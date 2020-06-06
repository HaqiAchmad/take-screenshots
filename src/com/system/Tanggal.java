package com.system;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.InterruptedException;
import java.util.StringTokenizer;
import java.time.LocalDateTime;


/**
 * Class ini digunakan untuk mengetahui waktu/tanggal saat ini
 * Berguna untuk penamaan file pada hasil screenshot dan penulisan informasi ke database/system 
 * Class ini mendapatkan informasi waktu/tanggal saat ini melalui class LocalDateTime 
 * 
 * Type class : Superclass 
 * Total method : 16
 * Total line : 462
 * 
 * @see LocalDateTime
 * 
 * @author Achmad Baihaqi
 * @version 1.1
 * @since 12 05 2020
 */
public class Tanggal {
    
    /**
     * Class attribute dari instance class LocalDateTime
     */
    private static final LocalDateTime local = LocalDateTime.now();
    
    /**
     * Class attribute untuk mendapatkan data waktu atau tanggal
     */
    private static final int GET_DETIK = 1, GET_MENIT = 2, GET_JAM = 3, GET_TANGGAL = 4,
                             GET_NAMAHARI = 5, GET_BULAN = 6, GET_NAMABULAN = 7, GET_TAHUN = 8;
    /**
     * Method ini digunakan untuk memasukan informasi tanngal saat user melakukan sebuah aktivitas ke database/system
     * Method ini mengambil method2 yang lain seperti getNamaHari(), getNamaBulan(), getHari(), getTahun(), getMenit(), getJam() dll 
     * Jika method memiliki output int maka akan diubah kebentuk String melalui method intToStr()
     * Dan semua method tersebut dijadikan menjadi satu variabel. Example Selasa, 12 January 2020 13:34
     * 
     * 
     * @return Tanngal dan jam saat ini Example :  Selasa, 12 January 2020 13:34
     */
    public static String getTanggal_Activity(){

        String tanggal = Tanggal.getNamaHari() + ", "+ intToStr(getHari()) +" "+ getNamaBulan() +" "+ intToStr(getTahun()) +" "+ intToStr(getJam()) +":"+ intToStr(getMenit());
        return tanggal;
    }
    
    /**
     * Method ini digunakan untuk penamanan pada file hasil screenshot
     * Cara kerja dan output method ini hampir sma seperti method getTanggal_Activity 
     * Method ini mengambil method2 yang lain seperti getNamaHari(), getNamaBulan(), getHari(), getTahun(), getMenit(), getJam() dll 
     * Jika method memiliki output int maka akan diubah kebentuk String melalui method intToStr()
     * Dan semua method tersebut dijadikan menjadi satu variabel. Example 2020-01-12 13.36.10
     * 
     * 
     * @return Tanngal dan jam saat ini Example :  2020-01-12 13.36.10
     */
    public static String getTanggal_Screenshot(){

        String tanggal = intToStr(getTahun()) +"-"+ intToStr(getBulan()) +"-"+ intToStr(getHari()) +" "+ intToStr(getJam()) +"."+ intToStr(getMenit()) +"."+ intToStr(getDetik());
        return tanggal;
    }
    
    /**
     * Digunakan untuk mendapatkan data waktu atau tanggal 
     * Method ini mengambil data dari file com.database.date.haqi 
     * Lalu memilah datanya sesuia code yang diinputkan
     * 
     * @param code parameter hanya dapat diisi oleh class attribute diatas
     * @return data waktu atau tanggal
     */
    private static String getData(int code){
        
        StringTokenizer data = new StringTokenizer(Tanggal.getUpdateTime(), "#\n");
        String buffer = "NULL";
        
            for(int i = 1; i <= code; i++){
                buffer = data.nextToken();
            }
        return buffer;
    }
    
    /**
     * Mengubah nilai dari varibel yang bertipe data int menjadi String
     * 
     * @see Integer
     * 
     * @param i input yang akan diubah kedalam bentuk string
     * @return variabel i yang telah diubah kedalam bentuk string 
     */
    private static String intToStr(int i){
        return Integer.toString(i);
    }
    
    /**
     * Mendapatkan detik saat ini melalui method Tanggal.getData(); dengan code GET_DETIK
     * 
     * @return detik saat ini 
     */
    private static int getDetik(){
        return Integer.parseInt(Tanggal.getData(Tanggal.GET_DETIK));
    }
    
    /**
     * Mendapatkan menit saat ini melalui method Tanggal.getData(); dengan code GET_MENIT
     * 
     * @return menit saat ini 
     */
    private static int getMenit(){
        return Integer.parseInt(Tanggal.getData(Tanggal.GET_MENIT));
    }
    
    /**
     * Mendapatkan jam saat ini melalui method Tanggal.getData(); dengan code GET_JAM
     * 
     * @return jam saat ini 
     */
    private static int getJam(){
        return Integer.parseInt(Tanggal.getData(Tanggal.GET_JAM));
    }
    
