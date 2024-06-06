package prolab2.proje;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FirmaPanel extends javax.swing.JFrame {
    private final Map<String, Map<String, Integer>> distances;
    private Map<String, Map<String, Integer>> roadTickets;
    private Map<String, Map<String, Integer>> railTickets;
    private Map<String, Map<String, Integer>> airTickets;
    private final Company company;
    private Transport transport;
    private Route route;
    private String selectedKalkisYeri ;
    private String selectedVarisYeri;
    static String ADMINUSERNAME="username";
    static String ADMINPASSWORD="password";

    public FirmaPanel(Company company,Transport transport) {
        this.distances = createDistances();
        this.roadTickets = createRoadDistances();
        this.railTickets = createRailDistances();
        this.airTickets = createAirDistances();
        Route route = new Route(distances);
        this.route = route;
        this.company = company;
        this.transport=transport;
        transport = new Transport();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firma_Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        araclar_table = new javax.swing.JTable();
        araclar_label = new javax.swing.JLabel();
        kalkısYeri_label = new javax.swing.JLabel();
        kalkısYeri_comboBox = new javax.swing.JComboBox<>();
        yakitTipi_label = new javax.swing.JLabel();
        yakitTipi_comboBox = new javax.swing.JComboBox<>();
        aracTuru_label = new javax.swing.JLabel();
        aracTuru_comboBox = new javax.swing.JComboBox<>();
        kalkisZamani_label = new javax.swing.JLabel();
        kalkisZamanis_comboBox = new javax.swing.JComboBox<>();
        varısYeri_label = new javax.swing.JLabel();
        varısYeri_comboBox = new javax.swing.JComboBox<>();
        aracEkle_button = new javax.swing.JButton();
        aracCıkar_button = new javax.swing.JButton();
        persone_panel = new javax.swing.JPanel();
        surusPersoneli_label = new javax.swing.JLabel();
        surusPersoneli2_label = new javax.swing.JLabel();
        hizmetPersoneli_label = new javax.swing.JLabel();
        hizmetPersoneli2_label = new javax.swing.JLabel();
        ad_label = new javax.swing.JLabel();
        soyad_label = new javax.swing.JLabel();
        maas_label = new javax.swing.JLabel();
        surusPersoneliAd_textField = new javax.swing.JTextField();
        surusPersoneliSoyad_textField = new javax.swing.JTextField();
        surusPersoneliMaas_textField = new javax.swing.JTextField();
        surusPersoneli2Ad_textField = new javax.swing.JTextField();
        surusPersoneli2Soyad_textField = new javax.swing.JTextField();
        surusPersoneli2Maas_textField = new javax.swing.JTextField();
        hizmetPersoneli2Ad_textField = new javax.swing.JTextField();
        hizmetPersoneli2Soyad_textField = new javax.swing.JTextField();
        hizmetPersoneli2Maas_textField = new javax.swing.JTextField();
        hizmetPersoneliAd_textField = new javax.swing.JTextField();
        hizmetPersoneliSoyad_textField = new javax.swing.JTextField();
        hizmetPersoneliMaas_textField = new javax.swing.JTextField();
        kazanc_Panel = new javax.swing.JPanel();
        gunlukKazanc_textField = new javax.swing.JTextField();
        gunlukKazancTarihler_comboBox = new javax.swing.JComboBox<>();
        gunlukKazanc_Label = new javax.swing.JLabel();
        gunlukKazanc_Label1 = new javax.swing.JLabel();
        toplamKazanc_textField = new javax.swing.JTextField();
        kazancGoster_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        aracID_label = new javax.swing.JLabel();
        aracID_textField = new javax.swing.JTextField();
        cıkıs_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firma_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        araclar_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Araç Türü", "Kalkış", "Varış", "Yakıt Tipi", "Araç ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(araclar_table);

        araclar_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        araclar_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        araclar_label.setText("ARAÇLAR");

        kalkısYeri_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kalkısYeri_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kalkısYeri_label.setText("Kalkış Yeri");

        kalkısYeri_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kalkış Yeri", "Kocaeli", "Istanbul", "Eskisehir", "Ankara", "Konya", "Bilecik" }));
        kalkısYeri_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkısYeri_comboBoxActionPerformed(evt);
            }
        });

        yakitTipi_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yakitTipi_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yakitTipi_label.setText("Yakıt Tipi");

        yakitTipi_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yakıt Tipi", "Benzin", "Gaz", "Elektrik", " " }));
        yakitTipi_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yakitTipi_comboBoxActionPerformed(evt);
            }
        });

        aracTuru_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aracTuru_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aracTuru_label.setText("Araç Türü");

        aracTuru_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Araç seç", "Otobüs20", "Otobüs15", "Tren", "Uçak" }));
        aracTuru_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracTuru_comboBoxActionPerformed(evt);
            }
        });

        kalkisZamani_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kalkisZamani_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kalkisZamani_label.setText("Kalkış Zamanı");

        kalkisZamanis_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kalkış Zamanı", "04/12/2023", "05/12/2023", "06/12/2023", "07/12/2023", "08/12/2023", "09/12/2023", "10/12/2023", "11/12/2023" }));
        kalkisZamanis_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkisZamanis_comboBoxActionPerformed(evt);
            }
        });

        varısYeri_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        varısYeri_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        varısYeri_label.setText("Varış Yeri");

        varısYeri_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Varış Yeri", "Kocaeli", "Istanbul", "Eskisehir", "Ankara", "Konya", "Bilecik" }));
        varısYeri_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varısYeri_comboBoxActionPerformed(evt);
            }
        });

        aracEkle_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aracEkle_button.setText("EKLE");
        aracEkle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracEkle_buttonActionPerformed(evt);
            }
        });

        aracCıkar_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aracCıkar_button.setText("ÇIKAR");
        aracCıkar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracCıkar_buttonActionPerformed(evt);
            }
        });

        persone_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        surusPersoneli_label.setText("SürüşPersoneli:");

        surusPersoneli2_label.setText("SürüşPersoneli2:");

        hizmetPersoneli_label.setText("HizmetPersoneli:");

        hizmetPersoneli2_label.setText("HizmetPersoneli2:");

        ad_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ad_label.setText("Ad");

        soyad_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soyad_label.setText("Soyad");

        maas_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maas_label.setText("Maaş");

        surusPersoneliMaas_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surusPersoneliMaas_textFieldActionPerformed(evt);
            }
        });

        surusPersoneli2Ad_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surusPersoneli2Ad_textFieldActionPerformed(evt);
            }
        });

        hizmetPersoneliAd_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hizmetPersoneliAd_textFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout persone_panelLayout = new javax.swing.GroupLayout(persone_panel);
        persone_panel.setLayout(persone_panelLayout);
        persone_panelLayout.setHorizontalGroup(
            persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(persone_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(surusPersoneli2_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hizmetPersoneli_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hizmetPersoneli2_label, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                    .addComponent(surusPersoneli_label, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(persone_panelLayout.createSequentialGroup()
                        .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(hizmetPersoneliAd_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(surusPersoneliAd_textField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(surusPersoneli2Ad_textField, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(hizmetPersoneli2Ad_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hizmetPersoneli2Soyad_textField)
                            .addComponent(surusPersoneliSoyad_textField)
                            .addComponent(surusPersoneli2Soyad_textField)
                            .addComponent(hizmetPersoneliSoyad_textField, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(surusPersoneli2Maas_textField)
                            .addComponent(hizmetPersoneliMaas_textField)
                            .addComponent(hizmetPersoneli2Maas_textField)
                            .addComponent(surusPersoneliMaas_textField))
                        .addContainerGap())
                    .addGroup(persone_panelLayout.createSequentialGroup()
                        .addComponent(ad_label, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(soyad_label, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(maas_label, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        persone_panelLayout.setVerticalGroup(
            persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(persone_panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ad_label)
                    .addComponent(soyad_label)
                    .addComponent(maas_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surusPersoneliAd_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surusPersoneli_label)
                    .addComponent(surusPersoneliSoyad_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surusPersoneliMaas_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surusPersoneli2Ad_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surusPersoneli2_label)
                    .addComponent(surusPersoneli2Soyad_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surusPersoneli2Maas_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hizmetPersoneli_label)
                    .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hizmetPersoneliAd_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hizmetPersoneliMaas_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hizmetPersoneliSoyad_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hizmetPersoneli2_label)
                        .addComponent(hizmetPersoneli2Ad_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(persone_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hizmetPersoneli2Maas_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hizmetPersoneli2Soyad_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        kazanc_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        gunlukKazancTarihler_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "04/12/2023", "05/12/2023", "06/12/2023", "07/12/2023", "08/12/2023", "09/12/2023", "10/12/2023", "11/12/2023" }));

        gunlukKazanc_Label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gunlukKazanc_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gunlukKazanc_Label.setText("GÜNLÜK KAZANÇ");

        gunlukKazanc_Label1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gunlukKazanc_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gunlukKazanc_Label1.setText("TOPLAM KAZANÇ");

        kazancGoster_button.setText("GÖSTER");
        kazancGoster_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kazancGoster_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kazanc_PanelLayout = new javax.swing.GroupLayout(kazanc_Panel);
        kazanc_Panel.setLayout(kazanc_PanelLayout);
        kazanc_PanelLayout.setHorizontalGroup(
            kazanc_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kazanc_PanelLayout.createSequentialGroup()
                .addGroup(kazanc_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gunlukKazanc_Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kazanc_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kazanc_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kazanc_PanelLayout.createSequentialGroup()
                                .addComponent(gunlukKazancTarihler_comboBox, 0, 113, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gunlukKazanc_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gunlukKazanc_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(kazanc_PanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(kazanc_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kazancGoster_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toplamKazanc_textField))))
                .addContainerGap())
        );
        kazanc_PanelLayout.setVerticalGroup(
            kazanc_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kazanc_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gunlukKazanc_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(kazanc_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gunlukKazancTarihler_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gunlukKazanc_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gunlukKazanc_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toplamKazanc_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kazancGoster_button)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        aracID_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        aracID_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aracID_label.setText("ARAÇ ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aracID_label, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(aracID_textField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aracID_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aracID_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        cıkıs_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cıkıs_button.setText("ÇIKIŞ");
        cıkıs_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cıkıs_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout firma_PanelLayout = new javax.swing.GroupLayout(firma_Panel);
        firma_Panel.setLayout(firma_PanelLayout);
        firma_PanelLayout.setHorizontalGroup(
            firma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firma_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firma_PanelLayout.createSequentialGroup()
                        .addGroup(firma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(firma_PanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(araclar_label, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(firma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(varısYeri_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yakitTipi_label, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yakitTipi_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(firma_PanelLayout.createSequentialGroup()
                                .addGroup(firma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(firma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(kalkısYeri_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(aracTuru_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kalkisZamani_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kalkisZamanis_comboBox, 0, 142, Short.MAX_VALUE)
                                        .addComponent(aracEkle_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kalkısYeri_label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(varısYeri_label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(aracTuru_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(firma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(firma_PanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(aracCıkar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cıkıs_button))
                                    .addGroup(firma_PanelLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(firma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(kazanc_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addComponent(persone_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        firma_PanelLayout.setVerticalGroup(
            firma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firma_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(persone_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(firma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(araclar_label)
                    .addGroup(firma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, firma_PanelLayout.createSequentialGroup()
                            .addGroup(firma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(kazanc_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(firma_PanelLayout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(kalkisZamani_label)
                                    .addGap(5, 5, 5)
                                    .addComponent(kalkisZamanis_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(kalkısYeri_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(kalkısYeri_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(varısYeri_label)))
                            .addGroup(firma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(firma_PanelLayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(varısYeri_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(yakitTipi_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(yakitTipi_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)
                                    .addComponent(aracTuru_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(aracTuru_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(aracEkle_button, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(firma_PanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(firma_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(aracCıkar_button, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                        .addComponent(cıkıs_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(firma_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(firma_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kalkısYeri_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkısYeri_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kalkısYeri_comboBoxActionPerformed

    private void yakitTipi_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yakitTipi_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yakitTipi_comboBoxActionPerformed

    private void aracTuru_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracTuru_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aracTuru_comboBoxActionPerformed

    
    
    private void kalkisZamanis_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkisZamanis_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kalkisZamanis_comboBoxActionPerformed

    private void hizmetPersoneliAd_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hizmetPersoneliAd_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hizmetPersoneliAd_textFieldActionPerformed

    private void surusPersoneli2Ad_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surusPersoneli2Ad_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surusPersoneli2Ad_textFieldActionPerformed
            
    private void aracCıkar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracCıkar_buttonActionPerformed
          // Seçili satırın indeksini al
                int selectedRowIndex = araclar_table.getSelectedRow();
                Trip selectedTrip;
                // Seçili bir satır varsa işlemi gerçekleştir
                if (selectedRowIndex != -1) {
                    // Seçili satırı çıkar
                    DefaultTableModel model = (DefaultTableModel) araclar_table.getModel();
                    model.removeRow(selectedRowIndex);
                    
                    selectedTrip = company.getTrips().get(selectedRowIndex);
                    transport.removeTrip(selectedTrip);
                    company.removeTrip(selectedTrip);

                } else {
                    JOptionPane.showMessageDialog(null, "Lütfen çıkarmak istediğiniz bir satırı seçin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
                }                         
                
    }//GEN-LAST:event_aracCıkar_buttonActionPerformed

    private void varısYeri_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varısYeri_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varısYeri_comboBoxActionPerformed

    private void kazancGoster_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kazancGoster_buttonActionPerformed
        Admin admin =new Admin(ADMINUSERNAME,ADMINPASSWORD); 
        String date=(String) gunlukKazancTarihler_comboBox.getSelectedItem();
          List<Trip> trips=company.getTrips();
          for (Trip trip : trips) {
            if(date.equals(trip.getDate())){
               int biletHasılat=trip.getVehicle().passengerOfNumber()*trip.getPrice();
               company.addDailyEarnings(date,biletHasılat );
               int expense= trip.getVehicle().calculateTotalPersonnelCost()+admin.getHizmetBedeli()+trip.getVehicle().getFuelCostPerKm()*getDistanceBetweenCities(trip.getRoute().getDeparturePoint(),trip.getRoute().getArrivalPoint());
              
               company.addDailyExpenses(date,expense );
           }     
          }
          int i=getDistanceBetweenCities(selectedKalkisYeri,selectedVarisYeri);

          int dailyProfit=company.calculateDailyProfit(date);
          gunlukKazanc_textField.setText(String.valueOf(dailyProfit));
          int totalProfit=company.calculateTotalProfit();
          toplamKazanc_textField.setText(String.valueOf(totalProfit));
     
    }//GEN-LAST:event_kazancGoster_buttonActionPerformed

    private void cıkıs_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cıkıs_buttonActionPerformed
        dispose();
    }//GEN-LAST:event_cıkıs_buttonActionPerformed

    private void aracEkle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracEkle_buttonActionPerformed

        String selectedAracTuru = (String) aracTuru_comboBox.getSelectedItem();
        String selectedYakitTipi = (String) yakitTipi_comboBox.getSelectedItem();
        selectedKalkisYeri = (String) kalkısYeri_comboBox.getSelectedItem();
        selectedVarisYeri = (String) varısYeri_comboBox.getSelectedItem();
        String aracID = aracID_textField.getText();
        String hizmetPersoneliAd = hizmetPersoneliAd_textField.getText();
        String hizmetPersoneliSoyad = hizmetPersoneliSoyad_textField.getText();
        int hizmetPersoneliMaas = Integer.parseInt(hizmetPersoneliMaas_textField.getText());
        String hizmetPersoneli2Ad = hizmetPersoneli2Ad_textField.getText();
        String hizmetPersoneli2Soyad = hizmetPersoneli2Soyad_textField.getText();
        int hizmetPersoneli2Maas = Integer.parseInt(hizmetPersoneli2Maas_textField.getText());
        String surusPersoneliAd = surusPersoneliAd_textField.getText();
        String surusPersoneliSoyad = surusPersoneliSoyad_textField.getText();
        int surusPersoneliMaas = Integer.parseInt(surusPersoneliMaas_textField.getText());
        String surusPersoneli2Ad = surusPersoneli2Ad_textField.getText();
        String surusPersoneli2Soyad = surusPersoneli2Soyad_textField.getText();
        int surusPersoneli2Maas = Integer.parseInt(surusPersoneli2Maas_textField.getText());
        String selectedKalkisZamani = (String) kalkisZamanis_comboBox.getSelectedItem();
        System.out.println(hizmetPersoneliAd+hizmetPersoneli2Maas+surusPersoneliSoyad);
        // Personel maaşları
        Personel driver1 = new Personel(surusPersoneliAd, surusPersoneliSoyad, surusPersoneliMaas, hizmetPersoneliMaas);
        Personel driver2 = new Personel(surusPersoneli2Ad, surusPersoneli2Soyad, surusPersoneli2Maas, hizmetPersoneli2Maas);
        Personel servicePersonnel1 = new Personel(hizmetPersoneliAd, hizmetPersoneli2Soyad, surusPersoneliMaas, hizmetPersoneliMaas);
        Personel servicePersonnel2 = new Personel(hizmetPersoneli2Ad, hizmetPersoneliSoyad, surusPersoneli2Maas, hizmetPersoneli2Maas);


        Vehicle newVehicle = null;

        switch (selectedAracTuru) {
            case "Uçak":
            newVehicle = new Airplane(aracID, 10.0, 30, driver1, driver2, servicePersonnel1, servicePersonnel2);
            break;
            case "Tren":
            newVehicle = new Train(aracID, 10.0, 25, driver1, driver2, servicePersonnel1, servicePersonnel2);
            break;
            case "Otobüs15":
            newVehicle = new Bus(aracID, 15.0, 15, driver1, driver2, servicePersonnel1, servicePersonnel2);
            break;
            case "Otobüs20":
            newVehicle = new Bus(aracID, 20.0, 20, driver1, driver2, servicePersonnel1, servicePersonnel2);
            break;
            default:
            break;
        }
        if (newVehicle == null) {
            JOptionPane.showMessageDialog(this, "Error creating the vehicle.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        Route route = new Route(distances);
        route.setArrivalPoint(selectedVarisYeri);
        route.setDeparturePoint(selectedKalkisYeri);
        int price=getTicketPrice(selectedAracTuru,selectedKalkisYeri,selectedVarisYeri);
        Trip newTrip = new Trip(newVehicle, route, selectedKalkisZamani, price);

        transport.addTrip(newTrip);
        company.addVehicle(newVehicle);
        company.addTrip(newTrip);
        transport.printTripList();

        DefaultTableModel model = (DefaultTableModel) araclar_table.getModel();
        model.addRow(new Object[]{selectedAracTuru , route.getDeparturePoint(), route.getArrivalPoint(),selectedYakitTipi,aracID});

    }//GEN-LAST:event_aracEkle_buttonActionPerformed

    private void surusPersoneliMaas_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surusPersoneliMaas_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surusPersoneliMaas_textFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad_label;
    private javax.swing.JButton aracCıkar_button;
    private javax.swing.JButton aracEkle_button;
    private javax.swing.JLabel aracID_label;
    private javax.swing.JTextField aracID_textField;
    private javax.swing.JComboBox<String> aracTuru_comboBox;
    private javax.swing.JLabel aracTuru_label;
    private javax.swing.JLabel araclar_label;
    private javax.swing.JTable araclar_table;
    private javax.swing.JButton cıkıs_button;
    private javax.swing.JPanel firma_Panel;
    private javax.swing.JComboBox<String> gunlukKazancTarihler_comboBox;
    private javax.swing.JLabel gunlukKazanc_Label;
    private javax.swing.JLabel gunlukKazanc_Label1;
    private javax.swing.JTextField gunlukKazanc_textField;
    private javax.swing.JTextField hizmetPersoneli2Ad_textField;
    private javax.swing.JTextField hizmetPersoneli2Maas_textField;
    private javax.swing.JTextField hizmetPersoneli2Soyad_textField;
    private javax.swing.JLabel hizmetPersoneli2_label;
    private javax.swing.JTextField hizmetPersoneliAd_textField;
    private javax.swing.JTextField hizmetPersoneliMaas_textField;
    private javax.swing.JTextField hizmetPersoneliSoyad_textField;
    private javax.swing.JLabel hizmetPersoneli_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kalkisZamani_label;
    private javax.swing.JComboBox<String> kalkisZamanis_comboBox;
    private javax.swing.JComboBox<String> kalkısYeri_comboBox;
    private javax.swing.JLabel kalkısYeri_label;
    private javax.swing.JButton kazancGoster_button;
    private javax.swing.JPanel kazanc_Panel;
    private javax.swing.JLabel maas_label;
    private javax.swing.JPanel persone_panel;
    private javax.swing.JLabel soyad_label;
    private javax.swing.JTextField surusPersoneli2Ad_textField;
    private javax.swing.JTextField surusPersoneli2Maas_textField;
    private javax.swing.JTextField surusPersoneli2Soyad_textField;
    private javax.swing.JLabel surusPersoneli2_label;
    private javax.swing.JTextField surusPersoneliAd_textField;
    private javax.swing.JTextField surusPersoneliMaas_textField;
    private javax.swing.JTextField surusPersoneliSoyad_textField;
    private javax.swing.JLabel surusPersoneli_label;
    private javax.swing.JTextField toplamKazanc_textField;
    private javax.swing.JComboBox<String> varısYeri_comboBox;
    private javax.swing.JLabel varısYeri_label;
    private javax.swing.JComboBox<String> yakitTipi_comboBox;
    private javax.swing.JLabel yakitTipi_label;
    // End of variables declaration//GEN-END:variables
    
    
    private Map<String, Map<String, Integer>> createDistances() {
        Map<String, Map<String, Integer>> distances = new HashMap<>();
        distances.put("Istanbul", createCityDistancesMap(0, 100, 500, 300, 600,225));
        distances.put("Kocaeli", createCityDistancesMap(100, 0, 400, 200, 500,75));
        distances.put("Ankara", createCityDistancesMap(500, 400, 0, 0, 0,225));
        distances.put("Eskisehir", createCityDistancesMap(300, 200, 0, 0, 300,75));
        distances.put("Konya", createCityDistancesMap(600, 500, 0, 300, 0,300));
        distances.put("Bilecik",createCityDistancesMap(225,75,225,75,300,0));
        return distances;
    }

    private Map<String, Integer> createCityDistancesMap(int istanbul, int kocaeli, int ankara, int eskisehir, int konya, int bilecik) {
        Map<String, Integer> cityDistances = new HashMap<>();
        cityDistances.put("Istanbul", istanbul);
        cityDistances.put("Kocaeli", kocaeli);
        cityDistances.put("Ankara", ankara);
        cityDistances.put("Eskisehir", eskisehir);
        cityDistances.put("Konya", konya);
        cityDistances.put("Bilecik",bilecik);
        return cityDistances;
    }
    
    private int getDistanceBetweenCities(String departure, String arrival) {

        if (this.distances.containsKey(departure)) {
            Map<String, Integer> departureDistances = this.distances.get(departure);
            if (departureDistances.containsKey(arrival)) {
                return departureDistances.get(arrival);
            } else {
                return -1; // or throw an exception, return a specific value, etc.
            }
        } else {
            return -1; // or throw an exception, return a specific value, etc.
        }
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
     private Map<String, Map<String, Integer>> createRoadDistances() {
        Map<String, Map<String, Integer>> distances = new HashMap<>();
        distances.put("Istanbul", createRoadDistancesMap(0, 50, 300, 150, 300));
        distances.put("Kocaeli", createRoadDistancesMap(50, 0, 400, 100, 250));
        distances.put("Ankara", createRoadDistancesMap(300, 400, 0, 0, 0));
        distances.put("Eskisehir", createRoadDistancesMap(150, 100, 0, 0, 150));
        distances.put("Konya", createRoadDistancesMap(300, 250, 0, 150, 0));
        return distances;
    }

    private Map<String, Map<String, Integer>> createRailDistances() {
        Map<String, Map<String, Integer>> distances = new HashMap<>();
        distances.put("Istanbul", createRailDistancesMap(0, 50, 150, 250, 200, 300));
        distances.put("Kocaeli", createRailDistancesMap(50, 0, 50, 200, 100, 250));
        distances.put("Bilecik", createRailDistancesMap(150, 50, 0, 150, 50, 200));
        distances.put("Ankara", createRailDistancesMap(250, 200, 150, 0, 100, 0));
        distances.put("Eskisehir", createRailDistancesMap(200, 100, 50, 100, 0, 150));
        distances.put("Konya", createRailDistancesMap(300, 250, 200, 0, 150, 0));
        return distances;
    }

    private Map<String, Map<String, Integer>> createAirDistances() {
        Map<String, Map<String, Integer>> distances = new HashMap<>();
        distances.put("Istanbul", createAirDistancesMap(0, 1000, 1200));
        distances.put("Ankara", createAirDistancesMap(1000, 0, 0));
        distances.put("Konya", createAirDistancesMap(1200, 0, 0));
        return distances;
    }

  
    private Map<String, Integer> createRailDistancesMap(int istanbul, int kocaeli, int ankara, int eskisehir, int konya, int bilecik) {
        Map<String, Integer> cityDistances = new HashMap<>();
        cityDistances.put("Istanbul", istanbul);
        cityDistances.put("Kocaeli", kocaeli);
        cityDistances.put("Ankara", ankara);
        cityDistances.put("Eskisehir", eskisehir);
        cityDistances.put("Konya", konya);
        cityDistances.put("Bilecik",bilecik);
        return cityDistances;
    }
    
    private Map<String, Integer> createAirDistancesMap(int istanbul, int ankara,  int konya ) {
        Map<String, Integer> cityDistances = new HashMap<>();
        cityDistances.put("Istanbul", istanbul);
        cityDistances.put("Ankara", ankara);
        cityDistances.put("Konya", konya);
        return cityDistances;
    }
    
    private Map<String, Integer> createRoadDistancesMap(int istanbul, int kocaeli, int ankara, int eskisehir, int konya) {
        Map<String, Integer> cityDistances = new HashMap<>();
        cityDistances.put("Istanbul", istanbul);
        cityDistances.put("Kocaeli", kocaeli);
        cityDistances.put("Ankara", ankara);
        cityDistances.put("Eskisehir", eskisehir);
        cityDistances.put("Konya", konya);
        return cityDistances;
    }
    
    public int getTicketPrice(String transportationType, String departureCity, String arrivalCity) {
        Map<String, Map<String, Integer>> distances;
        switch (transportationType) {
            case "Otobüs20":
                distances = roadTickets;
                break;
            case "Otobüs15":
                distances = roadTickets;
                break;
            case "Tren":
                distances = railTickets;
                break;
            case "Uçak":
                distances = airTickets;
                break;
            default:
                throw new IllegalArgumentException("Invalid transportation type.");
        }

        if (distances.containsKey(departureCity) && distances.get(departureCity).containsKey(arrivalCity)) {
            return distances.get(departureCity).get(arrivalCity);
        } else {
            throw new IllegalArgumentException("Invalid cities or no distance information available.");
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////7
    
    
    public void setTransport(Transport newTransport) {
        this.transport = newTransport;
    }
    public Transport getTransport(){return transport;};

}
