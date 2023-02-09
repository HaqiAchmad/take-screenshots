package com.system;

import com.database.Database;
import com.media.sounds.PlaySounds;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.swing.ImageIcon;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
* Class ini digunakan untuk mendapatkan informasi dari aplikasi dan info dari device user
* Contoh informasi : nama dari aplikasi, versi dari aplikasi, tahun rilis aplikasi dan pembuat aplikasi
* Info Device : Nama username dari laptop, lebar dan tinggi layar user
* 
* 
* @author Achmad Baihaqi
* @version 1.5
* @since 13 05 2020
*/

public class Apps {
    
    /**
     * Digunakan untuk memanipulasi file about.haqi
     */
    private final Properties properties = new Properties();

    /**
     * Digunakan untuk mendapatkan gambar yang akan dipakai untuk icon aplikasi
     */
    private static final ImageIcon iconDaymode = new ImageIcon("src/com/media/icons/app-icon-daymode.png"),
                                   iconDarkmode = new ImageIcon("src/com/media/icons/app-icon-darkmode.png");
    /**
     * Digunakan untuk mengetahui lebar dan tinggi layar dari user
     */
    private final static Toolkit tk = Toolkit.getDefaultToolkit();
    
    /**
     * Digunakan untuk mereset data aplikasi jika file about.haqi diubah
     */
    private final String[] defaultData = {"Take Screenshots", "1.7.0", "Achmad Baihaqi", "2021", "0"};
    
    public static final String APP_NAME = "name", APP_AUTHOR = "author", APP_VERSION = "version", 
                                APP_RELEASED = "released", APP_TOTAL_SCREENSHOT = "total_screenshot";
    
    /**
     * Gmail, password dan recipent yang akan digunakan untuk mengirimkan ratting dari user
     */
    private final String GMAIL       = "your_email@gmail.com",
                                RECIPIENT   = "hakiahmad756@gmail.com",
                                PASSWORD    = "your_pw_gmail";
    
    /**
     * Method ini digunakan untuk mengetahui nama dari device user
     * Nama didapatkan dari method getProperty dengan key:"user.name" dari class System
     * 
     * @see System
     * @return nama dari device user 
     */
    public static String getUsername(){
       return System.getProperty("user.name");
    }

    /**
     * Digunakan untuk mengetahui ip address dari user
     * 
     * @return ip address user
     */
    private String getIpAddress(){
        
        try{
            InetAddress ip = InetAddress.getLocalHost();
            return ip.getHostAddress();
            
        }catch(UnknownHostException ex){
            Apps.showException("Terjadi masalah pada koneksi", Apps.class.getName(), ex.toString());
        }
        return "ip is null";
    }
    
    /**
     * Digunakan untuk mengecek apakah user tersambung ke inernet atau tidak
     * 
     * @return Jika user tersambung te Internet maka akan mengembalikan nilai <b>True</b>. 
     *         Tapi jika user tidak tersambung ke Internet maka akan mengembalikan nilai <b>False</b>
     */
    public boolean isConnectInternet(){
        Socket s = new Socket();
        InetSocketAddress inet = new InetSocketAddress("www.google.com", 80);
        
            try{
                s.connect(inet, 1000);
                return true;
            }catch(Exception ex){
                return false;
            }finally{
                try{
                    s.close();
                }catch(Exception ex){
                    Apps.showException("Terjadi kesalahan yang tidak diketahui", Apps.class.getName(), ex.toString());
                }
            }
    }
    
    /**
     * digunakan untuk membuka sebuah link
     * 
     * @param link 
     * @throws java.io.IOException 
     * @throws java.net.URISyntaxException 
     */
    public void openLink(final String link) throws IOException, URISyntaxException {
        if(this.isConnectInternet()){
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI(link));
            JOptionPane.showMessageDialog(null, "Sedang membuka link yang dituju!", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        }else{
            PlaySounds.play(PlaySounds.SUARA_NOTIF);
            JOptionPane.showMessageDialog(null, "Tidak terhubung ke internet!!");
        }
    }
    
    /**
     * Untuk mendapatkan direktori icon aplikasi
     * Direktori didapatkan dari method getImage pada class ImageIcon 
     * 
     * @return direktori icon aplikasi 
     */
    public static Image getWindowIcon(){
        Settings setting = new Settings();
        if(setting.isDaymode()){
            return iconDaymode.getImage();
        }else if(setting.isDarkmode()){
            return iconDarkmode.getImage();
        }else{
            return iconDaymode.getImage();
        }
    }
    
    /**
     * Digunakan untuk mendapatkan lebar layar dari user
     * Lebar layar didapatkan salah satu method di class Toolkit yang outputnya double (di konversi ke int di method ini)
     * 
     * 
     * @return lebar layar user 
     */
    public static int getLebarScreen(){
        return (int) tk.getScreenSize().getWidth();
    }
    
