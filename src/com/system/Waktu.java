package com.system;

import java.time.LocalDateTime;


/**
 * Class ini digunakan untuk mengetahui waktu/tanggal saat ini
 * Berguna untuk penamaan file pada hasil screenshot dan penulisan informasi ke database
 * Class ini mendapatkan informasi waktu/tanggal saat ini melalui class LocalDateTime 
 * 
 * 
 * @author Achmad Baihaqi
 * @version 1.2
 * @since 12 05 2020
 */
public class Waktu {
    
    /**
     * Digunakan untuk mendapatkan waktu saat ini
     */
    private static final LocalDateTime local = LocalDateTime.now();

    /**
     * Attribute yang akan digunakan untuk menyimpan data dari waktu
     */
    private static int detik, menit, jam, tanggal, bulan, tahun, codehari;
    
    /**
     * Attribute yang akan digunakan untuk menyimpan data dari nama hari dan nama bulan
     */
    private static String namaHari, namaBulan;
    
    /**
     * Method ini digunakan untuk mendapatkan informasi tentang tanggal saat ini.
     * Method ini digunakan untuk aktivitas
     * 
     * 
     * @return Tanngal dan jam saat ini Example :  Selasa, 12 January 2020 13:34
     */
    public static String getTanggal_Activity(){
        return String.format("%s, %d %s %d %02d:%02d", 
                    Waktu.namaHari, Waktu.tanggal, Waktu.namaBulan, Waktu.tahun, Waktu.jam, Waktu.menit 
               );
    }
    
    /**
     * Method ini digunakan untuk mendapatkan informasi tentang tanggal saat ini
     * Method ini digunakan untuk penamaan pada file hasil screenshot
     * 
     * 
     * @return Tanngal dan jam saat ini Example :  2020-1-12 13.36.10
     */
    public static String getTanggal_Screenshot(){
        return String.format("%d-%d-%d %02d.%02d.%02d", 
                Waktu.tahun, Waktu.bulan, Waktu.tanggal, Waktu.jam, Waktu.menit, Waktu.detik
                );
    }
    
    /**
     * Method ini digunakan untuk mendapatkan nama hari saat ini
     * Method ini mendapatkan nama hari berdasarkan kode hari yang didapat dari attribute codehari
     * Kode hari berkisar antara 1 - 7
     *  1 berati senin, 2 berarti selasa, 3 berati rabu dan seterusnya sampai 7
     * 
     * 
     * @return nama hari saat ini 
     */
    private static String getNamaHari(){
        
        switch(Waktu.codehari){
            case 1: return "Senin"; 
            case 2: return "Selasa";
            case 3: return "Rabu";
            case 4: return "Kamis";
            case 5: return "Jumat";
            case 6: return "Sabtu";
            case 7: return "Minggu";
            default: return "null";      
        }
        
    }
    
    /**
     * Method ini digunakan untuk mendapatkan nama bulan saat ini.
     * Method ini mendapatkan nama bulan berdasarkan nilai bulan dari attribute bulan pada class ini.
     * Nilai bulan berkisar antara 1 - 12
     *  1 berati januari, 2 berarti februari, 3 berati maret dan seterusnya sampai 12.
     * 
     * 
     * @return nama bulan saat ini 
     */
    private static String getNamaBulan(){
        
        switch(Waktu.bulan){
            case 1: return "Januari"; 
            case 2: return "Februari";
            case 3: return "Maret";
            case 4: return "April";
            case 5: return "Mei";
            case 6: return "Juni";
            case 7: return "Juli";
            case 8: return "Agustus"; 
            case 9: return "September";
            case 10: return "Oktober";
            case 11: return "November";
            case 12: return "Desember";
            default: return "null";  
        }
        
    }
    
    /**
     * Digunakan untuk mendapatkan jumlah hari dalam bulan tertentu
     * class ini menggunakan attribute bulan untuk mendapatkan nilai dari bulan dan mereturn jumlah harinya
     * 
     * @return jumlah hari dalam sebulan
     */
    protected static int jumlahHari(){
        
        switch(Waktu.bulan){
            case 1: return 31; 
            case 2: return (Waktu.tahun % 4 == 0) ? (29) : (28);
            case 3: return 31;
            case 4: return 31;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default : return 1;
                
        }
        
    }
    
    /**
     * Method ini digunakan untuk mendapatkan detik, menit, jam, tanggal, codehari, namahari, bulan, namabulan dan tahun saat ini.
     * 
     */
    public static void updateTime(){
        
        // untuk mendapatkan waktu saat ini 
        Waktu.detik = local.getSecond();
        Waktu.menit = local.getMinute();
        Waktu.jam = local.getHour();
        Waktu.tanggal = local.getDayOfMonth();
        Waktu.codehari = local.getDayOfWeek().getValue();
        Waktu.namaHari = Waktu.getNamaHari();
        Waktu.bulan = local.getMonthValue();
        Waktu.namaBulan = Waktu.getNamaBulan();
        Waktu.tahun = local.getYear();

        // mengupdate waktu
            new Thread(new Runnable(){
                
                @Override
                public void run(){
                    try{
                        // waktu akan terus diupdate sampai aplikasi diclose
                        while(true){

                            Waktu.detik++;
                            if(Waktu.detik > 59){
                                Waktu.detik = 0;
                                Waktu.menit++;
                            }else if(Waktu.menit > 59){
                                Waktu.menit = 0;
                                Waktu.jam++;
                            }else if(Waktu.jam > 23){
                                Waktu.jam = 0;
                                Waktu.tanggal++;
                                Waktu.codehari++;
                                    if(Waktu.codehari > 7){
                                        Waktu.codehari = 0;
                                    }
                            }else if(Waktu.tanggal > Waktu.jumlahHari()){
                                Waktu.tanggal = 1;
                                Waktu.bulan++;
                            }else if(Waktu.bulan > 12){
                                Waktu.bulan = 1;
                                Waktu.tahun++;
                            }

                           Thread.sleep(1000);

                        }
                        
                    }catch(InterruptedException iex){
                        javax.swing.JOptionPane.showMessageDialog(null, iex);
                    }
                }
            
            }).start();
    }

}