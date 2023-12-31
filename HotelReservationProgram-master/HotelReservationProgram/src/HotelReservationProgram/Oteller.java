/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservationProgram;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Oteller extends javax.swing.JFrame {
    DefaultTableModel dtm = new DefaultTableModel();
    DefaultComboBoxModel dcm = new DefaultComboBoxModel();
    DefaultListModel dlm = new DefaultListModel();
    ArrayList<Otel> oteller = new ArrayList();
    public Oteller() {
        initComponents();
        dtm.setColumnIdentifiers(new String[]{"Oda No", "Oda Tipi", "Durumu"});
        jTableOdalar.setModel(dtm);
        jComboBoxOteller.setModel(dcm);
        dlm.addElement("Kahvaltı");
        dlm.addElement("Öğle Yemeği");
        dlm.addElement("Akşam Yemeği");
        dlm.addElement("Disco");
        dlm.addElement("Oda Servisi");
        dlm.addElement("Gece Etkinlikleri");
        jListHizmetler.setModel(dlm);
        oteller = Rezervasyon.otellerim;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelOteller = new javax.swing.JLabel();
        jComboBoxOteller = new javax.swing.JComboBox<>();
        jButtonSorgula = new javax.swing.JButton();
        jButtonRezerveEt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOdalar = new javax.swing.JTable();
        jLabelOdalar = new javax.swing.JLabel();
        jLabelHizmetler = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListHizmetler = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelOteller.setText("Oteller:");

        jButtonSorgula.setText("Sorgula");
        jButtonSorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSorgulaActionPerformed(evt);
            }
        });

        jButtonRezerveEt.setText("Rezerve Et");
        jButtonRezerveEt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRezerveEtActionPerformed(evt);
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

        jLabelOdalar.setText("Odalar:");

        jLabelHizmetler.setText("Hizmetler:");

        jScrollPane2.setViewportView(jListHizmetler);

        jLabel1.setText("Alınan her hizmet");

        jLabel2.setText("100 TL'dir!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelOteller, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxOteller, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSorgula))
                    .addComponent(jLabelOdalar))
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHizmetler)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRezerveEt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOteller)
                    .addComponent(jComboBoxOteller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSorgula))
                .addGap(29, 29, 29)
                .addComponent(jLabelOdalar)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHizmetler)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRezerveEt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonRezerveEtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRezerveEtActionPerformed
        if (jTableOdalar.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen bir oda seçiniz!", "Uyarı!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Otel seçilenOtel = null;
        Oda seçilenOda = null;
        int fatura = 0;
        ArrayList<String> seçilenHizmetler = new ArrayList();
        for (Otel otel : oteller) {
            if (((Otel) jComboBoxOteller.getSelectedItem()).ad.equals(otel.ad)) {
                int odaNo = (Integer) jTableOdalar.getValueAt(jTableOdalar.getSelectedRow(), 0);
                for (Oda oda : otel.odalar) {
                    if ((Boolean) jTableOdalar.getValueAt(jTableOdalar.getSelectedRow(), 2)) {
                        JOptionPane.showMessageDialog(this, "Bu odayı rezerve edemezsiniz!", "Uyarı!", JOptionPane.WARNING_MESSAGE);
                        return;
                    } else if (odaNo == oda.odaNo) {
                        seçilenOda = oda;
                        seçilenOtel = (Otel) jComboBoxOteller.getSelectedItem();

                        for (String s : jListHizmetler.getSelectedValuesList()) {
                            fatura += 100;
                            seçilenHizmetler.add(s);
                        }
                    }
                }
            }
        }
        String[] seçimler = {"Evet", "Hayır"};
        int seçim = JOptionPane.showOptionDialog(this, "Rezervasyon almak istediğinize emin misiniz!", "Uyarı!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, seçimler, seçimler[0]);
        if(seçim == 0){
            AnaSayfa.sistemdekiKişi.otel = seçilenOtel;
            AnaSayfa.sistemdekiKişi.oda = seçilenOda;
            AnaSayfa.sistemdekiKişi.aldığıHizmetler = seçilenHizmetler;
            AnaSayfa.sistemdekiKişi.fatura += fatura;
            seçilenOda.rezerveEdilmişMi = true;
            JOptionPane.showMessageDialog(this, "İşleminiz başarıyla tamamlanmıştır!", "Tebrikler!", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("ad: " + AnaSayfa.sistemdekiKişi.ad + ", seçilen: " + AnaSayfa.sistemdekiKişi.aldığıHizmetler + "fatura: " + AnaSayfa.sistemdekiKişi.fatura);
            System.out.println("alınan odalar: " + AnaSayfa.sistemdekiKişi.oda);
        } else if(seçim == 1){
            JOptionPane.showMessageDialog(this, "İşleminiz iptal edilmiştir!", "Uyarı!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (int i = dtm.getRowCount() - 1; i > -1; i--) {
            dtm.removeRow(i);
        }
        jComboBoxOteller.removeAllItems();    
    }//GEN-LAST:event_jButtonRezerveEtActionPerformed
    private void jButtonSorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSorgulaActionPerformed
        dtm.setRowCount(0);
        for (Otel otel : oteller) {
            if (((Otel) jComboBoxOteller.getSelectedItem()).ad.equals(otel.ad)) {
                for (Oda oda : otel.odalar) {
                    dtm.addRow(new Object[]{oda.odaNo, oda.odaTipi, oda.rezerveEdilmişMi});
                }
            }
        }
    }//GEN-LAST:event_jButtonSorgulaActionPerformed
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
            java.util.logging.Logger.getLogger(Oteller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oteller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oteller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oteller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oteller().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRezerveEt;
    private javax.swing.JButton jButtonSorgula;
    private javax.swing.JComboBox<String> jComboBoxOteller;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelHizmetler;
    private javax.swing.JLabel jLabelOdalar;
    private javax.swing.JLabel jLabelOteller;
    private javax.swing.JList<String> jListHizmetler;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableOdalar;
    // End of variables declaration//GEN-END:variables
}
