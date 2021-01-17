package com.media.images;

import com.database.Database;
import com.media.sounds.PlaySounds;
import com.system.Apps;
import com.system.Files;
import com.system.Settings;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


/**
 * Class ini digunakann untuk melakukan screenshot pada aplikasi
 * 
 * @author Achmad Baihaqi
 * @since 14 July 2020
 * @version 1.1
 */
public class Screenshot {
    
    /**
     * Digunakan untuk menyimpan directory dari file screenshot terakhir
     */
    private static String lastScreenshot;
    
    /**
     * Method ini digunakan untuk mengambil screenshot.
     * Hasil screenshot akan disimpan didirektori yang diatur user.
     * Hasil screenshot akan diberi nama dan format yang diinputkan user.
     * Format gambar yang didukung dimethod ini hanya ada tiga yaitu: jpg, png dan bmp.
     * 
     * @param filename input yang akan digunakan untuk memberi nama pada gambar hasil screeshot
     */
    public static void ambilScreenshot(final String filename){
        
        try{
            String formatType = Settings.getSetting(Settings.SETTING_FORMAT).substring(1), // mendapatkan tipe format gambar example png
                   penyimpanan = Settings.getSetting(Settings.SETTING_PEYIMPANAN), // mendapatkan penyimpanan screenshot
                   // untuk membuat file screenshot
                   createScreenshot = penyimpanan + filename +" [haqi]" + Settings.getSetting(Settings.SETTING_FORMAT)
            ;
            
            Rectangle rectangle = new Rectangle(Apps.getLebarScreen(), Apps.getTinggiScreen()); // mengatur lebar dan tinggi screenshot
            BufferedImage capture = new Robot().createScreenCapture(rectangle); // menangkap screenshot layar
            
                /**
                 * Mengecek apakah direktori penyimpanan screenshot yang diatur user exist atau tidak
                 * Jika exist maka screenshot akan secara otaomatis tersimpan
                 * Jika tidak maka screenshot akan disimpan di desktop
                 */
                if(Files.isExistFolder(penyimpanan)){
                    ImageIO.write(capture, formatType, new File(createScreenshot)); // menyimpan hasil screenshot
                    Screenshot.setLastScreenshot(createScreenshot);                    
                }else{
                    Apps.showNotification("Direktori penyimpanan screenshot tidak ditemukan\n"
                                        + "Screenshot akan disimpan di desktop dan format pada gambar diatur ke .png\n"
                                        + "Atau mungkin OS anda tidak mengizinkan membuat file di direktori yang anda atur!", Screenshot.class.getName(), "Silahkan untuk reset pengaturan anda untuk memperbaiki error ini!!");
                    // screenshot akan disimpan ke desktop
                    ImageIO.write(capture, "png", new File("C:\\Users\\" + Apps.getUsername() + "\\Desktop\\"+filename+".png")); // menyimpan screenshot ke desktop
                    Screenshot.setLastScreenshot(createScreenshot);
                    Settings.setSettings(Settings.SETTING_PEYIMPANAN, "C:\\Users\\" + Apps.getUsername() + "\\Desktop\\");
                }

            
        }catch (IOException ex){
            Apps.showException("Terjadi kesalahan saat mengambil screenshot!!", Screenshot.class.getName(), ex.toString());
        }catch (AWTException ex) {
            Apps.showException("Gagal membuat screenshot!", Screenshot.class.getName(), ex.toString());
                
        }
    }
    
    public static void createSample(){
       
        new Thread(new Runnable(){

            @Override
            public void run(){
                try {
                    Thread.sleep(1000);
                    String penyimpanan = Database.getDirectoryDB() +"temp\\", // mendapatkan penyimpanan screenshot
                           createScreenshot = penyimpanan + "sample "+Apps.getUsername()+".png"; // untuk membuat file screenshot

                    Rectangle rectangle = new Rectangle(Apps.getLebarScreen(), Apps.getTinggiScreen()); // mengatur lebar dan tinggi screenshot
                    BufferedImage capture = new Robot().createScreenCapture(rectangle); // menangkap screenshot layar
                    /**
                     * Mengecek apakah direktori penyimpanan screenshot yang diatur user exist atau tidak
                     * Jika exist maka screenshot akan secara otaomatis tersimpan
                     */
                    if(Files.isExistFolder(penyimpanan)){
                        ImageIO.write(capture, "png", new File(createScreenshot)); // menyimpan hasil screenshot     
                        System.out.println("sample dibuat");
                    }else{
                        System.out.println("Gagal membuat sample");
                    }                        
                } catch (InterruptedException e) {
                    System.out.println("Error : " + e.getMessage());
                }catch (IOException ex){
                    Apps.showException("Terjadi kesalahan saat mengambil screenshot!!", Screenshot.class.getName(), ex.toString());
                }catch (AWTException ex) {
                    Apps.showException("Gagal membuat screenshot!", Screenshot.class.getName(), ex.toString());
                }
            }
        }).start();
    }
    
    /**
     * Digunakan untuk mengatur screenshot terakhir
     * 
     * @param last direktori screenshot terakhir
     */
    public static void setLastScreenshot(String last){
        lastScreenshot = last;
    }
    
    /**
     * Untuk mendapatkan direktori dari screenshot terakhir.
     * Screenshot terakhir akan digunakan sebagai input untuk :  
     * Menyimpan gambar, Mengubah nama gambar, Membuka gambar, Membuka folder gambar, dan untuk Menghapus gambar
     * 
     * @return screenshot terakhir
     */
    public static String getLastScreenshot(){
        if(lastScreenshot != null){
            return lastScreenshot;
        }else{
            return "ERROR";
        }
    }
    
    /**
     * Digunakan untuk memutar efek suara saat user melakukan screenshot
     * 
     */
    public static void playSoundEffect(){
        String sound = Settings.getSetting(Settings.SETTING_EFEK_SUARA); // mendapatkan efek suara yang diatur user di setting
        
            switch(sound){
                case "suara 1.mp3":
                    PlaySounds.play(PlaySounds.SUARA_1); break;
                case "suara 2.mp3":    
                    PlaySounds.play(PlaySounds.SUARA_2); break;
                case "suara 3.mp3":
                    PlaySounds.play(PlaySounds.SUARA_3); break;
                case "suara 4.mp3":
                    PlaySounds.play(PlaySounds.SUARA_4); break;
                case "suara 5.mp3":
                    PlaySounds.play(PlaySounds.SUARA_5); break;
                default : System.out.println("Efek suara dinonaktifkan."); break;
            }
    }
    

}
