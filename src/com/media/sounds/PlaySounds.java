package com.media.sounds;

import com.system.Apps;

import javazoom.jl.player.Player;
import javazoom.jl.decoder.JavaLayerException;

import java.io.FileInputStream;
import java.io.IOException;


/**
 * Class ini digunakan untuk memutar audio mp3 dan wav. 
 * Yang digunakan untuk efek suara saat screenshot atau saat aplikasi terjadi error/exception
 * 
 * @author Achmad Baihaqi
 * @since 1 July 2020
 * @version 1.3
 */
public class PlaySounds {
    
    /**
     * attribute yang digunakan untuk memutar dan menonaktifkan audio/suara
     */
    private static Player players;
    /**
     * nama file dari audio yang akan diputar
     */
    public static final String  SUARA_1 = "suara 1.mp3", SUARA_2 = "suara 2.mp3", SUARA_3 = "suara 3.mp3",
                                SUARA_4 = "suara 4.mp3", SUARA_5 = "suara 5.mp3", SUARA_ERROR = "suara error.wav",
                                SUARA_NOTIF = "suara notif.wav";
    /**
     * directory penyimpanan file audio
     */
    private static final String directory = "src\\com\\media\\sounds\\";
    
    /**
     * Method ini digunakan untuk memutar audio/suara
     * 
     * @param filename file audio yang akan diputar
     */
    public static synchronized void play(final String filename){

        // mengambil input audio dari user
        try{
            FileInputStream input = new FileInputStream(directory+filename);
            players = new Player(input);
        }catch(IOException iex){
            Apps.showException("Mungkin file audio sudah terhapus!!", PlaySounds.class.getName(), iex.toString());
        }catch(JavaLayerException jlex){
            Apps.showException("Gagal memutar audio/suara!!\nMungkin file audio sudah terhapus!!", PlaySounds.class.getName(), jlex.toString());
        }
        
        new Thread(new Runnable(){
            
            @Override
            public void run(){
                try{
                    players.play(); // memutar audio
                }catch(JavaLayerException jlex){
                    Apps.showException("Gagal memutar audio/suara!!\nMungkin file audio sudah terhapus!!", PlaySounds.class.getName(), jlex.toString());
                }
            }
        }).start();

    }

    /**
     * Method ini digunakan untuk menonaktifkan audio/suara
     */
    public static synchronized void stop(){
        if(players != null){
            players.close();
        }
    }
    
   
}
