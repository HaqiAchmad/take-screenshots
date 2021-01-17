package com.system;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Class ini digunakan untuk memanipulasi file yang ada didalam program
 *
 *
 * @author Achmad Baihaqi
 * @version 1.3
 * @since 10 06 2020
 */
public class Files {

    /**
     * Method ini digunakan untuk membuat file di dalam folder project
     * Sebelum membuat file method akan mengecek apakah file yang akan dibuat exist atau tidak
     * Jika tidak exist maka file akan dibuat jika exist maka file tidak akan dibuat
     *
     * @param filename nama file yang akan dibuat
     */
    public static void createFile(String filename){

        try {
            File file = new File(filename);
                if(isExistFile(filename)){
                    System.out.println("File tersebut sudah ada");
                }else{
                    if (file.createNewFile()){
                        System.out.println("File berhasil dibuat");
                    }else{
                        System.out.println("Gagal membuat file \""+ filename +"\"");
                    }
                }

        }catch (IOException ex){
            Apps.showException("Terjadi kesalahan saat membuat file \""+ filename +"\"", Files.class.getName(), ex.toString());
        }
    }

    /**
     * Method ini digunakan untuk membuat beberapa folder sekaligus
     * Sebelum membuat folder method akan mengecek apakah folder yang akan dibuat exist atau tidak
     * Jika tidak exist maka folder akan dibuat jika exist maka folder tidak akan dibuat
     *
     * @param folderName nama folder yang akan dibuat
     */
    public static void createFolders(String folderName){

        File file = new File(folderName);
            if(isExistFolder(folderName)){
                System.out.println("Folder tersebut sudah ada");
            }else{
                if(file.mkdirs()){
                    System.out.println("Folder berhasil dibuat");
                }else{
                    System.out.println("Gagal membuat folder \""+ folderName +"\"");
                }
            }
    }

    /**
     * Digunakan untuk mengecek apakah file exist atau tidak
     * Jika exist maka akan mereturn true jika tidak makan akan mereturn false
     *
     * @param directoryFile direktori dari file yang akan dicek
     * @return file exist atau tidak
     */
    public static boolean isExistFile(String directoryFile){

        File file = new File(directoryFile);
        return file.exists();
    }

    /**
     * Digunakan untuk mengecek apakah folder exist atau tidak
     * Jika exist maka akan mereturn true jika tidak makan akan mereturn false
     *
     * @param directory direktori dari folder yang akan dicek
     * @return folder exist atau tidak
     */
    public static boolean isExistFolder(String directory){

        File file = new File(directory);
        return file.exists();
    }

    /**
     * Digunakan untuk menampilkan semua data yang ada didalam file ke-console\layar
     * Method ini menggunakan class BufferedReader untuk membaca satu per satu baris data dari file
     * Lalu akan ditampilkan ke-console
     *
     * @see FileReader
     * @see BufferedReader
     *
     * @param filename file yang akan ditampikan datanya ke-console
     */
    public static void showFile(String filename){

        try{
            FileReader file = new FileReader(filename);
            BufferedReader show = new BufferedReader(file);
            String buffer = show.readLine();

                while (buffer != null){
                    System.out.println(buffer);
                    buffer = show.readLine();
                }

        }catch (IOException ex){
            System.out.println("Terjadi kesalahan " + ex);
        }
    }

    /**
     * Method ini digunakan untuk menambahkan data kedalam file
     * Method ini menggunakan class BufferedWriter untuk menambakan data kefile yang diinputkan
     * Jika param append bernilai true maka data akan ditambahkan dibaris baru sebaliknya jika bernilai false maka data akan menimpa data sebelumnya
     *
     * @see FileWriter
     * @see BufferedWriter
     *
     * @param filename filename yang akan ditambahkan datanya
     * @param data data yang akan ditambahkan kefile
     * @param append untuk mengecek apakah data akan ditambahkan kebaris baru atau menimpa data sebelumnya
     */
    public static void writeFile(String filename, String data, boolean append){
        try{
            FileWriter file = new FileWriter(filename, append);
            BufferedWriter tulis = new BufferedWriter(file);

            // mengecek apakah data yang dimasukan null atau tidak, jika data bernilai null maka akan menuliskan spasi saja
                if(data == null){
                    data = " ";
                    if(append){
                        tulis.newLine(); tulis.write(data); tulis.flush(); // menambahkan kebaris baru
                    }else{
                        tulis.write(data); tulis.flush();
                    }
                }else{ // jika data tidak bernilai null
                    if(append){
                        tulis.newLine(); tulis.write(data); tulis.flush(); // menambahkan kebaris baru
                    }else{
                        tulis.write(data); tulis.flush();
                    }
                }

        }catch (IOException ex){
            Apps.showException("File mungkin sudah dihapus", Files.class.getName(), ex.toString());
        }
    }
    
