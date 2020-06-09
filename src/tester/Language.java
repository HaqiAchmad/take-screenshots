package tester;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import javax.swing.JOptionPane;

public class Language {

    private static File language = new File("src\\com\\database\\language.haqi");
    public static final int ENGLISH = 1,  INDONESIAN = 2,
                             JAPANESE = 3, ROMAJI = 4,
                             KOREAN = 5, ROMANIZATION = 6;

    public static String getLanguage(){

        try{
            FileReader file = new FileReader(Language.language);
            BufferedReader baca = new BufferedReader(file);
            return baca.readLine();

        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan\n" + ex);
        }
        return null;
    }

    public static void setLanguage(int codeLanguage){

        try{
            FileWriter file = new FileWriter(Language.language);
            BufferedWriter tulis = new BufferedWriter(file);

                switch (codeLanguage){
                    case ENGLISH: tulis.write("ENGLISH"); tulis.flush(); break;
                    case INDONESIAN: tulis.write("INDONESIAN"); tulis.flush(); break;
                    case JAPANESE: tulis.write("JAPANESE"); tulis.flush(); break;
                    case ROMAJI: tulis.write("ROMAJI"); tulis.flush(); break;
                    case KOREAN: tulis.write("KOREAN"); tulis.flush(); break;
                    case ROMANIZATION: tulis.write("ROMANIZATION"); tulis.flush(); break;
                    default: tulis.write("ENGLISH"); tulis.flush(); break;
                }

        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan\n" + ex);
        }
    }

    public static boolean isEnglish(){

        if(Language.getLanguage().equalsIgnoreCase("english")){
            return true;
        }else{
            return false;
        }

    }

    public static boolean isIndonesian(){

        if(Language.getLanguage().equalsIgnoreCase("indonesian")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isJapanese(){

        if(Language.getLanguage().equalsIgnoreCase("japanese")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isRomaji(){

        if(Language.getLanguage().equalsIgnoreCase("romaji")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isKorean(){

        if(Language.getLanguage().equalsIgnoreCase("korean")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isRomanization(){

        if(Language.getLanguage().equalsIgnoreCase("romanization")){
            return true;
        }else{
            return false;
        }
    }


    public static void showFile(File file){

        try{
            FileReader files = new FileReader(file);
            BufferedReader baca = new BufferedReader(files);
            String buffer = baca.readLine();

                while (buffer != null){
                    System.out.println(buffer);
                    buffer = baca.readLine();
                }

        }catch(IOException ex){
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {

        File english = new File("temp\\english lyrics.txt");
        File indonesian = new File("temp\\indonesian lyrics.txt");
        File japanese = new File("temp\\japanese lyrics.txt");
        File romaji = new File("temp\\romaji lyrics.txt");
        File korean = new File("temp\\korean lyrics.txt");
        File romanization = new File("temp\\romanization lyrics.txt");

        Scanner input = new Scanner(System.in);
        System.out.print("Pilih Bahasa : " +
                "\n\t1. English\n\t2. Indonesian" +
                "\n\t3. Japanese\n\t4. Romaji" +
                "\n\t5. Korean\n\t6. Romanization" +
                "\nMasukan kode [1-6] : ");
        char code = input.next().charAt(0);

        switch (code){

            case '1': showFile(english); break;
            case '2': showFile(indonesian); break;
            case '3': showFile(japanese); break;
            case '4': showFile(romaji); break;
            case '5': showFile(korean); break;
            case '6': showFile(romanization); break;
            default: showFile(english); break;

        }



    }
}














