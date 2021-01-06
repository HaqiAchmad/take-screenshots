package com.main;

import com.system.Aktivitas;
import com.system.Apps;
import com.database.Database;
import com.system.Waktu;

import java.io.IOException;

/**
 * Class ini adalah class yang pertama kali dijalankan saat aplikasi dibuka
 * 
 * 
 * @author Achmad Baihaqi
 * @version 1.4
 * @since 14 05 2020
 */
public class Main {
    
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
        
        // membuka window Root (Window Utama)
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
