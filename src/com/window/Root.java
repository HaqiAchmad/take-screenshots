package com.window;

import com.media.images.Screenshot;
import com.media.sounds.PlaySounds;
import com.system.Aktivitas;
import com.system.Apps;
import com.system.Settings;
import com.system.Waktu;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.ImageIcon;

/**
 * Class ini digunakan untuk mengambil screenshot
 * 
 * @author Achmad Baihaqi
 * @version 1.5
 * @since Take Screenshot 1.0
 */
public class Root extends javax.swing.JFrame {

    
    public Root() {
        initComponents();

        this.setTitle(Apps.getName() +" " + Apps.getVersion());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(Apps.getWindowIcon());
        
        this.btnScreenshot.setMnemonic(KeyEvent.VK_ENTER);
        this.txtDirektori.setText(Settings.getSetting(Settings.SETTING_PEYIMPANAN));
        this.txtDirektori.setEditable(false);
        this.btnScreenshot.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.btnSaveTo.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.lblTotalSS.setText(Apps.getTotalScreenshot() + " screenshot diambil.");
        this.lblCopyright.setText("Copyright © " + Apps.getReleased()+" "+Apps.getAuthor()+".");
        if(Settings.isAutoSave()){
            this.opsAutosave.setSelected(true);
        }else{
            this.opsAutosave.setSelected(false);
        }
        
        this.setThemes();
        this.setLanguage();
    }
    
    private void setThemes(){
        this.panelMain.setBackground(Settings.getThemeColors(new Color(234,238,241), new Color(35,35,37)));
        this.btnScreenshot.setBackground(Settings.getThemeColors(new Color(40,87,186), new Color(61,113,219)));
        this.btnSaveTo.setBackground(Settings.getThemeColors(new Color(255,255,255), new Color(28,25,25)));
        this.opsAutosave.setBackground(Settings.getThemeColors(new Color(234,238,241), new Color(35,35,37)));
        this.txtDirektori.setBackground(Settings.getThemeColors(new Color(215,221,223), new Color(45,48,49)));
        
        this.btnScreenshot.setForeground(Settings.getThemeColors(new Color(255,255,255), new Color(34,31,31)));
        this.btnSaveTo.setForeground(Settings.getThemeColors(new Color(20,20,20), new Color(255,255,255)));
        this.txtDirektori.setForeground(Settings.getThemeColors(new Color(21,24,30), new Color(231,232,233)));
        this.opsAutosave.setForeground(Settings.getThemeColors(new Color(13,13,13), new Color(248,248,248)));
        this.lblSimpan.setForeground(Settings.getThemeColors(new Color(16,17,24), new Color(248,248,248)));
        this.lblCopyright.setForeground(Settings.getThemeColors(new Color(89,89,89), new Color(142,137,137)));
        this.lblTotalSS.setForeground(Settings.getThemeColors(new Color(16,15,15), new Color(248,248,248)));
        
        
        this.lblCamera.setIcon(Settings.getThemeIcons(new ImageIcon(getClass().getResource("/com/media/icons/app-window-root-camera-daymode.png")), 
                                                      new ImageIcon(getClass().getResource("/com/media/icons/app-window-root-camera-darkmode.png"))));
        this.btnScreenshot.setIcon(Settings.getThemeIcons(new ImageIcon(getClass().getResource("/com/media/icons/app-window-root-btnScreenshot-daymode.png")), 
                                                         new ImageIcon(getClass().getResource("/com/media/icons/app-window-root-btnScreenshot-darkmode.png"))));
        this.btnSetting.setIcon(Settings.getThemeIcons(new ImageIcon(getClass().getResource("/com/media/icons/app-window-root-setting-daymode.png")), 
                                                      new ImageIcon(getClass().getResource("/com/media/icons/app-window-root-setting-darkmode.png"))));
        
    }

