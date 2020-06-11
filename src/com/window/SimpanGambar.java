package com.window;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.*;
import javax.swing.*;
import com.system.*;
import com.window.helper.*;
import java.awt.Frame;

public class SimpanGambar extends JFrame {

    private File screenshot;
    private String gambar;
    private int widthGbr, heightGbr, xx, yy;

    
    public SimpanGambar(){
        this.screenshot = new File(Aktivitas.getAktif());
        this.gambar = Aktivitas.getAktif();
        this.widthGbr = Gambar.lebarGambar(this.screenshot);
        this.heightGbr = Gambar.tinggiGambar(this.screenshot);
        
        initComponents();
        this.setSize(this.pnlMain.getWidth(), 180);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(Apps.getWindowIcon());
        
        this.txtFilename.setText(Gambar.getNamaGambar(this.gambar));
        this.txtFormat.setText(Gambar.getFormatGbr(this.gambar) + " Image");
        this.txtUkuran.setText(Gambar.getSize(this.gambar) +"  ("+ Integer.toString(this.widthGbr)+"x"+Integer.toString(this.heightGbr) + ")");
        
        JButton[] btns = new JButton[]{this.btnSave, this.btnRename, this.btnShow, btnFolder ,this.btnDelete};
        
        for (JButton btn : btns){
            btn.setUI(new javax.swing.plaf.basic.BasicButtonUI());
            btn.addMouseListener(new java.awt.event.MouseListener() {

                @Override
                public void mouseClicked(MouseEvent e) {
                     
                }

                @Override
                public void mousePressed(MouseEvent e) {
                     
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                     
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new java.awt.Color(87,117,181));
                    btn.setForeground(new java.awt.Color(255,255,255));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new java.awt.Color(223,224,224));
                    btn.setForeground(new java.awt.Color(21,18,18)); 
                }
            });
           
            
        }
            this.btnSave.setMnemonic(KeyEvent.VK_ENTER);
         
    }
    


    public void back(){
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            @Override
            public void run(){
                Root root = new Root();
                root.setLocation(getX(), getY());
                root.setVisible(true);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new JLabel();
        pnlMain = new JPanel();
        lblUkuran = new JLabel();
        lblFilename = new JLabel();
        lblFormat = new JLabel();
        lblhelpFilename = new JLabel();
        lblhelpFormat = new JLabel();
        lblhelpUkuran = new JLabel();
        txtFilename = new JLabel();
        txtFormat = new JLabel();
        txtUkuran = new JLabel();
        pnlBottom = new JPanel();
        btnSave = new JButton();
        btnRename = new JButton();
        btnShow = new JButton();
        btnDelete = new JButton();
        btnFolder = new JButton();
        pnlTop = new JPanel();
        lblTop = new JLabel();
        lblMinimize = new JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                pnlMainMouseDragged(evt);
            }
        });
        pnlMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                pnlMainMousePressed(evt);
            }
        });

        lblUkuran.setBackground(new java.awt.Color(22, 23, 29));
        lblUkuran.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        lblUkuran.setForeground(new java.awt.Color(20, 16, 18));
        lblUkuran.setText("Ukuran");

        lblFilename.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        lblFilename.setForeground(new java.awt.Color(20, 16, 18));
        lblFilename.setText("Filename");

        lblFormat.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        lblFormat.setForeground(new java.awt.Color(20, 16, 18));
        lblFormat.setText("Format");

        lblhelpFilename.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblhelpFilename.setHorizontalAlignment(SwingConstants.CENTER);
        lblhelpFilename.setText(":");

        lblhelpFormat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblhelpFormat.setHorizontalAlignment(SwingConstants.CENTER);
        lblhelpFormat.setText(":");

        lblhelpUkuran.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblhelpUkuran.setHorizontalAlignment(SwingConstants.CENTER);
        lblhelpUkuran.setText(":");

        txtFilename.setBackground(new java.awt.Color(19, 0, 11));
        txtFilename.setForeground(new java.awt.Color(14, 12, 12));
        txtFilename.setText("Screenshot 1");

        txtFormat.setBackground(new java.awt.Color(19, 0, 11));
        txtFormat.setForeground(new java.awt.Color(14, 12, 12));
        txtFormat.setText(".png");

        txtUkuran.setBackground(new java.awt.Color(19, 0, 11));
        txtUkuran.setForeground(new java.awt.Color(14, 12, 12));
        txtUkuran.setText("100 kb");

        GroupLayout pnlMainLayout = new GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(lblFilename, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblhelpFilename, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFilename, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(lblFormat, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblhelpFormat, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFormat, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(lblUkuran, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblhelpUkuran, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUkuran, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFilename)
                    .addComponent(lblhelpFilename)
                    .addComponent(txtFilename))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormat)
                    .addComponent(lblhelpFormat)
                    .addComponent(txtFormat))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUkuran)
                    .addComponent(lblhelpUkuran)
                    .addComponent(txtUkuran))
                .addGap(20, 20, 20))
        );

        pnlBottom.setBackground(new java.awt.Color(203, 206, 208));
        pnlBottom.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                pnlBottomMouseDragged(evt);
            }
        });
        pnlBottom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                pnlBottomMousePressed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(223, 224, 224));
        btnSave.setForeground(new java.awt.Color(21, 18, 18));
        btnSave.setText("Simpan");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnRename.setBackground(new java.awt.Color(223, 224, 224));
        btnRename.setForeground(new java.awt.Color(21, 18, 18));
        btnRename.setText("Rename");
        btnRename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenameActionPerformed(evt);
            }
        });

        btnShow.setBackground(new java.awt.Color(223, 224, 224));
        btnShow.setForeground(new java.awt.Color(21, 18, 18));
        btnShow.setText("Buka");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(223, 224, 224));
        btnDelete.setForeground(new java.awt.Color(21, 18, 18));
        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFolder.setBackground(new java.awt.Color(223, 224, 224));
        btnFolder.setForeground(new java.awt.Color(21, 18, 18));
        btnFolder.setText("Folder");
        btnFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFolderActionPerformed(evt);
            }
        });

        GroupLayout pnlBottomLayout = new GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRename)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShow, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFolder)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addGap(97, 97, 97))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBottomLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShow)
                    .addComponent(btnDelete)
                    .addComponent(btnRename)
                    .addComponent(btnSave)
                    .addComponent(btnFolder))
                .addGap(37, 37, 37))
        );

        pnlTop.setBackground(new java.awt.Color(203, 206, 208));
        pnlTop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                pnlTopMouseDragged(evt);
            }
        });
        pnlTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                pnlTopMousePressed(evt);
            }
        });

        lblTop.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblTop.setForeground(new java.awt.Color(11, 11, 11));
        lblTop.setText("Screenshot sukses diambil!!");

        lblMinimize.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(0, 6, 1));
        lblMinimize.setHorizontalAlignment(SwingConstants.RIGHT);
        lblMinimize.setIcon(new ImageIcon(getClass().getResource("/com/media/app-minimize.png"))); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        GroupLayout pnlTopLayout = new GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTop, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(lblMinimize, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblTop, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTopLayout.createSequentialGroup()
                        .addComponent(lblMinimize, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(pnlTop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlMain, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlBottom, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTop, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlMain, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBottom, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Aktivitas.setOpen("open");
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " membuka window SimpanGambar()"); 
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " keluar dari window SimpanGambar()."); 
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Aktivitas.setOpen("close");
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " menutup aplikasi."); 
        Database.backupDatabase();
    }//GEN-LAST:event_formWindowClosing

    private void pnlTopMousePressed(MouseEvent evt) {//GEN-FIRST:event_pnlTopMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_pnlTopMousePressed

    private void pnlTopMouseDragged(MouseEvent evt) {//GEN-FIRST:event_pnlTopMouseDragged
        int x = evt.getXOnScreen(),
            y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_pnlTopMouseDragged

    private void pnlMainMousePressed(MouseEvent evt) {//GEN-FIRST:event_pnlMainMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_pnlMainMousePressed

    private void pnlMainMouseDragged(MouseEvent evt) {//GEN-FIRST:event_pnlMainMouseDragged
        int x = evt.getXOnScreen(),
            y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_pnlMainMouseDragged

    private void pnlBottomMousePressed(MouseEvent evt) {//GEN-FIRST:event_pnlBottomMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_pnlBottomMousePressed

    private void pnlBottomMouseDragged(MouseEvent evt) {//GEN-FIRST:event_pnlBottomMouseDragged
        int x = evt.getXOnScreen(),
            y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_pnlBottomMouseDragged

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        this.btnSave.setSelected(true);
        dispose();
        this.back();
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " menyimpan hasil screenshot."); 
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenameActionPerformed
        Rename r = new Rename();
        r.setLocation(getX(), getY());
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRenameActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        
        try{
            Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " menampilakan hasil screenshot."); 
            File file = new File(Aktivitas.getAktif());
            java.awt.Desktop.getDesktop().open(file);
            
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat membuka file.\n" + ex);
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFolderActionPerformed
        
        File file = new File(Aktivitas.getAktif().substring(0, Aktivitas.getAktif().lastIndexOf("\\")));
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " membuka folder hasil screenshot."); 
        try{
            java.awt.Desktop.getDesktop().open(file);
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Tidak bisa menampilkan folder\n" + ex);
        }
        
    }//GEN-LAST:event_btnFolderActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        System.out.println(Aktivitas.getAktif());
        File hapus = new File(Aktivitas.getAktif());
        Gambar.hapusGambar(hapus);
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " menghapus hasil screenshot."); 
        dispose();
        this.back();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void lblMinimizeMouseClicked(MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked









    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpanGambar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnDelete;
    private JButton btnFolder;
    private JButton btnRename;
    private JButton btnSave;
    private JButton btnShow;
    private JLabel jLabel1;
    private JLabel lblFilename;
    private JLabel lblFormat;
    private JLabel lblMinimize;
    private JLabel lblTop;
    private JLabel lblUkuran;
    private JLabel lblhelpFilename;
    private JLabel lblhelpFormat;
    private JLabel lblhelpUkuran;
    private JPanel pnlBottom;
    private JPanel pnlMain;
    private JPanel pnlTop;
    private JLabel txtFilename;
    private JLabel txtFormat;
    private JLabel txtUkuran;
    // End of variables declaration//GEN-END:variables
}