    /**
     * Digunakan untuk mendapatkan tinggi layar dari user
     * Tinggi layar didapatkan salah satu method di class Toolkit yang outputnya double (di konversi ke int di method ini)
     * 
     * 
     * @return tinggi layar user 
     */
    public static int getTinggiScreen(){
        return (int) tk.getScreenSize().getHeight();
    }
    
    /**
     * Method ini digunakan untuk mendapatkan informasi tentang aplikasi sesuai dengan key yang diinputkan.
     * Selanjutnya method akan mereturn value dari key yang diinputkan 
     * 
     * Contoh key & value adalah 
     * Author:achmad baihaqi | "kata sebelum tanda : adalah  'key' sedangkan kata sesudah : adalah 'value'"
     * 
     * Macam macam key yang tersedia:
     * name             : digunakan untuk mendapatkan nama dari aplikasi 
     * version          : digunakan untuk mendapatkan versi dari aplikasi
     * author           : digunakan untuk mengetahui nama pembuat aplikasi
     * released         : digunakan untuk mengetahui tahun dibuatnya aplikasi
     * total screenshot : digunakan untuk mendapatkan total screenshot
     * 
     * 
     * 
     * @param key input untuk mendapatkan informasi dari aplikasi 
     * @return info tentang aplikasi sesuai dengan input key
     */
    public String getProperty(final String key){
        try{
            properties.load(new FileInputStream(Database.getDirectoryDB() + "about.haqi"));
            return properties.getProperty(key);
        }catch(IOException e){
            Apps.showException(e.getMessage(), Apps.class.getName(), "Silahkan restart aplikasi!");
        }
        return null;
    }
    
    /**
     * Method ini digunakan untuk mengetahui nama dari aplikasi
     * Method ini menggunakan method getProperty untuk mendapatkan nama dari aplikasi dengan memasukan key 'name' 
     * 
     * @return nama dari aplikasi 
     */
    public String getName(){
        String data = getProperty(APP_NAME);
        if(data == null || !data.equalsIgnoreCase(this.defaultData[0])){
            this.resetDataApp();
            Apps.showNotification("Database mungkin corrupt!!", Apps.class.getName(), "Silahkan restart applikasi!");
            this.reportUser("Berusaha mengubah nama aplikasi ke " + data);
            return this.defaultData[0];
        }
        return data;
    }
    
    /**
     * Method ini digunakan untuk mengetahui versi dari aplikasi
     * Method ini menggunakan method getProperty untuk mendapatkan versi dari aplikasi dengan memasukan key 'version' 
     * 
     * @return versi dari aplikasi 
     */
    public String getVersion(){
        String data = getProperty(APP_VERSION);
        if(data == null || !data.equalsIgnoreCase(this.defaultData[1])){
            this.resetDataApp();
            Apps.showNotification("Database mungkin corrupt!!", Apps.class.getName(), "Silahkan restart applikasi!");
            this.reportUser("Berusaha mengubah versi aplikasi ke " + data);
            return this.defaultData[1];
        }
        return data;
    }
    
    /**
     * Method ini digunakan untuk mengetahui name dari pembuat aplikasi
     * Method ini menggunakan method getProperty untuk mendapatkan nama dari pembuat aplikasi dengan memasukan key 'author' 
     * 
     * @return nama pembuat aplikasi
     */
    public String getAuthor(){
        String data = getProperty(APP_AUTHOR);
        if(data == null || !data.equalsIgnoreCase(this.defaultData[2])){
            this.resetDataApp();
            Apps.showNotification("Pelangaran hak cipta terdeteksi!!\nSystem mendeteksi bahwa hak cipta diedit dengan paksa!!", Apps.class.getName(), "Copyright © 2020 Achmad Baihaqi. All Rights Reserved.");
            this.reportUser("Berusaha mengubah nama pembuat aplikasi ke " + data);
            return this.defaultData[2];
        }
        return data;
    }
    
    /**
     * Method ini digunakan untuk mengetahui tahun dibuatnya aplikasi
     * Method ini menggunakan method getProperty untuk mendapatkan tahun dibuatnya aplikasi dengan memasukan key 'released' 
     * 
     * @return tahun rilis aplikasi
     */
    public String getReleased(){
        String data = getProperty(APP_RELEASED);
        if(data == null || !data.equalsIgnoreCase(this.defaultData[3])){
            this.resetDataApp();
            Apps.showNotification("Database mungkin corrupt!!", Apps.class.getName(), "Silahkan restart applikasi!");
            this.reportUser("Berusaha mengubah tahun dibuat aplikasi ke " + data);
            return this.defaultData[3];
        }
        return data;
    }

