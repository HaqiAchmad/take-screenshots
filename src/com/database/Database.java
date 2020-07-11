package com.database;

import com.system.Apps;
import com.system.Files;
import com.system.Settings;

import java.io.File;
import java.io.IOException;


/**
 * Digunakan untuk pengolahan file pada dbase
 * 
 * @author Achmad Baihaqi
 * @version 1.1
 * @since Take screenshot 1.4
 */
public class Database {

    /**
     * file yang ada didalam package com.database
     */
    private static final File  fileAktivitas = new File("src\\com\\database\\aktivitas.haqi"),
                               fileScreenshots = new File("src\\com\\database\\screenshots.haqi"),
                               fileAbout = new File("src\\com\\database\\about.haqi"),
                               fileSettings = new File("src\\com\\database\\settings.haqi");


    /**
     * Digunakan untuk mengecek file/folder yang ada didatabase ada atau tidak.
     * Jika file tidak ada maka akan dibuatkan
     * 
     * @throws IOException menangkap exception saat mereset setting
     */
    public static void createNotExistDatabase() throws IOException{
        
        // mencegek apakah folder database ada atau tidaks
        if(!Files.isExistFolder("src\\com\\database\\")){
            Files.createFolders("src\\com\\database\\");
            Apps.showException("Folder src\\com\\database\\ tidak dapat ditemukan", Database.class.getName(), IOException.class.getName());
        }
        
        // mencegek apakah folder temp ada atau tidaks
        if(!Files.isExistFolder("src\\com\\database\\temp\\")){
            Files.createFolders("src\\com\\database\\temp\\");
            Apps.showException("Folder src\\com\\database\\temp\\ tidak dapat ditemukan", Database.class.getName(), IOException.class.getName());
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
            Apps.resetDataApp();
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
            Settings.resetSetting();
        }
        

    }


}
