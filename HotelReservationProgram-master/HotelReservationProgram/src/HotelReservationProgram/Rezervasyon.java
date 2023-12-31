/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservationProgram;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Rezervasyon extends javax.swing.JFrame {
    static ArrayList<Otel> otellerim = new ArrayList();
    public Rezervasyon() {
        initComponents();
        Otel o1 = new Otel("Moon Otel", "İstanbul");
        o1.odalar.add(new Oda(1, "Tek Yataklı", false));
        o1.odalar.add(new Oda(2, "Tek Yataklı", false));
        o1.odalar.add(new Oda(3, "Çift Yataklı", false));
        o1.odalar.add(new Oda(4, "Çift Yataklı", false));
        o1.odalar.add(new Oda(5, "Tek Yataklı", false));
        otellerim.add(o1);
        Otel o2 = new Otel("Moonrise Otel", "İstanbul");
        o2.odalar.add(new Oda(1, "Tek Yataklı", false));
        o2.odalar.add(new Oda(2, "Çift Yataklı", false));
        o2.odalar.add(new Oda(3, "Tek Yataklı", false));
        o2.odalar.add(new Oda(4, "Tek Yataklı", false));
        otellerim.add(o2);
        Otel o3 = new Otel("Sun Otel", "Bursa");
        o3.odalar.add(new Oda(1, "Çift Yataklı", false));
        o3.odalar.add(new Oda(2, "Tek Yataklı", false));
        otellerim.add(o3);
        Otel o4 = new Otel("Sunrise Otel", "Antalya");
        o4.odalar.add(new Oda(1, "Çift Yataklı", false));
        otellerim.add(o4);
        Otel o5 = new Otel("Sky Otel", "İzmir");
        o5.odalar.add(new Oda(1, "Tek Yataklı", false));
        otellerim.add(o5);
        Otel o6 = new Otel("Cloud Otel", "Manisa");
        o6.odalar.add(new Oda(1, "Çift Yataklı", false));
        otellerim.add(o6);
    }
    String tarih(){
        int gün = Integer.parseInt((String)jComboBoxGün.getSelectedItem()), ay = jComboBoxAy.getSelectedIndex() + 1, yıl = Integer.parseInt((String)jComboBoxYıl.getSelectedItem());
        String tarih = "" + gün + "." + ay + "." + yıl + " - " + (gün + Integer.parseInt(jTextFieldGünSayısı.getText())) + "." + ay + "." + yıl;
        return tarih;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabelTarih = new javax.swing.JLabel();
        jComboBoxGün = new javax.swing.JComboBox<>();
        jComboBoxAy = new javax.swing.JComboBox<>();
        jComboBoxYıl = new javax.swing.JComboBox<>();
        jLabelGünSayısı = new javax.swing.JLabel();
        jTextFieldGünSayısı = new javax.swing.JTextField();
        jLabelŞehir = new javax.swing.JLabel();
        jComboBoxŞehirler = new javax.swing.JComboBox<>();
        jButtonOtelleriGörüntüle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabelTarih.setText("Tarih:");
        jComboBoxGün.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxGün.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGünActionPerformed(evt);
            }
        });
        jComboBoxAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık" }));
        jComboBoxYıl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027" }));
        jLabelGünSayısı.setText("Gün Sayısı:");
        jLabelŞehir.setText("Şehir:");
        jComboBoxŞehirler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İstanbul", "Bursa", "Antalya", "İzmir", "Manisa" }));
        jButtonOtelleriGörüntüle.setText("Otelleri Görüntüle");
        jButtonOtelleriGörüntüle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOtelleriGörüntüleActionPerformed(evt);
            }
        });
        jLabel1.setText("Günlük 500TL");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonOtelleriGörüntüle)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBoxGün, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jComboBoxAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jComboBoxYıl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelGünSayısı)
                                .addComponent(jLabelŞehir))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextFieldGünSayısı, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(jLabel1))
                                .addComponent(jComboBoxŞehirler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTarih)
                    .addComponent(jComboBoxGün, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxYıl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGünSayısı)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldGünSayısı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelŞehir)
                    .addComponent(jComboBoxŞehirler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButtonOtelleriGörüntüle)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jComboBoxGünActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGünActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGünActionPerformed
    private void jButtonOtelleriGörüntüleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOtelleriGörüntüleActionPerformed
        if(jTextFieldGünSayısı.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Lütfen gün sayısıbelirtin!", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Oteller oteller = AnaSayfa.oteller;
        for (Otel o : otellerim) {
            if (jComboBoxŞehirler.getSelectedItem() == o.şehir) {
                oteller.dcm.addElement(o);
            }
        }
        AnaSayfa.sistemdekiKişi.odayıTuttuğuTarihlerarası = tarih();
        AnaSayfa.sistemdekiKişi.fatura += Integer.parseInt(jTextFieldGünSayısı.getText()) * 200;
        System.out.println("tarih aralığı: " + AnaSayfa.sistemdekiKişi.odayıTuttuğuTarihlerarası);
        oteller.setVisible(true);
    }//GEN-LAST:event_jButtonOtelleriGörüntüleActionPerformed
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
            java.util.logging.Logger.getLogger(Rezervasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rezervasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rezervasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rezervasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rezervasyon().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOtelleriGörüntüle;
    private javax.swing.JComboBox<String> jComboBoxAy;
    private javax.swing.JComboBox<String> jComboBoxGün;
    private javax.swing.JComboBox<String> jComboBoxYıl;
    private javax.swing.JComboBox<String> jComboBoxŞehirler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelGünSayısı;
    private javax.swing.JLabel jLabelTarih;
    private javax.swing.JLabel jLabelŞehir;
    private javax.swing.JTextField jTextFieldGünSayısı;
    // End of variables declaration//GEN-END:variables
}
