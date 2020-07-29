package com.main;

import com.system.Aktivitas;
import com.system.Apps;
import com.database.Database;
import com.system.Waktu;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class ini adalah class yang pertama kali dijalankan saat aplikasi dibuka
 * 
 * 
 * @author Achmad Baihaqi
 * @version 1.3
 * @since 14 05 2020
 */
public class Main {
    
    /**
     * Digunakan untuk membuka jar file saat membuka aplikasi
     */
    private static final File JARFILE = new File("Take_Screenshots_1.5.jar");
    
    /**
     * Method main ini digunakan untuk membuka aplikasi
     * Sebelum membuka aplikasi method akan mengecek apakah database exist atau tidak, jika tidak maka method akan membuat database baru
     *
     * @param args 
     * @exception IOException menangani error pada file
     */
    public static void main(String[] args) throws IOException{

        //membuat database/file yang terhapus
        Database.createNotExistDatabase();
        
        /*
           mengecek apakah jarfile exist atau tidak, jika exist maka akan dibuka, jika tidak maka akan membuka window Root
           membuka jarfile digunakan untuk menhindari bug saat menggirim ratting
        */
        if(Main.JARFILE.exists()){ // jika jarfile exist
            
            new Thread(new Runnable(){

                @Override
                public void run(){
                    try{
                        System.out.println("jar file is exist");
                        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "java -jar " + Main.JARFILE); // command cmd untuk membuka jar file
                        builder.redirectErrorStream(true); // membaca kesalahan/error saat membuka jar file
                        Process p = builder.start(); // membuka jar file
                        // membaca output yang keluar dari jar file
                        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        String s;
                        while((s = in.readLine()) != null){
                            System.out.println(s); // menuliskan output ke konsol
                        }
                    }catch(IOException ex){
                        Apps.showException("Terjadi kesalahan saat membuka aplikasi\nSilahkan instal ulang aplikasi", Main.class.getName(), ex.toString());
                    }

                }
            }).start();

        }else{ // jika jarfile tidak exist
            Apps.showNotification("Terjadi kesalahan saat membuka aplikasi\nMungkin ada beberapa file yang hilang atau direname", Main.class.getName(), "Silahkan instal ulang aplikasi");
            java.awt.EventQueue.invokeLater(new Runnable(){

                @Override
                public void run(){
                    Waktu.updateTime();
                    Aktivitas.addAktivitas("\nAktivitas " + Apps.getUsername() + " pada " + Waktu.getTanggal_Activity());
                    Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " membuka aplikasi.");
                    new com.window.Root().setVisible(true); // membuka window root
                }
            });
        }
    }
    
}
