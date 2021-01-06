package com.window.helper;

import com.system.Apps;
import com.system.Settings;
import java.awt.Color;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.WindowConstants;

/**
 * Untuk terhubung ke kontak saya seperti whatsapp dan gmail
 * 
 * @author Achmad Baihaqi
 * @since 17 July 2020
 * @version 1.1
 */
public class KontakSaya extends javax.swing.JFrame {

    public KontakSaya() {
        initComponents();
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // agar tidak menutup window utama
        this.setTitle(Settings.getLanguageActived("Contact Developer", "Kontak Developer", "開発者に連絡する", "Kaihatsu-sha ni renraku suru", "개발자에게 문의", "gaebalja-ege mun-ui"));
        this.setIconImage(Apps.getWindowIcon());
        this.lblKontaksaya.setText(Settings.getLanguageActived("Contact Developer", "Kontak Developer", "開発者に連絡する", "Kaihatsu-sha ni renraku suru", "개발자에게 문의", "gaebalja-ege mun-ui"));
        
        setThemes();
    }

    private void setThemes(){
        this.mainPanel.setBackground(Settings.getThemeColors(new Color(255,255,255), new Color(35,35,37)));
        
        this.lblKontaksaya.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
        this.txtWhatsapp.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
        this.txtInstagram.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
        this.txtTwitter.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
        this.txtYoutube.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        lblIconKontak = new javax.swing.JLabel();
        kontakWhatsapp = new javax.swing.JLabel();
        lblKontaksaya = new javax.swing.JLabel();
        txtWhatsapp = new javax.swing.JLabel();
        kontakInstagram = new javax.swing.JLabel();
        txtInstagram = new javax.swing.JLabel();
        txtTwitter = new javax.swing.JLabel();
        kontakTwitter = new javax.swing.JLabel();
        txtYoutube = new javax.swing.JLabel();
        kontakYoutube = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblIconKontak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-kontaksaya-people.png"))); // NOI18N

        kontakWhatsapp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kontakWhatsapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-kontaksaya-whatsapp.png"))); // NOI18N
        kontakWhatsapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kontakWhatsappMouseClicked(evt);
            }
        });

        lblKontaksaya.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblKontaksaya.setText("Kontak saya!!!");

        txtWhatsapp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtWhatsapp.setText("Whatsapp");
        txtWhatsapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWhatsappMouseClicked(evt);
            }
        });

        kontakInstagram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kontakInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-kontaksaya-ig.png"))); // NOI18N
        kontakInstagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kontakInstagramMouseClicked(evt);
            }
        });

        txtInstagram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInstagram.setText("Instagram");
        txtInstagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtInstagramMouseClicked(evt);
            }
        });

        txtTwitter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTwitter.setText("Twitter");
        txtTwitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTwitterMouseClicked(evt);
            }
        });

        kontakTwitter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kontakTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-kontaksaya-twitter.png"))); // NOI18N
        kontakTwitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kontakTwitterMouseClicked(evt);
            }
        });

        txtYoutube.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtYoutube.setText("Youtube");
        txtYoutube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtYoutubeMouseClicked(evt);
            }
        });

        kontakYoutube.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kontakYoutube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-kontaksaya-youtube.png"))); // NOI18N
        kontakYoutube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kontakYoutubeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(lblIconKontak, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKontaksaya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kontakWhatsapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kontakInstagram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtInstagram, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kontakTwitter, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(txtTwitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kontakYoutube, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(txtYoutube, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIconKontak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKontaksaya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(kontakWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWhatsapp))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kontakTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kontakInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(kontakYoutube, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addComponent(txtYoutube)))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtInstagram)
                                    .addComponent(txtTwitter))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Digunakan untuk membuka chat whatsapp no saya
     * 
     * @param evt 
     */
    private void kontakWhatsappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kontakWhatsappMouseClicked
        try{
            Apps.openLink("https://wa.me/6285655864624");
        }catch(IOException | URISyntaxException ex){
            Apps.showException("Ada masalah saat menghubungkan ke Whatsapp", KontakSaya.class.getName(), "https://wa.me/6285655864624");
        }
    }//GEN-LAST:event_kontakWhatsappMouseClicked

    private void kontakInstagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kontakInstagramMouseClicked
        try{
            Apps.openLink("https://instagram.com/system32.bin");
        }catch(IOException | URISyntaxException ex){
            Apps.showException("Ada masalah saat menghubungkan ke Instagram", KontakSaya.class.getName(), "mailto:hakiahmad756@gmail.com");
        }
    }//GEN-LAST:event_kontakInstagramMouseClicked

    private void kontakTwitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kontakTwitterMouseClicked
        try{
            Apps.openLink("https://twitter.com/twitter");
        }catch(IOException | URISyntaxException ex){
            Apps.showException("Ada masalah saat menghubungkan ke Twitter", KontakSaya.class.getName(), "mailto:hakiahmad756@gmail.com");
        }
    }//GEN-LAST:event_kontakTwitterMouseClicked

    private void kontakYoutubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kontakYoutubeMouseClicked
        try{
            Apps.openLink("https://youtube.com/channel/UCxq4odfJNeYuyae4qf6UDRQ");
        }catch(IOException | URISyntaxException ex){
            Apps.showException("Ada masalah saat menghubungkan ke Youtube", KontakSaya.class.getName(), "mailto:hakiahmad756@gmail.com");
        }
    }//GEN-LAST:event_kontakYoutubeMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Ratting.isOpen_KontakSaya = false;
    }//GEN-LAST:event_formWindowClosed

    private void txtWhatsappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWhatsappMouseClicked
        try{
            Apps.openLink("https://wa.me/6285655864624");
        }catch(IOException | URISyntaxException ex){
            Apps.showException("Ada masalah saat menghubungkan ke Whatsapp", KontakSaya.class.getName(), "https://wa.me/6285655864624");
        }
    }//GEN-LAST:event_txtWhatsappMouseClicked

    private void txtInstagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInstagramMouseClicked
        try{
            Apps.openLink("https://instagram.com/system32.bin");
        }catch(IOException | URISyntaxException ex){
            Apps.showException("Ada masalah saat menghubungkan ke Instagram", KontakSaya.class.getName(), "mailto:hakiahmad756@gmail.com");
        }
    }//GEN-LAST:event_txtInstagramMouseClicked

    private void txtTwitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTwitterMouseClicked
        try{
            Apps.openLink("https://twitter.com/twitter");
        }catch(IOException | URISyntaxException ex){
            Apps.showException("Ada masalah saat menghubungkan ke Twitter", KontakSaya.class.getName(), "mailto:hakiahmad756@gmail.com");
        }
    }//GEN-LAST:event_txtTwitterMouseClicked

    private void txtYoutubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtYoutubeMouseClicked
        try{
            Apps.openLink("https://youtube.com/channel/UCxq4odfJNeYuyae4qf6UDRQ");
        }catch(IOException | URISyntaxException ex){
            Apps.showException("Ada masalah saat menghubungkan ke Youtube", KontakSaya.class.getName(), "mailto:hakiahmad756@gmail.com");
        }
    }//GEN-LAST:event_txtYoutubeMouseClicked


    public static void main(String args[]) {

        new KontakSaya().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel kontakInstagram;
    private javax.swing.JLabel kontakTwitter;
    private javax.swing.JLabel kontakWhatsapp;
    private javax.swing.JLabel kontakYoutube;
    private javax.swing.JLabel lblIconKontak;
    private javax.swing.JLabel lblKontaksaya;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel txtInstagram;
    private javax.swing.JLabel txtTwitter;
    private javax.swing.JLabel txtWhatsapp;
    private javax.swing.JLabel txtYoutube;
    // End of variables declaration//GEN-END:variables
}
