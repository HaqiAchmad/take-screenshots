package com.media.images;

import com.system.Apps;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


/**
 * Class ini digunkan untuk menangkap screenshot layar, pemorsesan gambar, dan mengetahui informasi tentang gambar
 * Informasi gambar antara yang dapat didapatkan dimethod ini antara lain : tinggi atau lebar gambar
 *  
 * @author Achmad Baihaqi
 * @version 1.7
 * @since 01 03 2020
 */
public class Gambar {


    /**
     * Method ini digunakan untuk mengambil screenshot.
     * Hasil screenshot akan disimpan didirektori yang diatur user.
     * Hasil screenshot akan diberi nama dan format yang diinputkan user.
     * Format gambar yang didukung dimethod ini hanya ada tiga yaitu: jpg, png dan bmp.
     * 
     * @see Rectangle
     * @see BufferedImage
     * @see ImageIO
     * 
     * @param filename input yang akan digunakan untuk memberi nama pada gambar hasil screeshot
     */
    public static void ambilGambarLayar(final String filename){ // mengambil ss dari layar
        Screenshot.ambilScreenshot(filename);
    }

    /**
     * Method ini digunakan untuk mengambil lebar dari gambar
     * Jika terjadi error maka method akan mereturn nilai -1000
     * 
     * 
     * @param inputGambar input direktori gambar
     * @return lebar dari gambar
     */
    public static int lebarGambar(File inputGambar){ // mendapatkan lebar di gbr
        try {
           BufferedImage gbr = ImageIO.read(new File(inputGambar.getPath()));
                return gbr.getWidth();
        }catch (IOException ex){
            Apps.showException("Tidak dapat menghitung lebar dari gambar!!\nMungkin file screenshot telah dihapus!!", Gambar.class.getName(), ex.toString());
        }
       return -1000;
    }

    /**
     * Method ini digunakan untuk mengambil tinggi dari gambar
     * Jika terjadi error maka method akan mereturn nilai -1000
     * 
     * 
     * @param inputGambar input direktori gambar
     * @return tinggi dari gambar
     */
    public static int tinggiGambar(File inputGambar){ // mendapatkan tinggi dari gbr
        try {
            BufferedImage gbr = ImageIO.read(new File(inputGambar.getPath()));
            return gbr.getHeight();
        }catch (IOException ex){
            Apps.showException("Tidak dapat menghitung tinggi dari gambar!!\nMungkin file screenshot telah dihapus!!", Gambar.class.getName(), ex.toString()); 
        }
        return -1000;
    }
}
