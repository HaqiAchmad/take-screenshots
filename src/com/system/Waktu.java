package com.system;

import java.util.Calendar;

/**
 * Class ini digunakan untuk mengetahui waktu/tanggal saat ini
 * Berguna untuk penamaan file pada hasil screenshot dan penulisan informasi ke log file
 * Class ini mendapatkan informasi waktu/tanggal saat ini melalui class Calendar
 * 
 * @author Achmad Baihaqi
 * @version 1.3
 * @since 12 05 2020
 */
public class Waktu {
    
    /**
     * Digunakan untuk mendapatkan waktu saat ini
     */
    private static Calendar time = Calendar.getInstance();

    /**
     * Attribute yang akan digunakan untuk menyimpan data dari waktu
     */
    private static int detik, menit, jam, tanggal, bulan, tahun, codehari;
    
    /**
     * Attribute yang akan digunakan untuk menyimpan data dari nama hari dan nama bulan
     */
    private static String namaHari, namaBulan;
    
    public Waktu(){
        updateTime();
    }
    
    /**
     * Mendapatkan waktu saat ini dengan menggunakan object time
     */
    public static void updateTime(){
        time = Calendar.getInstance();
        detik = time.get(Calendar.SECOND);
        menit = time.get(Calendar.MINUTE);
        jam = time.get(Calendar.HOUR_OF_DAY);
        tanggal = time.get(Calendar.DAY_OF_MONTH);
        bulan = time.get(Calendar.MONTH);
        tahun = time.get(Calendar.YEAR);
        namaHari = getNamaHari();
        namaBulan = getNamaBulan();
    }
    
    /**
     * Method ini digunakan untuk mendapatkan informasi tentang tanggal saat ini.
     * Method ini digunakan untuk penulisan log aplikasi
     * 
     * 
     * @return Tanngal dan jam saat ini Example :  Selasa, 12 January 2020 13:34
     */
    public static String getTanggal_Aktivitas(){
        updateTime();
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
        updateTime();
        return String.format("%d-%d-%d %02d.%02d.%02d", 
                Waktu.tahun, Waktu.bulan+1, Waktu.tanggal, Waktu.jam, Waktu.menit, Waktu.detik
                );
    }
    
    /**
     * Method ini digunakan untuk mendapatkan nama hari saat ini
     * 
     * @return nama hari saat ini 
     */
    private static String getNamaHari(){
        
        switch(time.get(Calendar.DAY_OF_WEEK)){
            case Calendar.SUNDAY: return "Minggu";
            case Calendar.MONDAY: return "Senin";
            case Calendar.TUESDAY: return "Selasa";
            case Calendar.WEDNESDAY: return "Rabu";
            case Calendar.THURSDAY: return "Kamis";
            case Calendar.FRIDAY: return "Jumat";
            case Calendar.SATURDAY: return "Sabtu";
            default: return "null";
        }
    }
    
    /**
     * Method ini digunakan untuk mendapatkan nama bulan saat ini.
     * 
     * @return nama bulan saat ini 
     */
    private static String getNamaBulan(){
        
        switch(time.get(Calendar.MONTH)){
            case Calendar.JANUARY: return "Januari"; 
            case Calendar.FEBRUARY: return "Februari";
            case Calendar.MARCH: return "Maret";
            case Calendar.APRIL: return "April";
            case Calendar.MAY: return "Mei";
            case Calendar.JUNE: return "Juni";
            case Calendar.JULY: return "Juli";
            case Calendar.AUGUST: return "Agustus"; 
            case Calendar.SEPTEMBER: return "September";
            case Calendar.OCTOBER: return "Oktober";
            case Calendar.NOVEMBER: return "November";
            case Calendar.DECEMBER: return "Desember";
            default: return "null";  
        }
        
    }
}