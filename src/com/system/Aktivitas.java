package com.system;

import java.io.*;
import javax.swing.JOptionPane;


/**
 * Class ini digunakan untuk merekam aktivitas yang dilakukan user, menuliskan informasi ke system, mendapatkan informasi system
 * Contoh aktivitas seperti : saat user menekan tombol screenshot maka class ini akan menuliskan ke system bahwa user melakukan screenshot,
 *                            saat user menekan tombol autosave maka class ini akan menuliskan ke system bahwa user mengatur screenshot akan tersimpan secara otomatis
 * 
 * Class ini sebagian besar hanya berisi getter dan setter saja
 * System yang dimaksud adalah semua file yang terdapat di dalam package com.database
 * 
 * 
 * Type class : Superclass
 * Total method : 16
 * Total line : 274
 * 
 * @author Achmad Baihaqi
 * @version 1.2
 * @since 15-05-2020
 */
public class Aktivitas {

    /**
     * File yang berada didalam database
     */
     private static File fileAbout = new File("database\\about.haqi"),
                         fileAktivitas = new File("database\\aktivitas.haqi"),
                         fileDate = new File("database\\date.haqi"),
                         fileIsActive = new File ("database\\isActive.haqi"),
                         fileIsAutoSave = new File("database\\isAutoSave.haqi"),
                         fileIsOpen = new File("database\\isOpen.haqi"),
                         fileLanguage = new File("database\\language.haqi"),
                         fileSaveTo = new File("database\\SaveTo.haqi"),
                         fileScreenshots = new File("database\\screenshots.haqi"),
                         fileTheme = new File("database\\theme.haqi"),
                         fileTotalSS = new File("database\\TotalSS.haqi");




    /**
     * 
     * Bertugas untuk menuliskan semua aktivitas yang dilakukan user ke system tepatnya ke file aktivitas.haqi
     * Method ini akan menulikan aktivitas user ke file tersebut pada baris baru 
     * 
     * 
     * @see FileWriter
     * @see BufferedWriter
     * @param aktivitas digunakan sebagai input, input disini adalah aktivitas yang dilakukan user
     */
    public static void addAktivitas(String aktivitas){
        Files.writeFile(fileAktivitas.toString(), aktivitas, true);
    }
    
    /**
     * Berfungsi untuk menampilakan semua aktivitas yang dilakukan user ke konsol/screen
     * Dengan membaca file aktivitas.haqi
     * 
     * @see FileReader
     * @see BufferedWriter
     */
    private static void showAktivitas(){
        Files.showFile(fileAktivitas.toString());
    }
    
    /**
     * Method berfungsi untuk mengetaui total screenshot yang diambil user
     * Dengan mengambil data dari file TotalSS.haqi melaui class Files
     * Method ini juga berfungsi untuk penamaan file hasil sceenshot
     * 
     * Note : jika file kosong maka akan mereturn 1
     * 
     * @see Files
     *
     * @return total screenshot yang diambil
     */
    public static int getTotalSS(){
        String totalSS = Files.getDataFile(fileTotalSS.toString());
        if(totalSS == null){
            return 0;
        }else{
            return Integer.parseInt(totalSS);
        }
    }

    /**
     * Berfungsi untuk mengupdate total screenshot yang diambil. "total sceenshot akan selalu diupdate saat user menekan tombol take scrensot pada com.window.Root() "
     * Method ini akan mengkonversi totalSS ke string dan menuliskanya ke file TotalSS.haqi
     * Method ini akan menimpa data total ss sebelumnya
     * 
     * @see FileWriter 
     * @see BufferedWriter
     * @param totalSS input total jumlah screenthot
     */
    public static void setTotalSS(int totalSS){

        Files.writeFile(fileTotalSS.toString(), Integer.toString(totalSS),false);
    }
    
    /**
     * Menampilkan semua data yang ada didalam file sceeenshots.haqi ke console/layar
     * Data tersebut berisi direktori dari screenshot yang diambil user
     * 
     * @see FileReader 
     * @see BufferedReader
     * 
     */
    public static void showScreenshots(){
        Files.showFile(fileScreenshots.toString());
    }
    
    /**
     * Menuliskan direktori screenshot ke file screenshots.haqi
     * Direktori akan dituliskan pada baris baru (append)
     * 
     * @see FileWriter
     * @see BufferedWriter
     * @param screenshot input direktori screenshot yang diambil user
     */
    public static void addScreenshot(String screenshot){
        Files.writeFile(fileScreenshots.toString(), screenshot, true);
    }
    
