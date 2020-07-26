package com.window;

import com.media.sounds.PlaySounds;
import com.system.Settings;
import com.system.Aktivitas;
import com.system.Apps;
import com.system.Waktu;
import com.window.helper.Ratting;

import java.awt.Color;
import java.awt.Cursor;
import java.io.IOException;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 * Digunakan untuk mengubah setting pada aplikasi
 * 
 * @author Achmad Baihaqi
 * @version 1.2
 * @since Take Screenshot 1.4
 */
public class WindowSetting extends javax.swing.JFrame {


    public WindowSetting() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(Apps.getWindowIcon());
        this.setTitle(Settings.getLanguageActived("Setting","Pengaturan","設定","Settei","환경","hwangyeong"));

        this.lblCopyright.setText("Copyright © " + Apps.getReleased() + " "+Apps.getAuthor()+".");
        this.btnChooseStorage.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.btnSimpan.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.btnBatal.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.txtPenyimpanan.setText(Settings.getSetting(Settings.SETTING_PEYIMPANAN));
        this.txtPenyimpanan.setEditable(false);

        this.setLangugage();
        this.setThemes();
        
        
        /**
         * Mengatur combo box pada theme, language, format, autosave dan efek screenshot sesuai seting yang dipilih usser
         */
        
        
            if(Settings.isEnglishLanguage()){
                this.inputLanguage.setSelectedIndex(0);
                this.inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Daymode", "Darkmode" }));
                this.inputEfekSuara.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Deactivated", "Voice 1", "Voice 2", "Voice 3", "Voice 4", "Voice 5"}));
                this.inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Activated", "Deactivated"}));
            }else if(Settings.isIndonesianLanguage()){
                this.inputLanguage.setSelectedIndex(1);
                this.inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Terang", "Gelap" }));
                this.inputEfekSuara.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Dinonaktifkan", "Suara 1", "Suara 2", "Suara 3", "Suara 4", "Suara 5"}));
                this.inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Aktif", "Dinonaktifkan"}));
            }else if(Settings.isJapaneseLanguage()){
                this.inputLanguage.setSelectedIndex(2);
                this.inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"デイモード", "ダークモード"}));
                this.inputEfekSuara.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"非アクティブ化", "ボイス1", "ボイス2", "ボイス3", "ボイス4", "ボイス5"}));
                this.inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"活性化", "非アクティブ化"}));
            }else if(Settings.isJapaneseRomajiLanguage()){
                this.inputLanguage.setSelectedIndex(3);
                this.inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Deimōdo", "Dākumōdo"}));
                this.inputEfekSuara.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Hiakutibu-ka", "Boisu 1", "Boisu 2", "Boisu 3", "Boisu 4", "Boisu 5"}));
                this.inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Kassei-ka", "Hiakutibu-ka"}));
            }else if(Settings.isKoreanLanguage()){
                this.inputLanguage.setSelectedIndex(4);
                this.inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"주간 모드", "다크 모드"}));
                this.inputEfekSuara.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"비활성화", "음성 1", "음성 2", "음성 3", "음성 4", "음성 5"}));
                this.inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"활성화", "비활성화"}));
            }else if(Settings.isKoreanRomanizationLanguage()){
                this.inputLanguage.setSelectedIndex(5);
                this.inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"jugan modeu", "dakeu modeu"}));
                this.inputEfekSuara.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"bihwalseonghwa", "eumsoeng 1", "eumsoeng 2", "eumsoeng 3", "eumsoeng 4", "eumsoeng 5"}));
                this.inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"hwalseonghwa", "bihwalseonghwa"}));
            }else{
                this.inputLanguage.setSelectedIndex(0);
                this.inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Daymode", "Darkmode" }));
                this.inputEfekSuara.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Deactivated", "Voice 1", "Voice 2", "Voice 3", "Voice 4", "Voice 5"}));
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
            
            if(Settings.isEfekSuara_Nonaktif()){
                this.inputEfekSuara.setSelectedIndex(0);
            }else if(Settings.isEfekSuara_1()){
                this.inputEfekSuara.setSelectedIndex(1);
            }else if(Settings.isEfekSuara_2()){
                this.inputEfekSuara.setSelectedIndex(2);
            }else if(Settings.isEfekSuara_3()){
                this.inputEfekSuara.setSelectedIndex(3);
            }else if(Settings.isEfekSuara_4()){
                this.inputEfekSuara.setSelectedIndex(4);
            }else if(Settings.isEfekSuara_5()){
                this.inputEfekSuara.setSelectedIndex(5);
            }else{
                this.inputEfekSuara.setSelectedIndex(0);
            }
            
            if(Settings.isAutoSave()){
                this.inputAutosave.setSelectedIndex(0);
            }else{
                this.inputAutosave.setSelectedIndex(1);
            }
    }

    
    public void setThemes(){
        JLabel[] lbls = new JLabel[]{this.lblTheme, this.lblLanguage, this.lblFormat, this.lblEfekSuara, lblAutosave, this.lblPeyimpanan};
        JComboBox[] combs = new JComboBox[]{this.inputTheme, this.inputLanguage, this.inputFormat, this.inputEfekSuara, this.inputAutosave, this.inputEfekSuara};
        
        this.topPanel.setBackground(Settings.getThemeColors(new Color(180,185,184), new Color(57,60,64)));
        this.mainPanel.setBackground(Settings.getThemeColors(new Color(255,255,255), new Color(35,35,37)));
        this.btnSimpan.setBackground(Settings.getThemeColors(new Color(223,224,224), new Color(57,60,64)));
        this.btnBatal.setBackground(Settings.getThemeColors(new Color(223,224,224), new Color(57,60,64)));
        this.btnChooseStorage.setBackground(Settings.getThemeColors(new Color(240,240,240), new Color(14,14,14)));
        this.txtPenyimpanan.setBackground(Settings.getThemeColors(new Color(255,255,255), new Color(35,35,37)));
        this.lineApplications.setBackground(Settings.getThemeColors(new Color(8,8,8), new Color(77,79,81)));
        for(int i = 0; i < combs.length; i++){
            JComboBox comb = combs[i];
            comb.setBackground(Settings.getThemeColors(new Color(222,222,222), new Color(35,35,37)));
            comb.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(239,239,239)));
        }
        
        this.lblPengaturan.setForeground(Settings.getThemeColors(new Color(0,16,26), new Color(255,255,255)));
        this.lblApplications.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(245,242,242)));
        this.btnSimpan.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(224,224,224)));
        this.btnBatal.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(224,224,224)));
        this.btnChooseStorage.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(255,250,250)));
        this.txtPenyimpanan.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(228,228,228)));
        this.lblCopyright.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(221,221,221)));
        this.lblRatting.setForeground(Settings.getThemeColors(new Color(0,0,0), new Color(221,221,221)));
        this.lblResetPengaturan.setForeground(Settings.getThemeColors(new Color(255,0,0), new Color(224,45,45)));
        for(int i = 0; i < lbls.length; i++){
            JLabel lbl = lbls[i];
            lbl.setForeground(Settings.getThemeColors(new Color(18,14,14), new Color(246,245,245)));
        }
    }
    
    public void setLangugage(){
        this.lblPengaturan.setText("  "+Settings.getLanguageActived(
            "Setting","Pengaturan","設定","Settei","환경","hwangyeong"
        ));
        this.lblApplications.setText("   "+Settings.getLanguageActived(
            "Applications","Aplikasi","応用","Ōyō","신청","sincheong"
        ));
        this.lblTheme.setText("   "+Settings.getLanguageActived( 
            "Choose the theme as you wish","Pilih tema yang kamu suka","好きなテーマを選んでください","Sukina tēma o erande kudasai","테마를 선택하십시오","temaleul seontaeghasibsio"  
        ));
        this.lblLanguage.setText("   "+Settings.getLanguageActived(
             "Choose the language you understand", "Pilih bahasa yang anda mengerti", "言語を選んでください ", "Gengo o erande kudasai", "당신의 언어를 고르시 오" ,"dangsin-ui eon-eoleul goleusi o"
        ));
        this.lblFormat.setText("   "+Settings.getLanguageActived(
             "Select image format", "Pilih format pada gambar", "画像形式を選択", "Gazō keishiki o sentaku", "이미지 형식 선택" ,"imiji hyeongsig seontaeg"
        ));
        this.lblEfekSuara.setText("   "+Settings.getLanguageActived(
             "Choose sound effect", "Pilih efek suara saat screenshot", "効果音を選択", "Kōka-on o sentaku","음향 효과를 선택하십시오", "eumhyang hyogwaleul seontaeghasibsio"
        ));
        this.lblAutosave.setText("   "+Settings.getLanguageActived(
             "Auto save image when screenshot", "Simpan otomatis gambar saat screenshot", "スクリーンショット時に画像を自動保存" ,"Sukurīnshotto-ji ni gazō o jidō hozon", "스크린 샷시 이미지 자동 저장", "seukeulin syas-si imiji jadong jeojang"
        ));
        this.lblPeyimpanan.setText("   "+Settings.getLanguageActived(
             "Default screenshot storage", "Default penyimpanan screenshot", "スクリーンショットストレージ", "Sukurīnshottosutorēji", "스크린 샷 저장", "seukeulin syas jeojang"
        ));
        this.lblRatting.setText(" "+Settings.getLanguageActived(
                "Retting application","Ratting aplikasi","評価アプリケーション","Hyōka apurikēshon","평가 신청","pyeong-ga sincheong"
        ));
        this.lblResetPengaturan.setText(Settings.getLanguageActived(
                "Reset settings", "Reset pengaturan", "設定をリセットする", "Settei o risettosuru", "설정 재설정 ", "seoljeong jaeseoljeong"
        )+"???");
        this.btnSimpan.setText(Settings.getLanguageActived(
                "Save","Simpan","セーブ","Sēbu","저장","jeojang"
        ));
        this.btnBatal.setText(Settings.getLanguageActived(
                "Cancel","Batal","キャンセル","Kyanseru","취소","chwiso"
        ));

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        lblPengaturan = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        lblApplications = new javax.swing.JLabel();
        lineApplications = new javax.swing.JSeparator();
        lblTheme = new javax.swing.JLabel();
        lblFormat = new javax.swing.JLabel();
        inputFormat = new javax.swing.JComboBox();
        inputAutosave = new javax.swing.JComboBox();
        lblAutosave = new javax.swing.JLabel();
        lblPeyimpanan = new javax.swing.JLabel();
        txtPenyimpanan = new javax.swing.JTextField();
        btnChooseStorage = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        lblLanguage = new javax.swing.JLabel();
        inputLanguage = new javax.swing.JComboBox();
        inputTheme = new javax.swing.JComboBox();
        lblCopyright = new javax.swing.JLabel();
        lblResetPengaturan = new javax.swing.JLabel();
        lblEfekSuara = new javax.swing.JLabel();
        inputEfekSuara = new javax.swing.JComboBox();
        lblRatting = new javax.swing.JLabel();

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

        topPanel.setBackground(new java.awt.Color(180, 185, 184));

        lblPengaturan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPengaturan.setForeground(new java.awt.Color(0, 16, 26));
        lblPengaturan.setText("   Pengaturan");

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/media/icons/app-window-windowsetting-back.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(lblPengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPengaturan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblApplications.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblApplications.setText("  Applications");

        lineApplications.setBackground(new java.awt.Color(8, 8, 8));

        lblTheme.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblTheme.setForeground(new java.awt.Color(18, 14, 14));
        lblTheme.setText("   Pilih tema yang anda suka");

        lblFormat.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblFormat.setForeground(new java.awt.Color(18, 14, 14));
        lblFormat.setText("   Pilih format pada screenshots");

        inputFormat.setBackground(new java.awt.Color(222, 222, 222));
        inputFormat.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        inputFormat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Png Image", "Jpg Image", "Bmp Image" }));

        inputAutosave.setBackground(new java.awt.Color(222, 222, 222));
        inputAutosave.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        inputAutosave.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aktif", "Tidak aktif" }));

        lblAutosave.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblAutosave.setForeground(new java.awt.Color(18, 14, 14));
        lblAutosave.setText("   Simpan otomatis gambar saat screenshot");

        lblPeyimpanan.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblPeyimpanan.setForeground(new java.awt.Color(18, 14, 14));
        lblPeyimpanan.setText("   Default peyimpanan screenshot");

        txtPenyimpanan.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtPenyimpanan.setText("D:\\Dokumen\\Sorce code");
        txtPenyimpanan.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        btnChooseStorage.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnChooseStorage.setText("...");
        btnChooseStorage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseStorageActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(223, 224, 224));
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

        btnBatal.setBackground(new java.awt.Color(223, 224, 224));
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
        lblLanguage.setForeground(new java.awt.Color(18, 14, 14));
        lblLanguage.setText("   Pilih bahasa yang anda mengerti");

        inputLanguage.setBackground(new java.awt.Color(222, 222, 222));
        inputLanguage.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        inputLanguage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Indonesian", "日本", "日本（ローマ字)", "한국어", "한국 (로맨틱 화)" }));
        inputLanguage.setMinimumSize(new java.awt.Dimension(88, 21));

        inputTheme.setBackground(new java.awt.Color(222, 222, 222));
        inputTheme.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        inputTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Daymode", "Darkmode (Coming soon)" }));
        inputTheme.setMinimumSize(new java.awt.Dimension(88, 21));

        lblCopyright.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblCopyright.setText(" Copyright@ achmad baihaqi 2020. ");
        lblCopyright.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCopyrightMouseClicked(evt);
            }
        });

        lblResetPengaturan.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblResetPengaturan.setForeground(new java.awt.Color(255, 0, 0));
        lblResetPengaturan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResetPengaturan.setText("Reset Pengaturan???");
        lblResetPengaturan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblResetPengaturanMouseClicked(evt);
            }
        });

        lblEfekSuara.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblEfekSuara.setForeground(new java.awt.Color(18, 14, 14));
        lblEfekSuara.setText("   Pilih efek suara saat screenshot");

        inputEfekSuara.setBackground(new java.awt.Color(222, 222, 222));
        inputEfekSuara.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        inputEfekSuara.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tidak aktif", "Suara 1", "Suara 2", "Suara 3", "Suara 4", "Suara 5" }));

        lblRatting.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblRatting.setText(" Ratting??");
        lblRatting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRattingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApplications, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lineApplications, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputFormat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblAutosave, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputAutosave, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblPeyimpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPenyimpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChooseStorage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLanguage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputLanguage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTheme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblEfekSuara, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputEfekSuara, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblRatting, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResetPengaturan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblApplications)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineApplications, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputEfekSuara, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEfekSuara, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputAutosave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAutosave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeyimpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPenyimpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseStorage))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRatting)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCopyright)
                    .addComponent(lblResetPengaturan))
                .addGap(2, 2, 2))
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
        
        try{
            // set theme
            switch(this.inputTheme.getSelectedIndex()){
                case 0: Settings.setSettings(Settings.SETTING_THEME, Settings.THEME_DAYMODE) ;break;
                case 1: Settings.setSettings(Settings.SETTING_THEME, Settings.THEME_DARKMODE) ;break;
                default: Settings.setSettings(Settings.SETTING_THEME, Settings.THEME_DAYMODE) ;break;
            }
            
            // set language
            switch(this.inputLanguage.getSelectedIndex()){
                case 0: Settings.setSettings(Settings.SETTING_LANGUAGE, Settings.LANGUAGE_ENGLISH) ; break;
                case 1: Settings.setSettings(Settings.SETTING_LANGUAGE, Settings.LANGUAGE_INDONESIAN) ; break;
                case 2: Settings.setSettings(Settings.SETTING_LANGUAGE, Settings.LANGUAGE_JAPANESE) ; break;
                case 3: Settings.setSettings(Settings.SETTING_LANGUAGE, Settings.LANGUAGE_JAPANESE_ROMAJI) ; break;
                case 4: Settings.setSettings(Settings.SETTING_LANGUAGE, Settings.LANGUAGE_KOREAN) ; break;
                case 5: Settings.setSettings(Settings.SETTING_LANGUAGE, Settings.LANGUAGE_KOREAN_ROMANIZATION) ; break;
                default: Settings.setSettings(Settings.SETTING_LANGUAGE, Settings.LANGUAGE_ENGLISH) ; break;
            }
            
            // set format
            switch(this.inputFormat.getSelectedIndex()){
                case 0: Settings.setSettings(Settings.SETTING_FORMAT, Settings.FORMAT_PNG) ; break;
                case 1: Settings.setSettings(Settings.SETTING_FORMAT, Settings.FORMAT_JPG) ; break;
                case 2: Settings.setSettings(Settings.SETTING_FORMAT, Settings.FORMAT_BMP) ; break;
                default: Settings.setSettings(Settings.SETTING_FORMAT, Settings.FORMAT_PNG) ; break;
            }
            
            // set efek suara
            switch(this.inputEfekSuara.getSelectedIndex()){
                case 0: Settings.setSettings(Settings.SETTING_EFEK_SUARA, Settings.EFEK_SUARA_DEACTIVATED); break;
                case 1: Settings.setSettings(Settings.SETTING_EFEK_SUARA, Settings.EFEK_SUARA_1);break;
                case 2: Settings.setSettings(Settings.SETTING_EFEK_SUARA, Settings.EFEK_SUARA_2);break;
                case 3: Settings.setSettings(Settings.SETTING_EFEK_SUARA, Settings.EFEK_SUARA_3);break;
                case 4: Settings.setSettings(Settings.SETTING_EFEK_SUARA, Settings.EFEK_SUARA_4);break;
                case 5: Settings.setSettings(Settings.SETTING_EFEK_SUARA, Settings.EFEK_SUARA_5);break;
                default: Settings.setSettings(Settings.SETTING_EFEK_SUARA, Settings.EFEK_SUARA_1); break;
            }
            
            // set autosave
            switch(this.inputAutosave.getSelectedIndex()){
                case 0: Settings.setSettings(Settings.SETTING_AUTOSAVE, Settings.AUTOSAVE_ACTIVATED); break;
                case 1:  Settings.setSettings(Settings.SETTING_AUTOSAVE, Settings.AUTOSAVE_DEACTIVATED); break;
                default:  Settings.setSettings(Settings.SETTING_AUTOSAVE, Settings.AUTOSAVE_ACTIVATED); break;
            }
            
            // set penyimpanan
            // akan menambahkan '\' jika pada directory belum terdapat '\'
            String penyimpanan = txtPenyimpanan.getText();
            if (penyimpanan.lastIndexOf('\\') != penyimpanan.length()-1){
                Settings.setSettings(Settings.SETTING_PEYIMPANAN, txtPenyimpanan.getText()+"\\");
            }else{
                Settings.setSettings(Settings.SETTING_PEYIMPANAN, txtPenyimpanan.getText());
            }
            
        }catch(java.io.IOException ex){
            Apps.showException("Ada masalah saat menyimpan perubahan", WindowSetting.class.getName(), ex.toString());
        }
        
        
        // keluar dari window setting lalu membuka window root
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
        jfc.setDialogTitle(Settings.getLanguageActived("Save to","Simpan ke","に保存","Ni hozon","에 저장","e jeojang"));
        jfc.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        jfc.setAcceptAllFileFilterUsed(false);
        int returnNilai = jfc.showSaveDialog(null);
            
            if(returnNilai == javax.swing.JFileChooser.APPROVE_OPTION){
                if(jfc.getSelectedFile().isDirectory()){
                    this.txtPenyimpanan.setText(jfc.getSelectedFile().getPath());
                    Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t-> " + Apps.getUsername() + " mengubah direktori penyimpanan ke " + jfc.getSelectedFile().getPath());
                    System.out.println("Screenshots akan disimpan ke -> " + jfc.getSelectedFile().getPath());
                }
            }
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnChooseStorageActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
       dispose();
        java.awt.EventQueue.invokeLater(new Runnable(){

            @Override
            public void run(){
                Root rootWindow = new Root();
                rootWindow.setLocation(getX(), getY());
                rootWindow.setVisible(true);
            }
        
        });
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnSimpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseEntered
        this.btnSimpan.setBackground(Settings.getThemeColors(new Color(138,143,143), new Color(22,23,24)));
    }//GEN-LAST:event_btnSimpanMouseEntered

    private void btnSimpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseExited
        this.btnSimpan.setBackground(Settings.getThemeColors(new Color(223,224,224), new Color(57,60,64)));
    }//GEN-LAST:event_btnSimpanMouseExited

    private void btnBatalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseEntered
        this.btnBatal.setBackground(Settings.getThemeColors(new Color(138,143,143), new Color(22,23,24)));
    }//GEN-LAST:event_btnBatalMouseEntered

    private void btnBatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseExited
        this.btnBatal.setBackground(Settings.getThemeColors(new Color(223,224,224), new Color(57,60,64)));
    }//GEN-LAST:event_btnBatalMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " membuka window WindowSetting()"); 
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " keluar dari window WindowSetting()"); 
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Aktivitas.addAktivitas(Waktu.getTanggal_Activity() +"\t->"+ Apps.getUsername() + " menutup aplikasi"); 
    }//GEN-LAST:event_formWindowClosing

    private void lblResetPengaturanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetPengaturanMouseClicked
        try{
            Settings.resetSetting();
            JOptionPane.showMessageDialog(null, "Pengaturan berhasil direset!!");
            dispose();
       
                java.awt.EventQueue.invokeLater(new Runnable(){

                    @Override
                    public void run(){
                        Root rootWindow = new Root();
                        rootWindow.setLocation(getX(), getY());
                        rootWindow.setVisible(true);
                    }

                });
        }catch(IOException ex){
            Apps.showException("Ada masalah saat mereset pengaturan!", SimpanGambar.class.getName(), ex.toString());
        }
    }//GEN-LAST:event_lblResetPengaturanMouseClicked

    private void lblCopyrightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCopyrightMouseClicked
        PlaySounds.play(PlaySounds.SUARA_NOTIF);
        JOptionPane.showMessageDialog(null, "Copyright © " + Apps.getReleased() + " "+Apps.getAuthor()+". All Rights Reserved.");
    }//GEN-LAST:event_lblCopyrightMouseClicked

    private void lblRattingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRattingMouseClicked
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable(){
        
            @Override
            public void run(){
                Ratting ratting = new Ratting();
                ratting.setLocation(getX(), getY());
                ratting.setVisible(true);
            }
        });
        
    }//GEN-LAST:event_lblRattingMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowSetting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnChooseStorage;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox inputAutosave;
    private javax.swing.JComboBox inputEfekSuara;
    private javax.swing.JComboBox inputFormat;
    private javax.swing.JComboBox inputLanguage;
    private javax.swing.JComboBox inputTheme;
    private javax.swing.JLabel lblApplications;
    private javax.swing.JLabel lblAutosave;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblEfekSuara;
    private javax.swing.JLabel lblFormat;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblPengaturan;
    private javax.swing.JLabel lblPeyimpanan;
    private javax.swing.JLabel lblRatting;
    private javax.swing.JLabel lblResetPengaturan;
    private javax.swing.JLabel lblTheme;
    private javax.swing.JSeparator lineApplications;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField txtPenyimpanan;
    // End of variables declaration//GEN-END:variables


}
