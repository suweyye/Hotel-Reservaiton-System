/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservationProgram;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class YöneticiSayfası extends javax.swing.JFrame {
    DefaultComboBoxModel dcm = new DefaultComboBoxModel();
    DefaultComboBoxModel dcm2 = new DefaultComboBoxModel();
    DefaultTableModel dtm = new DefaultTableModel();
    DefaultTableModel dtm2 = new DefaultTableModel();
    public YöneticiSayfası() {
        initComponents();
        jComboBoxOteller.setModel(dcm);
        jComboBoxOdaTipi.setModel(dcm2);
        dcm2.addElement("Tek Yataklı");
        dcm2.addElement("Çift Yataklı");
        dtm.setColumnIdentifiers(new String[]{"Oda No", "Oda Tipi", "Durumu"});
        jTableOdalar.setModel(dtm);
        dtm2.setColumnIdentifiers(new String[]{"Ad", "Soyad", "Tel", "Email", "Yaş", "TC", "Cinsiyet", "Kaldığı Otel", "Oda No", "Tarih Aralığı", "Aldığı Hizmetler", "Faturası"});
        jTableMüşteriler.setModel(dtm2);
        for (Otel otel : Rezervasyon.otellerim) {
            dcm.addElement(otel);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxOteller = new javax.swing.JComboBox<>();
        jLabelOteller = new javax.swing.JLabel();
        jButtonSorgula = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOdalar = new javax.swing.JTable();
        jButtonSil = new javax.swing.JButton();
        jButtonEkle = new javax.swing.JButton();
        jLabelOdaNo = new javax.swing.JLabel();
        jTextFieldOdaNo = new javax.swing.JTextField();
        jLabelOdaTipi = new javax.swing.JLabel();
        jComboBoxOdaTipi = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMüşteriler = new javax.swing.JTable();
        jButtonSilMüşteri = new javax.swing.JButton();
        jButtonTümünüGöster = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxOteller.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelOteller.setText("Oteller:");

        jButtonSorgula.setText("Sorgula");
        jButtonSorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSorgulaActionPerformed(evt);
            }
        });

        jTableOdalar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableOdalar);

        jButtonSil.setText("Sil");
        jButtonSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSilActionPerformed(evt);
            }
        });

        jButtonEkle.setText("Ekle");
        jButtonEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEkleActionPerformed(evt);
            }
        });

        jLabelOdaNo.setText("Oda No:");

        jLabelOdaTipi.setText("Oda Tipi:");

        jComboBoxOdaTipi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOteller, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelOdaNo)
                            .addComponent(jLabelOdaTipi))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldOdaNo)
                            .addComponent(jComboBoxOteller, 0, 84, Short.MAX_VALUE)
                            .addComponent(jComboBoxOdaTipi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSorgula)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSil, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(708, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOteller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSorgula)
                    .addComponent(jLabelOteller)
                    .addComponent(jButtonEkle))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOdaNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOdaNo)
                    .addComponent(jButtonSil))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOdaTipi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOdaTipi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Odalar", jPanel1);

        jTableMüşteriler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableMüşteriler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMüşterilerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableMüşteriler);

        jButtonSilMüşteri.setText("Sil");
        jButtonSilMüşteri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSilMüşteriActionPerformed(evt);
            }
        });

        jButtonTümünüGöster.setText("Tümünü Göster");
        jButtonTümünüGöster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTümünüGösterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonTümünüGöster, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jButtonSilMüşteri, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSilMüşteri)
                    .addComponent(jButtonTümünüGöster))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Müşteriler", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonSorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSorgulaActionPerformed
        dtm.setRowCount(0);
        for (Otel otel : Rezervasyon.otellerim) {
            if (otel.ad.equals(((Otel) jComboBoxOteller.getSelectedItem()).ad)) {
                for (Oda oda : otel.odalar) {
                    dtm.addRow(new Object[]{oda.odaNo, oda.odaTipi, oda.rezerveEdilmişMi});
                }
                break;
            }
        }
    }//GEN-LAST:event_jButtonSorgulaActionPerformed
    private void jButtonSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSilActionPerformed
        if (jTableOdalar.getSelectedRow() == -1) {
            return;
        }
        String[] seçimler = {"Evet", "Hayır"};
        int seçim = JOptionPane.showOptionDialog(this, "Bu odayı silmek istediğinize emin misiniz!", "Uyarı!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, seçimler, seçimler[0]);
        if (seçim == 0) {
            int odaNo = (Integer) jTableOdalar.getValueAt(jTableOdalar.getSelectedRow(), 0);
            for (Otel otel : Rezervasyon.otellerim) {
                if (otel.ad.equals(((Otel) jComboBoxOteller.getSelectedItem()).ad)) {
                    for (Oda oda : otel.odalar) {
                        if (oda.odaNo == (Integer) jTableOdalar.getValueAt(jTableOdalar.getSelectedRow(), 0)) {
                            if (oda.rezerveEdilmişMi == true) {
                                JOptionPane.showMessageDialog(this, "Rezerve edilmiş oda silinemez!", "Uyarı!", JOptionPane.WARNING_MESSAGE);}
                            else {
                                otel.odalar.remove(oda);
                                dtm.removeRow(jTableOdalar.getSelectedRow());
                                break;
                            }
                        }
                    }
                }
            }
            return;
        } else if(seçim == 1){
            JOptionPane.showMessageDialog(this, "İşlem iptal edilmiştir!", "Uyarı!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSilActionPerformed
    private void jButtonEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEkleActionPerformed
        int odaNo = Integer.parseInt(jTextFieldOdaNo.getText());
        String mesaj = "Bu otelde zaten " + odaNo + " numarada bir oda var.\nLütfen başka bir numara veriniz!";
        for (Oda oda : ((Otel) jComboBoxOteller.getSelectedItem()).odalar) {
            if (oda.odaNo == odaNo) {
                JOptionPane.showMessageDialog(this, mesaj, "Uyarı!", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        Oda oda = new Oda(Integer.parseInt(jTextFieldOdaNo.getText()), (String) jComboBoxOdaTipi.getSelectedItem(), false);
        ((Otel) jComboBoxOteller.getSelectedItem()).odalar.add(oda);
        dtm.addRow(new Object[]{oda.odaNo, oda.odaTipi, oda.rezerveEdilmişMi});
    }//GEN-LAST:event_jButtonEkleActionPerformed
    private void jButtonTümünüGösterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTümünüGösterActionPerformed
        dtm2.setRowCount(0);
        for (Kullanıcı k : AnaSayfa.müşteriler) {
            if (!k.müşteriBilgileriBoşMu()) {
                dtm2.addRow(new Object[]{k.ad, k.soyad, k.tel, k.email, k.yaş, k.tc, k.cinsiyet, k.otel, k.oda.odaNo, k.odayıTuttuğuTarihlerarası, k.aldığıHizmetler, k.fatura});
            }
        }
    }//GEN-LAST:event_jButtonTümünüGösterActionPerformed
    private void jButtonSilMüşteriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSilMüşteriActionPerformed
        if (jTableMüşteriler.getSelectedRow() == -1) {
            return;
        }
        String[] seçimler = {"Evet", "Hayır"};
        int seçim = JOptionPane.showOptionDialog(this, "Bu müşteriyi silmek istediğinize emin misiniz!", "Uyarı!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, seçimler, seçimler[0]);
        if(seçim == 0){
            for (Kullanıcı k : AnaSayfa.müşteriler) {
                String tc = (String) jTableMüşteriler.getValueAt(jTableMüşteriler.getSelectedRow(), 5);
                if (tc.equals(k.tc)) {
                    k.oda.rezerveEdilmişMi = false;
                    AnaSayfa.müşteriler.remove(k);
                    break;
                }
            }
            dtm2.removeRow(jTableMüşteriler.getSelectedRow());
            JOptionPane.showMessageDialog(this, "İşleminiz tamamlanmıştır!", "Bilgilendirme!", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else if(seçim == 1){
            JOptionPane.showMessageDialog(this, "İşleminiz iptal edilmiştir!", "Uyarı!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSilMüşteriActionPerformed
    private void jTableMüşterilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMüşterilerMouseClicked
    }//GEN-LAST:event_jTableMüşterilerMouseClicked
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
            java.util.logging.Logger.getLogger(YöneticiSayfası.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YöneticiSayfası.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YöneticiSayfası.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YöneticiSayfası.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YöneticiSayfası().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonEkle;
    private javax.swing.JButton jButtonSil;
    private javax.swing.JButton jButtonSilMüşteri;
    private javax.swing.JButton jButtonSorgula;
    private javax.swing.JButton jButtonTümünüGöster;
    private javax.swing.JComboBox<String> jComboBoxOdaTipi;
    private javax.swing.JComboBox<String> jComboBoxOteller;
    private javax.swing.JLabel jLabelOdaNo;
    private javax.swing.JLabel jLabelOdaTipi;
    private javax.swing.JLabel jLabelOteller;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableMüşteriler;
    private javax.swing.JTable jTableOdalar;
    private javax.swing.JTextField jTextFieldOdaNo;
    // End of variables declaration//GEN-END:variables
}