    /**
     * Untuk mengatur apakan aplikasi sudah terbuka atau belum
     * Dengan menuliskan open(input) ke file isopen.haqi dan menimpa data sebelumnya(append = false)
     * Key(open) hanya memiliki dua nilai yaitu:
     *  open: berarti aplikasi saat ini sedang dibuka
     *  close: berarti aplikasi saat ini sedang tidak dibuka
     * 
     * Note : jika nilai dari key bukan open atau close maka method ini akan menuliskan close(sebagai default)
     * 
     * @see FileWriter
     * @see BufferedWriter
     * @param key hanya dapat bernilai open atau close
     */
    public static void setOpen(String key){
        if(key.equalsIgnoreCase("open")){
            Files.writeFile(fileIsOpen.toString(), key, false);
        }else{
            Files.writeFile(fileIsOpen.toString(), key, false);
        }
    }

    /**
     * Method ini digunakan untuk mengetahui apakan aplikasi sudah terbuka atau belum
     * 
     * Note : kemungkinan aplikasi akan terjadi error saat dijalankan secara bersamaan
     * 
     * @return jika sudah mereturn true, jika belum mereturn false 
     */
    public static boolean isOpen_aplikasi(){
        String data = Files.getDataFile(fileIsOpen.toString());
        if(data == null){
            return false;
        }else if(data.equals("open")){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Method akan menuliskan autosave(input) ke file isautosave.haqi
     * Input yang dituliskan hanya memiliki dua nilai yaitu:
     *  actived : user mengaktifkan setelan untuk autosave
     *  deactived : user menonaktifkan setelan untuk autosave
     * 
     * Note : jika input selain actived atau deactived maka method akan secara default akan menuliskan deactived
     * 
     * @see FileWriter
     * @see BufferedWriter
     * @param autosave input hanya dpt bernilai actived atau deactived
     */
    public static void setAutoSave(String autosave){
        Files.writeFile(fileIsAutoSave.toString(), autosave, false);
    }
    
    /**
     * Berfungsi untuk mengetaui apakan user mensetting untuk autosave atau tidak
     * 
     * @see FileReader
     * @see BufferedReader
     * @return jika ya maka mereturn true, jika tidak maka mereturn false
     */
    public static boolean isAutoSave(){
        String data = Files.getDataFile(fileIsAutoSave.toString());

        if(data == null){
            return false;
        }else if(data.equalsIgnoreCase("actived")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Method ini digunakan untuk mendapatkan direktori yang diatur user untuk menyimpan hasil screenshot
     * Dengan membaca file SaveTo.haqi
     * Lalu method akan mereturn data yang ada difile SaveTo.haqi
     * Jika file SaveTo.haqi kosong maka method akan mereturn direktori userhome\\downloads sebagai default Example : "C:\\Users\\YOU\\Downloads\\
     *
     * @see FileReader
     * @see BufferedReader
     *
     * @return direktori untuk menyimpan file hasil screenshot
     */
    public static String getPenyimpanan() {
        String storage = Files.getDataFile(fileSaveTo.toString());
        if (storage == null) {
            return "C:\\Users\\" + Apps.getUsername() + "\\Downloads\\";
        } else {
            return storage;
        }
    }

    /**
     * Method ini digunakan untuk menyimpan direktori peyimpanan screenshot yang diatur user
     * Direktori akan disimpan kefile SaveTo.haqi
     * User dapat menguabah setelan direktori di window com.window.Root.java
     *
     * @see FileWriter
     * @see BufferedWriter
     *
     * @param simpanKe input direktori yang diatur user
     */
    public static void setPeyimpanan(String simpanKe) {
        Files.writeFile(fileSaveTo.toString(), simpanKe, false);
    }

    /**
     * Untuk menuliskan direktori file yang akan diproes ke file isactive.haqi
     * Yang dimaksud "file yang akan diproses" adalah Opsi yang ditampilkan setelah screenshot diambil(com.window.SimpanGambar.java)
     * 
     * @see FileWriter
     * @see BufferedWriter
     * @param aktif direktori file yang akan diproses 
     */
    public static void setAktif(String aktif){
        Files.writeFile(fileIsActive.toString(), aktif, false);
    }
    
    /**
     * Mendapatkan file yang sedang aktif(file yang sedang diproses pada SimpanGambar.java)
     * Data diambil dari file isactive.haqi
     * Method ini juga digunakan untuk mendapatkan data-data dari file  yang sedang di proses seperti (nama file, format file, ukuran file, resolusi file, dll)
     *
     * 
     * @see FileReader 
     * @see BufferedReader
     * @return  file yang sedang aktif
     */
    public static String getAktif(){
        return Files.getDataFile(fileIsActive.toString());
    }


}