package com.window;

import com.media.images.Gambar;
import com.media.images.Screenshot;
import com.system.*;
import com.window.helper.*;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.*;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.*;

/**
 * 
 * @author Achmad Baihaqi
 * @version 1.3
 * @since Take Screenshot 1.0
 */
public class SimpanGambar extends JFrame {

    private File screenshot;
    private String gambar;
    private int widthGbr, heightGbr, xx, yy;

    
    public SimpanGambar(){
        this.screenshot = new File(Screenshot.getLastScreenshot());
        this.gambar = Screenshot.getLastScreenshot();
        this.widthGbr = Gambar.lebarGambar(this.screenshot);
        this.heightGbr = Gambar.tinggiGambar(this.screenshot);
 
        initComponents();
        this.setSize(457, 180);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(Apps.getWindowIcon());
        
        this.txtFilename.setText(Files.getNamaFile(this.gambar));
        this.txtFormat.setText(Files.getFormatFile(this.gambar) + " Image");
        this.txtUkuran.setText(Files.getSizeFile(this.gambar) +"  ("+ Integer.toString(this.widthGbr)+"x"+Integer.toString(this.heightGbr) + ")");

        this.setLanguage();
        this.setThemes();

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
                    btn.setBackground(Settings.getThemeColors(new Color(87,117,181), new Color(31,83,130)));
                    btn.setForeground(Settings.getThemeColors(new Color(255,255,255), new Color(255,255,255)));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(Settings.getThemeColors(new Color(223,224,224), new Color(57,60,64)));
                    btn.setForeground(Settings.getThemeColors(new Color(21,18,18), new Color(248,244,244))); 
                }
            });
           
            
        }
            this.btnSave.setMnemonic(KeyEvent.VK_ENTER);
         
    }
    
    public void setThemes(){
        JButton[] btns = new JButton[]{this.btnSave, this.btnRename, this.btnShow, btnFolder ,this.btnDelete};
        
        this.pnlTop.setBackground(Settings.getThemeColors(new Color(203,206,208), new Color(57, 60, 64)));
        this.pnlBottom.setBackground(Settings.getThemeColors(new Color(203,206,208), new Color(57, 60, 64)));
        this.pnlMain.setBackground(Settings.getThemeColors(new Color(255,255,255), new Color(35, 35, 37)));
        for(int i = 0; i < btns.length; i++){
            JButton btn = btns[i];
            btn.setUI(new javax.swing.plaf.basic.BasicButtonUI());
            btn.setBackground(Settings.getThemeColors(new Color(223,224,224), new Color(57, 60, 64)));
            btn.setForeground(Settings.getThemeColors(new Color(21,18,18), new Color(248,244,244)));
        }
        
        this.lblTop.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(255, 255, 255)));
        this.lblFilename.setForeground(Settings.getThemeColors(new Color(20,16,18), new Color(237, 237, 237)));
        this.lblFormat.setForeground(Settings.getThemeColors(new Color(20,16,18), new Color(237, 237, 237)));
        this.lblUkuran.setForeground(Settings.getThemeColors(new Color(20,16,18), new Color(237, 237, 237)));
        this.lblhelpFilename.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(242, 242, 242)));
        this.lblhelpFormat.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(242, 242, 242)));
        this.lblhelpUkuran.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(242, 242, 242)));
        this.txtFilename.setForeground(Settings.getThemeColors(new Color(14,12,12), new Color(242, 242, 242)));
        this.txtFormat.setForeground(Settings.getThemeColors(new Color(14,12,12), new Color(242, 242, 242)));
        this.txtUkuran.setForeground(Settings.getThemeColors(new Color(14,12,12), new Color(242, 242, 242)));
    }   

    public void setLanguage(){
        this.lblTop.setText(Settings.getLanguageActived(
                "Successfully screenshot!!","Screenshot sukses diambil!!","正常にスクリーンショット", "Seijō ni sukurīnshotto", "성공적으로 스크린 샷","seong-gongjeog-eulo seukeulin syas"
        ));
        this.lblFilename.setText(Settings.getLanguageActived(
                "Filename","Nama file","ファイル名","Fairu-mei","파일 이름","pail ileum"
        ));
        this.lblFormat.setText(Settings.getLanguageActived(
                "Format","Format","フォーマット","Fōmatto","체재","chejae"
        ));
        this.lblUkuran.setText(Settings.getLanguageActived(
                "Size","Ukuran","サイズ","Saizu","크기","keugi"
        ));
        this.btnSave.setText(Settings.getLanguageActived(
                "Save image","Simpan","セーブ","Sēbu","저장","jeojang"
        ));
        this.btnRename.setText(Settings.getLanguageActived(
                "Rename","Ubah nama","リネーム","Rinēmu","이름 바꾸기","ileum bakkugi"
        ));
        this.btnShow.setText(Settings.getLanguageActived(
                "Open","Buka","開いた","Aita","열다","yeolda"
        ));
        this.btnFolder.setText(Settings.getLanguageActived(
                "Folder","Folder","フォルダ","Foruda","폴더","poldeo"
        ));
        this.btnDelete.setText(Settings.getLanguageActived(
                "Delete","Hapus","削除する","Sakujo suru","지우다","jiuda"
        ));
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

        jLabel1 = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        lblUkuran = new javax.swing.JLabel();
        lblFilename = new javax.swing.JLabel();
        lblFormat = new javax.swing.JLabel();
        lblhelpFilename = new javax.swing.JLabel();
        lblhelpFormat = new javax.swing.JLabel();
        lblhelpUkuran = new javax.swing.JLabel();
        txtFilename = new javax.swing.JLabel();
        txtFormat = new javax.swing.JLabel();
        txtUkuran = new javax.swing.JLabel();
        pnlBottom = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnRename = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFolder = new javax.swing.JButton();
        pnlTop = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lblTop = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlMainMouseDragged(evt);
            }
        });
        pnlMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMainMousePressed(evt);
            }
        });

        lblUkuran.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblUkuran.setForeground(new java.awt.Color(20, 16, 18));
        lblUkuran.setText("Ukuran");

        lblFilename.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblFilename.setForeground(new java.awt.Color(20, 16, 18));
        lblFilename.setText("Filename");

        lblFormat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblFormat.setForeground(new java.awt.Color(20, 16, 18));
        lblFormat.setText("Format");

        lblhelpFilename.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblhelpFilename.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhelpFilename.setText(":");

        lblhelpFormat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblhelpFormat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhelpFormat.setText(":");

        lblhelpUkuran.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblhelpUkuran.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhelpUkuran.setText(":");

        txtFilename.setBackground(new java.awt.Color(19, 0, 11));
        txtFilename.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtFilename.setForeground(new java.awt.Color(14, 12, 12));
        txtFilename.setText("Screenshot (726) 2020-6-13 14.0.50 [haqi]");

        txtFormat.setBackground(new java.awt.Color(19, 0, 11));
        txtFormat.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtFormat.setForeground(new java.awt.Color(14, 12, 12));
        txtFormat.setText(".png");

        txtUkuran.setBackground(new java.awt.Color(19, 0, 11));
        txtUkuran.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtUkuran.setForeground(new java.awt.Color(14, 12, 12));
        txtUkuran.setText("100 kb");

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFilename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFormat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblhelpUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhelpFilename, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhelpFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFilename, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtFormat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUkuran, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFilename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFilename)
                        .addComponent(lblhelpFilename)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormat)
                    .addComponent(lblhelpFormat)
                    .addComponent(txtFormat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUkuran)
                    .addComponent(lblhelpUkuran)
                    .addComponent(txtUkuran))
                .addGap(20, 20, 20))
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

        btnSave.setBackground(new java.awt.Color(223, 224, 224));
        btnSave.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnSave.setForeground(new java.awt.Color(21, 18, 18));
        btnSave.setText("Simpan");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnRename.setBackground(new java.awt.Color(223, 224, 224));
        btnRename.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnRename.setForeground(new java.awt.Color(21, 18, 18));
        btnRename.setText("Rename");
        btnRename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenameActionPerformed(evt);
            }
        });

        btnShow.setBackground(new java.awt.Color(223, 224, 224));
        btnShow.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnShow.setForeground(new java.awt.Color(21, 18, 18));
        btnShow.setText("Buka");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(223, 224, 224));
        btnDelete.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(21, 18, 18));
        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFolder.setBackground(new java.awt.Color(223, 224, 224));
        btnFolder.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnFolder.setForeground(new java.awt.Color(21, 18, 18));
        btnFolder.setText("Folder");
        btnFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFolderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRename)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFolder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShow)
                    .addComponent(btnDelete)
                    .addComponent(btnRename)
                    .addComponent(btnSave)
                    .addComponent(btnFolder))
                .addGap(37, 37, 37))
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

        lblMinimize.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(0, 6, 1));
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-minimize.png"))); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        lblTop.setText("Screenshot sukses");

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTop, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " membuka window SimpanGambar()"); 
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " keluar dari window SimpanGambar()."); 
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " menutup aplikasi."); 
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
        String filenameSebelumnya = txtFilename.getText();
        if(Files.isExistFile(screenshot.getParent()+"\\"+txtFilename.getText()+Settings.getSetting(Settings.SETTING_FORMAT))){
            if(txtFilename.getText().equalsIgnoreCase(filenameSebelumnya)){
                dispose();
                this.back();
                Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " menyimpan hasil screenshot."); 
                Aktivitas.addScreenshot(screenshot.getPath()+"|"+Waktu.getTanggal_Activity());  
            }else{
                javax.swing.JOptionPane.showMessageDialog(null, txtFilename.getText() + " sudah ada di direktori "+ screenshot.getParent());
            }
        }else{
            dispose();
            this.back();
            Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " menyimpan hasil screenshot."); 
            Aktivitas.addScreenshot(screenshot.getPath()+"|"+Waktu.getTanggal_Activity());  
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenameActionPerformed
        Rename r = new Rename();
        r.setLocation(getX(), getY());
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRenameActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        
        try{
            Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " menampilakan hasil screenshot."); 
            File file = new File(Screenshot.getLastScreenshot());
            java.awt.Desktop.getDesktop().open(file);
            
        }catch(IOException ex){
            Apps.showException("Terjadi kesalahan saat membuka file", SimpanGambar.class.getName(), ex.toString());
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFolderActionPerformed
        
        File file = new File(Screenshot.getLastScreenshot().substring(0, Screenshot.getLastScreenshot().lastIndexOf("\\")));
        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " membuka folder hasil screenshot."); 
        try{
            java.awt.Desktop.getDesktop().open(file);
        }catch(IOException ex){
            Apps.showException("Terjadi kesalahan saat membuka folder penyimpanan file", SimpanGambar.class.getName(), ex.toString());
        }
        
    }//GEN-LAST:event_btnFolderActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        System.out.println(Screenshot.getLastScreenshot());
        File hapus = new File(Screenshot.getLastScreenshot());
        Files.deleteFile(hapus.toString());
        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " menghapus hasil screenshot."); 
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
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFolder;
    private javax.swing.JButton btnRename;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFilename;
    private javax.swing.JLabel lblFormat;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblTop;
    private javax.swing.JLabel lblUkuran;
    private javax.swing.JLabel lblhelpFilename;
    private javax.swing.JLabel lblhelpFormat;
    private javax.swing.JLabel lblhelpUkuran;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JLabel txtFilename;
    private javax.swing.JLabel txtFormat;
    private javax.swing.JLabel txtUkuran;
    // End of variables declaration//GEN-END:variables
}