    /**
     * Digunakan untuk mendapatkan nama dari file
     * Method akan mengambil kata ditengah" string dengan menggunakan method substring
     * Yang di mulai dari var i sampai var j
     *  var i : adalah index terakhir dari char '\',
     *  var j : adalah index terakthir dari char '.'
     *
     *  Example : C:\\user\\YOU\\Downloads\\gambar.jpg maka outpunya adalah "gambar"
     *
     * @param filename input direktori file
     * @return nama dari file
     */
    public static String getNamaFile(String filename){
        int i = filename.lastIndexOf("\\"), j = filename.lastIndexOf(".");
        return filename.substring(i+1,j);
    }

    /**
     * Digunakan untuk mendapatkan format dari file
     * Sebelum mendapatkan format dari file method akan mengecek apakah yang diinputkan user itu file atau tidak
     * Jika bukan file maka method akan mereturn null
     * Jika file method akan mereturn format dari file
     *
     * @see File
     *
     * @param filename file yang akan didapatkan formatnya
     * @return format dari file
     */
    public static String getFormatFile(String filename){
        File file = new File(filename);
            if(!file.isFile()){
                System.out.println("Input yang anda masukan bukan sebuah file!");
                return null;
            }

        int i = filename.lastIndexOf(".");
        return filename.substring(i);
    }

    /**
     * Digunakan untuk mengubah nama dari file
     * Method ini mengunakan class File untuk mengubah nama
     * Jika nama berhasil diubah maka method akan menampilakan pesan "Nama berhasil diubah", jika gagal maka akan menampilkan "Gagal mengubah nama"
     *
     * @see File
     *
     * @param filename filename yang akan diubah namanya
     * @param newName nama baru dari file
     */
    public static void renameFile(String filename, String newName){
        File file = new File(filename);
        String ubahNama = file.getParentFile() +"\\"+ newName + getFormatFile(filename); // agar tidak membuat filebaru
        if (file.renameTo(new File(ubahNama))){
            System.out.println("Nama berhasil diubah");
        }else {
            System.out.println("Gagal mengubah nama");
        }
    }

    /**
     * Digunakan untuk mendapatkan ukuran/size dari file dalam betuk String
     * Dengan memanfaatkan method length() pada class File untuk mendapatkan size dari file
     * Output dari method length() tersebut akan diproses pada method ini
     * Cara pemrosesanya sebagai berikut:
     *  - jika sizenya berkisar antara 0 hingga 999 maka hasilnya adalah bytes, contoh output : 40 bytes
     *  - jika sizenya berkisar antara 1000 hingga 9999999 maka hasilnya adalah kilobytes, contoh output: 40 Kb
     *  - jika sizenya lebih besar dari 1000000 maka akan hasilnya megabytes, contoh output: 40 Mb
     *  Note : jika size file adalah gigabytes maka akan dianggap sebagai megabytes
     *         jika terjadi error maka akan mereturn -1
     *
     * @see File
     *
     * @param filename file yang akan diketahui sizenya
     * @return size dari file dalam bentuk integer
     */
    public static String getSizeFile(String filename){
        File file = new File(filename);

        double size = file.length();
        if(size > 0 && size <= 999){
            return Integer.toString((int) size) + " bytes";
        }else if(size >= 1000 && size <= 999999){
            return Integer.toString((int) size/1024) + " Kb"; 
        }else if(size >= 1000000){
            return Integer.toString((int)size/(1024*1024)) + " Mb";
        }

        return "-1 Gb";
    }

    public static String countSize(final long size){
        if(size > 0 && size <= 999){
            return  size + " bytes";
        }else if(size >= 1000 && size <= 999999){
            return (size/1024) + " Kb";
        }else if(size >= 1000000 && size <= 999999999){
            return (size/(1024*1024)) + " Mb";
        }else if(size >= 1000000000){
            return (size/(1024*1024*1024)) + " Gb";
        }
        return "-1 Gb";
    }
    
    /**
     * Method ini digunakan untuk menghapus file
     * Method ini menggunakan class File untuk menghapus file
     *
     * Note : jika gagal dalam mengapus file kemungkinan direktori file salah
     *
     * @see File
     *
     * @param filename input direktori gambar
     */
    public static void deleteFile(String filename){
        File file = new File(filename);
            if(file.delete()){
                System.out.println(filename + " berhasil didelete");
            }else{
                System.out.println("gagal menghapus file");
            }
    }

}