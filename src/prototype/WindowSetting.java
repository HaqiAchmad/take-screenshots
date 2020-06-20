package prototype;

import com.window.*;
import com.system.Settings;
import com.system.Aktivitas;
import com.system.Apps;
import com.system.Database;
import com.system.Tanggal;
import java.awt.Cursor;
import javax.swing.filechooser.FileSystemView;


public class WindowSetting extends javax.swing.JFrame {

    private String themeBefore, languageBefore, formatBefore, autosaveBefore, storageBefore;
    
    public WindowSetting() {
        initComponents();
        
//        this.setSize(this.mainPanel.getWidth(), 323);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(Apps.getWindowIcon());
        this.setTitle(Settings.languageSetString("Setting","Pengaturan","設定","Settei","환경","hwangyeong"));

        
        this.btnChooseStorage.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.btnSimpan.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.btnBatal.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.txtPeyimpanan.setText(Settings.getPenyimpanan());
        this.txtPeyimpanan.setEditable(false);
//        this.themeBefore = inputTheme.getSelectedItem().toString();
        this.languageBefore = inputLanguage.getSelectedItem().toString();
        this.formatBefore = inputFormat.getSelectedItem().toString();
        this.autosaveBefore = inputFormat.getSelectedItem().toString();
        storageBefore = txtPeyimpanan.getText();
        
       

        setLangugage();
        

            if(Settings.isEnglishLanguage()){
                this.inputLanguage.setSelectedIndex(0);
//                this.inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Daymode", "Darkmode" }));
                this.inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Activated", "Deactivated"}));
            }else if(Settings.isIndonesianLanguage()){
                this.inputLanguage.setSelectedIndex(1);
//                this.inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Terang", "Gelap" }));
                this.inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Aktif", "Dinonaktifkan"}));
            }else if(Settings.isJapaneseLanguage()){
                this.inputLanguage.setSelectedIndex(2);
//                this.inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"デイモード", "ダークモード"}));
                this.inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"活性化", "非アクティブ化"}));
            }else if(Settings.isJapaneseRomajiLanguage()){
                this.inputLanguage.setSelectedIndex(3);
//                this.inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Deimōdo", "Dākumōdo"}));
                this.inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Kassei-ka", "Hiakutibu-ka"}));
            }else if(Settings.isKoreanLanguage()){
                this.inputLanguage.setSelectedIndex(4);
//                this.inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"주간 모드", "다크 모드"}));
                this.inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"활성화", "비활성화"}));
            }else if(Settings.isKoreanRomanizationLanguage()){
                this.inputLanguage.setSelectedIndex(5);
//                this.inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"jugan modeu", "dakeu modeu"}));
                this.inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"hwalseonghwa", "bihwalseonghwa"}));
            }else{
                this.inputLanguage.setSelectedIndex(0);
//                this.inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Daymode", "Darkmode" }));
                this.inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Activated", "Deactivated"}));
            }
            
            if(Settings.isDaymode()){
                this.inputTheme.setSelectedIndex(0);
            }else{
                this.inputTheme.setSelectedIndex(1);
            }
            
            if(Settings.isPngFormat()){
                this.inputFormat.setSelectedIndex(0);
            }else if(Settings.isJpgFormat()){
                this.inputFormat.setSelectedIndex(1);
            }else if(Settings.isBmpFormat()){
                this.inputFormat.setSelectedIndex(2);
            }else{
                this.inputFormat.setSelectedIndex(0);
            }
            
            if(Settings.isAutoSave()){
                this.inputAutosave.setSelectedIndex(0);
            }else{
                this.inputAutosave.setSelectedIndex(1);
            }
        

    }

    public void setLangugage(){
        this.lblPengaturan.setText("  "+Settings.languageSetString(
            "Setting","Pengaturan","設定","Settei","환경","hwangyeong"
        ));
        this.lblApplications.setText("   "+Settings.languageSetString(
            "Applications","Aplikasi","応用","Ōyō","신청","sincheong"
        ));
        this.lblTheme.setText("   "+Settings.languageSetString( 
            "Choose the theme as you wish","Pilih tema yang kamu suka","好きなテーマを選んでください","Sukina tēma o erande kudasai","테마를 선택하십시오","temaleul seontaeghasibsio"  
        ));
        this.lblLanguage.setText("   "+Settings.languageSetString(
             "Choose the language you understand", "Pilih bahasa yang anda mengerti", "言語を選んでください ", "Gengo o erande kudasai", "당신의 언어를 고르시 오" ,"dangsin-ui eon-eoleul goleusi o"
        ));
        this.lblFormat.setText("   "+Settings.languageSetString(
             "Select image format", "Pilih format pada gambar", "画像形式を選択", "Gazō keishiki o sentaku", "이미지 형식 선택" ,"imiji hyeongsig seontaeg"
        ));
        this.lblAutosave.setText("   "+Settings.languageSetString(
             "Auto save image when screenshot", "Simpan otomatis gambar saat screenshot", "スクリーンショット時に画像を自動保存" ,"Sukurīnshotto-ji ni gazō o jidō hozon", "스크린 샷시 이미지 자동 저장", "seukeulin syas-si imiji jadong jeojang"
        ));
        this.lblPeyimpanan.setText("   "+Settings.languageSetString(
             "Default screenshot storage", "Default penyimpanan screenshot", "スクリーンショットストレージ", "Sukurīnshottosutorēji", "스크린 샷 저장", "seukeulin syas jeojang"
        ));
        this.btnSimpan.setText(Settings.languageSetString(
                "Save","Simpan","セーブ","Sēbu","저장","jeojang"
        ));
        this.btnBatal.setText(Settings.languageSetString(
                "Cancel","Batal","キャンセル","Kyanseru","취소","chwiso"
        ));

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        lblPengaturan = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        lblApplications = new javax.swing.JLabel();
        lineApplications = new javax.swing.JSeparator();
        lblTheme = new javax.swing.JLabel();
        lblFormat = new javax.swing.JLabel();
        lblAutosave = new javax.swing.JLabel();
        lblPeyimpanan = new javax.swing.JLabel();
        txtPeyimpanan = new javax.swing.JTextField();
        btnChooseStorage = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        lblLanguage = new javax.swing.JLabel();
        lblCopyright = new javax.swing.JLabel();
        inputLanguage = new javax.swing.JComboBox();
        inputFormat = new javax.swing.JComboBox();
        inputAutosave = new javax.swing.JComboBox();
        inputTheme = new javax.swing.JComboBox();

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

        topPanel.setBackground(new java.awt.Color(57, 60, 64));

        lblPengaturan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPengaturan.setForeground(new java.awt.Color(255, 255, 255));
        lblPengaturan.setText("   Pengaturan");

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/app-window-windowsetting-close-daymode.png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(lblPengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPengaturan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        mainPanel.setBackground(new java.awt.Color(35, 35, 37));

        lblApplications.setBackground(new java.awt.Color(255, 255, 255));
        lblApplications.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblApplications.setForeground(new java.awt.Color(245, 242, 242));
        lblApplications.setText("  Applications");

        lineApplications.setBackground(new java.awt.Color(77, 79, 81));

        lblTheme.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblTheme.setForeground(new java.awt.Color(246, 245, 245));
        lblTheme.setText("   Pilih tema yang anda suka");

        lblFormat.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblFormat.setForeground(new java.awt.Color(246, 245, 245));
        lblFormat.setText("   Pilih format pada screenshots");

        lblAutosave.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblAutosave.setForeground(new java.awt.Color(246, 245, 245));
        lblAutosave.setText("   Simpan otomatis gambar saat screenshot");

        lblPeyimpanan.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblPeyimpanan.setForeground(new java.awt.Color(246, 245, 245));
        lblPeyimpanan.setText("   Default peyimpanan screenshot");

        txtPeyimpanan.setBackground(new java.awt.Color(35, 35, 37));
        txtPeyimpanan.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtPeyimpanan.setForeground(new java.awt.Color(228, 228, 228));
        txtPeyimpanan.setText("D:\\Dokumen\\Sorce code");
        txtPeyimpanan.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        btnChooseStorage.setBackground(new java.awt.Color(14, 14, 14));
        btnChooseStorage.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnChooseStorage.setForeground(new java.awt.Color(255, 250, 250));
        btnChooseStorage.setText("...");
        btnChooseStorage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseStorageActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(57, 60, 64));
        btnSimpan.setForeground(new java.awt.Color(224, 224, 224));
        btnSimpan.setText("Simpan");
        btnSimpan.setBorder(null);
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSimpanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSimpanMouseExited(evt);
            }
        });
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(57, 60, 64));
        btnBatal.setForeground(new java.awt.Color(224, 224, 224));
        btnBatal.setText("Batal");
        btnBatal.setBorder(null);
        btnBatal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        lblLanguage.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblLanguage.setForeground(new java.awt.Color(246, 245, 245));
        lblLanguage.setText("   Pilih bahasa yang anda mengerti");

        lblCopyright.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblCopyright.setForeground(new java.awt.Color(221, 221, 221));
        lblCopyright.setText(" Copyright@ achmad baihaqi 2020. 設定");

        inputLanguage.setBackground(new java.awt.Color(0, 0, 0));
        inputLanguage.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        inputLanguage.setForeground(new java.awt.Color(239, 239, 239));
        inputLanguage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Indonesian", "日本", "日本（ローマ字)", "한국어", "한국 (로맨틱 화)" }));
        inputLanguage.setMinimumSize(new java.awt.Dimension(88, 21));

        inputFormat.setBackground(new java.awt.Color(0, 0, 0));
        inputFormat.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        inputFormat.setForeground(new java.awt.Color(239, 239, 239));
        inputFormat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Png Image", "Jpg Image", "Bmp Image" }));

        inputAutosave.setBackground(new java.awt.Color(0, 0, 0));
        inputAutosave.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        inputAutosave.setForeground(new java.awt.Color(239, 239, 239));
        inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aktif", "Tidak aktif" }));

        inputTheme.setBackground(new java.awt.Color(0, 0, 0));
        inputTheme.setForeground(new java.awt.Color(255, 255, 255));
        inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Daymode", "Darkmode" }));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblPeyimpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPeyimpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChooseStorage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLanguage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAutosave, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApplications, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lineApplications, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputFormat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputAutosave, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputLanguage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTheme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblApplications)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineApplications, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAutosave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(inputTheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputAutosave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeyimpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeyimpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseStorage))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(lblCopyright))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed

//            if(this.inputTheme.getSelectedIndex() == 0){
//                Settings.setTheme(Settings.THEME_DAYMODE);
//                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah theme dari "+ this.themeBefore + " ke Daymode");
//            }else if(this.inputTheme.getSelectedIndex() == 1){
//                Settings.setTheme(Settings.THEME_DARKMODE);
//                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah theme dari "+ this.themeBefore + " ke Darkmode");
//            }else{
//                Settings.setTheme(Settings.THEME_DAYMODE);
//                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah theme dari "+ this.themeBefore + " ke Daymode");
//            }

            if(this.inputLanguage.getSelectedIndex() == 0){
                Settings.setLanguage(Settings.LANGUAGE_ENGLISH);
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah setelan bahasa dari "+ this.languageBefore +" ke English");
            }else if(this.inputLanguage.getSelectedIndex() == 1){
                Settings.setLanguage(Settings.LANGUAGE_INDONESIAN);
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah setelan bahasa dari "+ this.languageBefore +" ke Indonesian");
            }else if(this.inputLanguage.getSelectedIndex() == 2){
                Settings.setLanguage(Settings.LANGUAGE_JAPANESE);
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah setelan bahasa dari "+ this.languageBefore +" ke Jepang");
            }else if(this.inputLanguage.getSelectedIndex() == 3){
                Settings.setLanguage(Settings.LANGUAGE_JAPANESE_ROMAJI);
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah setelan bahasa dari "+ this.languageBefore +" ke Jepang(Romaji)");
            }else if(this.inputLanguage.getSelectedIndex() == 4){
                Settings.setLanguage(Settings.LANGUAGE_KOREAN);
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah setelan bahasa dari "+ this.languageBefore +" ke Korean");
            }else if(this.inputLanguage.getSelectedIndex() == 5){
                Settings.setLanguage(Settings.LANGUAGE_KOREAN_ROMANIZATION);
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah setelan bahasa dari "+ this.languageBefore +" ke Korean (Romanizaion)");
            }else{
                Settings.setLanguage(Settings.LANGUAGE_ENGLISH);
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah setelan bahasa dari "+ this.languageBefore +" ke English");
            }
        
            if(this.inputFormat.getSelectedIndex() == 0){
                Settings.setFormatSelected(Settings.SET_FORMAT_PNG);
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah format gambar dari "+ this.formatBefore + " ke Png Image");
            }else if(this.inputFormat.getSelectedIndex() == 1){
                Settings.setFormatSelected(Settings.SET_FORMAT_JPG);
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah format gambar dari "+ this.formatBefore + " ke Jpg Image");
            }else if(this.inputFormat.getSelectedIndex() == 2){
                Settings.setFormatSelected(Settings.SET_FORMAT_BMP);
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah format gambar dari "+ this.formatBefore + " ke Bmp Image");
            }else{
                Settings.setFormatSelected(Settings.SET_FORMAT_PNG);
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengubah format gambar dari "+ this.formatBefore + " ke Png Image");
            }

            if(this.inputAutosave.getSelectedIndex() == 0){
                Settings.setAutoSave(Settings.AUTOSAVE_ACTIVATED);
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Mengaktifkan autosave pada screenshot");
            }else if(this.inputAutosave.getSelectedIndex() == 1){
                Settings.setAutoSave(Settings.AUTOSAVE_DEACTIVATED);
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Menonaktifkan autosave pada screenshot");
            }else{
                Settings.setAutoSave(Settings.AUTOSAVE_DEACTIVATED);
                Aktivitas.addAktivitas(Tanggal.getTanggal_Activity()+"\t-> " + Apps.getUsername() + " Menonaktifkan autosave pada screenshot");
            }
            
            
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable(){

            @Override
            public void run(){
                Root rootWindow = new Root();
                rootWindow.setLocation(getX(), getY());
                rootWindow.setVisible(true);
            }
        
        });
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
       dispose();
       Settings.setPeyimpanan(storageBefore);
        java.awt.EventQueue.invokeLater(new Runnable(){

            @Override
            public void run(){
                Root rootWindow = new Root();
                rootWindow.setLocation(getX(), getY());
                rootWindow.setVisible(true);
            }
        
        });
        
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnChooseStorageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseStorageActionPerformed
        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        javax.swing.JFileChooser jfc = new javax.swing.JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle(Settings.languageSetString("Save to","Simpan ke","に保存","Ni hozon","에 저장","e jeojang"));
        jfc.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        jfc.setAcceptAllFileFilterUsed(false);
        int returnNilai = jfc.showSaveDialog(null);
            
            if(returnNilai == javax.swing.JFileChooser.APPROVE_OPTION){
                if(jfc.getSelectedFile().isDirectory()){
                    this.txtPeyimpanan.setText(jfc.getSelectedFile().getPath());
                    Settings.setPeyimpanan(jfc.getSelectedFile().getPath() + "\\");
                    Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t-> " + Apps.getUsername() + " mengubah direktori penyimpanan ke " + jfc.getSelectedFile().getPath());
                    System.out.println("Screenshots akan disimpan ke -> " + jfc.getSelectedFile().getPath());
                }
            }
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnChooseStorageActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
       dispose();
       Settings.setPeyimpanan(storageBefore);
        java.awt.EventQueue.invokeLater(new Runnable(){

            @Override
            public void run(){
                Root rootWindow = new Root();
                rootWindow.setLocation(getX(), getY());
                rootWindow.setVisible(true);
            }
        
        });
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnSimpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseEntered
        this.btnSimpan.setBackground(new java.awt.Color(22,23,24));
    }//GEN-LAST:event_btnSimpanMouseEntered

    private void btnSimpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseExited
        this.btnSimpan.setBackground(new java.awt.Color(57,60,64));
    }//GEN-LAST:event_btnSimpanMouseExited

    private void btnBatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseEntered
        this.btnBatal.setBackground(new java.awt.Color(22,23,24));
    }//GEN-LAST:event_btnBatalMouseEntered

    private void btnBatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseExited
        this.btnBatal.setBackground(new java.awt.Color(57,60,64));
    }//GEN-LAST:event_btnBatalMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Aktivitas.setOpen("open");
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " membuka window WindowSetting()"); 
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " keluar dari window WindowSetting()"); 
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Aktivitas.setOpen("close");
        Aktivitas.addAktivitas(Tanggal.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " menutup aplikasi"); 
        Database.backupDatabase();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WindowSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowSetting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnChooseStorage;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox inputAutosave;
    private javax.swing.JComboBox inputFormat;
    private javax.swing.JComboBox inputLanguage;
    private javax.swing.JComboBox inputTheme;
    private javax.swing.JLabel lblApplications;
    private javax.swing.JLabel lblAutosave;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblFormat;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblPengaturan;
    private javax.swing.JLabel lblPeyimpanan;
    private javax.swing.JLabel lblTheme;
    private javax.swing.JSeparator lineApplications;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField txtPeyimpanan;
    // End of variables declaration//GEN-END:variables
}