    /**
     * Method ini digunakan untuk mengetahui total screenshot yang sudah diambil
     * Method ini menggunakan method getProperty untuk mendapatkan total screenshot dengan memasukan key 'total screenshot' 
     * 
     * @return total screenshot yang diambil user
     */
    public int getTotalScreenshots(){
        try{
            return Integer.parseInt(getProperty(APP_TOTAL_SCREENSHOT));
        }catch(NumberFormatException e){
            this.resetDataApp();
        }
        return 0;
    }
    
    /**
     * Berfungsi untuk mengupdate total screenshot yang diambil. 
     * "total sceenshot akan selalu diupdate saat user menekan tombol take screnshot pada com.window.MainWindow() "
     * 
     */
    public void updateTotalScreenshot(){
        try{
            int totalSS = getTotalScreenshots();
            properties.setProperty(Apps.APP_TOTAL_SCREENSHOT, Integer.toString(totalSS+1));
            properties.store(new FileOutputStream(Database.getDirectoryDB() + "about.haqi"), "");
        }catch(NumberFormatException e){
            this.resetDataApp();
        }catch(IOException ex){
            Apps.showException("File mungkin tidak ditemukan didatabse!!", Apps.class.getName(), ex.toString());
        }
    }
    
    /**
     * Untuk mereset data dari apllikasi seperti nama aplikasi, versi aplikasi, author applkasi dll.
     * Fungsi mereset data aplikasi adalah jika file about.haqi terhapus atau file about.haqi kosong
     * 
     */
    public void resetDataApp(){
        try{
            properties.put(Apps.APP_NAME, this.defaultData[0]);
            properties.put(Apps.APP_VERSION, this.defaultData[1]);
            properties.put(Apps.APP_AUTHOR, this.defaultData[2]);
            properties.put(Apps.APP_RELEASED, this.defaultData[3]);
            properties.put(Apps.APP_TOTAL_SCREENSHOT, this.defaultData[4]);
            properties.store(new FileOutputStream(Database.getDirectoryDB() + "about.haqi"), "data aplikasi");
        }catch(IOException e){
            Apps.showException("File tidak ada didalam database", Apps.class.getName(), e.toString());
        }
    }
    
    /**
     * Digunakan untuk mengirimpan pesan ke hakiahmad756@gmail.com bahwa user meruabah database
     * 
     * @param pesan pesan yang akan dikirimkan
     */
    private void reportUser(final String pesan){
        if(this.isConnectInternet()){
            new Thread(new Runnable(){
            
                @Override
                public void run(){
                    try{
                        sendGmail(getUsername()+" <"+getIpAddress()+"> "+pesan, "null");
                    }catch(Exception ex){
                        System.err.println(ex.toString());
                    }
                    
                }
            }).start();
        }
    }
    
    /**
     * Digunakan untuk mengirimkan email dari user ke hakiahmad756@gmail.com. 
     * Email dapat berisi ratting dari user atau laporan bahwa user mengedit database
     * 
     * @param subject subject dari email
     * @param body isi dari email
     */
    public void sendGmail(String subject, String body){
            
        System.out.println("Mengirim email ke " + RECIPIENT);

        // membuat properti object
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // membuat session
        Session session = Session.getInstance(props, new Authenticator(){

            @Override 
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(GMAIL, PASSWORD);
            }

        });
        
        // mendebug session
        session.setDebug(true);

        try{
            // membuat email yang akan dikirim
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(GMAIL)); // mengatur pengirim email
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(RECIPIENT)); // mengatur tipe pesan dan penerima email
            message.setSubject(subject); // mengatur subject dari email
            message.setContent(body, "text/html"); // mengatur isi dari email

            Transport.send(message); // mengirimkan email 
            System.out.println("Email sukses terkirim ke " + RECIPIENT);

        }catch (MessagingException ex) {
            Apps.showException("Ada masalah saat mengirim email", Apps.class.getName(), ex.toString());
        }

    }

    /**
     * Digunakan untuk menampilkan pesan/notifikasi ke user
     * 
     * @param notification pesan yang ingin ditampilkan
     * @param location lokasi class yang menampilkan pesan
     * @param note keterangan pesan
     */
    public static void showNotification(String notification, String location, String note){
        PlaySounds.play(PlaySounds.SUARA_NOTIF);
        JOptionPane.showMessageDialog(null, "Ada yang aneh!!\n\nNotifikasi :\n" + notification + "\n\nLokasi :\n"+ location +"\n\nKeterangan :\n" + note);
    }
    
    /**
     * Digunakan untuk menampilkan excepion yang terjadi pada aplikasi
     * 
     * @param message pesan yang ingin ditampilkan
     * @param location lokasi class yang terjadi exception
     * @param exception tipe exception
     */
    public static void showException(String message, String location, String exception){
        PlaySounds.play(PlaySounds.SUARA_ERROR);
        JOptionPane.showMessageDialog(null, "Terjadi Kesalahan!!\n\nPesan :\n" + message + "\n\nLokasi :\n"+ location +"\n\nException :\n" + exception);
    }
}
