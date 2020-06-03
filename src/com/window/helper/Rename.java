package com.window.helper;

import com.system.*;
import com.window.*;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.io.File;

/**
 * 
 * Type class : Subclass
 * Total method : 18
 * Total line : 333 without java doc
 * 
 * @author Infinite World
 * @version 1.0
 * @since 13 05 2020
 */
public class Rename extends javax.swing.JFrame {

    private File gambar;
    private int xx, yy;
    
    public Rename() {
        initComponents();
        this.gambar = new File(Aktivitas.getAktif());
        
        this.setIconImage(Apps.getWindowIcon());
        this.setLocationRelativeTo(null);
        
        this.inpNama.setText(gambar.getName().substring(0, gambar.getName().lastIndexOf(".")));
    }


    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTop = new javax.swing.JPanel();
        lblTop = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        pnlBottom = new javax.swing.JPanel();
        btnBatal = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        pnlMain = new javax.swing.JPanel();
        lblNama = new javax.swing.JLabel();
        inpNama = new javax.swing.JTextField();

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

        lblTop.setText(" Ubah nama gambar!");

        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/app-minimize.png"))); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(lblMinimize)
                .addGap(15, 15, 15))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(btnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal)
                    .addComponent(btnSimpan))
                .addContainerGap())
        );

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

        lblNama.setForeground(new java.awt.Color(16, 0, 11));
        lblNama.setText("Nama baru :");

        inpNama.setText("new name");
        inpNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inpNamaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inpNama, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Aktivitas.setOpen("open");
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " membuka window Rename()"); 
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " keluar dari window Rename()"); 
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Aktivitas.setOpen("close");
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " menutup aplikasi"); 
    }//GEN-LAST:event_formWindowClosing

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       // batal
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
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_pnlBottomMousePressed

    private void pnlBottomMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBottomMouseDragged
        int x = evt.getXOnScreen(),
            y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_pnlBottomMouseDragged

    public void aksiBtnSimpan(){
        
        Gambar.ubahNamaGambar(gambar, inpNama.getText());
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " mengubah nama gambar dari ("+ gambar.getName() +") menjadi > " + inpNama.getText()+"."); 
        Aktivitas.setAktif(this.gambar.getParent() +"\\"+ inpNama.getText() + ".png");
        dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            @Override
            public void run(){
                new SimpanGambar().setVisible(true);
            }
        
        });
    }

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        this.aksiBtnSimpan();
    }//GEN-LAST:event_btnSimpanActionPerformed

    public void aksiBtnBatal(){
        
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable(){
        
            @Override
            public void run(){
                new com.window.SimpanGambar().setVisible(true);
            }
        });
    }
    
    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        this.aksiBtnBatal();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void inpNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inpNamaKeyPressed
       
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.aksiBtnSimpan();
        }
        
    }//GEN-LAST:event_inpNamaKeyPressed

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked


    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rename().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JTextField inpNama;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblTop;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTop;
    // End of variables declaration//GEN-END:variables
}
