package com.system;

/**
 * Class ini adalah class yang pertama kali dijalankan saat aplikasi dibuka
 * Class ini hanya memiliki satu method yaitu main
 * Class ini saat dijalankan akan menuju ke class com.window.Root() (window untuk menscreenshot gambar
 * 
 * 
 * Type class : Superclass , MainClass
 * Total method : 1
 * Total Line : 70
 * 
 * @author Achmad Baihaqi
 * @version 1.1
 * @since 14 05 2020
 */
public class Start {
    
    
    /**
     * Method main ini digunakan untuk membuka aplikasi
     * Aplikasi akan dibuka mengunakan class Thread untuk meminimalisir terjadinya error
     * Sebelum aplikasi dibuka maka method ini akan meginformasikan pada system bahwa aplikasi dibuka (melalui method Aktivits.addAktivitas()
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        // sementara di disable
//        if(Aktivitas.isOpen_aplikasi()){
//            JOptionPane.showMessageDialog(null, "Aplikasi sudah terbuka");
//        }else{
//            
//            java.awt.EventQueue.invokeLater(new Runnable(){
//            
//                @Override 
//                public void run(){
//                    new com.window.Root().setVisible(true);
//                }
//            
//            });
//        }
        
        // membuka aplikasi
        Thread t = new Thread(new Runnable(){
        
            @Override
            public void run(){
                Aktivitas.addAktivitas("\nActivity " + Apps.getUsername() + " pada " + Tanggal.getTanggal_Activity()); 
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " membuka aplikasi."); 
                new com.window.Root().setVisible(true);
            }
        });
        
        
        t.start();
        
        
        try{
            
            t.join();
            
        }catch(java.lang.InterruptedException iex){
            iex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat membuka aplikasi -> (Start.java)\n" + iex);
        }
        
    }
    
    
}
