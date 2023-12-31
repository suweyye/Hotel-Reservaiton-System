/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservationProgram;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class AnaSayfa extends javax.swing.JFrame {
    Rezervasyon rezervasyon = new Rezervasyon();
    KullanıcıHesap kullanıcıHesap = new KullanıcıHesap();
    static Oteller oteller = new Oteller();
    YöneticiSayfası yöneticiSayfası = new YöneticiSayfası();
    //
    static ArrayList<Kullanıcı> müşteriler = new ArrayList();
    Kullanıcı sahte = new Kullanıcı("admin", "admin", "admin", "admin", "admin", "admin", 0, "admin", "admin");
    ArrayList<Yönetici> yöneticiler = new ArrayList();
    Yönetici y1 = new Yönetici("Maya", "Yılmaz", "my", "my123");
    Yönetici y2 = new Yönetici("Sümeyye", "Yılmaz", "sy", "sy123");
    public AnaSayfa() {
        initComponents();
        müşteriler.add(sahte);
        yöneticiler.add(y1);
        yöneticiler.add(y2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelKullanıcıAdı = new javax.swing.JLabel();
        jLabelŞifre = new javax.swing.JLabel();
        jTextFieldKullanıcıAdı = new javax.swing.JTextField();
        jTextFieldŞifre = new javax.swing.JTextField();
        jButtonGir = new javax.swing.JButton();
        jButtonHesapOluştur = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelKullanıcıAdıYönetici = new javax.swing.JLabel();
        jLabelŞifreYönetici = new javax.swing.JLabel();
        jTextFieldKullanıcıAdıYönetici = new javax.swing.JTextField();
        jTextFieldŞifreYönetici = new javax.swing.JTextField();
        jButtonGirYönetici = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hoş geldiniz!");
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AnaSayfa", jPanel1);

        jLabelKullanıcıAdı.setText("Kullanıcı Adı:");

        jLabelŞifre.setText("Şifre:");

        jButtonGir.setText("Gir");
        jButtonGir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGirActionPerformed(evt);
            }
        });

        jButtonHesapOluştur.setText("Hesap Oluştur");
        jButtonHesapOluştur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHesapOluşturActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelKullanıcıAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelŞifre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldKullanıcıAdı, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jTextFieldŞifre)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonHesapOluştur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonGir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(86, 86, 86))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKullanıcıAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldKullanıcıAdı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelŞifre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldŞifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButtonGir)
                .addGap(18, 18, 18)
                .addComponent(jButtonHesapOluştur)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Müşteri Girişi", jPanel2);

        jLabelKullanıcıAdıYönetici.setText("Kullanıcı Adı:");

        jLabelŞifreYönetici.setText("Şifre:");

        jButtonGirYönetici.setText("Gir");
        jButtonGirYönetici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGirYöneticiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonGirYönetici, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelKullanıcıAdıYönetici, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelŞifreYönetici, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldKullanıcıAdıYönetici, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldŞifreYönetici, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKullanıcıAdıYönetici, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldKullanıcıAdıYönetici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelŞifreYönetici, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldŞifreYönetici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButtonGirYönetici)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Yönetici Girişi", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Hakkımızda", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static Kullanıcı sistemdekiKişi = null;
    private void jButtonGirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGirActionPerformed
        String mesaj = "Kullanıcı adı veya şifre yanlış!" + "\n" + "Lütfen tekrar deneyin!";
        for (Kullanıcı k : müşteriler) {
            if (jTextFieldKullanıcıAdı.getText().equals(k.kullanıcıAdı) && jTextFieldŞifre.getText().equals(k.şifre)) {
                sistemdekiKişi = k;
                rezervasyon.setVisible(true);
                return;
            }
        }
        JOptionPane.showMessageDialog(rootPane, mesaj, "Hata!", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButtonGirActionPerformed
    private void jButtonHesapOluşturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHesapOluşturActionPerformed
        kullanıcıHesap.setVisible(true);
    }//GEN-LAST:event_jButtonHesapOluşturActionPerformed
    private void jButtonGirYöneticiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGirYöneticiActionPerformed
        String mesaj = "Kullanıcı adı veya şifre yanlış!" + "Lütfen tekrar deneyin!";
        String mesaj2 = "Başarıyla giriş yapılmıştır.\nGerekli işlemleri yapabilirsiniz:)";
        for (Yönetici y : yöneticiler) {
            if (jTextFieldKullanıcıAdıYönetici.getText().equals(y.kullanıcıAdı) && jTextFieldŞifreYönetici.getText().equals(y.şifre)) {
                JOptionPane.showMessageDialog(this, mesaj2, "Hoşgeldizniz!", JOptionPane.INFORMATION_MESSAGE);
                yöneticiSayfası.setVisible(true);
                return;
            } 
        }
        JOptionPane.showMessageDialog(this, mesaj, "Hata!", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButtonGirYöneticiActionPerformed
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
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaSayfa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGir;
    private javax.swing.JButton jButtonGirYönetici;
    private javax.swing.JButton jButtonHesapOluştur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelKullanıcıAdı;
    private javax.swing.JLabel jLabelKullanıcıAdıYönetici;
    private javax.swing.JLabel jLabelŞifre;
    private javax.swing.JLabel jLabelŞifreYönetici;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldKullanıcıAdı;
    private javax.swing.JTextField jTextFieldKullanıcıAdıYönetici;
    private javax.swing.JTextField jTextFieldŞifre;
    private javax.swing.JTextField jTextFieldŞifreYönetici;
    // End of variables declaration//GEN-END:variables
}
