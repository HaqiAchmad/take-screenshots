package com.system;

import com.database.Database;
import java.io.File;

/**
 * Class ini digunakan untuk merekam aktivitas yang dilakukan user, dan menuliskan datanya ke database
 * Contoh aktivitas seperti : user melakukan screenshot, user mengubah setelan applikasi, user membuka sebuah window, dll
 *  
 * 
 * @author Achmad Baihaqi
 * @version 1.6
 * @since 15-05-2020
 */
public class Aktivitas {

    /**
     * File yang digunakan untuk menyimpan aktivitas user
     */
     private static final File fileAktivitas = new File(Database.getDirectoryDB() + "aktivitas.haqi"),
                               fileScreenshots = new File(Database.getDirectoryDB() + "screenshots.haqi");
     
    /**
     * 
     * Bertugas untuk menuliskan semua aktivitas yang dilakukan user ke database tepatnya ke file aktivitas.haqi
     * Method ini akan menulikan aktivitas user ke file tersebut pada baris baru
     * 
     * 
     * @param aktivitas aktivitas yang dilakukan user
     */
    public static void addAktivitas(String aktivitas){
        Files.writeFile(fileAktivitas.toString(), aktivitas, true);
    }
    
    /**
     * Menuliskan direktori screenshot ke file screenshots.haqi
     * Direktori akan dituliskan pada baris baru (append)
     * 
     * @see FileWriter
     * @see BufferedWriter
     * @param screenshot input direktori screenshot yang diambil user
     */
    public static void addScreenshot(String screenshot){
        Files.writeFile(fileScreenshots.toString(), screenshot, true);
    } 
}