package prolab2.proje;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KullanıcıPaneli extends javax.swing.JFrame {
    private Transport transport;
    private OdemeYap odemeYap;
    
    public KullanıcıPaneli(Transport transport) {
        this.transport=transport;
        initComponents();
        seferTablosu_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seferTablosu_tableMouseClicked(evt);
            }
        });
        this.odemeYap=new OdemeYap();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anaPanel_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        seferTablosu_table = new javax.swing.JTable();
        listele_button = new javax.swing.JButton();
        yolcuSayisi_panel = new javax.swing.JPanel();
        yolcuSayisi_label = new javax.swing.JLabel();
        arttır_button = new javax.swing.JButton();
        azalt_button = new javax.swing.JButton();
        yolcuSayisi_textBox = new javax.swing.JTextField();
        guzergah_panel = new javax.swing.JPanel();
        kalkısNoktası_label = new javax.swing.JLabel();
        varısNoktası_label = new javax.swing.JLabel();
        kalkısNoktası_comboBox = new javax.swing.JComboBox<>();
        varısNoktası_comboBox = new javax.swing.JComboBox<>();
        yolculukTarihi_label = new javax.swing.JLabel();
        yolculukTarihi_comboBox = new javax.swing.JComboBox<>();
        odemeYap_button = new javax.swing.JButton();
        cıkıs_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        anaPanel_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seferTablosu_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Araç Türü", "Kalkış", "Varış", "Kapasite", "Tarih", "Fiyat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(seferTablosu_table);

        listele_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listele_button.setText("SEFER BUL");
        listele_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listele_buttonActionPerformed(evt);
            }
        });

        yolcuSayisi_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        yolcuSayisi_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        yolcuSayisi_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yolcuSayisi_label.setText("Yolcu Sayısı");

        arttır_button.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        arttır_button.setText("+");
        arttır_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arttır_buttonActionPerformed(evt);
            }
        });

        azalt_button.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        azalt_button.setText("-");
        azalt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azalt_buttonActionPerformed(evt);
            }
        });

        yolcuSayisi_textBox.setText("0");
        yolcuSayisi_textBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yolcuSayisi_textBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout yolcuSayisi_panelLayout = new javax.swing.GroupLayout(yolcuSayisi_panel);
        yolcuSayisi_panel.setLayout(yolcuSayisi_panelLayout);
        yolcuSayisi_panelLayout.setHorizontalGroup(
            yolcuSayisi_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yolcuSayisi_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(yolcuSayisi_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yolcuSayisi_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(yolcuSayisi_panelLayout.createSequentialGroup()
                        .addGroup(yolcuSayisi_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arttır_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(azalt_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yolcuSayisi_textBox, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                .addContainerGap())
        );
        yolcuSayisi_panelLayout.setVerticalGroup(
            yolcuSayisi_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yolcuSayisi_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yolcuSayisi_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(yolcuSayisi_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(yolcuSayisi_panelLayout.createSequentialGroup()
                        .addComponent(arttır_button, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(azalt_button, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(yolcuSayisi_textBox)))
        );

        guzergah_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        kalkısNoktası_label.setText("Kalkış Noktası:");

        varısNoktası_label.setText("Varış Noktası:");

        kalkısNoktası_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kalkış Noktası", "Kocaeli", "Istanbul", "Eskisehir", "Ankara", "Konya", "Bilecik" }));
        kalkısNoktası_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalkısNoktası_comboBoxActionPerformed(evt);
            }
        });

        varısNoktası_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Varış Noktası", "Kocaeli", "Istanbul", "Eskisehir", "Ankara", "Konya", "Bilecik" }));

        javax.swing.GroupLayout guzergah_panelLayout = new javax.swing.GroupLayout(guzergah_panel);
        guzergah_panel.setLayout(guzergah_panelLayout);
        guzergah_panelLayout.setHorizontalGroup(
            guzergah_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guzergah_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guzergah_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guzergah_panelLayout.createSequentialGroup()
                        .addComponent(varısNoktası_label, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varısNoktası_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(guzergah_panelLayout.createSequentialGroup()
                        .addComponent(kalkısNoktası_label, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kalkısNoktası_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        guzergah_panelLayout.setVerticalGroup(
            guzergah_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guzergah_panelLayout.createSequentialGroup()
                .addGroup(guzergah_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kalkısNoktası_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kalkısNoktası_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(guzergah_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varısNoktası_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varısNoktası_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        yolculukTarihi_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        yolculukTarihi_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yolculukTarihi_label.setText("Yolculuk Tarihi");

        yolculukTarihi_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yolculuk Tarihi", "04/12/2023", "05/12/2023", "06/12/2023", "07/12/2023", "08/12/2023", "09/12/2023", "10/12/2023", "11/12/2023", " ", " " }));

        odemeYap_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        odemeYap_button.setText("BİLET AL");
        odemeYap_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemeYap_buttonActionPerformed(evt);
            }
        });

        cıkıs_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cıkıs_button.setText("ÇIKIŞ");
        cıkıs_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cıkıs_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout anaPanel_panelLayout = new javax.swing.GroupLayout(anaPanel_panel);
        anaPanel_panel.setLayout(anaPanel_panelLayout);
        anaPanel_panelLayout.setHorizontalGroup(
            anaPanel_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anaPanel_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(anaPanel_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(anaPanel_panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(anaPanel_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listele_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yolcuSayisi_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yolculukTarihi_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yolculukTarihi_comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(odemeYap_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(anaPanel_panelLayout.createSequentialGroup()
                        .addComponent(guzergah_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cıkıs_button, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        anaPanel_panelLayout.setVerticalGroup(
            anaPanel_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anaPanel_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(anaPanel_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guzergah_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cıkıs_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(anaPanel_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(anaPanel_panelLayout.createSequentialGroup()
                        .addComponent(listele_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(odemeYap_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yolculukTarihi_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yolculukTarihi_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(yolcuSayisi_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(anaPanel_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(anaPanel_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kalkısNoktası_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalkısNoktası_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kalkısNoktası_comboBoxActionPerformed

    private void listele_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listele_buttonActionPerformed
                String selectedKalkisNoktasi = (String) kalkısNoktası_comboBox.getSelectedItem();
                String selectedVarisNoktasi = (String) varısNoktası_comboBox.getSelectedItem();
                String selectedYolculukTarihi = (String) yolculukTarihi_comboBox.getSelectedItem();

                List<Trip> filteredTrips = filterTrips(selectedKalkisNoktasi, selectedVarisNoktasi, selectedYolculukTarihi);

                updateSeferTablosu(filteredTrips);
    }//GEN-LAST:event_listele_buttonActionPerformed
      private void updateSeferTablosu(List<Trip> trips) {
        DefaultTableModel model = (DefaultTableModel) seferTablosu_table.getModel();
        model.setRowCount(0); 

        for (Trip trip : trips) {
            Object[] row = {
                trip.getVehicle().getVehicleId(),
                trip.getRoute().getDeparturePoint(),
                trip.getRoute().getArrivalPoint(),
                trip.getVehicle().getCapacity(),
                trip.getDate(),
                trip.getPrice()
            };
            model.addRow(row);
       
        }
    }

    private List<Trip> filterTrips(String kalkisNoktasi, String varisNoktasi, String yolculukTarihi) {
        List<Trip> allTrips = transport.getTrips();
        List<Trip> filteredTrips = new ArrayList<>();

        for (Trip trip : allTrips) {
            boolean kalkisMatch = "Kalkış Noktası".equals(kalkisNoktasi) || kalkisNoktasi.equals(trip.getRoute().getDeparturePoint());
            boolean varisMatch = "Varış Noktası".equals(varisNoktasi) || varisNoktasi.equals(trip.getRoute().getArrivalPoint());
            boolean tarihMatch = "Yolculuk Tarihi".equals(yolculukTarihi) || yolculukTarihi.equals(trip.getDate());

        
            if (kalkisMatch && varisMatch && tarihMatch) {
                filteredTrips.add(trip);
            }
        }

        return filteredTrips;
    }
    
    private Trip selectedTrip; 
    
    private void seferTablosu_tableMouseClicked(java.awt.event.MouseEvent evt) {
    int selectedRow = seferTablosu_table.getSelectedRow();

    if (selectedRow != -1) {
        selectedTrip = transport.getTrips().get(selectedRow);
    }
    }
    
    private void yolcuSayisi_textBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yolcuSayisi_textBoxActionPerformed
    }//GEN-LAST:event_yolcuSayisi_textBoxActionPerformed

    private void arttır_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arttır_buttonActionPerformed
        int currentYolcuSayisi = Integer.parseInt(yolcuSayisi_textBox.getText());
        currentYolcuSayisi++;
        yolcuSayisi_textBox.setText(String.valueOf(currentYolcuSayisi));
      
    }//GEN-LAST:event_arttır_buttonActionPerformed

    private void azalt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azalt_buttonActionPerformed
       int currentYolcuSayisi = Integer.parseInt(yolcuSayisi_textBox.getText());
        if (currentYolcuSayisi > 0) {
            currentYolcuSayisi--;
            yolcuSayisi_textBox.setText(String.valueOf(currentYolcuSayisi));
        }
    }//GEN-LAST:event_azalt_buttonActionPerformed

    private void odemeYap_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemeYap_buttonActionPerformed
    int yolcuSayisi = Integer.parseInt(yolcuSayisi_textBox.getText());

    
    int capacity = 0;
        if (selectedTrip != null) {
            capacity=selectedTrip.getVehicle().getCapacity();
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen bir sefer seçiniz.");
    }

    switch (capacity) {
        case 15:
              {
            selectedTrip.getVehicle().getSeatMap();
            Otobus15 otobus15=new Otobus15(selectedTrip.getVehicle().getSeatMap(),yolcuSayisi);
            otobus15.setVisible(true);           
            };
            break;
        case 20:
             {
            Otobus20 otobus20=new Otobus20(selectedTrip.getVehicle().getSeatMap(),yolcuSayisi);
            otobus20.setVisible(true);     
            };
            break;
        case 25:
             {
            Tren tren= new Tren(selectedTrip.getVehicle().getSeatMap(),yolcuSayisi);
            tren.setVisible(true);
             };
            break;
        case 30:
             {
            Ucak ucak= new Ucak(selectedTrip.getVehicle().getSeatMap(),yolcuSayisi);
            ucak.setVisible(true);    
            };
            break;
        default:
            break;
    }
        
    }//GEN-LAST:event_odemeYap_buttonActionPerformed
    
    private void cıkıs_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cıkıs_buttonActionPerformed
               dispose();
    }//GEN-LAST:event_cıkıs_buttonActionPerformed


   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel anaPanel_panel;
    private javax.swing.JButton arttır_button;
    private javax.swing.JButton azalt_button;
    private javax.swing.JButton cıkıs_button;
    private javax.swing.JPanel guzergah_panel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kalkısNoktası_comboBox;
    private javax.swing.JLabel kalkısNoktası_label;
    private javax.swing.JButton listele_button;
    private javax.swing.JButton odemeYap_button;
    private javax.swing.JTable seferTablosu_table;
    private javax.swing.JComboBox<String> varısNoktası_comboBox;
    private javax.swing.JLabel varısNoktası_label;
    private javax.swing.JLabel yolcuSayisi_label;
    private javax.swing.JPanel yolcuSayisi_panel;
    private javax.swing.JTextField yolcuSayisi_textBox;
    private javax.swing.JComboBox<String> yolculukTarihi_comboBox;
    private javax.swing.JLabel yolculukTarihi_label;
    // End of variables declaration//GEN-END:variables


}


