package com.main;

import com.system.Aktivitas;
import com.system.Apps;
import com.database.Database;
import com.system.Waktu;
import com.window.MainWindow;

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
     * @param args args
     * @exception IOException menangani error pada file
     */
    public static void main(String[] args) throws IOException{

        //membuat database/file yang terhapus
        Database.createNotExistDatabase();

        // membuka window MainWindow (Window Utama)
        java.awt.EventQueue.invokeLater(new Runnable(){

            @Override
            public void run(){
                Aktivitas.addAktivitas("\nAktivitas " + Apps.getUsername() + " pada " + Waktu.getTanggal_Aktivitas());
                Aktivitas.addAktivitas(Waktu.getTanggal_Aktivitas() +"\t->"+ Apps.getUsername() + " membuka aplikasi.");
                new MainWindow().setVisible(true); // membuka window root
            }
        });
    }
}
