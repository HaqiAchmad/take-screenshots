package com.system;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.io.*;
import java.util.StringTokenizer;

/**
* Class ini digunakan untuk mendapatkan informasi dari aplikasi dan info dari device user
* Contoh informasi : nama dari aplikasi, versi dari aplikasi, tahun rilis aplikasi dan pembuat aplikasi
* Info Device : Nama username dari user, lebar dan tinggi layar user
* 
* Type class : Super class
* Total method : 9
* Total Baris : 189
* 
* 
* @see ImageIcon
* @see Toolkit
* 
* @author Achmad Baihaqi
* @version 1.0
* @since 13 05 2020
*/

public class Apps {

    /**
     * Digunakan untuk mendapatkan gambar yang akan dipakai untuk icon aplikasi
     */
    private static final ImageIcon icon = new ImageIcon("src/com/media/app-icon.png");
    /**
     * Digunakan untuk mengetahui lebar dan tinggi layar dari user
     */
    private final static Toolkit tk = Toolkit.getDefaultToolkit();
    
    /**
     * Method ini digunakan untuk mengetahui nama dari device user
     * Nama didapatkan dari method getProperty dengan key:"user.name" dari class System
     * 
     * @see System
     * @return nama dari device user 
     */
    public static String getUsername(){
       return System.getProperty("user.name");
    }

    /**
     * Untuk mendapatkan direktori icon aplikasi
     * Direktori didapatkan dari method getImage pada class ImageIcon 
     * 
     * @see ImageIcon
     * @return direktori icon aplikasi 
     */
    public static Image getWindowIcon(){
        return icon.getImage();
    }
    
    /**
     * Digunakan untuk mendapatkan lebar layar dari user
     * Lebar layar didapatkan salah satu method di class Toolkit yang outputnya double (di konversi ke int di method ini)
     * 
     * 
     * @see Toolkit
     * @return lebar layar user 
     */
    public static int getLebarScreen(){
        return (int) tk.getScreenSize().getWidth();
    }
    
    /**
     * Digunakan untuk mendapatkan tinggi layar dari user
     * Tinggi layar didapatkan salah satu method di class Toolkit yang outputnya double (di konversi ke int di method ini)
     * 
     * 
     * @see Toolkit
     * @return tinggi layar user 
     */
    public static int getTinggiScreen(){
        return (int) tk.getScreenSize().getHeight();
    }
    
    /**
     * Method ini digunakan untuk mendapatkan informasi tentang aplikasi sesuai dengan key yang dimasukan user
     * Cara kerja kelas ini adalah dengan membaca file about.haqi dipackage com.database
     * Method ini akan membaca tiap baris pada file about.haqi
     * Lalu datanya ditampung di variabel token(StringTokenizer) dengan delimetri ':' dan '\n'
     * Selanjutnya diproses untuk memisahkan antara key dan valuenya 
     * Contoh key & value = Author:achmad baihaqi | "kata sebelum tanda : adalah  'key' sedangkan kata sesudah : adalah 'value'"
     * Setelah diproses maka method akan mereturn value dari key
     * 
     * Macam macam key yang tersedia:
     * name     : digunakan untuk mendapatkan nama dari aplikasi 
     * version  : digunakan untuk mendapatkan versi dari aplikasi
     * author   : digunakan untuk mengetahui nama sang pembuat aplikasi
     * released : digunakan untuk mengetahui tahun rilis aplikasi
     * 
     * 
     * @see FileReader
     * @see BufferedReader 
     * @see StringTokenizer
     * 
     * @param key input untuk mengetahui informasi dari aplikasi 
     * @return info tentang aplikasi sesuai dengan input key
     */
    private static String getProperty(String key){

        try {
            FileReader f = new FileReader("database\\about.haqi");
            BufferedReader baca = new BufferedReader(f);
            StringTokenizer token;
            
                if(key.equalsIgnoreCase("name")){
                    token = new StringTokenizer(baca.readLine(),":\n");
                    token.nextToken();
                    return token.nextToken();
                }else if(key.equalsIgnoreCase("version")){
                    baca.readLine(); // membuang name
                    token = new StringTokenizer(baca.readLine(), ":\n");
                    token.nextToken();
                    return token.nextToken();
                }else if(key.equalsIgnoreCase("author")){
                    baca.readLine(); // membuang name
                    baca.readLine(); // membuang version
                    token = new StringTokenizer(baca.readLine(), ":\n");
                    token.nextToken();
                    return token.nextToken();
                }else if(key.equalsIgnoreCase("released")){
                    baca.readLine(); // membuang name
                    baca.readLine(); // membuang version
                    baca.readLine(); // membuang author
                    token = new StringTokenizer(baca.readLine(), ":\n");
                    token.nextToken();
                    return token.nextToken();
                }else{
                    System.out.println("not found code");
                    javax.swing.JOptionPane.showMessageDialog(null, key+" <--- bukan sebuah kode");
                }
            
        } catch (IOException ex) {
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "Terjadi kesalahan di (Apps.java)\n" + ex);
        }
        return "null";
    }
    
    /**
     * Method ini digunakan untuk mengetahui nama dari aplikasi
     * Method ini menggunakan method getProperty untuk mendapatkan nama dari aplikasi dengan memasukan key 'name' 
     * 
     * @return nama dari aplikasi 
     */
    public static String getName(){
        return getProperty("name");
    }
    
    /**
     * Method ini digunakan untuk mengetahui versi dari aplikasi
     * Method ini menggunakan method getProperty untuk mendapatkan versi dari aplikasi dengan memasukan key 'versi' 
     * 
     * @return versi dari aplikasi 
     */
    public static String getVersion(){
        return getProperty("version");
    }
    
    /**
     * Method ini digunakan untuk mengetahui name dari pembuat aplikasi
     * Method ini menggunakan method getProperty untuk mendapatkan nama dari pembuat aplikasi dengan memasukan key 'versi' 
     * 
     * @return nama dari pembuat aplikasi 
     */
    public static String getAuthor(){
        return getProperty("author");
    }
    
    /**
     * Method ini digunakan untuk mengetahui tahun rilis aplikasi
     * Method ini menggunakan method getProperty untuk mendapatkan tahun rilis aplikasi dengan memasukan key 'versi' 
     * 
     * @return tahun rilis aplikasi
     */
    public static String getReleased(){
        return getProperty("released");
    }
    
    public static void openWindow(){
    
        Thread t = new Thread(new Runnable(){
        
            @Override 
            public void run(){
                new com.window.SimpanGambar().setVisible(true);
            }
        
        });
    
        
        t.start();
        
        try{
            t.join();
        }catch(InterruptedException iex){
        
        
        }
        
    }
    
}
