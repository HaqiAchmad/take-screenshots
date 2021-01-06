package com.window.helper;

import com.media.images.Screenshot;
import com.system.Aktivitas;
import com.system.Apps;
import com.system.Files;
import com.system.Settings;
import com.system.Waktu;
import com.window.SimpanGambar;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.io.File;

/**
 * Window ini digunakan untuk mengubah nama pada gambar
 * 
 * @author Infinite World
 * @version 1.4
 * @since 13 05 2020
 */
public class Rename extends javax.swing.JFrame {

    private final File gambar;
    private int xx, yy;
    
    public Rename() {
        initComponents();
        this.gambar = new File(Screenshot.getLastScreenshot());
        
        this.setIconImage(Apps.getWindowIcon());
        this.setLocationRelativeTo(null);
        this.inpNama.setText(gambar.getName().substring(0, gambar.getName().lastIndexOf(".")));
        this.btnSave.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.btnBatal.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.setThemes();
        this.setLanguage();
    }

    private void setThemes(){
        this.pnlTop.setBackground(Settings.getThemeColors(new Color(203,206,208), new Color(57, 60, 64)));
        this.pnlBottom.setBackground(Settings.getThemeColors(new Color(203,206,208), new Color(57, 60, 64)));
        this.pnlMain.setBackground(Settings.getThemeColors(new Color(239,240,240), new Color(35, 35, 37)));
        this.btnSave.setBackground(Settings.getThemeColors(new Color(223,224,224), new Color(57, 60, 64)));
        this.btnBatal.setBackground(Settings.getThemeColors(new Color(223,224,224), new Color(57, 60, 64)));
        this.inpNama.setBackground(Settings.getThemeColors(new Color(239,240,240), new Color(43,43,43)));
        
        this.btnSave.setForeground(Settings.getThemeColors(new Color(21,18,18), new Color(248,244,244)));
        this.btnBatal.setForeground(Settings.getThemeColors(new Color(21,18,18), new Color(248,244,244)));
        this.inpNama.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(237,236,236)));
        this.inpNama.setCaretColor(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
        this.lblTop.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(255,255,255)));
        this.lblNama.setForeground(Settings.getThemeColors(new Color(16,0,11), new Color(237,237,237)));
    }

    private void setLanguage(){

        this.lblTop.setText(Settings.getLanguageActived(
                "Rename image!","Ubah nama gambar!" , "画像の名前を変更","Gazō no namae o henkō","이미지 이름 바꾸기","imiji ileum bakkugi"
        ));
        this.lblNama.setText(Settings.getLanguageActived(
                "New name","Nama baru" , "新しい名前","Atarashī namae","새로운 이름","saeloun ileum"
        ));
        this.btnSave.setText(Settings.getLanguageActived(
                "Save","Simpan",  "セーブ","Sēbu","저장","jeojang"
        ));
        this.btnBatal.setText(Settings.getLanguageActived(
                "Cancel","Batal",  "キャンセル","Kyanseru","취소","chwiso"
        ));

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        lblNama = new javax.swing.JLabel();
        inpNama = new javax.swing.JTextField();
        pnlBottom = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        pnlTop = new javax.swing.JPanel();
        lblTop = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        pnlMain.setBackground(new java.awt.Color(239, 240, 240));
        pnlMain.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlMainMouseDragged(evt);
            }
        });
        pnlMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMainMousePressed(evt);
            }
        });

        lblNama.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblNama.setForeground(new java.awt.Color(16, 0, 11));
        lblNama.setText("Nama baru ");

        inpNama.setBackground(new java.awt.Color(239, 240, 240));
        inpNama.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        inpNama.setText("new name");
        inpNama.setPreferredSize(new java.awt.Dimension(55, 26));
        inpNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inpNamaKeyPressed(evt);
            }
        });

        pnlBottom.setBackground(new java.awt.Color(203, 206, 208));
        pnlBottom.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlBottomMouseDragged(evt);
            }
        });
        pnlBottom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlBottomMousePressed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(223, 224, 224));
        btnSave.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(21, 18, 18));
        btnSave.setText("Simpan");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(223, 224, 224));
        btnBatal.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(21, 18, 18));
        btnBatal.setText("batal");
        btnBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBatalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBatalMouseExited(evt);
            }
        });
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBatal)
                .addContainerGap())
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBatal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTop.setBackground(new java.awt.Color(203, 206, 208));
        pnlTop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlTopMouseDragged(evt);
            }
        });
        pnlTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTopMousePressed(evt);
            }
        });

        lblTop.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblTop.setText(" Ubah nama gambar!");

        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-minimize.png"))); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTop, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimize)
                .addGap(15, 15, 15))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(lblTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inpNama, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(pnlBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpNama, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(pnlBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " membuka window Rename()"); 
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " keluar dari window Rename()"); 
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " menutup aplikasi"); 
    }//GEN-LAST:event_formWindowClosing

    private void formKeyPressed(KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       
    }//GEN-LAST:event_formKeyPressed

    private void pnlTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTopMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_pnlTopMousePressed

    private void pnlTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTopMouseDragged
        int x = evt.getXOnScreen(),
            y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_pnlTopMouseDragged

    private void pnlMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMainMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_pnlMainMousePressed

    private void pnlMainMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMainMouseDragged
        int x = evt.getXOnScreen(),
            y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_pnlMainMouseDragged

    private void pnlBottomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBottomMousePressed
