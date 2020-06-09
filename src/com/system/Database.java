package com.system;

import java.io.*;
import javax.swing.JOptionPane;


public class Database {

    /**
     * untuk mengecek apakah file ada atau tidak
     */
    private static File fileAbout = new File("database\\about.haqi"),
            fileAktivitas = new File("database\\aktivitas.haqi"),
            fileDate = new File("database\\date.haqi"),
            fileIsActive = new File ("database\\isActive.haqi"),
            fileIsAutoSave = new File("database\\isAutoSave.haqi"),
            fileIsOpen = new File("database\\isOpen.haqi"),
            fileLanguage = new File("database\\language.haqi"),
            fileSaveTo = new File("database\\SaveTo.haqi"),
            fileScreenshots = new File("database\\screenshots.haqi"),
            fileTheme = new File("database\\theme.haqi"),
            fileTotalSS = new File("database\\TotalSS.haqi");


    public static void createNotExistDb(){

        int totalDB = 11;

        for(int i = 0; i <= totalDB; i++){
            if(!Files.isExistFolder("database\\")){
                JOptionPane.showMessageDialog(null, "Database tidak ditemukan!");
                Files.createFolder("database\\");
            }else if(!Files.isExistFile(fileAbout.toString())){
                JOptionPane.showMessageDialog(null, fileAbout.toString() +  " tidak ada di database!!");
                Files.createFile("database\\", "about.haqi");
            }else if(!Files.isExistFile(fileAktivitas.toString())){
                JOptionPane.showMessageDialog(null, fileAktivitas.toString() + " tidak ada di database!!");
                Files.createFile("database\\", "aktivitas.haqi");
            }else if(!Files.isExistFile(fileDate.toString())){
                JOptionPane.showMessageDialog(null, fileDate.toString() + " tidak ada di database!!");
                Files.createFile("database\\", "date.haqi");
            }else if(!Files.isExistFile(fileIsActive.toString())){
                JOptionPane.showMessageDialog(null, fileIsActive.toString() + " tidak ada di database!!");
                Files.createFile("database\\", "IsActive.haqi");
            }else if(!Files.isExistFile(fileIsAutoSave.toString())){
                JOptionPane.showMessageDialog(null, fileIsAutoSave.toString() + " tidak ada di database!!");
                Files.createFile("database\\", "IsAutoSave.haqi");
            }else if(!Files.isExistFile(fileIsOpen.toString())){
                JOptionPane.showMessageDialog(null, fileIsOpen.toString() + " tidak ada di database!!");
                Files.createFile("database\\", "IsOpen.haqi");
            }else if(!Files.isExistFile(fileLanguage.toString())){
                JOptionPane.showMessageDialog(null, fileLanguage.toString() + " tidak ada di database!!");
                Files.createFile("database\\", "language.haqi");
            }else if(!Files.isExistFile(fileSaveTo.toString())){
                JOptionPane.showMessageDialog(null, fileSaveTo.toString() + " tidak ada di database!!");
                Files.createFile("database\\", "SaveTo.haqi");
            }else if(!Files.isExistFile(fileScreenshots.toString())){
                JOptionPane.showMessageDialog(null, fileScreenshots.toString() + " tidak ada di database!!");
                Files.createFile("database\\", "screenshots.haqi");
            }else if(!Files.isExistFile(fileTotalSS.toString())){
                JOptionPane.showMessageDialog(null, fileTotalSS.toString() + " tidak ada di database!!");
                Files.createFile("database\\", "TotalSs.haqi");
            }else if(!Files.isExistFile(fileTheme.toString())){
                JOptionPane.showMessageDialog(null, fileTheme.toString() + " tidak ada di database!!");
                Files.createFile("database\\", "Theme.haqi");
            }

        }

    }

