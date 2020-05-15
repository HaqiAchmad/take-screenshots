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
 * Total method : 14
 * Total line : 369 
 * 
 * @author Achmad Baihaqi
 * @version 1.0
 * @since 15-05-2020
 */
public class Aktivitas {

    /**
     * 
     * Bertugas untuk menuliskan semua aktivitas yang dilakukan user ke system tepatnya ke file aktivitas.haqi pada package com.database
     * Method ini akan menulikan aktivitas user ke file tersebut pada baris baru 
     * 
     * 
     * @see FileWriter
     * @see BufferedWriter
     * @param aktivitas digunakan sebagai input, input disini adalah aktivitas yang dilakukan user
     */
    public static void addAktivitas(String aktivitas){
        
        try{
            FileWriter file = new FileWriter("src\\com\\database\\aktivitas.haqi", true);
            BufferedWriter tulis = new BufferedWriter(file);
            
            tulis.write(aktivitas); tulis.newLine(); tulis.flush();
            
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan di (Aktivitas.java)\n" + ex);
        }
    }
    
    /**
     * Berfungsi untuk menampilakan semua aktivitas yang dilakukan user ke konsol/screen
     * Dengan membaca file aktivitas.haqi pada package com.database
     * 
     * @see FileReader
     * @see BufferedWriter
     * @exception IOExcepion jika file tidak ada atau kosong
     */
    private static void showAktivitas(){
        
        try{
            FileReader file = new FileReader("src\\com\\database\\aktivitas.haqi");
            BufferedReader baca = new BufferedReader(file);
            String buffer = baca.readLine();
            
                // membaca keseluruhan file aktivitas.haqi
                while(buffer != null){
                    System.out.println(buffer);
                    buffer = baca.readLine();
                }
            
            
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan di (Aktivitas.java)\n" + ex);
        }
        
    }
    
    /**
     * Method berfungsi untuk mengetaui total screenshot yang diambil user
     * Dengan mengambil data dari file TotalSS.haqi dipackage com.database
     * Method ini juga berfungsi untuk penamaan file hasil sceenshot
     * 
     * Note : jik file kosong maka akan mereturn 1
     * 
     * @see FileReader
     * @see BufferedReader
     * @return total screenshot yang diambil
     */
    public static int getTotalSS(){
                
        try{
            FileReader file = new FileReader("src\\com\\database\\TotalSS.haqi");
            BufferedReader baca = new BufferedReader(file);
            String buffer = baca.readLine();
            
            return Integer.parseInt(buffer);
            
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan di (Aktivitas.java)\n" + ex);
        }
        return 1;
    }

    /**
     * Berfungsi untuk mengupdate total screenshot yang diambil. "total sceenshot akan selalu diupdate saat user menekan tombol take scrensot pada com.window.Root() "
     * Method ini akan mengkonversi totalSS ke string dan menuliskanya ke file TotalSS.haqi di package com.database
     * Method ini akan menimpa data total ss sebelumnya (append = false)
     * 
     * @see FileWriter 
     * @see BufferedWriter
     * @param totalSS input total jumlah screenthot
     */
    public static void setTotalSS(int totalSS){
        
        try{
            
            FileWriter file = new FileWriter("src\\com\\database\\TotalSS.haqi");
            BufferedWriter tulis = new BufferedWriter(file);
            
            tulis.write(Integer.toString(totalSS)); tulis.newLine(); tulis.flush();
            
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan di (Aktivitas.java)\n" + ex);
        }
    }
    
    /**
     * Menampilkan semua data yang ada didalam file sceeenshots.haqi di package com.database
     * Data tersebut berisi direktori dari screenshot yang diambil user
     * 
     * @see FileReader 
     * @see BufferedReader
     * 
     */
    public static void showScreenshots(){
        
        try{
            
            FileReader file = new FileReader("src\\com\\database\\screenshots.haqi");
            BufferedReader baca = new BufferedReader(file);
            String buffer = baca.readLine();
            
                while(buffer != null){
                    System.out.println(buffer);
                    buffer = baca.readLine();
                }
            
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan di (Aktivitas.java)\n" + ex);
        }
        
    }
    
    /**
     * Menuliskan direktori screenshot ke file screenshots.haqi dipackage com.database
     * Direktori akan dituliskan pada baris baru (append)
     * 
     * @see FileWriter
     * @see BufferedWriter
     * @param screenshot input direktori screenshot yang diambil user
     */
    public static void addScreenshot(String screenshot){
        
        try{
            
            FileWriter file = new FileWriter("src\\com\\database\\screenshots.haqi", true);
            BufferedWriter tulis = new BufferedWriter(file);
            
            tulis.write(screenshot); tulis.newLine(); tulis.flush();
            
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan di (Aktivitas.java)\n" + ex);
        }
    }
    
