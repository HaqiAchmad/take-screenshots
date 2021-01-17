package com.system;

import com.database.Database;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 * Digunakan untuk mendapatkan dan mengedit sebuah penggaturan aplikasi
 * 
 * @author Achmad Baihaqi
 * @version 1.2
 * @since 15-05-2020
 */
public class Settings {

     /** 
      * kode yang digunakan untuk mengubah dan mendapatkan setting
     */
    public static final String SETTING_THEME = "Theme?", SETTING_LANGUAGE = "Language?", SETTING_PEYIMPANAN = "Peyimpanan?",
                               SETTING_FORMAT = "Format?", SETTING_AUTOSAVE = "Autosave?", SETTING_EFEK_SUARA = "Efek Suara?";
    
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
    public static boolean isEnglishLanguage(){
        return Settings.getSetting(SETTING_LANGUAGE).contains("ENGLISH");
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Indonesian
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Indonesian atau tidak
     */
    public static boolean isIndonesianLanguage(){
        return Settings.getSetting(SETTING_LANGUAGE).contains("INDONESIAN");
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Jawa
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Jawa atau tidak
     */
    public static boolean isJavaneseLanguage(){
        return Settings.getSetting(SETTING_LANGUAGE).contains("JAVANESE");
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Jepang
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Jepangs atau tidak
     */
    public static boolean isJapaneseLanguage(){
        return Settings.getSetting(SETTING_LANGUAGE).contains("JAPANESE");
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Jepang (Romaji)
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Jepang (Romaji) atau tidak
     */
    public static boolean isJapaneseRomajiLanguage(){
        return Settings.getSetting(SETTING_LANGUAGE).contains("ROMAJI");
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Korea
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Korea atau tidak
     */
    public static boolean isKoreanLanguage(){
        return Settings.getSetting(SETTING_LANGUAGE).contains("KOREAN");
    }

    /**
     * Untuk mengecek apakah user memakai setelan bahasa Korea (Romanized)
     * Jika ya maka akan mereturn true jika tidak mereturn false
     *
     * @return apakah user memakai setelan bahasa Korea (Romanized) atau tidak
     */
    public static boolean isKoreanRomanizationLanguage(){
        return Settings.getSetting(SETTING_LANGUAGE).contains("ROMANIZATION");
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
    public static String getLanguageActived(String english, String indonesian, String javanese, String japanese, String romaji, String korean, String romanization){

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
    public static boolean isPngFormat(){
        return Settings.getSetting(SETTING_FORMAT).contains(".png");
    }

    /**
     * Digunakan untuk mengecek apakah user memakai format jpg atau tidak.
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai format jpg atau tidak
     */
    public static boolean isJpgFormat(){
        return Settings.getSetting(SETTING_FORMAT).contains(".jpg");
    }

    /**
     * Digunakan untuk mengecek apakah user memakai format bmp atau tidak.
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai format bmp atau tidak
     */
    public static boolean isBmpFormat(){
        return Settings.getSetting(SETTING_FORMAT).contains(".bmp");
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
    public static Color getThemeColors(Color daymode, Color darkmode){
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
    public static ImageIcon getThemeIcons(ImageIcon directoryDaymode, ImageIcon directoryDarkmode){
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
    public static boolean isDaymode(){
        return Settings.getSetting(SETTING_THEME).contains("Daymode");
    }
    
    /**
     * Digunakan untuk mengecek apakah user memakai mode darkmode atau tidak.
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai mode darkmode atau tidak
     */
    public static boolean isDarkmode(){
        return Settings.getSetting(SETTING_THEME).contains("Darkmode");
    }
    
    /**
     * Berfungsi untuk mengetaui apakan user mensetting untuk autosave atau tidak
     *
     * @see FileReader
     * @see BufferedReader
     * @return jika ya maka mereturn true, jika tidak maka mereturn false
     */
    public static boolean isAutoSave(){
        String data = Settings.getSetting(Settings.SETTING_AUTOSAVE);

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
    public static boolean isEfekSuara_Nonaktif(){
        return Settings.getSetting(Settings.SETTING_EFEK_SUARA).contains("Deactivated");
    }
    
     /**
     * Digunakan untuk mengecek apakah user memakai efek suara 1 atau tidak
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai efek suara 1 atau tidak
     */
    public static boolean isEfekSuara_1(){
        return Settings.getSetting(Settings.SETTING_EFEK_SUARA).contains("suara 1.mp3");
    }
    
     /**
     * Digunakan untuk mengecek apakah user memakai efek suara 2 atau tidak
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai efek suara 2 atau tidak
     */
    public static boolean isEfekSuara_2(){
        return Settings.getSetting(Settings.SETTING_EFEK_SUARA).contains("suara 2.mp3");
    }
    
     /**
     * Digunakan untuk mengecek apakah user memakai efek suara 3 atau tidak
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai efek suara 3 atau tidak
     */
    public static boolean isEfekSuara_3(){
        return Settings.getSetting(Settings.SETTING_EFEK_SUARA).contains("suara 3.mp3");
    }
    
     /**
     * Digunakan untuk mengecek apakah user memakai efek suara 4 atau tidak
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai efek suara 4 atau tidak
     */
    public static boolean isEfekSuara_4(){
        return Settings.getSetting(Settings.SETTING_EFEK_SUARA).contains("suara 4.mp3");
    }
    
     /**
     * Digunakan untuk mengecek apakah user memakai efek suara 5 atau tidak
     * Jika ya maka akan mereturn true jika tidak mereturn false
     * 
     * @return user memakai efek suara 5 atau tidak
     */
    public static boolean isEfekSuara_5(){
        return Settings.getSetting(Settings.SETTING_EFEK_SUARA).contains("suara 5.mp3");
    }
    
    /**
     * Method ini digunakan untuk mengubah setting yang diatur oleh user
     * 
     * 
     * @param setting setting yang akan diubah valuenya
     * @param value value dari setting
     * @throws IOException 
     */
    public static void setSettings(final String setting, final String value) throws IOException{
        
        String buffer;
        // mendapatkan data setting sebelumnya
        File fileSetting = new File(Database.getDirectoryDB() + "settings.haqi");
        FileReader fSetting = new FileReader(fileSetting);
        BufferedReader dataSetting = new BufferedReader(fSetting);
        buffer = dataSetting.readLine();
        
        // digunakan untuk menampung sementara data setting saat diupdate
        File fileTemp = new File(Database.getDirectoryDB() + "temp\\temp.haqi");
        FileWriter fTemp = new FileWriter(fileTemp);
        BufferedWriter dataTemp = new BufferedWriter(fTemp);

            // membaca data setting sebelumnya
            while(buffer != null){
                    if(buffer.contains(setting)){ // mengupdate value pada setting
                        dataTemp.write(setting+value);
                        dataTemp.newLine();
                        dataTemp.flush();
                        Aktivitas.addAktivitas(Waktu.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah setelan " + setting + " ke " + value);
                    }else{
                        dataTemp.write(buffer);
                        dataTemp.newLine();
                        dataTemp.flush();
                        
                    }

                buffer = dataSetting.readLine();
                
            }
        
        
        fSetting.close();
        fTemp.close();
        dataSetting.close();
        dataTemp.close();
        
        // mendapatkan data setting yang diupdate oleh user, yang sebelumnya disimpan di file temp.haqi
        fSetting = new FileReader(fileTemp);
        dataSetting = new BufferedReader(fSetting);
        // menuliskan data setting yang diupdate user ke file setting.haqi
        fTemp = new FileWriter(fileSetting);
        dataTemp = new BufferedWriter(fTemp);
        
            buffer = dataSetting.readLine();
            while(buffer != null){
                dataTemp.write(buffer);
                dataTemp.newLine();
                dataTemp.flush();
                buffer = dataSetting.readLine();
            }
            
        fSetting.close();
        fTemp.close();
        dataSetting.close();
        dataTemp.close();
        Files.deleteFile(fileTemp.toString()); // menghapus file temp.haqi
        
    }
    
    /**
     * Method ini digunakan untuk mendapatkan setting/pengaturan yang dipakai user
     * Selanjutnya method akan mereturn value dari setting yang diinputkan 
     * 
     * Contoh setting & value = Language?INDONESIAN| "kata sebelum tanda ? adalah  'setting' sedangkan kata sesudah : adalah 'value'"
     * 
     * 
     * @param setting input untuk mengetahui informasi dari aplikasi 
     * @return info tentang aplikasi sesuai dengan input key
     */
    public static String getSetting(final String setting){
        try{
            FileReader file = new FileReader(Database.getDirectoryDB() + "settings.haqi");
            BufferedReader data = new BufferedReader(file);
            String buffer = data.readLine();
            
            // jika buffer nilainya adalah null, berarti data pada file settings.haqi telah diubah dengan paksa 
            if(buffer == null){
                Settings.resetSetting();
                Apps.showNotification("Database corrupt!", Settings.class.getName(), "Database mungkin telah diedit dengan paksa.");
            }
               // membaca file settings.haqi
                while(buffer != null){
                        if(buffer.contains(setting)){ // jika setting ditemukan 
                            return buffer.substring(buffer.indexOf("?")+1); // mereturn value dari setting
                        }
                    buffer = data.readLine();
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
    public static void resetSetting() throws IOException{
        
        FileWriter file = new FileWriter(Database.getDirectoryDB() + "settings.haqi");
        BufferedWriter setting = new BufferedWriter(file);
        
        // mereset setting
        setting.write(Settings.SETTING_LANGUAGE + "INDONESIAN"); setting.newLine();
        setting.write(Settings.SETTING_THEME + "Daymode");  setting.newLine();
        setting.write(Settings.SETTING_FORMAT + ".png"); setting.newLine();
        setting.write(Settings.SETTING_PEYIMPANAN + "C:\\Users\\" + Apps.getUsername() + "\\Desktop\\"); setting.newLine();
        setting.write(Settings.SETTING_EFEK_SUARA + "suara 1.mp3"); setting.newLine();
        setting.write(Settings.SETTING_AUTOSAVE + "deactivated"); setting.newLine();
        setting.flush();
        
    }
    
}