    public static void createNotExistBackup(){
        String directoryBackup = "database\\backup\\";
        int totalDB = 11;

        for(int i = 0; i <= totalDB; i++){
            if(!Files.isExistFolder(directoryBackup)){
                JOptionPane.showMessageDialog(null, "Database backup tidak ditemukan!");
                Files.createFolder(directoryBackup);
            }else if(!Files.isExistFile(directoryBackup+"about.haqi")){
                JOptionPane.showMessageDialog(null, directoryBackup+"about.haqi" +  " tidak ada di database!!");
                Files.createFile(directoryBackup, "about.haqi");
            }else if(!Files.isExistFile(directoryBackup+"aktivitas.haqi")){
                JOptionPane.showMessageDialog(null, directoryBackup+"aktivitas.haqi" + " tidak ada di database!!");
                Files.createFile(directoryBackup, "aktivitas.haqi");
            }else if(!Files.isExistFile(directoryBackup+"date.haqi")){
                JOptionPane.showMessageDialog(null, directoryBackup+"date.haqi" + " tidak ada di database!!");
                Files.createFile(directoryBackup, "date.haqi");
            }else if(!Files.isExistFile(directoryBackup+"isActive.haqi")){
                JOptionPane.showMessageDialog(null, directoryBackup+"isActive.haqi" + " tidak ada di database!!");
                Files.createFile(directoryBackup, "IsActive.haqi");
            }else if(!Files.isExistFile(directoryBackup+"IsAutoSave.haqi")){
                JOptionPane.showMessageDialog(null, directoryBackup+"IsAutoSave.haqi" + " tidak ada di database!!");
                Files.createFile(directoryBackup, "IsAutoSave.haqi");
            }else if(!Files.isExistFile(directoryBackup+"IsOpen.haqi")){
                JOptionPane.showMessageDialog(null, directoryBackup+"IsOpen.haqi" + " tidak ada di database!!");
                Files.createFile(directoryBackup, "IsOpen.haqi");
            }else if(!Files.isExistFile(directoryBackup+"language.haqi")){
                JOptionPane.showMessageDialog(null, directoryBackup+"language.haqi" + " tidak ada di database!!");
                Files.createFile(directoryBackup, "language.haqi");
            }else if(!Files.isExistFile(directoryBackup+"SaveTo.haqi")){
                JOptionPane.showMessageDialog(null, directoryBackup+"SaveTo.haqi" + " tidak ada di database!!");
                Files.createFile(directoryBackup, "SaveTo.haqi");
            }else if(!Files.isExistFile(directoryBackup+"screenshots.haqi")){
                JOptionPane.showMessageDialog(null, directoryBackup+"screenshots.haqi" + " tidak ada di database!!");
                Files.createFile(directoryBackup, "screenshots.haqi");
            }else if(!Files.isExistFile(directoryBackup+"TotalSs.haqi")){
                JOptionPane.showMessageDialog(null, directoryBackup+"TotalSs.haqi" + " tidak ada di database!!");
                Files.createFile(directoryBackup, "TotalSs.haqi");
            }else if(!Files.isExistFile(directoryBackup+"Theme.haqi")){
                JOptionPane.showMessageDialog(null, directoryBackup+"Theme.haqi" + " tidak ada di database!!");
                Files.createFile(directoryBackup, "Theme.haqi");
            }

        }


    }

    public static void backupDatabase(){
        String backup = "database\\backup\\";
        createNotExistDb();
        createNotExistBackup();
        // membackup database
        Files.copyDataFile(fileAbout.toString(), backup+"about.haqi");
        Files.copyDataFile(fileAktivitas.toString(), backup+"aktivitas.haqi");
        Files.copyDataFile(fileDate.toString(), backup+"date.haqi");
        Files.copyDataFile(fileIsActive.toString(), backup+"IsActive.haqi");
        Files.copyDataFile(fileIsAutoSave.toString(), backup+"IsAutoSave.haqi");
        Files.copyDataFile(fileIsOpen.toString(), backup+"IsOpen.haqi");
        Files.copyDataFile(fileLanguage.toString(), backup+"language.haqi");
        Files.copyDataFile(fileSaveTo.toString(), backup+"SaveTo.haqi");
        Files.copyDataFile(fileScreenshots.toString(), backup+"screenshots.haqi");
        Files.copyDataFile(fileTheme.toString(), backup+"Theme.haqi");
        Files.copyDataFile(fileTotalSS.toString(), backup+"totalSS.haqi");
        System.out.println("Database berhasil dibackup pada " + Tanggal.getTanggal_Activity());
    }

}
