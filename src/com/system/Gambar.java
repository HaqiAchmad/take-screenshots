package com.system;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;


/**
 * Class ini digunkan untuk menangkap screenshot layar, pemorsesan gambar, dan mengetahui informasi tentang gambar
 * Pemrosesan yang dimaksud adalah : mengubah nama gambar, menghapus atau menyimpan gambar "bukan mengedit gambar"
 * Informasi gambar antara yang dapat didapatkan dimethod ini antara lain : tinggi atau lebar gambar, size gambar dan format gambar
 * 
 * 
 * Type class : Superclass
 * Total method : 10
 * Total line : 287
 * 
 * @author Achmad Baihaqi
 * @version 1.4
 * @since 01 03 2020
 */
public class Gambar {

    /**
     * Di bawah in adalah format-format yang tersedia untuk gambar
     */
    public static final int FORMAT_JPG = 1;
    public static final int FORMAT_PNG = 2;
    public static final int FORMAT_BMP = 3;

    
    /**
     * Method ini digunakan untuk mendapatkan direktori yang diatur user untuk menyimpan hasil screenshot
     * Dengan membaca file SaveTo.haqi di package com.database
     * Lalu method akan mereturn data yang ada difile SaveTo.haqi 
     * Jika file SaveTo.haqi kosong atau terjadi error maka method akan mereturn direktori userhome\\downloads sebagai default Example : "C:\\Users\\YOU\\Downloads\\
     * 
     * @see FileReader
     * @see BufferedReader
     * 
     * @return direktori untuk menyimpan file hasil screenshot
     */
    public static String getDefaultSave() {
        
        try{
            
            FileReader file = new FileReader("src\\com\\database\\saveto.haqi");
            BufferedReader baca = new BufferedReader(file);
            String buffer = baca.readLine();
            
                // jika file database\\saveto.haqi (kosong) maka scr default file tersimpan ke userhome\\download
                if(buffer == null){
                    Gambar.setDefaultSave("C:\\Users\\" + System.getProperty("user.name") + "\\Downloads\\");
                    return "C:\\Users\\" + com.system.Apps.getUsername() + "\\Downloads\\";
                }else{
                    return buffer;
                }
           
            
        }catch(java.io.IOException ex){
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "Terjadi kesalahan!\n" + ex); 
        }
        return "C:\\Users\\" + com.system.Apps.getUsername() + "\\Downloads\\"; // default direktori jika terjadi error
    }

    /**
     * Method ini digunakan untuk menyimpan direktori peyimpanan screenshot yang diatur user
     * Direktori akan disimpan kefile SaveTo.haqi pada package com.database
     * User dapat menguabah setelan direktori di window com.window.Root.java
     * 
     * @see FileWriter 
     * @see BufferedWriter
     * 
     * @param simpanKe input direktori yang diatur user
     */
    public static void setDefaultSave(String simpanKe) {
        try{
            
            FileWriter file = new FileWriter("src\\com\\database\\saveto.haqi");
            BufferedWriter tulis = new BufferedWriter(file);
            
            tulis.write(simpanKe); tulis.newLine(); tulis.flush();
            
        }catch(java.io.IOException ex){
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "Terjadi kesalahan!\n" + ex);
        }
    }

    /**
     * Method ini digunakan untuk mengambil screenshot
     * Method dapat mengambil screenshot dengan memanfaatkan class BufferedImage dan Rectangle
     * Lalu method akan menyimpan hasil screenshot dengan bantuan class ImageIO
     * Hasil screenshot akan disimpan didirektori yang diatur user
     * Hasil screenshot akan diberi nama dan format yang diinputkan user
     * Format gambar yang didukung dimethod ini hanya ada tiga yaitu: jpg, png dan bmp
     * 
     * @see Rectangle
     * @see BufferedImage
     * @see ImageIO
     * 
     * @param filename input yang akan digunakan untuk memberi nama pada gambar hasil screeshot
     * @param format input format yang akan digunakan pada gambar
     */
    public static void ambilGambarLayar(String filename, final int format){ // mengambil ss dari layar

        try{

            Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage capture = new Robot().createScreenCapture(rectangle); // menangkap ss layar

            // menyimpan filenya sesuai format yg dinputkan user ke direktori defalult
            switch (format){
                case FORMAT_JPG:
                    ImageIO.write(capture, "jpg", new File(Gambar.getDefaultSave()+filename+".jpg"));
                    break;
                case FORMAT_PNG:
                    ImageIO.write(capture, "png", new File(Gambar.getDefaultSave()+filename+".png"));
                    break;
                case FORMAT_BMP:
                    ImageIO.write(capture, "bmp", new File(Gambar.getDefaultSave()+filename+".bmp"));
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Format tidak tersedia");
            }


        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Digunakan untuk mendapatkan nama dari gambar
     * Method akan mengambil kata ditengah" string dengan menggunakan method substring
     * Yang di mulai dari var i sampai var j
     *  var i : adalah index terakhir dari char '\', 
     *  var j : adalah index terakthir dari char '.'
     * 
     *  Example : C:\\user\\YOU\\Downloads\\gambar.jpg maka outpunya adalah "gambar"
     * 
     * @param direkoriGambar input direktori gambar
     * @return nama dari gambar
     */
    public static String getNamaGambar(String direkoriGambar){
        int i = direkoriGambar.lastIndexOf("\\"), j = direkoriGambar.lastIndexOf(".");
        return direkoriGambar.substring(i+1,j); 
    }
    
    /**
     * Digunakan untuk mengubah nama gambar sesuai input yang dimasukan user 
     * Dengan memanfaatkan method renameTo pada class File 
     * String ubah digunakan untuk tidak menduplicate file yang lama
     * 
     * @param inputGambar direktori gambar yang akan diubah
     * @param namaBaru input nama baru
     */
    public static void ubahNamaGambar(File inputGambar, String namaBaru){ 
        File file = new File(inputGambar.toString());
        String ubah = file.getParentFile() +"\\"+ namaBaru +".png"; // agar tidak membuat filebaru
            if (file.renameTo(new File(ubah))){
                System.out.println("Nama berhasil diubah");
            }else {
                System.out.println("Gagal mengubah nama");
            }
    }

     /**
     * Digunakan untuk mendapatkan format dari gambar
     * Cara kerja method hampir sama seperti method getNamaGambar
     * Method akan mengambil kata ditengah" string dengan menggunakan method substring yang di mulai dari var i sampai index terakthir
     *  var i : adalah index terakhir dari char '.', 
     * 
     *  Example : C:\\user\\YOU\\Downloads\\gambar.jpg maka outpunya adalah ".jpg"
     * 
     * @param direkoriGambar input direktori gambar
     * @return format dari gambar
     */
    public static String getFormatGbr(String direkoriGambar){ 
        int i = direkoriGambar.lastIndexOf(".");
        return direkoriGambar.substring(i);
    }

    /**
     * Method ini digunakan untuk mengambil lebar dari gambar
     * Method in memanfaatkan class BufferedImage untuk mendapatkan lebar dari gambar
     * Jika terjadi error maka method akan mereturn nilai -1
     * 
     * @see BufferedImage
     * 
     * @param inputGambar input direktori gambar
     * @return lebar dari gambar
     */
    public static int lebarGambar(File inputGambar){ // mendapatkan lebar di gbr
        try {
           BufferedImage gbr = ImageIO.read(new File(inputGambar.getPath()));
                return gbr.getWidth();
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
       return -1;
    }

    /**
     * Method ini digunakan untuk mengambil tinggi dari gambar
     * Method in memanfaatkan class BufferedImage untuk mendapatkan tinggi dari gambar
     * Jika terjadi error maka method akan mereturn nilai -1
     * 
     * @see BufferedImage
     * 
     * @param inputGambar input direktori gambar
     * @return tinggi dari gambar
     */
    public static int tinggiGambar(File inputGambar){ // mendapatkan tinggi dari gbr
        try {
            BufferedImage gbr = ImageIO.read(new File(inputGambar.getPath()));
            return gbr.getHeight();
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return -1;
    }

    /**
     * Method ini digunakan untuk menghapus gambar
     * Method ini menggunakan class File untuk menghapus gambar
     * 
     * Note : jika gagal dalam mengapus file kemungkinan direktori gambar salah
     * 
     * @see File
     * 
     * @param inputGambar input direktori gambar 
     */
    public static void hapusGambar(File inputGambar){ // menghapus gambar
        File file = new File(inputGambar.toString());
        if (file.delete()){
            System.out.println(inputGambar.toString() + " -> berhasil di delete");
        }else {
            System.out.println(inputGambar.toString() + " -> Gagal menghapus gambar");
        }
    }
         
    /**
     * Digunakan untuk mendapatkan ukuran/size dari gambar
     * Dengan memanfaatkan method length() pada class File untuk mendapatkan size dari gambar
     * Output dari method length() tersebut akan diproses pada method ini
     * Cara pemrosesanya sebagai berikut:
     *  - jika sizenya berkisar antara 0 hingga 999 maka hasilnya adalah bytes, contoh output : 40 bytes
     *  - jika sizenya berkisar antara 1000 hingga 9999999 maka hasilnya adalah kilobytes, contoh output: 40 Kb
     *  - jika sizenya lebih besar dari 1000000 maka akan hasilnya megabytes, contoh output: 40 Mb
     *  Note : jika size gambar adalah gigabytes maka akan dianggap sebagai megabytes
     *         jika terjadi error maka akan mereturn -1
     * 
     * @see File
     * 
     * @param gambar input direktori gambar
     * @return size dari gambar
     */
    public static String getSize(String gambar){
        File file = new File(gambar);

       double size = file.length();
          if(size > 0 && size <= 999){
              return Double.toString((int) size) + " bytes";
          }else if(size >= 1000 && size <= 999999){
              return Double.toString((int) size/1024) + " kb";
          }else if(size >= 1000000){
              return Double.toString((int)size/(1024*1024)) + " Mb";
          }
          
          return "-1";
    }



}
