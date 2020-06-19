package com.system;

import java.io.*;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Settings {

    /**
     * File yang digunakan untuk menyimpan setelan ke database
     */
    private static File fileLanguage = new File("database\\language.haqi"),
                        fileFormat = new File("database\\format.haqi"),
                        fileTheme = new File("database\\Theme.haqi"),
                        fileIsAutoSave = new File("database\\IsAutoSave.haqi"),
                        fileSaveto = new File("database\\saveto.haqi");
    /**
     * kode bahasa yang digunakan untuk mengatur bahasa
     */
    public static final int LANGUAGE_ENGLISH = 0, LANGUAGE_INDONESIAN = 1, LANGUAGE_JAPANESE = 2,
            LANGUAGE_JAPANESE_ROMAJI = 3, LANGUAGE_KOREAN = 4, LANGUAGE_KOREAN_ROMANIZATION = 5;
    /**
     * kode yang digunakan untuk mengatur format gambar
     */
    public static final int SET_FORMAT_PNG = 6, SET_FORMAT_JPG = 7, SET_FORMAT_BMP = 8;

    /**
     * kode yang digunakan untuk mengatur tema aplikasi
     */
    public static final int THEME_DAYMODE = 9, THEME_DARKMODE = 10;

    /**
     * kode yang digunakan untuk mengatur gambar disimpan otomatis atau tidak
     */
    public static final int AUTOSAVE_ACTIVATED = 11, AUTOSAVE_DEACTIVATED = 12;

    /**
     * Mendapatkan bahasa yang disetting user dengan membaca file language.haqi pada database
     * Jika data kosong maka method akan menuliskan english ke file language.haqi dan mereturn english
     *
     * @return bahasa yang disetting user
     */
    public static String getLanguage(){
        String data = Files.getDataFile(fileLanguage.toString());
        if(data == null){
            setLanguage(LANGUAGE_ENGLISH);
            return "ENGLISH";
        }else{
            return data;
        }
    }

    /**
     * Method ini digunakan untuk menuliskan setelan bahasa yang diatur user
     * Method ini menuliskan setelan bahasa melalui bantuan code bahasa ,
     * Jika code yang dimasukan ENGLISH maka method akan menuliskan kata english ke file
     * Jika code yang dimasukan INDONESIAN maka method akan menuliskan kata indonesian ke file dan seterusnya
     * Jika code yang dimasukan tidak tersedia maka secara default method akan menulikan english
     *
     * @param code input code bahasa
     */
    public static void setLanguage(int code){

        switch (code){
            case LANGUAGE_ENGLISH: Files.writeFile(fileLanguage.toString(),"ENGLISH", false); break;
            case LANGUAGE_INDONESIAN: Files.writeFile(fileLanguage.toString(), "INDONESIAN", false); break;
            case LANGUAGE_JAPANESE: Files.writeFile(fileLanguage.toString(), "JAPANESE", false); break;
            case LANGUAGE_JAPANESE_ROMAJI: Files.writeFile(fileLanguage.toString(), "ROMAJI", false); break;
            case LANGUAGE_KOREAN: Files.writeFile(fileLanguage.toString(), "KOREAN", false); break;
            case LANGUAGE_KOREAN_ROMANIZATION: Files.writeFile(fileLanguage.toString(), "ROMANIZATION", false); break;
            default: Files.writeFile(fileLanguage.toString(), "ENGLISH", false); break;
        }
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Inggris
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Inggris atau tidak
     */
    public static boolean isEnglishLanguage(){
        if(getLanguage().contains("ENGLISH")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Indonesian
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Indonesian atau tidak
     */
    public static boolean isIndonesianLanguage(){
        if(getLanguage().contains("INDONESIAN")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Jepang
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Jepangs atau tidak
     */
    public static boolean isJapaneseLanguage(){
        if(getLanguage().contains("JAPANESE")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Jepang (Romaji)
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Jepang (Romaji) atau tidak
     */
    public static boolean isJapaneseRomajiLanguage(){
        if(getLanguage().contains("ROMAJI")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Korea
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Korea atau tidak
     */
    public static boolean isKoreanLanguage(){
        if(getLanguage().contains("KOREAN")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Korea (Romanized)
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Korea (Romanized) atau tidak
     */
    public static boolean isKoreanRomanizationLanguage(){
        if(getLanguage().contains("ROMANIZATION")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Method ini digunakan untuk medapatkan kata tertentu kedalam bahasa yang disetting user
     * Jika user menggatur bahasa ke English maka yang direturn adalah param english
     * Jika user mengatur bahasa ke Indonesian maka yang direturn adalah param indonesian
     *
     * @param english text dalam bahasa inggris
     * @param indonesian text dalam bahasa indonesia
     * @param japanese text dalam bahasa jepang
     * @param korean text dalam bahasa korea
     * @return kata dalam bahasa tertentu
     */
    public static String languageSetString(String english, String indonesian, String japanese, String korean){

        if(isEnglishLanguage()){
            return english;
        }else if(isIndonesianLanguage()){
            return indonesian;
        }else if(isJapaneseLanguage()){
            return japanese;
        }else if(isKoreanLanguage()){
            return korean;
        }else {
            return english;
        }
    }

    /**
     * Method ini digunakan untuk medapatkan kata tertentu kedalam bahasa yang disetting user
     * Jika user menggatur bahasa ke English maka yang direturn adalah param english
     * Jika user mengatur bahasa ke Indonesian maka yang direturn adalah param indonesian
     *
     * @param english text dalam bahasa inggris
     * @param indonesian text dalam bahasa indonesia
     * @param japanese text dalam bahasa jepang
     * @param romaji text dalam bahasa jepang (romaji)
     * @param korean text dalam bahasa korean
     * @param romanization text dalam bahasa korean (romanized)
     * @return kata dalam bahasa tertentu
     */
    public static String languageSetString(String english, String indonesian, String japanese, String romaji, String korean, String romanization){

        if(isEnglishLanguage()){
            return english;
        }else if(isIndonesianLanguage()){
            return indonesian;
        }else if(isJapaneseLanguage()){
            return japanese;
        }else if(isJapaneseRomajiLanguage()){
            return romaji;
        }else if(isKoreanLanguage()){
            return korean;
        }else if(isKoreanRomanizationLanguage()){
            return romanization;
        }else {
            return english;
        }
    }

    public static String getFormatSelected(){
        String data = Files.getDataFile(fileFormat.toString());
        if(data == null){
            return ".png";
        }else{
            return data;
        }
    }

    public static void setFormatSelected(int code){

        switch (code){
            case SET_FORMAT_PNG: Files.writeFile(fileFormat.toString(), ".png", false); break;
            case SET_FORMAT_JPG: Files.writeFile(fileFormat.toString(), ".jpg", false); break;
            case SET_FORMAT_BMP: Files.writeFile(fileFormat.toString(), ".bmp", false); break;
            default: Files.writeFile(fileFormat.toString(), ".png", false); break;
        }
    }

    public static boolean isPngFormat(){
        if(getFormatSelected().contains(".png")){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isJpgFormat(){
        if(getFormatSelected().contains(".jpg")){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isBmpFormat(){
        if(getFormatSelected().contains(".bmp")){
            return true;
        }else {
            return false;
        }
    }

    public static String getTheme(){
        String data = Files.getDataFile(fileTheme.toString());
        if(data == null){
            return "daymode";
        }else{
            return data;
        }
    }

    public static void setTheme(int code){
        
        switch(code){
            case THEME_DAYMODE: Files.writeFile(fileTheme.toString(), "daymode", false); break;
            case THEME_DARKMODE: Files.writeFile(fileTheme.toString(), "darkmode", false); break;
            default: Files.writeFile(fileTheme.toString(), "daymode", false); break;
        }
    }
    
    public static Color getThemeColors(Color daymode, Color darkmode){
        if(isDaymode()){
            return daymode;
        }else if(isDarkmode()){
            return darkmode;
        }else{
            return daymode;
        }
    }
    
    public static ImageIcon getThemeIcons(ImageIcon directoryDaymode, ImageIcon directoryDarkmode){
        if(isDaymode()){
            return directoryDaymode;
        }else if(isDarkmode()){
            return directoryDarkmode;
        }else{
            return directoryDaymode;
        }
    }
    
    public static boolean isDaymode(){
        if(getTheme().contains("daymode")){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean isDarkmode(){
        if(getTheme().contains("darkmode")){
            return true;
        }else{
            return false;
        }
    }
    

    /**
     * Method akan menuliskan autosave(input) ke file isautosave.haqi
     * Input yang dituliskan hanya memiliki dua nilai yaitu:
     *  actived : user mengaktifkan setelan untuk autosave
     *  deactived : user menonaktifkan setelan untuk autosave
     *
     * Note : jika input selain actived atau deactived maka method akan secara default akan menuliskan deactived
     *
     * @see FileWriter
     * @see BufferedWriter
     * @param code kode untuk pengaturan
     */
    public static void setAutoSave(int code){
        switch (code){
            case AUTOSAVE_ACTIVATED: Files.writeFile(fileIsAutoSave.toString(), "actived", false); break;
            case AUTOSAVE_DEACTIVATED: Files.writeFile(fileIsAutoSave.toString(), "deactived", false); break;
            default:Files.writeFile(fileIsAutoSave.toString(), "deactived", false); break;
        }
    }

    /**
     * Berfungsi untuk mengetaui apakan user mensetting untuk autosave atau tidak
     *
     * @see FileReader
     * @see BufferedReader
     * @return jika ya maka mereturn true, jika tidak maka mereturn false
     */
    public static boolean isAutoSave(){
        String data = Files.getDataFile(fileIsAutoSave.toString());

        if(data == null){
            return false;
        }else if(data.equalsIgnoreCase("actived")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Method ini digunakan untuk mendapatkan direktori yang diatur user untuk menyimpan hasil screenshot
     * Dengan membaca file SaveTo.haqi
     * Lalu method akan mereturn data yang ada difile SaveTo.haqi
     * Jika file SaveTo.haqi kosong maka method akan mereturn direktori userhome\\downloads sebagai default Example : "C:\\Users\\YOU\\Downloads\\
     *
     * @see FileReader
     * @see BufferedReader
     *
     * @return direktori untuk menyimpan file hasil screenshot
     */
    public static String getPenyimpanan() {
        String storage = Files.getDataFile(fileSaveto.toString());
        if (storage == null) {
            return "C:\\Users\\" + Apps.getUsername() + "\\Downloads\\";
        } else {
            return storage;
        }
    }

    /**
     * Method ini digunakan untuk menyimpan direktori peyimpanan screenshot yang diatur user
     * Direktori akan disimpan kefile SaveTo.haqi
     * User dapat menguabah setelan direktori di window com.window.Root.java
     *
     * @see FileWriter
     * @see BufferedWriter
     *
     * @param simpanKe input direktori yang diatur user
     */
    public static void setPeyimpanan(String simpanKe) {
        Files.writeFile(fileSaveto.toString(), simpanKe, false);
    }
    
}
