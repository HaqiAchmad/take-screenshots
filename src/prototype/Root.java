package prototype;

import com.system.*;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class Root extends javax.swing.JFrame {

    
    public Root() {
        initComponents();

        this.setTitle(Apps.getName() +" " + Apps.getVersion());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(Apps.getWindowIcon());
     
        
        this.btnScreenshot.setMnemonic(KeyEvent.VK_ENTER);
        this.txtDirektori.setText(Settings.getPenyimpanan());
        this.txtDirektori.setEditable(false);
        this.btnScreenshot.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.btnSaveTo.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.lblTotalSS.setText(Integer.toString(Aktivitas.getTotalSS()) + " screenshot diambil.");
        this.lblCopyright.setText("Copyright@ " + Apps.getAuthor()+" "+Apps.getReleased()+".");
        
        this.setLanguage();
        
    }

    public void setLanguage(){
        this.btnScreenshot.setText(Settings.languageSetString(
                "Take Screenshot","Ambil Screenshot","スクリーンショット","Sukurīnshotto","스크린 샷","seukeulin syas"
        ));
        this.lblSimpan.setText(Settings.languageSetString(
                "Save to :","Simpan ke :","に保存","Ni hozon","에 저장","e jeojang"
        ));
        this.lblTotalSS.setText(Aktivitas.getTotalSS()+" "+ Settings.languageSetString(
                "screenshot taken...","screenshot diambil...","取りました...","Torimashita...","촬영...","chwal-yeong..."
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
        jLabel1 = new javax.swing.JLabel();

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

        panelMain.setBackground(new java.awt.Color(35, 35, 37));
        panelMain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelMainKeyPressed(evt);
            }
        });

        lblCamera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCamera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/app-window-root-camera-darkmode.png"))); // NOI18N

        btnScreenshot.setBackground(new java.awt.Color(61, 113, 219));
        btnScreenshot.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnScreenshot.setForeground(new java.awt.Color(34, 31, 31));
        btnScreenshot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/app-window-root-btnScreenshot-darkmode.png"))); // NOI18N
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

        lblSimpan.setForeground(new java.awt.Color(248, 248, 248));
        lblSimpan.setText("Simpan ke :");
        lblSimpan.setPreferredSize(new java.awt.Dimension(41, 26));

        txtDirektori.setBackground(new java.awt.Color(45, 48, 49));
        txtDirektori.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtDirektori.setForeground(new java.awt.Color(231, 232, 233));
        txtDirektori.setText("D:\\Dokumen\\Sorce code");
        txtDirektori.setPreferredSize(new java.awt.Dimension(14, 27));

        lblTotalSS.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblTotalSS.setForeground(new java.awt.Color(248, 248, 248));
        lblTotalSS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalSS.setText("2 screenshot diambil.");

        btnSaveTo.setBackground(new java.awt.Color(28, 25, 25));
        btnSaveTo.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveTo.setText("...");
        btnSaveTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveToActionPerformed(evt);
            }
        });

        lblCopyright.setBackground(new java.awt.Color(0, 1, 30));
        lblCopyright.setForeground(new java.awt.Color(142, 137, 137));
        lblCopyright.setText("Copyright@ achmad baihaqi 2020.");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/app-window-root-setting-darkmode.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnScreenshot, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirektori, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveTo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        Aktivitas.setOpen("open");
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t-> " + Apps.getUsername() + " membuka window Root().");
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t-> " + Apps.getUsername() + " keluar dari window Root().");
    
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Aktivitas.setOpen("close");
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t-> " + Apps.getUsername() + " menutup aplikasi." );
        Database.backupDatabase();
    }//GEN-LAST:event_formWindowClosing

    private void formKeyPressed(KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void panelMainKeyPressed(KeyEvent evt) {//GEN-FIRST:event_panelMainKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
//            this.aksiBtnScreenshot();
//        }
//        System.out.println(evt.getKeyCode());
    }//GEN-LAST:event_panelMainKeyPressed

    private void btnScreenshotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScreenshotMouseEntered
    
        this.btnScreenshot.setBackground(new java.awt.Color(28,99,246));
        this.btnScreenshot.setForeground(new java.awt.Color(34,31,31));
        try{
            Thread.sleep(200);
            this.lblCamera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/app-window-root-camera-darkmode-entered.png")));

        }catch(InterruptedException iex){
            iex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan!\n"+iex);

        }
    }//GEN-LAST:event_btnScreenshotMouseEntered

    private void btnScreenshotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScreenshotMouseExited
     
        this.btnScreenshot.setBackground(new java.awt.Color(61,113,219));
        this.btnScreenshot.setForeground(new java.awt.Color(34,31,31));
        
            try{
            Thread.sleep(200);
            this.lblCamera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/app-window-root-camera-darkmode.png")));

        }catch(InterruptedException iex){
            iex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan!\n"+iex);

        }
    }//GEN-LAST:event_btnScreenshotMouseExited

    private void aksiBtnScreenshot(){
        
        int totalSS = Aktivitas.getTotalSS();
        String date = Tanggal.getTanggal_Screenshot();
        String filename = "Screenshot (" + Integer.toString(totalSS) +") " + date +" [haqi]";// example : Screenshot (1) 2020-01-12 13.36.10 [haqi].png
        
        try{
            
            this.lblTotalSS.setText(Aktivitas.getTotalSS() + " screenshot diambil."); // mengupdate text di label lblTotalSs
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            this.setVisible(false);
            Thread.sleep(300);                 
            Gambar.ambilGambarLayar(filename, Gambar.FORMAT_PNG); // mengscreenshot layar
            Aktivitas.setAktif(Settings.getPenyimpanan()+filename+Settings.getFormatSelected());
            Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t-> " + Apps.getUsername() + " melakukan screenshot."); // menambahkan ke aktivitas bahwa user melakukan screenshot
            Aktivitas.setTotalSS(totalSS+=1); // mengupdate total screenshot
            Thread.sleep(100);
            this.dispose();


        java.awt.EventQueue.invokeLater(new Runnable(){
        
            @Override 
            public void run(){
                
                if(Settings.isAutoSave()){
                    setVisible(true);
                }else{
                    com.window.SimpanGambar simpanGambar = new com.window.SimpanGambar();
                    simpanGambar.setLocation(getX(), getY());
                    simpanGambar.setVisible(true);
                }
                
            }
        });
            
        }catch(InterruptedException iex){
            iex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan!\n" + iex);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }
    
    private void btnScreenshotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScreenshotActionPerformed
        this.aksiBtnScreenshot();
    }//GEN-LAST:event_btnScreenshotActionPerformed

    private void btnSaveToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveToActionPerformed
        
        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        javax.swing.JFileChooser jfc = new javax.swing.JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle(Settings.languageSetString("Save to","Simpan ke","に保存","Ni hozon","에 저장","e jeojang"));
        jfc.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        jfc.setAcceptAllFileFilterUsed(false);
        int returnNilai = jfc.showSaveDialog(null);
            
            if(returnNilai == javax.swing.JFileChooser.APPROVE_OPTION){
                if(jfc.getSelectedFile().isDirectory()){
                    this.txtDirektori.setText(jfc.getSelectedFile().getPath());
                    Settings.setPeyimpanan(jfc.getSelectedFile().getPath() + "\\");
                    Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t-> " + Apps.getUsername() + " mengubah direktori penyimpanan ke " + jfc.getSelectedFile().getPath());
                    System.out.println("Screenshots akan disimpan ke -> " + jfc.getSelectedFile().getPath());
                }
            }
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnSaveToActionPerformed



    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setCursor(new java.awt.Cursor(Cursor.WAIT_CURSOR));
        java.awt.EventQueue.invokeLater(new Runnable(){

            @Override
            public void run(){
                dispose();
                WindowSetting win = new WindowSetting();
                win.setLocation(getX(), getY());
                win.setVisible(true);
            }

        });
    }//GEN-LAST:event_jLabel1MouseClicked



    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Root().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveTo;
    private javax.swing.JButton btnScreenshot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCamera;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblSimpan;
    private javax.swing.JLabel lblTotalSS;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField txtDirektori;
    // End of variables declaration//GEN-END:variables
}