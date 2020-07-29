package com.window.helper;

import com.system.Apps;
import com.system.Settings;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 * Untuk terhubung ke kontak saya seperti whatsapp dan gmail
 * 
 * @author Achmad Baihaqi
 * @since 17 July 2020
 * @version 1.0
 */
public class KontakSaya extends javax.swing.JFrame {

    /**
     * Untuk membuka link
     */
    private final Desktop desktop = Desktop.getDesktop();

    public KontakSaya() {
        initComponents();
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // agar tidak menutup window utama
        this.setTitle(Settings.getLanguageActived("Contact me", "Kontak saya", "私に連絡して", "Watashi ni renraku shite", "저에게 연락", "jeoege yeonlag"));
        this.setIconImage(Apps.getWindowIcon());
        
        this.lblKontaksaya.setText(Settings.getLanguageActived("Contact me", "Kontak saya", "私に連絡して", "Watashi ni renraku shite", "저에게 연락", "jeoege yeonlag"));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        lblIconKontak = new javax.swing.JLabel();
        kontakWhatsapp = new javax.swing.JLabel();
        kontakGmail = new javax.swing.JLabel();
        lblKontaksaya = new javax.swing.JLabel();
        txtWhatsapp = new javax.swing.JLabel();
        txtGmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(248, 245, 245));

        lblIconKontak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-kontaksaya-people.png"))); // NOI18N

        kontakWhatsapp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kontakWhatsapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-kontaksaya-whatsapp.png"))); // NOI18N
        kontakWhatsapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kontakWhatsappMouseClicked(evt);
            }
        });

        kontakGmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kontakGmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-kontaksaya-gmail.png"))); // NOI18N
        kontakGmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kontakGmailMouseClicked(evt);
            }
        });

        lblKontaksaya.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblKontaksaya.setText("Kontak saya!!!");

        txtWhatsapp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtWhatsapp.setText("Whatsapp");

        txtGmail.setText("   Gmail");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(lblIconKontak, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKontaksaya, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtWhatsapp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(kontakWhatsapp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kontakGmail, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(txtGmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIconKontak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKontaksaya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kontakGmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kontakWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWhatsapp)
                    .addComponent(txtGmail))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            if(Apps.isConnectInternet()){
                this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
                JOptionPane.showMessageDialog(null, "Sedang membuka browser..");
                desktop.browse(new URI("https://wa.me/6285655864624"));
            }else{
               // JOptionPane.showMessageDialog(null, "Tidak terhubung ke internet!!");
            }
        }catch(IOException | URISyntaxException ex){
            Apps.showException("Ada masalah saat menghubungkan ke Whatsapp", KontakSaya.class.getName(), "https://wa.me/6285655864624");
        }
    }//GEN-LAST:event_kontakWhatsappMouseClicked

    private void kontakGmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kontakGmailMouseClicked
        try{
            if(Apps.isConnectInternet()){
                this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
                JOptionPane.showMessageDialog(null, "Sedang membuka browser..");
                desktop.browse(new URI("https://mailto:hakiahmad756@gmail.com"));
            }else{
               // JOptionPane.showMessageDialog(null, "Tidak terhubung ke internet!!");
            }
        }catch(IOException | URISyntaxException ex){
            Apps.showException("Ada masalah saat menghubungkan ke Gmail", KontakSaya.class.getName(), "mailto:hakiahmad756@gmail.com");
        }
    }//GEN-LAST:event_kontakGmailMouseClicked


    public static void main(String args[]) {

        new KontakSaya().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel kontakGmail;
    private javax.swing.JLabel kontakWhatsapp;
    private javax.swing.JLabel lblIconKontak;
    private javax.swing.JLabel lblKontaksaya;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel txtGmail;
    private javax.swing.JLabel txtWhatsapp;
    // End of variables declaration//GEN-END:variables
}
