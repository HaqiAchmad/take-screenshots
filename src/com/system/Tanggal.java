package com.system;

import java.time.LocalDateTime;


/**
 * Class ini digunakan untuk mengetahui waktu/tanggal saat ini
 * Berguna untuk penamaan file pada hasil screenshot dan penulisan informasi ke database/system 
 * Class ini mendapatkan informasi waktu/tanggal saat ini melalui class LocalDateTime 
 * 
 * Type class : Superclass 
 * Total method : 11
 * Total line : 192
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
     * Mendapatkan detik saat ini melalui method getSecond() pada class LocalDateTime
     * 
     * @see LocalDateTime
     * 
     * @return detik saat ini 
     */
    private static int getDetik(){
        return Tanggal.local.getSecond();
    }
    
    /**
     * Mendapatkan menit saat ini melalui method getMinute() pada class LocalDateTime
     * 
     * @see LocalDateTime
     * 
     * @return menit saat ini 
     */
    private static int getMenit(){
        return Tanggal.local.getMinute();
    }
    
    /**
     * Mendapatkan jam saat ini melalui method geHour() pada class LocalDateTime
     * 
     * @see LocalDateTime
     * 
     * @return jam saat ini 
     */
    private static int getJam(){
        return Tanggal.local.getHour();
    }
    
    /**
     * Mendapatkan tangal saat ini melalui method getDayOfMonth() pada class LocalDateTime
     * 
     * @see LocalDateTime
     * 
     * @return tangal saat ini 
     */
    private static int getHari(){
        return Tanggal.local.getDayOfMonth();
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
     * Mendapatkan nilai bulan saat ini melalui method getMonthValue() pada class LocalDateTime
     * Nilai bulan bekisar 1 - 12
     * 
     * @see LocalDateTime
     * 
     * @return nilai bulan bulan saat ini 
     */
    private static int getBulan(){
       return Tanggal.local.getMonthValue();
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
     * Mendapatkan tahun saat ini melalui method getYear() pada class LocalDateTime
     * 
     * @see LocalDateTime
     * 
     * @return tahun saat ini 
     */
    private static int getTahun(){
        return Tanggal.local.getYear();
    }
 
}