    /**
     * Untuk mengatur apakan aplikasi sudah terbuka atau belum
     * Dengan menuliskan open(input) ke file isopen.haqi dipackage com.database dan menimpa data sebelumnya(append = false)
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
        
        
        try{
            
            FileWriter file = new FileWriter("src\\com\\database\\isopen.haqi");
            BufferedWriter tulis = new BufferedWriter(file);
            
                if(key.equalsIgnoreCase("open") || key.equalsIgnoreCase("close")){
                    tulis.write(key); tulis.newLine(); tulis.flush();
                }else{
                    tulis.write("close");
                }
            
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan di (Aktivitas.java)\n" + ex);
        }
        
    }
    
    /**
     * Untuk mendapatkan data dari file isopen.haqi dipackage com.database
     * Jika file kosong maka akan return close
     * 
     * @see FileReader
     * @see BufferedReader
     * @return data dari file isopen.haqi
     */
    private static String getOpen(){
                
        try{
            FileReader file = new FileReader("src\\com\\database\\isopen.haqi");
            BufferedReader baca = new BufferedReader(file);
            String buffer = baca.readLine();
            
            return buffer;
            
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan di (Aktivitas.java)\n" + ex);
        }
        return "close";
    }
    
    /**
     * Method ini digunakan untuk mengetahui apakan aplikasi sudah terbuka atau belum
     * 
     * Note : kemungkinan aplikasi akan terjadi error saat dijalankan secara bersamaan
     * 
     * @return jika sudah mereturn true, jika belum mereturn false 
     */
    public static boolean isOpen_aplikasi(){
        
        if(Aktivitas.getOpen().contains("open")){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Method akan menuliskan autosave(input) ke file isautosave.haqi pada package com.database
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

        try{
            
            FileWriter file = new FileWriter("src\\com\\database\\isautosave.haqi");
            BufferedWriter tulis = new BufferedWriter(file);
            
                if(autosave.equalsIgnoreCase("actived")){
                    tulis.write(autosave); tulis.newLine(); tulis.flush();
                }else if(autosave.equalsIgnoreCase("deactived")){
                    tulis.write(autosave); tulis.newLine(); tulis.flush();
                }else{
                    tulis.write("deactived"); tulis.newLine(); tulis.flush();
                }
               
            
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan di (Aktivitas.java)\n" + ex);
        }
        
    }
    
    /**
     * Berfungsi untuk mengetaui apakan user mensetting untuk autosave atau tidak
     * 
     * @see FileReader
     * @see BufferedReader
     * @return jika ya maka mereturn true, jika tidak maka mereturn false
     */
    public static boolean isAutoSave(){
    
        try{
            FileReader file = new FileReader("src\\com\\database\\isautosave.haqi");
            BufferedReader baca = new BufferedReader(file);
            String buffer = baca.readLine();
            
            if(buffer.equalsIgnoreCase("actived")){
                return true;
            }else{ // deactived
                return false;
            }
            
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan di (Aktivitas.java)\n" + ex);
        }
        return true;
    }
           
    /**
     * Untuk menuliskan direktori file yang akan diproes ke file isactive.haqi pada package com.database
     * Yang dimaksud "file yang akan diproses" adalah Opsi yang ditampilkan setelah screenshot diambil(com.window.SimpanGambar.java)
     * 
     * @see FileWriter
     * @see BufferedWriter
     * @param aktif direktori file yang akan diproses 
     */
    public static void setAktif(String aktif){
        
        
        try{
            
            FileWriter file = new FileWriter("src\\com\\database\\isactive.haqi");
            BufferedWriter tulis = new BufferedWriter(file);
            
               tulis.write(aktif); tulis.newLine(); tulis.flush();
            
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan di (Aktivitas.java)\n" + ex);
        }
        
    }
    
    /**
     * Mendapatkan file yang sedang aktif(file yang sedang diproses pada SimpanGambar.java)
     * Data diambil dari file isactive.haqi pada package com.database
     * Method ini juga digunakan untuk mendapatkan data-data dari file  yang sedang di proses seperti (nama file, format file, ukuran file, resolusi file, dll)
     * 
     * Note : jika file kosong maka akan return null
     * 
     * @see FileReader 
     * @see BufferedReader
     * @return  
     */
    public static String getAktif(){
                
        try{
            FileReader file = new FileReader("src\\com\\database\\isactive.haqi");
            BufferedReader baca = new BufferedReader(file);
            String buffer = baca.readLine();
            
            return buffer;
            
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan di (Aktivitas.java)\n" + ex);
        }
        return "null";
    }
    
}