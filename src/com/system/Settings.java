package com.system;

import com.database.Database;

import java.io.IOException;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import javax.swing.ImageIcon;

/**
 * Digunakan untuk mendapatkan dan mengedit sebuah penggaturan aplikasi
 * 
 * @author Achmad Baihaqi
 * @version 1.2
 * @since 15-05-2020
 */
public class Settings {
    
    private final Properties settings = new Properties();

     /** 
      * kode yang digunakan untuk mengubah dan mendapatkan setting
     */
    public static final String SETTING_THEME = "Theme", SETTING_LANGUAGE = "Language", SETTING_PEYIMPANAN = "Peyimpanan",
                               SETTING_FORMAT = "Format", SETTING_AUTOSAVE = "Autosave", SETTING_EFEK_SUARA = "Efek_Suara";
    
    /**
     * kode kode yang digunakan untuk mengubah value pada setting
     */
    public static final String 
                                /*
                                  kode yang digunakan untuk mengatur bahasa aplikasi
                                */
                                LANGUAGE_ENGLISH = "ENGLISH", LANGUAGE_INDONESIAN = "INDONESIAN", LANGUAGE_JAPANESE = "JAPANESE",
                                LANGUAGE_JAPANESE_ROMAJI = "ROMAJI", LANGUAGE_KOREAN = "KOREAN", LANGUAGE_KOREAN_ROMANIZATION = "ROMANIZATION",
                                LANGUAGE_JAVANESE = "JAVANESE",
                                /*
                                 * kode yang digunakan untuk mengatur format gambar
                                 */
                                FORMAT_PNG = ".png", FORMAT_JPG = ".jpg", FORMAT_BMP = ".bmp",
                                /*
                                 * kode yang digunakan untuk mengatur tema aplikasi
                                 */
                                THEME_DAYMODE = "Daymode", THEME_DARKMODE = "Darkmode",
                                /*
                                 * kode yang digunakan untuk mengatur gambar disimpan otomatis atau tidak
                                 */
                                AUTOSAVE_ACTIVATED = "Actived", AUTOSAVE_DEACTIVATED = "Deactivated",
                                /*
                                 kode yang digunakan untuk mengatur efek suara saat screenshot
                                */
                                EFEK_SUARA_DEACTIVATED = "Deactivated", EFEK_SUARA_1 = "suara 1.mp3", EFEK_SUARA_2 = "suara 2.mp3", EFEK_SUARA_3 = "suara 3.mp3", EFEK_SUARA_4 = "suara 4.mp3", EFEK_SUARA_5 = "suara 5.mp3"
                                ;

    
    /**
     * Untuk mengecek apakah user memakai setelan bahasa Inggris
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Inggris atau tidak
     */
    public boolean isEnglishLanguage(){
        return this.getSetting(SETTING_LANGUAGE).contains("ENGLISH");
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Indonesian
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Indonesian atau tidak
     */
    public boolean isIndonesianLanguage(){
        return this.getSetting(SETTING_LANGUAGE).contains("INDONESIAN");
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Jawa
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Jawa atau tidak
     */
    public boolean isJavaneseLanguage(){
        return this.getSetting(SETTING_LANGUAGE).contains("JAVANESE");
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Jepang
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Jepangs atau tidak
     */
    public boolean isJapaneseLanguage(){
        return this.getSetting(SETTING_LANGUAGE).contains("JAPANESE");
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Jepang (Romaji)
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Jepang (Romaji) atau tidak
     */
    public boolean isJapaneseRomajiLanguage(){
        return this.getSetting(SETTING_LANGUAGE).contains("ROMAJI");
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Korea
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Korea atau tidak
     */
    public boolean isKoreanLanguage(){
        return this.getSetting(SETTING_LANGUAGE).contains("KOREAN");
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Korea (Romanized)
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Korea (Romanized) atau tidak
     */
    public boolean isKoreanRomanizationLanguage(){
        return this.getSetting(SETTING_LANGUAGE).contains("ROMANIZATION");
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
     * @param javanese text dalam bahasa jawa
     * @return kata dalam bahasa tertentu
     */
    public String getLanguageActived(String english, String indonesian, String javanese, String japanese, String romaji, String korean, String romanization){

        if(isEnglishLanguage()){
            return english;
        }else if(isIndonesianLanguage()){
            return indonesian;
        }else if(isJavaneseLanguage()){
            return javanese;
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

    /**
     * Digunakan untuk mengecek apakah user memakai format png atau tidak.
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai format png atau tidak
     */
    public boolean isPngFormat(){
        return this.getSetting(SETTING_FORMAT).contains(".png");
    }

    /**
     * Digunakan untuk mengecek apakah user memakai format jpg atau tidak.
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai format jpg atau tidak
     */
    public boolean isJpgFormat(){
        return this.getSetting(SETTING_FORMAT).contains(".jpg");
    }

    /**
     * Digunakan untuk mengecek apakah user memakai format bmp atau tidak.
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai format bmp atau tidak
     */
    public boolean isBmpFormat(){
        return this.getSetting(SETTING_FORMAT).contains(".bmp");
    }
    
    /**
     * Digunakan untuk mendapat untuk mengatur applikasi ke daymode atau darkmode. 
     * Method akan mengecek apakah user sedang memakai daymode atau darkmode.
     * Jika user memakai daymode maka akan mereturn param daymode, 
     * Jika user memakai darkmode maka akan mereturn param darkmode, 
     * 
     * @param daymode input color saat daymode
     * @param darkmode input color saat darkmode
     * @return 
     */
    public Color getThemeColors(Color daymode, Color darkmode){
        if(isDaymode()){
            return daymode;
        }else if(isDarkmode()){
            return darkmode;
        }else{
            return daymode; // default
        }
    }

    /**
     * Digunakan untuk mendapat untuk mengatur icon applikasi ke daymode atau darkmode. 
     * Method akan mengecek apakah user sedang memakai daymode atau darkmode.
     * Jika user memakai daymode maka akan mereturn param daymode, 
     * Jika user memakai darkmode maka akan mereturn param darkmode, 
     * 
     * @param directoryDaymode input color saat daymode
     * @param directoryDarkmode input color saat darkmode
     * @return 
     */
    public ImageIcon getThemeIcons(ImageIcon directoryDaymode, ImageIcon directoryDarkmode){
        if(isDaymode()){
            return directoryDaymode;
        }else if(isDarkmode()){
            return directoryDarkmode;
        }else{
            return directoryDaymode; // default
        }
    }
    
    /**
     * Digunakan untuk mengecek apakah user memakai mode daymode atau tidak.
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai mode daymode atau tidak
     */
    public boolean isDaymode(){
        return this.getSetting(SETTING_THEME).contains("Daymode");
    }
    
    /**
     * Digunakan untuk mengecek apakah user memakai mode darkmode atau tidak.
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai mode darkmode atau tidak
     */
    public boolean isDarkmode(){
        return this.getSetting(SETTING_THEME).contains("Darkmode");
    }
    
    /**
     * Berfungsi untuk mengetaui apakan user mensetting untuk autosave atau tidak
     *
     * @return jika ya maka mereturn true, jika tidak maka mereturn false
     */
    public boolean isAutoSave(){
        String data = this.getSetting(Settings.SETTING_AUTOSAVE);

        if(data == null){
            return false;
        }else return data.equalsIgnoreCase("actived");
    }

     /**
     * Digunakan untuk mengecek apakah user menonaktifkan efek suara atau tidak
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user menonaktifkan efek suara atau tidak
     */
    public boolean isEfekSuara_Nonaktif(){
        return this.getSetting(Settings.SETTING_EFEK_SUARA).contains("Deactivated");
    }
    
     /**
     * Digunakan untuk mengecek apakah user memakai efek suara 1 atau tidak
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai efek suara 1 atau tidak
     */
    public boolean isEfekSuara_1(){
        return this.getSetting(Settings.SETTING_EFEK_SUARA).contains("suara 1.mp3");
    }
    
     /**
     * Digunakan untuk mengecek apakah user memakai efek suara 2 atau tidak
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai efek suara 2 atau tidak
     */
    public boolean isEfekSuara_2(){
        return this.getSetting(Settings.SETTING_EFEK_SUARA).contains("suara 2.mp3");
    }
    
     /**
     * Digunakan untuk mengecek apakah user memakai efek suara 3 atau tidak
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai efek suara 3 atau tidak
     */
    public boolean isEfekSuara_3(){
        return this.getSetting(Settings.SETTING_EFEK_SUARA).contains("suara 3.mp3");
    }
    
     /**
     * Digunakan untuk mengecek apakah user memakai efek suara 4 atau tidak
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai efek suara 4 atau tidak
     */
    public boolean isEfekSuara_4(){
        return this.getSetting(Settings.SETTING_EFEK_SUARA).contains("suara 4.mp3");
    }
    
     /**
     * Digunakan untuk mengecek apakah user memakai efek suara 5 atau tidak
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai efek suara 5 atau tidak
     */
    public boolean isEfekSuara_5(){
        return this.getSetting(Settings.SETTING_EFEK_SUARA).contains("suara 5.mp3");
    }
    
    /**
     * Method ini digunakan untuk mengubah setting yang diatur oleh user
     * 
     * 
     * @param setting setting yang akan diubah valuenya
     * @param value value dari setting
     * @throws IOException 
     */
    public void setSettings(final String setting, final String value) throws IOException{
        try{
            settings.setProperty(setting, value);
            settings.store(new FileOutputStream(Database.getDirectoryDB() + "settings.haqi"), "Pengaturan aplikasi");
        }catch(IOException ex){
            Apps.showException("File settings.haqi mungkin tidak ada didalam database!!", Settings.class.getName(), ex.toString());
        }
    }
    
    /**
     * Method ini digunakan untuk mendapatkan setting/pengaturan yang dipakai user
     * Selanjutnya method akan mereturn value dari setting yang diinputkan
     * 
     * @param setting input untuk mengetahui informasi dari aplikasi 
     * @return info tentang aplikasi sesuai dengan input key
     */
    public String getSetting(final String setting){
        try{
            settings.load(new FileInputStream(Database.getDirectoryDB() + "settings.haqi"));
            String value = settings.getProperty(setting);
            if(value.isEmpty()){
                resetSetting();
            }else{
                return value;
            }
        }catch(IOException ex){
            Apps.showException("File settings.haqi mungkin tidak ada didalam database!!", Settings.class.getName(), ex.toString());
        }
        return "default"; // jika setting tidak ditemukan maka method akan mereturn default
    }
    
    /**
     * Digunakan untuk mereset data dari setting jika file settings.haqi terhapus
     * 
     * @throws IOException 
     */
    public void resetSetting() throws IOException{
        
        settings.put(Settings.SETTING_LANGUAGE, "INDONESIAN"); 
        settings.put(Settings.SETTING_THEME, "Daymode");  
        settings.put(Settings.SETTING_FORMAT, ".png"); 
        settings.put(Settings.SETTING_PEYIMPANAN, "C:\\Users\\" + Apps.getUsername() + "\\Desktop\\"); 
        settings.put(Settings.SETTING_EFEK_SUARA, "suara 1.mp3"); 
        settings.put(Settings.SETTING_AUTOSAVE, "deactivated");
        settings.store(new FileOutputStream(Database.getDirectoryDB() + "settings.haqi"), "Pengaturan aplikasi");
    }
    
}