package prolab2.proje;

import java.util.HashMap;
import java.util.Map;
import javax.swing.*;


public class AdminPanel extends javax.swing.JFrame {

    private JButton firmaEkleButton;
    private JButton firmaSilButton;
    private JButton goruntuleButton;
    private Map<String, Company> firms;
    private Admin admin;
  
    
    public AdminPanel(String username,String password) {
        admin = new Admin(username, password);
        this.firms = new HashMap<>();
        initComponents();

    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        firmaEkle_panel = new javax.swing.JPanel();
        firmaEkle_label = new javax.swing.JLabel();
        kullaniciAdi_label = new javax.swing.JLabel();
        sifre_label = new javax.swing.JLabel();
        kullaniciAdi_textField = new javax.swing.JTextField();
        sifre_textField = new javax.swing.JTextField();
        firmaEkle_button = new javax.swing.JButton();
        adminPanel_label = new javax.swing.JLabel();
        firmalar_panel = new javax.swing.JPanel();
        firmalar_scrollPane = new javax.swing.JScrollPane();
        firmalar_liste = new javax.swing.JList<>();
        goruntule_button = new javax.swing.JButton();
        firmaSil_button = new javax.swing.JButton();
        firmalar_label = new javax.swing.JLabel();
        hizmetBedeli_panel = new javax.swing.JPanel();
        hizmetBedeli_label = new javax.swing.JLabel();
        degistir_button = new javax.swing.JButton();
        hizmetBedeli_textField = new javax.swing.JTextField();
        hizmetBedeliDegistir_textField = new javax.swing.JTextField();
        cıkıs_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        firmaEkle_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        firmaEkle_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        firmaEkle_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firmaEkle_label.setText("Firma Ekle");

        kullaniciAdi_label.setText("Kullanıcı Adı:");

        sifre_label.setText("Şifre:");

        kullaniciAdi_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciAdi_textFieldActionPerformed(evt);
            }
        });

        sifre_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifre_textFieldActionPerformed(evt);
            }
        });

        firmaEkle_button.setText("EKLE");
        firmaEkle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmaEkle_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout firmaEkle_panelLayout = new javax.swing.GroupLayout(firmaEkle_panel);
        firmaEkle_panel.setLayout(firmaEkle_panelLayout);
        firmaEkle_panelLayout.setHorizontalGroup(
            firmaEkle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firmaEkle_panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(firmaEkle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(firmaEkle_panelLayout.createSequentialGroup()
                        .addComponent(sifre_label, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sifre_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                    .addGroup(firmaEkle_panelLayout.createSequentialGroup()
                        .addComponent(kullaniciAdi_label, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kullaniciAdi_textField))
                    .addComponent(firmaEkle_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firmaEkle_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        firmaEkle_panelLayout.setVerticalGroup(
            firmaEkle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firmaEkle_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firmaEkle_label)
                .addGap(18, 18, 18)
                .addGroup(firmaEkle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullaniciAdi_label)
                    .addComponent(kullaniciAdi_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(firmaEkle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifre_label)
                    .addComponent(sifre_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firmaEkle_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adminPanel_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminPanel_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminPanel_label.setText("ADMİN PANEL");

        firmalar_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        firmalar_scrollPane.setViewportView(firmalar_liste);

        goruntule_button.setText("Görüntüle");
        goruntule_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goruntule_buttonActionPerformed(evt);
            }
        });

        firmaSil_button.setText("Firma Sil");
        firmaSil_button.setToolTipText("");
        firmaSil_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmaSil_buttonActionPerformed(evt);
            }
        });

        firmalar_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        firmalar_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firmalar_label.setText("Firmalar");

        javax.swing.GroupLayout firmalar_panelLayout = new javax.swing.GroupLayout(firmalar_panel);
        firmalar_panel.setLayout(firmalar_panelLayout);
        firmalar_panelLayout.setHorizontalGroup(
            firmalar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firmalar_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firmalar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(firmalar_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(firmalar_panelLayout.createSequentialGroup()
                        .addComponent(firmalar_scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(firmalar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(goruntule_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firmaSil_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        firmalar_panelLayout.setVerticalGroup(
            firmalar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firmalar_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firmalar_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(firmalar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firmalar_panelLayout.createSequentialGroup()
                        .addComponent(goruntule_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firmaSil_button))
                    .addComponent(firmalar_scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        hizmetBedeli_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        hizmetBedeli_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hizmetBedeli_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hizmetBedeli_label.setText("Hizmet Bedeli");

        degistir_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        degistir_button.setText("Değiştir");
        degistir_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degistir_buttonActionPerformed(evt);
            }
        });

        hizmetBedeli_textField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hizmetBedeli_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hizmetBedeli_textFieldActionPerformed(evt);
            }
        });

        hizmetBedeliDegistir_textField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hizmetBedeliDegistir_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hizmetBedeliDegistir_textFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hizmetBedeli_panelLayout = new javax.swing.GroupLayout(hizmetBedeli_panel);
        hizmetBedeli_panel.setLayout(hizmetBedeli_panelLayout);
        hizmetBedeli_panelLayout.setHorizontalGroup(
            hizmetBedeli_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hizmetBedeli_panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(hizmetBedeli_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(hizmetBedeli_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(degistir_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(hizmetBedeli_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hizmetBedeli_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hizmetBedeliDegistir_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        hizmetBedeli_panelLayout.setVerticalGroup(
            hizmetBedeli_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hizmetBedeli_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hizmetBedeli_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hizmetBedeli_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hizmetBedeli_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hizmetBedeliDegistir_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(degistir_button)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        cıkıs_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cıkıs_button.setText("ÇIKIŞ");
        cıkıs_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cıkıs_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firmalar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cıkıs_button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firmaEkle_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hizmetBedeli_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(adminPanel_label, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(adminPanel_label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firmaEkle_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hizmetBedeli_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firmalar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cıkıs_button)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sifre_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifre_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifre_textFieldActionPerformed

    private void kullaniciAdi_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciAdi_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullaniciAdi_textFieldActionPerformed

    private void firmaEkle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmaEkle_buttonActionPerformed
        String firmaAdi = JOptionPane.showInputDialog("Enter company name:");
        String kullaniciAdi = kullaniciAdi_textField.getText();
        String sifre = sifre_textField.getText();

        // Add new firm to Admin's firms map
        admin.addFirma(firmaAdi, kullaniciAdi, sifre);

        // Update firmalar_liste in the UI
        updateFirmalarListe();    }//GEN-LAST:event_firmaEkle_buttonActionPerformed

    private void firmaSil_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmaSil_buttonActionPerformed
        // Get selected firm from the list
        String selectedFirma = firmalar_liste.getSelectedValue();

        // Remove the selected firm from Admin's firms map
        admin.removeFirma(selectedFirma);

        // Update firmalar_liste in the UI
        updateFirmalarListe();    }//GEN-LAST:event_firmaSil_buttonActionPerformed

    private void goruntule_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goruntule_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goruntule_buttonActionPerformed

    private void cıkıs_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cıkıs_buttonActionPerformed
            dispose();    }//GEN-LAST:event_cıkıs_buttonActionPerformed

    private void hizmetBedeli_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hizmetBedeli_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hizmetBedeli_textFieldActionPerformed

    private void degistir_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degistir_buttonActionPerformed
            String hizmetBedeliDegistirText = hizmetBedeliDegistir_textField.getText();
            int hizmetBedeliDegistirInt = Integer.parseInt(hizmetBedeliDegistirText);
            admin.setHizmetBedeli(hizmetBedeliDegistirInt);
            hizmetBedeli_textField.setText(hizmetBedeliDegistirText);
    }//GEN-LAST:event_degistir_buttonActionPerformed

    private void hizmetBedeliDegistir_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hizmetBedeliDegistir_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hizmetBedeliDegistir_textFieldActionPerformed

    
    private void updateFirmalarListe() {
        // Update the firmalar_liste in the UI with the latest firm names
        DefaultListModel<String> firmalarListModel = new DefaultListModel<>();

        // Assuming getFirms() returns a String
        String firmalarString = admin.getFirms();
        String[] firmaAdlari = firmalarString.split("\n");

        for (String firmaAdi : firmaAdlari) {
            firmalarListModel.addElement(firmaAdi);
        }

        firmalar_liste.setModel(firmalarListModel);
    }
    
    public JButton getFirmaEkleButton() {
        return firmaEkleButton;
    }

    public JButton getFirmaSilButton() {
        return firmaSilButton;
    }

    public JButton getGoruntuleButton() {
        return goruntuleButton;
    }
    public JButton getDegistirButton() {
        return degistir_button;
    }
    public Admin getAdmin(){return admin;}
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminPanel_label;
    private javax.swing.JButton cıkıs_button;
    private javax.swing.JButton degistir_button;
    private javax.swing.JButton firmaEkle_button;
    private javax.swing.JLabel firmaEkle_label;
    private javax.swing.JPanel firmaEkle_panel;
    private javax.swing.JButton firmaSil_button;
    private javax.swing.JLabel firmalar_label;
    private javax.swing.JList<String> firmalar_liste;
    private javax.swing.JPanel firmalar_panel;
    private javax.swing.JScrollPane firmalar_scrollPane;
    private javax.swing.JButton goruntule_button;
    private javax.swing.JTextField hizmetBedeliDegistir_textField;
    private javax.swing.JLabel hizmetBedeli_label;
    private javax.swing.JPanel hizmetBedeli_panel;
    private javax.swing.JTextField hizmetBedeli_textField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kullaniciAdi_label;
    private javax.swing.JTextField kullaniciAdi_textField;
    private javax.swing.JLabel sifre_label;
    private javax.swing.JTextField sifre_textField;
    // End of variables declaration//GEN-END:variables
     // AdminPanel sınıfına yeni metodlar ekle
    public String getKullaniciAdi() {
        return kullaniciAdi_textField.getText();
    }

    public String getSifre() {
        return sifre_textField.getText();
    }
    public javax.swing.JList<String> getFirmalarListe() {
        return firmalar_liste;
    }   
    public String getHizmetBedeli(){
        return hizmetBedeli_textField.getText();
    }

}