//        xx = evt.getX();
//        yy = evt.getY();
    }//GEN-LAST:event_pnlBottomMousePressed

    private void pnlBottomMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBottomMouseDragged
//        int x = evt.getXOnScreen(),
//            y = evt.getYOnScreen();
//        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_pnlBottomMouseDragged

    public void aksiBtnSimpan(){
        
        Files.renameFile(gambar.toString(), inpNama.getText());
        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " mengubah nama gambar dari ("+ gambar.getName() +") menjadi > " + inpNama.getText()+"."); 
        Screenshot.setLastScreenshot(this.gambar.getParent() +"\\"+ inpNama.getText() + Settings.getSetting(Settings.SETTING_FORMAT));
        dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            @Override
            public void run(){
                SimpanGambar simpanGambar = new SimpanGambar();
                simpanGambar.setLocation(getX(), getY());
                simpanGambar.setVisible(true);
            }
        
        });
    }

    public void aksiBtnBatal(){
        
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable(){
        
            @Override
            public void run(){
                SimpanGambar simpanGambar = new SimpanGambar();
                simpanGambar.setLocation(getX(), getY());
                simpanGambar.setVisible(true);
            }
        });
    }
    
    private void inpNamaKeyPressed(KeyEvent evt) {//GEN-FIRST:event_inpNamaKeyPressed
       
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.aksiBtnSimpan();
        }
        
    }//GEN-LAST:event_inpNamaKeyPressed

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        boolean isExist = Files.isExistFile(gambar.getParent()+"\\"+inpNama.getText() + Settings.getSetting(Settings.SETTING_FORMAT)); // biar g error :)
        if(isExist){
            javax.swing.JOptionPane.showMessageDialog(null, inpNama.getText() + " sudah ada di direktori "+ gambar.getParent());
            this.setVisible(true);
        }else{
            this.aksiBtnSimpan();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        this.aksiBtnBatal();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        this.btnSave.setBackground(Settings.getThemeColors(new Color(87,117,181), new Color(31,83,130)));
        this.btnSave.setForeground(Settings.getThemeColors(new Color(255,255,255), new Color(255,255,255)));      
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        this.btnSave.setBackground(Settings.getThemeColors(new Color(223,224,224), new Color(57,60,64)));
        this.btnSave.setForeground(Settings.getThemeColors(new Color(21,18,18), new Color(248,244,244)));           
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnBatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseEntered
        this.btnBatal.setBackground(Settings.getThemeColors(new Color(87,117,181), new Color(31,83,130)));
        this.btnBatal.setForeground(Settings.getThemeColors(new Color(255,255,255), new Color(255,255,255)));
    }//GEN-LAST:event_btnBatalMouseEntered

    private void btnBatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseExited
        this.btnBatal.setBackground(Settings.getThemeColors(new Color(223,224,224), new Color(57,60,64)));
        this.btnBatal.setForeground(Settings.getThemeColors(new Color(21,18,18), new Color(248,244,244))); 
    }//GEN-LAST:event_btnBatalMouseExited


    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Rename().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField inpNama;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblTop;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTop;
    // End of variables declaration//GEN-END:variables
}
