package com.database;

import com.system.Apps;
import com.system.Files;
import com.system.Settings;

import java.io.File;
import java.io.IOException;


/**
 * Digunakan untuk mengelola file pada dbase
 * 
 * @author Achmad Baihaqi
 * @version 1.3
 * @since Take screenshot 1.4 
 */
public class Database {

    private static final String FOLDER_DB = "C:\\ProgramData\\Punya Haqi\\Take Screenshots 1.7.0\\database\\", 
                                FOLDER_DB_TEMP = "C:\\ProgramData\\Punya Haqi\\Take Screenshots 1.7.0\\database\\temp\\";
    
    /**
     * file yang ada didalam database
     */
    private static final File  fileAktivitas = new File(getDirectoryDB() + "aktivitas.haqi"),
                               fileScreenshots = new File(getDirectoryDB() + "screenshots.haqi"),
                               fileAbout = new File(getDirectoryDB() + "about.haqi"),
                               fileSettings = new File(getDirectoryDB() + "settings.haqi");


    /**
     * Digunakan untuk mengecek file/folder yang ada didatabase ada atau tidak.
     * Jika file tidak ada maka akan dibuatkan
     * 
     * @throws IOException menangkap exception saat mereset setting
     */
    public static void createNotExistDatabase() throws IOException{
        
        // untuk mereset setting jika file setting.haqi tidak ditemukan
        Settings setting = new Settings();
        // untuk mereset data aplikasi jika file about.haqi tidak ditemukan
        Apps apps = new Apps();
        
        // mencegek apakah folder database ada atau tidak
        if(!Files.isExistFolder(FOLDER_DB)){
            // membuat folder / file yang tidak ditemukan
            Files.createFolders(FOLDER_DB);
            Files.createFolders(FOLDER_DB_TEMP);
            Files.createFile(fileAktivitas.toString());
            Files.createFile(fileAbout.toString());
            Files.createFile(fileScreenshots.toString());
            Files.createFile(fileSettings.toString());
            // mereset data aplikasi
            apps.resetDataApp();
            setting.resetSetting();
        }else{
            // mencegek apakah folder temp ada atau tidaks
            if(!Files.isExistFolder(FOLDER_DB_TEMP)){
                Files.createFolders(FOLDER_DB_TEMP);
                Apps.showException("Folder "+FOLDER_DB_TEMP+" tidak dapat ditemukan", Database.class.getName(), IOException.class.getName());
            }

            // mengecek apakah file aktivitas.haqi ada atau tidak
            if(!Files.isExistFile(fileAktivitas.toString())){
                Files.createFile(fileAktivitas.toString());
                Apps.showException(fileAktivitas.toString()+" Tidak dapat ditemukan", Database.class.getName(), IOException.class.getName());
            }

            // mengecek apakah file about.haqi ada atau tidak
            if(!Files.isExistFile(fileAbout.toString())){
                Files.createFile(fileAbout.toString());
                Apps.showException(fileAbout.toString()+" Tidak dapat ditemukan", Database.class.getName(), IOException.class.getName());
                apps.resetDataApp();
            }

            // mengecek apakah file screenshots.haqi ada atau tidak
            if(!Files.isExistFile(fileScreenshots.toString())){
                Files.createFile(fileScreenshots.toString());
                Apps.showException(fileScreenshots.toString()+" Tidak dapat ditemukan", Database.class.getName(), IOException.class.getName());
            }

            // mengecek apakah file settings.haqi ada atau tidak
            if(!Files.isExistFile(fileSettings.toString())){
                Files.createFile(fileSettings.toString());
                Apps.showException(fileSettings.toString()+" Tidak dapat ditemukan", Database.class.getName(), IOException.class.getName());
                setting.resetSetting();
            }
            
        }
    }

    /**
     * Digunakan untuk mendapatkan directory dari database
     * 
     * @return directory dari database 
     */
    public static String getDirectoryDB(){
        return Database.FOLDER_DB;
    }

}
