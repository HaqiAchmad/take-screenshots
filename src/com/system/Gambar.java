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
 * @version 1.5
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
            String formatType = Settings.getFormatSelected().substring(1); // example : png
            Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage capture = new Robot().createScreenCapture(rectangle); // menangkap ss layar

            ImageIO.write(capture, formatType, new File(Settings.getPenyimpanan()+filename+Settings.getFormatSelected()));
//            switch (format){
//                case FORMAT_JPG:
//                    ImageIO.write(capture, "jpg", new File(Aktivitas.getPenyimpanan()+filename+".jpg"));
//                    break;
//                case FORMAT_PNG:
//                    ImageIO.write(capture, "png", new File(Aktivitas.getPenyimpanan()+filename+".png"));
//                    break;
//                case FORMAT_BMP:
//                    ImageIO.write(capture, "bmp", new File(Aktivitas.getPenyimpanan()+filename+".bmp"));
//                    break;
//                default:
//                    JOptionPane.showMessageDialog(null,"Format tidak tersedia");
//            }
//


        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
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






}
