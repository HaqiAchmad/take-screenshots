package com.window.helper;

import com.media.sounds.PlaySounds;
import com.system.Apps;
import com.system.Settings;
import com.window.WindowSetting;

import java.awt.Cursor;
import javax.swing.JOptionPane;


/**
 * Digunakan untuk mendapatkan ratting yang diberikan user terhadap applikasi ini
 * Ratting dari user akan dikirimkan lewat gmail
 * 
 * @author Achmad baihaqi
 * @version 1.2
 * @since 08 July 2020
 */
public class Ratting extends javax.swing.JFrame {

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
         
        this.lblNama.setText("  "+Settings.getLanguageActived("Your name", "Nama kamu", "あなたの名前", "Anata no namae", "당신의 이름", "dangsin-ui ileum"));
        this.lblMasukan.setText("  "+Settings.getLanguageActived("Feedback", "Masukan", "フィードバック", "Fīdobakku", "피드백", "pideubaeg"));
        this.lblRatting.setText("  "+Settings.getLanguageActived("Ratting" ,"Ratting", "ラッティング", "Rattingu", "라팅", "lating"));
        
        this.lblTemporary.setText(Settings.getLanguageActived("Window does not yet support darkmode", "Window belum mendukung darkmode", "まだサポートされていないダークモード", "Mada sapōto sa rete inai dākumōdo", "아직 지원되지 않는 다크 모드", "ajig jiwondoeji anhneun dakeu modeu"));
        this.lblKontak.setText(Settings.getLanguageActived("Contact me", "Kontak saya", "私に連絡して", "Watashi ni renraku shite", "저에게 연락", "jeoege yeonlag"));
        this.btnKirim.setText(Settings.getLanguageActived("Send", "Kirim", "それを送る", "Sore o okuru", "보내", "bonae"));
        this.btnNanti.setText(Settings.getLanguageActived("Later", "Nanti", "後で", "Atode", "나중", "Najung"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        lblTemporary = new javax.swing.JLabel();
        lblKontak = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        lblTemporary.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblTemporary.setForeground(new java.awt.Color(251, 47, 47));
        lblTemporary.setText("아직 지원되지 않는 다크 모드");

        lblKontak.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblKontak.setForeground(new java.awt.Color(58, 90, 223));
        lblKontak.setText("Kontak saya...");
        lblKontak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKontakMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(inputNama)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRatting, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblEmot, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(star1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(star2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(star3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTemporary, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKontak, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(star4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(star5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnNanti, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKirim, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(lblMasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 311, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputNama, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(star4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(star5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRatting, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(star1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(star2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(star3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEmot, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNanti, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKirim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblKontak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTemporary))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(lblMasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(190, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            // membuat pesan  yang berisi rattig dan masukan dari user untuk dikirimkan 
            String nama = this.inputNama.getText(),
                   star = Integer.toString(this.starValue),
                   subject = Integer.toString(this.starValue) + " Bintang dari " + this.inputNama.getText() + " <"+Apps.getName()+">",
                   masukan = "<h2>"+nama+" Memberi bintang " + star+"</h2>"
                            + "<h4>Masukan dari "+nama+":</h4>"
                            + "<h6> >> "+ inputMasukan.getText() + "</h6>" ;
            // mengirimkan ratting dari user ke gmail hakiahmad756@gmail.com
                Apps.sendGmail(subject, masukan);
                JOptionPane.showMessageDialog(null, "Ratting sukses terkirim...");
                this.btnKirim.setVisible(false); // jika ratting sudah terkirim maka btnKirim akan tidak terlihat dan btnNanti textnya berubah menjadi kembali
                this.btnNanti.setText("Kembali");
        }  
        this.setCursor(new java.awt.Cursor(Cursor.DEFAULT_CURSOR)); // mereset kursor
    }//GEN-LAST:event_btnKirimActionPerformed

    /**
     * Berfungsi untuk kembali ke window setting
     * @param evt 
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
         this.lblEmot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-benci.png")));
         this.lblEmot.setText(Settings.getLanguageActived("Hate", "Benci", "嫌い", "Kirai", "미움", "Mium"));
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
         this.lblEmot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-tidaksuka.png")));
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
         this.lblEmot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-lumayan.png")));
         this.lblEmot.setText(Settings.getLanguageActived("Not bad", "Lumayan", "悪くない", "Warukunai", "나쁘지 않다", "nappeuji anhda"));
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
         this.lblEmot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-suka.png")));
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
         this.lblEmot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-windowratting-emot-cinta.png")));
         this.lblEmot.setText(Settings.getLanguageActived("Love", "Cinta", "愛", "Ai", "사랑", "salang"));
    }//GEN-LAST:event_star5MouseClicked

    /**
     * Digunakan untuk membuka window kontak saya
     * @param evt 
     */
    private void lblKontakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKontakMouseClicked
        
        java.awt.EventQueue.invokeLater(new Runnable(){
        
            @Override
            public void run(){
                if(!Apps.isConnectInternet()){
                    Apps.showNotification("Tidak terhubung ke internet!", Ratting.class.getName(), "Internet error!");
                }else{
                    PlaySounds.play(PlaySounds.SUARA_NOTIF);
                    KontakSaya kontak = new KontakSaya();
                    kontak.setLocation(getX(), getY());
                    kontak.setVisible(true);
                }
            }
        });
    }//GEN-LAST:event_lblKontakMouseClicked


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmot;
    private javax.swing.JLabel lblKontak;
    private javax.swing.JLabel lblMasukan;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblRatting;
    private javax.swing.JLabel lblTemporary;
    private javax.swing.JLabel star1;
    private javax.swing.JLabel star2;
    private javax.swing.JLabel star3;
    private javax.swing.JLabel star4;
    private javax.swing.JLabel star5;
    // End of variables declaration//GEN-END:variables
}