    private void setLanguage(){
        this.btnScreenshot.setText(Settings.getLanguageActived(
                "Take Screenshot","Ambil Screenshot", "スクリーンショット","Sukurīnshotto","스크린 샷","seukeulin syas"
        ));
        this.opsAutosave.setText(Settings.getLanguageActived(
                "autosave","autosave",  "自動保存","Jidō hozon","자동 저장","jadongjeog"
        ));
        this.lblSimpan.setText(Settings.getLanguageActived(
                "Save to :","Simpan ke :",  "に保存 : ","Ni hozon : ","에 저장 : ","e jeojang : "
        ));
        this.lblTotalSS.setText(Apps.getTotalScreenshot()+" "+ Settings.getLanguageActived(
                "screenshot taken...","screenshot diambil...",  "取りました...","Torimashita...","촬영...","chwal-yeong..."
        ));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        lblCamera = new javax.swing.JLabel();
        btnScreenshot = new javax.swing.JButton();
        lblSimpan = new javax.swing.JLabel();
        txtDirektori = new javax.swing.JTextField();
        lblTotalSS = new javax.swing.JLabel();
        btnSaveTo = new javax.swing.JButton();
        lblCopyright = new javax.swing.JLabel();
        opsAutosave = new javax.swing.JRadioButton();
        btnSetting = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        panelMain.setBackground(new java.awt.Color(234, 238, 241));
        panelMain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelMainKeyPressed(evt);
            }
        });

        lblCamera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCamera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-window-root-camera-daymode.png"))); // NOI18N

        btnScreenshot.setBackground(new java.awt.Color(40, 87, 186));
        btnScreenshot.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnScreenshot.setForeground(new java.awt.Color(255, 255, 255));
        btnScreenshot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-window-root-btnScreenshot-daymode.png"))); // NOI18N
        btnScreenshot.setText("Ambil Screenshot");
        btnScreenshot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnScreenshotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnScreenshotMouseExited(evt);
            }
        });
        btnScreenshot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScreenshotActionPerformed(evt);
            }
        });

        lblSimpan.setForeground(new java.awt.Color(16, 17, 24));
        lblSimpan.setText("Simpan ke :");
        lblSimpan.setPreferredSize(new java.awt.Dimension(41, 26));

        txtDirektori.setBackground(new java.awt.Color(215, 221, 223));
        txtDirektori.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtDirektori.setForeground(new java.awt.Color(21, 24, 30));
        txtDirektori.setText("D:\\Dokumen\\Sorce code");
        txtDirektori.setPreferredSize(new java.awt.Dimension(14, 27));

        lblTotalSS.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblTotalSS.setForeground(new java.awt.Color(16, 15, 15));
        lblTotalSS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalSS.setText("2 screenshot diambil.");

        btnSaveTo.setBackground(new java.awt.Color(255, 255, 255));
        btnSaveTo.setForeground(new java.awt.Color(20, 20, 20));
        btnSaveTo.setText("...");
        btnSaveTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveToActionPerformed(evt);
            }
        });

        lblCopyright.setBackground(new java.awt.Color(0, 1, 30));
        lblCopyright.setForeground(new java.awt.Color(89, 89, 89));
        lblCopyright.setText("Copyright@ achmad baihaqi 2020.");
        lblCopyright.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCopyrightMouseClicked(evt);
            }
        });

        opsAutosave.setBackground(new java.awt.Color(234, 238, 241));
        opsAutosave.setForeground(new java.awt.Color(13, 13, 13));
        opsAutosave.setText("autosave");
        opsAutosave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opsAutosaveMouseClicked(evt);
            }
        });
        opsAutosave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opsAutosaveActionPerformed(evt);
            }
        });

        btnSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-window-root-setting-daymode.png"))); // NOI18N
        btnSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSettingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDirektori, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveTo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opsAutosave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnScreenshot, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                            .addComponent(lblCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotalSS, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSetting, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnScreenshot, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirektori, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveTo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opsAutosave))
                .addGap(18, 18, 18)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalSS, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCopyright)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t-> " + Apps.getUsername() + " membuka window Root().");
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t-> " + Apps.getUsername() + " keluar dari window Root().");
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t-> " + Apps.getUsername() + " menutup aplikasi." );
    }//GEN-LAST:event_formWindowClosing

    @Deprecated
    private void formKeyPressed(KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    @Deprecated
    private void panelMainKeyPressed(KeyEvent evt) {//GEN-FIRST:event_panelMainKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
//            this.aksiBtnScreenshot();
//        }
//        System.out.println(evt.getKeyCode());
    }//GEN-LAST:event_panelMainKeyPressed

    private void btnScreenshotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScreenshotMouseEntered
        this.btnScreenshot.setBackground(Settings.getThemeColors(new Color(34,71,147), new Color(28,99,246)));
        this.btnScreenshot.setForeground(Settings.getThemeColors(new Color(176,176,178), new Color(34,31,31)));
        try{
            Thread.sleep(200);
            this.lblCamera.setIcon(Settings.getThemeIcons(new ImageIcon(getClass().getResource("/com/media/icons/app-window-root-camera-daymode-entered.png")), 
                                                          new ImageIcon(getClass().getResource("/com/media/icons/app-window-root-camera-darkmode-entered.png"))));

        }catch(InterruptedException iex){
            Apps.showException("Terjadi kesalahan yang tidak diketahui", Root.class.getName(), iex.toString());

        }
    }//GEN-LAST:event_btnScreenshotMouseEntered

    private void btnScreenshotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScreenshotMouseExited
        this.btnScreenshot.setBackground(Settings.getThemeColors(new Color(40,87,186), new Color(61,113,219)));
        this.btnScreenshot.setForeground(Settings.getThemeColors(new Color(255,255,255), new Color(34,31,31)));
        
            try{
                Thread.sleep(200);
            this.lblCamera.setIcon(Settings.getThemeIcons(new ImageIcon(getClass().getResource("/com/media/icons/app-window-root-camera-daymode.png")), 
                                                      new ImageIcon(getClass().getResource("/com/media/icons/app-window-root-camera-darkmode.png"))));

        }catch(InterruptedException iex){
            Apps.showException("Terjadi kesalahan yang tidak diketahui", Root.class.getName(), iex.toString());
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan!\n"+iex);

        }
    }//GEN-LAST:event_btnScreenshotMouseExited

    private void btnScreenshotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScreenshotActionPerformed
        int totalSS = Integer.parseInt(Apps.getTotalScreenshot()) + 1; // untuk mendapatkan total screenshot sebelumnya dan ditambahkan 1
        String date = Waktu.getTanggal_Screenshot(); // mendapatkan waktu saat ini untuk penamaan hasil screenshot
        String filename = "Screenshot (" + Integer.toString(totalSS) +") " + date;// example : Screenshot (1) 2020-01-12 13.36.10
 
        try{
            Screenshot.playSoundEffect();
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            this.setVisible(false);
            Thread.sleep(290);  // agar window root visible terlebih dahulu sebelum mengambil screenshot               
            Apps.setTotalScreenshot(totalSS); // mengupdate total screenshot
            this.lblTotalSS.setText(Apps.getTotalScreenshot()+" "+ Settings.getLanguageActived(
                    "screenshot taken...","screenshot diambil...",  "取りました...","Torimashita...","촬영...","chwal-yeong..."
            ));
            Screenshot.ambilScreenshot(filename); // mengambil screenshot layar
            Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t-> " + Apps.getUsername() + " melakukan screenshot."); // menambahkan ke aktivitas bahwa user melakukan screenshot

            
            java.awt.EventQueue.invokeLater(new Runnable(){
        
            @Override 
            public void run(){

                try{
                    if(opsAutosave.isSelected()){
                        Settings.setSettings(Settings.SETTING_AUTOSAVE, "actived");
                        setVisible(true);
                    }else{

                        Settings.setSettings(Settings.SETTING_AUTOSAVE, "deactived");
                        SimpanGambar simpanGambar = new SimpanGambar();
                        simpanGambar.setLocation(getX(), getY());
                        Thread.sleep(200);
                        simpanGambar.setVisible(true);
                    }
                    
                }catch(IOException | InterruptedException ex){
                    Apps.showException("Mungkin ada file yang terhapus didatabase", Root.class.getName(), ex.toString());
                }
            }
        });
            
        }catch(InterruptedException iex){
            Apps.showException("Terjadi kesalahan yang tidak diketahui", Root.class.getName(), iex.toString());
        }
        
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnScreenshotActionPerformed

    private void btnSaveToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveToActionPerformed
        try{
            
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            javax.swing.JFileChooser jfc = new javax.swing.JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            jfc.setDialogTitle(Settings.getLanguageActived("Save to","Simpan ke", "に保存","Ni hozon","에 저장","e jeojang"));
            jfc.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
            jfc.setAcceptAllFileFilterUsed(false);
            int returnNilai = jfc.showSaveDialog(null);

                if(returnNilai == javax.swing.JFileChooser.APPROVE_OPTION){
                    if(jfc.getSelectedFile().isDirectory()){
                        this.txtDirektori.setText(jfc.getSelectedFile().getPath());
                        Settings.setSettings(Settings.SETTING_PEYIMPANAN, jfc.getSelectedFile().getPath() + "\\");
                        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t-> " + Apps.getUsername() + " mengubah direktori penyimpanan ke " + jfc.getSelectedFile().getPath());
                        System.out.println("Screenshots akan disimpan ke -> " + jfc.getSelectedFile().getPath());
                    }
                }
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            
        }catch(IOException ex){
            Apps.showException("Mungkin OS tidak mendukung membuat file di folder ini", Root.class.getName(), ex.toString());
        }
    }//GEN-LAST:event_btnSaveToActionPerformed

    @Deprecated
    private void opsAutosaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opsAutosaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_opsAutosaveMouseClicked

    @Deprecated
    private void opsAutosaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opsAutosaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opsAutosaveActionPerformed

    private void btnSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseClicked
        this.setCursor(new java.awt.Cursor(Cursor.WAIT_CURSOR));
        java.awt.EventQueue.invokeLater(new Runnable(){

            @Override
            public void run(){
                dispose();
                com.window.WindowSetting win = new com.window.WindowSetting();
                win.setLocation(getX(), getY());
                win.setVisible(true);
            }

        });
    }//GEN-LAST:event_btnSettingMouseClicked

    private void lblCopyrightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCopyrightMouseClicked
        PlaySounds.play(PlaySounds.SUARA_NOTIF);
        JOptionPane.showMessageDialog(null, "Copyright © " + Apps.getReleased() + "-2021 "+Apps.getAuthor()+". All Rights Reserved.");
    }//GEN-LAST:event_lblCopyrightMouseClicked



    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new Root().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveTo;
    private javax.swing.JButton btnScreenshot;
    private javax.swing.JLabel btnSetting;
    private javax.swing.JLabel lblCamera;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblSimpan;
    private javax.swing.JLabel lblTotalSS;
    private javax.swing.JRadioButton opsAutosave;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField txtDirektori;
    // End of variables declaration//GEN-END:variables
}
