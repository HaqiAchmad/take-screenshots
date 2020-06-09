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
 * Type class : Superclass
 * Total method : 18
 * Total line : 528
 *
 * @author Achmad Baihaqi
 * @version 1.0
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
            System.out.println("Terjadi kesalahan saat membuat file "+ ex);
        }
    }

    /**
     * Method ini digunakan untuk membuat file di dalam directory/folder yang diinputkan user
     * Sebelum membuat file method akan mengecek apakah file yang akan dibuat exist atau tidak
     * Jika tidak exist maka file akan dibuat jika exist maka file tidak akan dibuat
     *
     * @param directory directory dari file yang akan dibuat
     * @param filename nama file yang akan dibuat
     */
    public static void createFile(String directory, String filename){
        // akan menambahkan \ jika pada directory belum terdapat \
        if (directory.lastIndexOf('\\') != directory.length()-1){
            directory+="\\";
        }

        try{
            File file = new File(directory+filename);
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
            System.out.println("Terjadi kesalahan saat membuat file "+ ex);
        }


    }

    /**
     * Method ini digunakan untuk membuat folder
     * Sebelum membuat folder method akan mengecek apakah folder yang akan dibuat exist atau tidak
     * Jika tidak exist maka folder akan dibuat jika exist maka folder tidak akan dibuat
     *
     * @param folderName nama folder yang akan dibuat
     */
    public static void createFolder(String folderName){

        File file = new File(folderName);
            if(isExistFolder(folderName)){
                System.out.println("Folder tersebut sudah ada");
            }else{
                if(file.mkdir()){
                    System.out.println("Folder berhasil dibuat");
                }else{
                    System.out.println("Gagal membuat folder \""+ folderName +"\"");
                }
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
            if(file.exists()){
                return true;
            }else{
                return false;
            }
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
            if(file.exists()){
                return true;
            }else{
                return false;
            }
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
     * Method ini digunakan untuk mengambil\mendapatkan semua data yang ada didalam file
     * Sebelum mengambil\mendapatkan data dari file method akan menghitung jumlah baris dari file
     * Method akan membaca satu per satu baris yang ada didalam file melalui class BufferedReader
     * Method akan melakukan perulangan sampai baris terakhir dari file
     * Note : Jika baris dari file hanya satu maka method akan langsung mereturn data tanpa melakukan perulangan
     * Jika sudah sampai dibaris terakhir selanjutnya method akan mereturn data ke-user
     *
     * @see FileReader
     * @see BufferedReader
     *
     * @param filename file yang akan diambil datanya
     * @return semua data yang ada didalam file
     */
    public static String getDataFile(String filename){

        try{
            FileReader file = new FileReader(filename);
            BufferedReader show = new BufferedReader(file);
            String buffer = show.readLine();
            int end = countLineFile(filename);
            //untuk menghindari null pointer jika hanya ada satu baris di dalam file
            if(end == 1){
                return buffer;
            }

                for(int i = 0; i <= end; i++){
                    buffer+=show.readLine()+"\n";
                }
                return buffer;

        }catch (IOException ex){
            System.out.println("Terjadi kesalahan " + ex);
        }
        return null;
    }

    /**
     * Method ini digunakan untuk mengambil\mendapatkan data dari baris yang diinputkan user sampai kebaris terakhir
     * Sebelum mengambil\mendapatkan data dari file method akan menghitung jumlah baris dari file
     * Method akan membaca satu per satu baris yang ada didalam file melalui class BufferedReader
     * Method akan melakukan perulangan sampai baris yang diinputkan user
     * Note : Jika param fromLine nilainya lebih besar dari jumlah baris file atau param fromLine nilainya kurang dari satu
     *        maka method akan mereturn pesan "LINE OUT OF BOUNDS" untuk menyatakan bahwa input yang dimasukan user tidak valid
     * Jika sudah sampai dibaris terakhir selanjutnya method akan mereturn data ke-user
     *
     * @see FileReader
     * @see BufferedReader
     *
     * @param filename file yang akan diambil datanya
     * @param fromLine baris yang akan diambil datanya
     * @return mengambil data dari baris yang diinputkan user kebaris terakhir
     */
    public static String getDataFile(String filename, int fromLine){

        try{
            FileReader file = new FileReader(filename);
            BufferedReader show = new BufferedReader(file);
            String buffer = show.readLine(), data = buffer;
            int line = 1, end = countLineFile(filename);

            if(fromLine > end || fromLine < 1){
                return "LINE OUT OF BOUNDS";
            }

            for(int i = 0; i <= end; i++){
                if(line >= fromLine){
                    data+="\n"+buffer;
                }
                buffer = show.readLine();
                line++;
            }
            return data;

        }catch (IOException ex){
            System.out.println("Terjadi kesalahan " + ex);
        }
        return null;
    }

    /**
     * Method ini digunakan untuk mengambil\mendapatkan data dari baris awal yang diinputkan user sampai kebaris akhir yang diinputan user
     * Sebelum mengambil\mendapatkan data dari file method akan menghitung jumlah baris dari file
     * Method akan membaca satu per satu baris yang ada didalam file melalui class BufferedReader
     * Method akan melakukan perulangan sampai baris yang diinputkan user
     * Note : Jika param fromLine nilainya lebih besar dari jumlah baris file atau param fromLine nilainya kurang dari satu atau toLine nilainya kurang dari fromLine
     *        maka method akan mereturn pesan "LINE OUT OF BOUNDS" untuk menyatakan bahwa input yang dimasukan user tidak valid
     * Jika sudah sampai dibaris terakhir selanjutnya method akan mereturn data ke-user
     *
     * @see FileReader
     * @see BufferedReader
     *
     * @param filename file yang akan diambil datanya
     * @param fromLine awal baris yang akan diambil datanya
     * @param toLine akhir baris yang akan diambil datanya
     * @return mengambil data dari file dari baris tertentu sampai baris tertentu
     */
    public static String getDataFile(String filename, int fromLine, int toLine){

        try{
            FileReader file = new FileReader(filename);
            BufferedReader show = new BufferedReader(file);
            String buffer = show.readLine(), data = buffer;
            int line = 1, end = countLineFile(filename);

            if(fromLine > end || fromLine < 1 || toLine < fromLine){
                return "LINE OUT OF BOUNDS";
            }
            for(int i = 0; i <= end; i++){
                if(line >= fromLine && line <= toLine){
                    data+="\n"+buffer;
                }
                buffer = show.readLine();
                line++;
            }
            return data;

        }catch (IOException ex){
            System.out.println("Terjadi kesalahan " + ex);
        }
        return null;
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

                if(data == null){
                    data = "";
                    if(append){
                        tulis.newLine(); tulis.write(data); tulis.flush(); // menambahkan kebaris baru
                    }else{
                        tulis.write(data); tulis.flush();
                    }
                }else{
                    if(append){
                        tulis.newLine(); tulis.write(data); tulis.flush(); // menambahkan kebaris baru
                    }else{
                        tulis.write(data); tulis.flush();
                    }
                }

        }catch (IOException ex){
            System.out.println("Terjadi kesalahan " + ex);
        }
    }

    /**
     *  Digunakan untuk mencopykan data dari satu file ke file lain
     *  Method ini menggunakan getDateFile() untuk mendapatkan data dari file yang akan dicopy
     *  Lalu mempaste datanya ke file melalui method writeFile()
     *
     * @param file file yang akan dicopy datanya
     * @param copyTo file yang akan dipaste datanya
     */
    public static void copyDataFile(String file, String copyTo){
        String data = getDataFile(file);
        writeFile(copyTo, data, false);
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
     * Method ini digunakan untuk menghitung jumlah keseluruhan baris yang ada didalam file
     * Cara kerja method ini dengan membaca keseluruhan data yang ada didalam file
     * Jika terdapat baris maka nilainya adalah 1, nilainya akan ditampung kesebuah variabel, jika menemukan baris baru lagi maka nilai dari variabel akan bertambah satu, begitu seterusnya sampai kebaris terakhir
     *
     * @see FileReader
     * @see BufferedReader
     *
     * @param directoryFile file yang akan dihitung jumlah barisnya
     * @return jumlah baris yang ada didalam file
     */
    public static int countLineFile(String directoryFile){
        int line = 1;
        try{
            FileReader file = new FileReader(directoryFile);
            BufferedReader data = new BufferedReader(file);
            String buffer = data.readLine();

                while (buffer != null){
                    buffer = data.readLine();
                        if (buffer == null){
                            return line;
                        }
                    line++;
                }

        }catch(IOException ex){
            System.out.println("Terjadi kesalahan" + ex);
        }
        return -1;
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
     * Digunakan untuk mengosongkan data dari file
     * Method ini menggunakan class BufferedWriter untuk mengosongkan file
     *
     * @see FileWriter
     * @see BufferedWriter
     *
     * @param filename file yang akan dikosongkan datanya
     */
    public static void setEmptyFile(String filename){

        try {
            FileWriter file = new FileWriter(filename);
            BufferedWriter b = new BufferedWriter(file);
            file.close();
            file = new FileWriter(filename);
            b = new BufferedWriter(file);

        }catch (IOException ex){
            System.out.println("Terjadi kesalahan " + ex);
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
     *  Note : jika size gambar adalah gigabytes maka akan dianggap sebagai megabytes
     *         jika terjadi error maka akan mereturn -1
     *
     * @see File
     *
     * @param filename file yang akan diketahui sizenya
     * @return size dari file dalam bentuk string
     */
    public static String getSizeFile(String filename){
        File file = new File(filename);

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

    /**
     * Digunakan untuk mendapatkan ukuran/size dari file dalam betuk Integer
     * Dengan memanfaatkan method length() pada class File untuk mendapatkan size dari file
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
     * @param filename file yang akan diketahui sizenya
     * @return size dari file dalam bentuk integer
     */
    public static int getSizeFile_Int(String filename){
        File file = new File(filename);

        double size = file.length();
        if(size > 0 && size <= 999){
            return (int) size;
        }else if(size >= 1000 && size <= 999999){
            return (int) size/1024;
        }else if(size >= 1000000){
            return (int)size/(1024*1024);
        }

        return -1;
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