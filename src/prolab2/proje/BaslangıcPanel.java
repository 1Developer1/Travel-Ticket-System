package prolab2.proje;

import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class BaslangıcPanel extends javax.swing.JFrame {

    private AdminPanel adminPanel;
    private Admin admin;
    private Company company;
    static String ADMINUSERNAME="username";
    static String ADMINPASSWORD="password";
    private LoginPanel loginPanel;
    private FirmaPanel firmaPaneli;
    private KullanıcıPaneli kullanıcıPaneli;
    private Transport transport;
    private String username;
    private String password;
    private Map<String, FirmaPanel> firmaPanelleri = new HashMap<>();

    
 
    public BaslangıcPanel() {
        initComponents();
        
       
        loginPanel = new LoginPanel();
        adminPanel = new AdminPanel(ADMINUSERNAME,ADMINPASSWORD);
        this.admin=adminPanel.getAdmin();
       
        for (FirmaPanel firmaPanel : firmaPanelleri.values()) {
        firmaPanel.setTransport(transport);
        }
        transport = new Transport();
        
        List<Trip> trips = transport.getTrips();
        for (Trip trip : trips) {
                    System.out.println("TRİP GETDATE GÖSTER"+trip.getDate()); // Veya trip.getXXX() şeklinde, XXX, Trip sınıfının özelliklerini temsil eder.
                }        
        kullanıcıPaneli =new KullanıcıPaneli(transport);
                            
        adminGirisi_button.addActionListener((ActionEvent e) -> {
            adminGirisButtonActionPerformed(e);
        });

        firmaGirisi_button.addActionListener((ActionEvent e) -> {
            firmaGirisButtonActionPerformed(e);
        });
    }
    
    private void adminGirisButtonActionPerformed(ActionEvent event) {
        loginPanel.setVisible(true);
       
        loginPanel.getGirisButton().addActionListener((ActionEvent e) -> {
            // LoginPanel'den alınan kullanıcı adı ve şifreyi al
            String username = (String)loginPanel.getUsernameTextfield().getText();
            String password = (String)loginPanel.getPasswordTextfield().getText();
            System.out.println("++++++++++++++++++"+username+password);

            if (username.equals(ADMINUSERNAME) && password.equals(ADMINPASSWORD)) {
                // Kullanıcı adı ve şifre doğruysa AdminPanel'i aç
                loginPanel.setVisible(false);
                adminPanel.setVisible(true);
                
                

            } else {
                JOptionPane.showMessageDialog(this, "Admin girişi başarısız!");
            }
        });
    }
  
    private void firmaGirisButtonActionPerformed(ActionEvent event) {
        transport.printTripList();
        loginPanel.setVisible(true);
        System.out.println("---------------->" + admin.getFirmalar());
        loginPanel.getGirisButton().addActionListener((ActionEvent e) -> {

            this.username = (String) loginPanel.getUsernameTextfield().getText();
            this.password = (String) loginPanel.getPasswordTextfield().getText();
            System.out.println("++++++++++++++++++" + username + password);

            Company secilenFirma = admin.checkCredentials(username, password);

            if (secilenFirma != null) {
                FirmaPanel mevcutPanel = firmaPanelleri.get(username);

                if (mevcutPanel == null) {
                    FirmaPanel yeniFirmaPanel = new FirmaPanel(secilenFirma,transport);
                    firmaPanelleri.put(username, yeniFirmaPanel);
                    mevcutPanel = yeniFirmaPanel;
                }

                firmaPaneli = mevcutPanel;

                loginPanel.setVisible(false);
                mevcutPanel.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Firma girişi başarısız!");
            }
        });
    }
    
    public void ekranaBas() {
        for (Map.Entry<String, FirmaPanel> entry : firmaPanelleri.entrySet()) {
            String firmaAdi = entry.getKey();
            FirmaPanel firmaPanel = entry.getValue();
            
            Transport transport = firmaPanel.getTransport();
            
            
            System.out.println("Firma Adı: " + firmaAdi + ", Transport Bilgisi: ");
            transport.printTripList();
        }
    }
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminGirisi_button = new javax.swing.JButton();
        biletAra_button = new javax.swing.JButton();
        firmaGirisi_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminGirisi_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        adminGirisi_button.setText("ADMİN");

        biletAra_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        biletAra_button.setText("BİLET ARA");
        biletAra_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biletAra_buttonActionPerformed(evt);
            }
        });

        firmaGirisi_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        firmaGirisi_button.setText("FİRMA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminGirisi_button, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firmaGirisi_button, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(biletAra_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminGirisi_button, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(biletAra_button, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(firmaGirisi_button, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void biletAra_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biletAra_buttonActionPerformed
        transport.printTripList();
        kullanıcıPaneli= new KullanıcıPaneli(transport);
        kullanıcıPaneli.setVisible(true);
        ekranaBas();
    }//GEN-LAST:event_biletAra_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminGirisi_button;
    private javax.swing.JButton biletAra_button;
    private javax.swing.JButton firmaGirisi_button;
    // End of variables declaration//GEN-END:variables
}

