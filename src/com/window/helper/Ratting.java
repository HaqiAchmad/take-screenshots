package com.window.helper;

import com.media.sounds.PlaySounds;
import com.system.Apps;
import com.system.Settings;
import com.window.WindowSetting;
import java.awt.Color;

import java.awt.Cursor;
import javax.swing.JOptionPane;


/**
 * Digunakan untuk mendapatkan ratting yang diberikan user terhadap applikasi ini
 * Ratting dari user akan dikirimkan lewat gmail
 * 
 * @author Achmad baihaqi
 * @version 1.4
 * @since 08 Juli 2020
 */
public class Ratting extends javax.swing.JFrame {
    
    /**
     * Digunaakan untuk mengecek apakah window KontakSaya sedang dibuka atau tidak
     */
    public static boolean isOpen_KontakSaya = false;

    /**
     * Ratting yang diberikan user, defaultnya adalah 0
     */
    private int starValue = 0;

    public Ratting() {
        initComponents();
        this.lblEmot.setText("");
        
        this.setTitle("Ratting ~ " + Apps.getName()+" "+ Apps.getVersion());
        this.setIconImage(Apps.getWindowIcon());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        this.btnKirim.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.btnNanti.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        
        setLanguage();
        setThemes();
    }
    
    private void setThemes(){
        this.pnlMain.setBackground(Settings.getThemeColors(new Color(255,255,255), new Color(35,35,37)));
        this.btnKirim.setBackground(Settings.getThemeColors(new Color(193,193,193), new Color(57,60,64)));
        this.btnNanti.setBackground(Settings.getThemeColors(new Color(193,193,193), new Color(57,60,64)));
        this.inputNama.setBackground(Settings.getThemeColors(new Color(250,250,250), new Color(45,48,49)));
        this.inputMasukan.setBackground(Settings.getThemeColors(new Color(250,250,250), new Color(45,48,49)));
        
        this.btnKirim.setForeground(Settings.getThemeColors(new Color(5,5,5), new Color(255,255,255)));
        this.btnNanti.setForeground(Settings.getThemeColors(new Color(5,5,5), new Color(255,255,255)));
        this.inputNama.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
        this.inputNama.setCaretColor(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
        this.inputMasukan.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
        this.inputMasukan.setCaretColor(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
        this.lblNama.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
        this.lblMasukan.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
        this.lblRatting.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
        this.lblEmot.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
        this.lblKontak.setForeground(Settings.getThemeColors(new Color(58,90,223), new Color(255,51,51)));
    }
    
    private void setLanguage(){
        this.lblNama.setText("  "+Settings.getLanguageActived("Your name", "Nama kamu", "あなたの名前", "Anata no namae", "당신의 이름", "dangsin-ui ileum"));
        this.lblMasukan.setText("  "+Settings.getLanguageActived("Feedback", "Masukan", "フィードバック", "Fīdobakku", "피드백", "pideubaeg"));
        this.lblRatting.setText("  "+Settings.getLanguageActived("Ratting" ,"Ratting", "ラッティング", "Rattingu", "라팅", "lating"));

        this.lblKontak.setText(Settings.getLanguageActived("Contact Developer...", "Kontak Developer...", "開発者に連絡する", "Kaihatsu-sha ni renraku suru", "개발자에게 문의", "gaebalja-ege mun-ui"));
        this.btnKirim.setText(Settings.getLanguageActived("Send", "Kirim",  "それを送る", "Sore o okuru", "보내", "bonae"));
        this.btnNanti.setText(Settings.getLanguageActived("Later", "Nanti",  "後で", "Atode", "나중", "Najung"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        btnNanti = new javax.swing.JButton();
        btnKirim = new javax.swing.JButton();
        lblNama = new javax.swing.JLabel();
        lblRatting = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputMasukan = new javax.swing.JTextArea();
        lblMasukan = new javax.swing.JLabel();
        star4 = new javax.swing.JLabel();
        star1 = new javax.swing.JLabel();
        star2 = new javax.swing.JLabel();
        star3 = new javax.swing.JLabel();
        star5 = new javax.swing.JLabel();
        lblEmot = new javax.swing.JLabel();
        lblKontak = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        btnNanti.setBackground(new java.awt.Color(193, 193, 193));
        btnNanti.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnNanti.setForeground(new java.awt.Color(5, 5, 5));
        btnNanti.setText("Nanti");
        btnNanti.setBorder(null);
        btnNanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNantiActionPerformed(evt);
            }
        });

        btnKirim.setBackground(new java.awt.Color(193, 193, 193));
        btnKirim.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnKirim.setForeground(new java.awt.Color(5, 5, 5));
        btnKirim.setText("Kirim");
        btnKirim.setBorder(null);
        btnKirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKirimActionPerformed(evt);
            }
        });

        lblNama.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNama.setText(" Nama kamu");

        lblRatting.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblRatting.setText(" Ratting");

        inputNama.setBackground(new java.awt.Color(250, 250, 250));
        inputNama.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        inputMasukan.setBackground(new java.awt.Color(250, 250, 250));
        inputMasukan.setColumns(20);
        inputMasukan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inputMasukan.setRows(5);
        jScrollPane1.setViewportView(inputMasukan);

        lblMasukan.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblMasukan.setText(" Masukan");

        star4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        star4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png"))); // NOI18N
        star4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star4MouseClicked(evt);
            }
        });

        star1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        star1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png"))); // NOI18N
        star1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star1MouseClicked(evt);
            }
        });

        star2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        star2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png"))); // NOI18N
        star2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star2MouseClicked(evt);
            }
        });

        star3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        star3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png"))); // NOI18N
        star3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star3MouseClicked(evt);
            }
        });

        star5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        star5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png"))); // NOI18N
        star5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star5MouseClicked(evt);
            }
        });

        lblEmot.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblEmot.setText("Sangat Suka");

        lblKontak.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblKontak.setForeground(new java.awt.Color(58, 90, 223));
        lblKontak.setText("Kontak saya...");
        lblKontak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKontakMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(inputNama)))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(lblRatting, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblEmot, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(star1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(star2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(star3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblKontak, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(star4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(star5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(btnNanti, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKirim, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlMainLayout.createSequentialGroup()
                    .addComponent(lblMasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 311, Short.MAX_VALUE)))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputNama, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(star4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(star5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRatting, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(star1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(star2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(star3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmot, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNanti, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKirim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(lblKontak, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlMainLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(lblMasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(190, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Digunakan untuk mengirimkan ratting dari user 
     * Sebelum mengirimkan ratting user harus memenuhi beberapa kriteria untuk mengirimkan ratting antara lain;
     * - input nama tidak boleh kosong
     * - ratting tidak boleh kosong 
     * - user harus terhubung ke internet
     * 
     * @param evt 
     */
    private void btnKirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKirimActionPerformed
        this.setCursor(new java.awt.Cursor(Cursor.WAIT_CURSOR)); // mengset cursor ke wait/loading
        
        if(this.inputNama.getText().length() < 1){ // mengecek apakah input nama kosong atau tidak
            Apps.showNotification("Nama tidak boleh kosong!!", Ratting.class.getName(), "null");
        }else if(this.starValue == 0){
            // mengecek apakah ratting kosong atau tidak
            Apps.showNotification("Ratting tidak boleh kosong!!", Ratting.class.getName(), "null");
            javax.swing.JLabel[] lbls = new javax.swing.JLabel[]{this.star1, this.star2, this.star3, this.star4, this.star5};
            // jika ratting kosong maka input ratting akan diberikan warna merah
            for(javax.swing.JLabel lbl : lbls){
                lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowrating-bintang-error.png")));
            }
        }else if(!Apps.isConnectInternet()){ // mengecek apakah user terhubung ke internet 
            Apps.showNotification("Tidak terhubung ke internet!", Ratting.class.getName(), "Internet error!");
        }else{ // jika user sudah memehuni semua kriteria yang ditentukan method akan menggirimkan ratting dari user
            // mengirimkan ratting dari user ke gmail hakiahmad756@gmail.com
                String subject = "" + starValue + " bintang dari " + inputNama.getText(),
                       body = "<p>" + subject + "<br>" + "masukan:" + inputMasukan.getText() + "</p>";
                Apps.sendGmail(subject, body);
                JOptionPane.showMessageDialog(null, "Ratting sukses terkirim...");
                this.btnKirim.setVisible(false); // jika ratting sudah terkirim maka btnKirim akan tidak terlihat dan btnNanti textnya berubah menjadi kembali
                this.btnNanti.setText("Kembali");
        }  
        this.setCursor(new java.awt.Cursor(Cursor.DEFAULT_CURSOR)); // mereset kursor
    }//GEN-LAST:event_btnKirimActionPerformed

    /**
     * Berfungsi untuk kembali ke window setting
     * @param evt event
     */
    private void btnNantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNantiActionPerformed
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable(){
        
            @Override
            public void run(){
                WindowSetting set = new WindowSetting();
                set.setLocation(getX(), getY());
                set.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnNantiActionPerformed

    /**
     * Jika tombol start1 diklik maka ratting akan diset ke 1/benci
     * 
     * @param evt 
     */
    private void star1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star1MouseClicked
         this.starValue = 1;
         this.star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png")));
         this.star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png")));
         this.star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png")));
         this.star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png")));
         this.star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png")));
         this.lblEmot.setIcon(Settings.getThemeIcons(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-benci.png")), 
                                                     new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-benci-darkmode.png"))
         ));
         this.lblEmot.setText(Settings.getLanguageActived("Hate", "Benci",  "嫌い", "Kirai", "미움", "Mium"));
    }//GEN-LAST:event_star1MouseClicked

    /**
     * Jika tombol start2 diklik maka ratting akan diset ke 2/tidak suka
     * 
     * @param evt 
     */
    private void star2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star2MouseClicked
         this.starValue = 2;
         this.star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png"))); 
         this.star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png"))); 
         this.star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png")));
         this.star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png")));
         this.star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png")));
         this.lblEmot.setIcon(Settings.getThemeIcons(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-tidaksuka.png")), 
                                                     new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-tidaksuka-darkmode.png"))
         ));
         this.lblEmot.setText(Settings.getLanguageActived("Dislike" ,"Tidak suka", "好きではない", "Sukide wanai", "싫어", "silh-eo"));
    }//GEN-LAST:event_star2MouseClicked

    /**
     * Jika tombol start3 diklik maka ratting akan diset ke 3/lumayan
     * 
     * @param evt 
     */
    private void star3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star3MouseClicked
         this.starValue = 3;
         this.star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png"))); 
         this.star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png")));   
         this.star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png")));   
         this.star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png")));
         this.star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png")));
         this.lblEmot.setIcon(Settings.getThemeIcons(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-lumayan.png")), 
                                                     new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-lumayan-darkmode.png"))
         ));
         this.lblEmot.setText(Settings.getLanguageActived("Not bad", "Lumayan",  "悪くない", "Warukunai", "나쁘지 않다", "nappeuji anhda"));
    }//GEN-LAST:event_star3MouseClicked

    /**
     * Jika tombol start4 diklik maka ratting akan diset ke 4/suka
     * 
     * @param evt 
     */
    private void star4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star4MouseClicked
         this.starValue = 4;
         this.star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png"))); 
         this.star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png"))); 
         this.star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png"))); 
         this.star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png"))); 
         this.star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang-kosong.png")));
         this.lblEmot.setIcon(Settings.getThemeIcons(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-suka.png")), 
                                                     new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-suka-darkmode.png"))
         ));
         this.lblEmot.setText(Settings.getLanguageActived("Like", "Suka", "いいね", "Ī ne", "그 것처럼", "geu geoscheoleom"));
    }//GEN-LAST:event_star4MouseClicked

    /**
     * Jika tombol start5 diklik maka ratting akan diset ke 5/cinta
     * 
     * @param evt 
     */
    private void star5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star5MouseClicked
         this.starValue = 5;
         this.star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png"))); 
         this.star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png"))); 
         this.star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png"))); 
         this.star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png"))); 
         this.star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-bintang.png"))); 
         this.lblEmot.setIcon(Settings.getThemeIcons(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-cinta.png")), 
                                                     new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-cinta-darkmode.png"))
         ));
         this.lblEmot.setText(Settings.getLanguageActived("Love", "Cinta", "愛", "Ai", "사랑", "salang"));
    }//GEN-LAST:event_star5MouseClicked

    /**
     * Digunakan untuk membuka window kontak saya
     * @param evt 
     */
    private void lblKontakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKontakMouseClicked
        // membuka window kontakSaya
        if(!isOpen_KontakSaya){
            isOpen_KontakSaya = true;
            KontakSaya kontak = new KontakSaya();
            kontak.setLocation(getX(), getY());

                java.awt.EventQueue.invokeLater(new Runnable(){

                    @Override
                    public void run(){
                        kontak.setVisible(true);
                    }
                });            
        }else{
            PlaySounds.play(PlaySounds.SUARA_NOTIF);
            JOptionPane.showMessageDialog(null, "Window sudah terbuka!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_lblKontakMouseClicked


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ratting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKirim;
    private javax.swing.JButton btnNanti;
    private javax.swing.JTextArea inputMasukan;
    private javax.swing.JTextField inputNama;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmot;
    private javax.swing.JLabel lblKontak;
    private javax.swing.JLabel lblMasukan;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblRatting;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JLabel star1;
    private javax.swing.JLabel star2;
    private javax.swing.JLabel star3;
    private javax.swing.JLabel star4;
    private javax.swing.JLabel star5;
    // End of variables declaration//GEN-END:variables
}