    /**
     * Mendapatkan tanggal saat ini melalui method Tanggal.getData(); dengan code GET_TANGGAL
     * 
     * @return tanggal saat ini 
     */
    private static int getHari(){
        return Integer.parseInt(Tanggal.getData(Tanggal.GET_TANGGAL));
    }
    
    /**
     * Method ini digunakan untuk mendapatkan nama hari saat ini
     * Method ini mendapatkan nama hari berdasarkan kode hari yang didapat dari method getDayOfWeek().getValue()
     * Kode hari berkisar antara 1 - 7
     *  1 berati senin, 2 berarti selasa, 3 berati rabu dan seterusnya sampai 7
     * 
     * 
     * @return nama hari saat ini 
     */
    private static String getNamaHari(){
        
        switch(Tanggal.local.getDayOfWeek().getValue()){
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
     * Mendapatkan bulan saat ini melalui method Tanggal.getData(); dengan code GET_BULAN
     * 
     * @return bulan saat ini 
     */
    private static int getBulan(){
       return Integer.parseInt(Tanggal.getData(Tanggal.GET_BULAN));
    }
    
    /**
     * Method ini digunakan untuk mendapatkan nama bulan saat ini
     * Method ini mendapatkan nama bulan berdasarkan nilai bulan dari method getBulan() pada class ini
     * Nilai bulan berkisar antara 1 - 12
     *  1 berati januari, 2 berarti februari, 3 berati maret dan seterusnya sampai 12
     * 
     * 
     * @return nama bulan saat ini 
     */
    private static String getNamaBulan(){
        
        switch(Tanggal.getBulan()){
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
     * Mendapatkan tahun saat ini melalui method Tanggal.getData(); dengan code GET_TAHUN
     * 
     * @return tahun saat ini 
     */
    private static int getTahun(){
        return Integer.parseInt(Tanggal.getData(Tanggal.GET_TAHUN));
    }
    
    /**
     * Digunakan untuk mendapatkan jumlah hari dalam bulan tertentu
     * class ini menggunakan method getBulan() untuk mendapatkan nilai dari bulan dan mereturn jumlah harinya
     * 
     * @return jumlah hari dalam sebulan
     */
    protected static int jumlahHari(){
        
        switch(getBulan()){
            case 1: return 31; 
            case 2: return 28;
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
     * Digunakan untuk menuliskan data default ke file date.haqi 
     * Data default digunakan untuk menghindari kesalahan pada saat mendapatkan data dari waktu yaitu nullpointer exception
     * Method ini digunakan untuk mendapatkan data dari waktu saat ini dan menyimpanya ke file date.haqi dengan memanfaatkan class LocalDateTime
     * 
     * @see LocalDateTime
     * @see FileWriter
     * @see BufferedWriter
     * 
     */
    public static void setDefaultTime(){
        
        try{
            FileWriter file = new FileWriter("src\\com\\database\\date.haqi");
            BufferedWriter tulis = new BufferedWriter(file);  
            
            int detik = local.getSecond(),
                menit = local.getMinute(),
                jam = local.getHour(),
                tanggal = local.getDayOfMonth(),
                bulan = local.getMonthValue(),
                tahun = local.getYear();
            String data = Integer.toString(detik)+"#"+
                          Integer.toString(menit)+"#"+
                          Integer.toString(jam)+"#"+
                          Integer.toString(tanggal)+"#NULL#"+
                          Integer.toString(bulan)+"#NULL#"+
                          Integer.toString(tahun);
            tulis.write(data);
            tulis.flush();         
            
        }catch(IOException ex){
            javax.swing.JOptionPane.showMessageDialog(null, ex);
            ex.printStackTrace();
        }
        
    }
    
    /**
     * Method ini digunakan untuk mengupdate data dari file date.haqi 
     * Karena pada dasarnya waktu yang didapat dari class LocalDateTime tidaklah realtime
     * Note : class LocalDateTime hanya mendapatkan waktu saat program dirun lalu nilainya akan statis (tidak berubah-rubah)
     * Pada method ini kita akan mengupdatenya dan berikut cara kerjanya
     * - method menuliskan data waktu default ke file date.haqi dengan method sefDefaultTime() untuk menghindari nullPointer
     * - method mendapatkan data waktu dari method method diatas dan disimpan pada variabel bertipedata integer dan string
     * - method akan melaksanakan perulangan while(true) dengan delay 1000 ms untuk mengupdate data waktu agar realtime dengan waktu yang sekarang
     * - pengupate-tan data waktu dilakukan dengan cara menambahkan angka 1 pada variabel detik, jika variabel detik sudah mencapai 59 maka method akan menambahkan 1 pada vaeiabel menit dst
     * - jika sudah maka method akan menuliskan data waktu yang telah diupdata ke file data.haqi
     * 
     * @see FileReader
     * @see BufferedReader
     * @see Thread
     * 
   */
    public static void updateTime(){
        
        Tanggal.setDefaultTime();
        Thread update = new Thread(new Runnable(){
            
            int detik = local.getSecond(),
                menit = local.getMinute(),
                jam = local.getHour(),
                tanggal = local.getDayOfMonth(),
                bulan = local.getMonthValue(),
                tahun = local.getYear();
            String namaHari = Tanggal.getNamaHari(), namaBulan = Tanggal.getNamaBulan(), data;
        
            
            @Override
            public void run(){
                
                try{

                    FileWriter file = new FileWriter("src\\com\\database\\date.haqi");
                    BufferedWriter tulis = new BufferedWriter(file);
                    
                    data = Integer.toString(detik)+"#"+
                                  Integer.toString(menit)+"#"+
                                  Integer.toString(jam)+"#"+
                                  Integer.toString(tanggal)+"#NULL#"+
                                  Integer.toString(bulan)+"#NULL#"+
                                  Integer.toString(tahun);
                    tulis.write(data);
                    tulis.flush();      
                    
                        while(true){
                            
                            detik++;
                            if(detik > 59){
                                detik = 0;
                                menit++;
                            }else if(menit > 59){
                                menit = 0;
                                jam++;
                            }else if(jam > 23){
                                jam = 0;
                                tanggal++;
                                    switch(namaHari){
                                        case "Senin": namaHari = "Selasa"; break;
                                        case "Selasa": namaHari = "Rabu"; break;
                                        case "Rabu": namaHari = "Kamis"; break;
                                        case "Kamis": namaHari = "Jumat"; break;
                                        case "Jumat": namaHari = "Sabtu"; break;
                                        case "Sabtu": namaHari = "Minggu"; break;
                                        case "Minggu": namaHari = "Senin"; break;
                                        default : namaHari = "NULL"; break;
                                    }
                            }else if(tanggal > Tanggal.jumlahHari()){
                                tanggal = 1;
                                bulan++;
                                    switch(namaBulan){
                                        case "Januari": namaBulan = "Februari"; break;
                                        case "Februari": namaBulan = "Maret"; break;
                                        case "Maret": namaBulan = "April"; break;
                                        case "April": namaBulan = "Mei"; break;
                                        case "Mei": namaBulan = "Juni"; break;
                                        case "Juni": namaBulan = "Juli"; break;
                                        case "Juli": namaBulan = "Agustus"; break;
                                        case "Agustus": namaBulan = "September"; break;
                                        case "September": namaBulan = "Oktober"; break;
                                        case "Oktober": namaBulan = "November"; break;
                                        case "November": namaBulan = "Desember"; break;
                                        case "Desember": namaBulan = "Januari"; break;
                                        default: namaBulan = "NULL"; break;
                                    }
                            }else if(bulan > 12){
                                bulan = 1;
                                tahun++;
                            }
                            
                            tulis.close();
                            file = new FileWriter("src\\com\\database\\date.haqi");
                            tulis = new BufferedWriter(file);
                            data =  Integer.toString(detik)+"#"+
                                    Integer.toString(menit)+"#"+
                                    Integer.toString(jam)+"#"+
                                    Integer.toString(tanggal)+"#"+namaHari+"#"+
                                    Integer.toString(bulan)+"#"+namaBulan+"#"+
                                    Integer.toString(tahun);
                           tulis.write(data);
                           tulis.flush();
                           data = null;
                            
//                            System.out.println(Tanggal.getUpdateTime());
                            Thread.sleep(1000);
                        }
                        

                }catch(Exception ex){
                    javax.swing.JOptionPane.showMessageDialog(null, ex);
                    ex.printStackTrace();
                }
                
            }
            
        });
        
        update.start();
        
        try{
            update.join();
        }catch(InterruptedException ex){
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, ex);
        }
        
    }
 
    /**
     * Method ini digunakan untuk mendapatkan data waktu dari file date.haqi
     * 
     * @return data waktu pada file date.haqi 
     */
    private static String getUpdateTime(){
        
        try{
            FileReader file = new FileReader("src\\com\\database\\date.haqi");
            BufferedReader baca = new BufferedReader(file);
            return baca.readLine();
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args){
        
//        System.out.println(Tanggal.getData(GET_DETIK));
//        System.out.println(Tanggal.getData(GET_MENIT));
//        System.out.println(Tanggal.getData(GET_JAM));
//        System.out.println(Tanggal.getData(GET_TANGGAL));
//        System.out.println(Tanggal.getData(GET_NAMAHARI));
//        System.out.println(Tanggal.getData(GET_BULAN));
//        System.out.println(Tanggal.getData(GET_NAMABULAN));
//        System.out.println(Tanggal.getData(GET_TAHUN));
//        System.out.println(Tanggal.get);
//
//        Thread t = new Thread(new Runnable(){
//        
//            @Override
//            public void run(){
//                try{
//                    while(true){
//                        System.out.println(Tanggal.getTanggal_Activity());
//                        Thread.sleep(1000);
//                    }
//                }catch(Exception ex){
//
//                }
//                
//            }
//        });
//        
//        t.start();
//        
//        try{
//            t.join();
//        }catch(InterruptedException ex){
//            ex.printStackTrace();
//        }
//        
//                        Tanggal.updateTime();
    }
    
}
