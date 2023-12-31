/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservationProgram;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
public class KullanıcıHesap extends javax.swing.JFrame {
    public KullanıcıHesap() {
        initComponents();
        jRadioButtonErkek.setSelected(true);
    }
    boolean desenKontrol(String desenMetni, String icindeDesenArananMetin) {
        Pattern desen = Pattern.compile(desenMetni);
        Matcher arama = desen.matcher(icindeDesenArananMetin);
        return arama.find();
    }
    boolean tcNumarasınınAynısındanVarMı(){
       boolean aynıMı = false;
       for(Kullanıcı k : AnaSayfa.müşteriler){
           if(k.tc.equals(jTextFieldTC.getText())){
               aynıMı = true;
           }
       }
       return aynıMı;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelAd = new javax.swing.JLabel();
        jTextFieldAd = new javax.swing.JTextField();
        jLabelSoyad = new javax.swing.JLabel();
        jTextFieldSoyad = new javax.swing.JTextField();
        jLabelTel = new javax.swing.JLabel();
        jTextFieldTel = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelYaş = new javax.swing.JLabel();
        jSliderYaş = new javax.swing.JSlider();
        jTextFieldYaş = new javax.swing.JTextField();
        jLabelCinsiyet = new javax.swing.JLabel();
        jRadioButtonErkek = new javax.swing.JRadioButton();
        jRadioButtonKadın = new javax.swing.JRadioButton();
        jButtonKaydol = new javax.swing.JButton();
        jLabelTC = new javax.swing.JLabel();
        jTextFieldTC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAd.setText("Ad:");

        jLabelSoyad.setText("Soyad:");

        jLabelTel.setText("Tel:");

        jLabelEmail.setText("Email:");

        jLabelYaş.setText("Yaş:");

        jSliderYaş.setMinimum(1);
        jSliderYaş.setValue(1);
        jSliderYaş.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderYaşStateChanged(evt);
            }
        });

        jLabelCinsiyet.setText("Cinsiyet:");

        buttonGroup1.add(jRadioButtonErkek);
        jRadioButtonErkek.setText("Erkek");
        jRadioButtonErkek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonErkekActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonKadın);
        jRadioButtonKadın.setText("Kadın");

        jButtonKaydol.setText("Kaydol");
        jButtonKaydol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKaydolActionPerformed(evt);
            }
        });

        jLabelTC.setText("TC:");

        jLabel1.setText("+90");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSoyad)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(jLabelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldAd, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jTextFieldSoyad)
                    .addComponent(jTextFieldTel)
                    .addComponent(jTextFieldEmail))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonErkek)
                        .addGap(24, 24, 24)
                        .addComponent(jRadioButtonKadın))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTC)
                        .addGap(39, 39, 39)
                        .addComponent(jTextFieldTC, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelCinsiyet)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelYaş)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSliderYaş, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldYaş, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonKaydol, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAd)
                            .addComponent(jTextFieldAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelYaş))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSoyad)
                            .addComponent(jTextFieldSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldYaş, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSliderYaş, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTC)
                    .addComponent(jTextFieldTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTel)
                            .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmail)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelCinsiyet)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonKadın)
                            .addComponent(jRadioButtonErkek))
                        .addGap(30, 30, 30)
                        .addComponent(jButtonKaydol, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jRadioButtonErkekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonErkekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonErkekActionPerformed
    private void jSliderYaşStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderYaşStateChanged
        jTextFieldYaş.setText("" + jSliderYaş.getValue());
    }//GEN-LAST:event_jSliderYaşStateChanged
    private void jButtonKaydolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKaydolActionPerformed
        if (jTextFieldAd.getText().isEmpty() || desenKontrol("[^A-z\\s]", jTextFieldAd.getText())) {
            JOptionPane.showMessageDialog(this, "Lütfen adınızı düzgün giriniz!", "Uyarı!", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jTextFieldSoyad.getText().isEmpty() || desenKontrol("[^A-z\\s]", jTextFieldSoyad.getText())) {
            JOptionPane.showMessageDialog(this, "Lütfen soyadınızı düzgün giriniz!", "Uyarı!", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jTextFieldTel.getText().isEmpty() || jTextFieldTel.getText().length() != 10 || desenKontrol("[^0-9]", jTextFieldTel.getText())) {
            JOptionPane.showMessageDialog(this, "Telefon numarası 10 basamaklı ve sadece rakamdan oluşmalıdır!", "Uyarı!", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jTextFieldEmail.getText().isEmpty() || !desenKontrol("[A-Za-z0-9]+[@][A-Za-z0-9]+(.com)", jTextFieldEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Lütfen emaili düzgün bir şekilde giriniz!", "Uyarı!", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jTextFieldYaş.getText().isEmpty() || Integer.parseInt(jTextFieldYaş.getText()) < 18) {
            JOptionPane.showMessageDialog(this, "18 yaşından küçükler hesap oluşturamazlar!", "Uyarı!", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (jTextFieldTC.getText().isEmpty() || desenKontrol("[^0-9]", jTextFieldTC.getText()) || jTextFieldTC.getText().length() != 11) {
            JOptionPane.showMessageDialog(this, "Lütfen tc no'da sadece rakam kullanınız!\nAyrıca 11 basamaklı olmalı!", "Uyarı!", JOptionPane.WARNING_MESSAGE);
            return;
        } else if(tcNumarasınınAynısındanVarMı()){
            JOptionPane.showMessageDialog(this, "TC numaranız veri tabanındaki birisi ile uyuşuyor.\nLütfen doğru girdiğinizden emin olunuz!", "Hata!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String cinsiyet = "";
        if (jRadioButtonErkek.isSelected()) {
            cinsiyet = "erkek";
        } else if (jRadioButtonKadın.isSelected()) {
            cinsiyet = "kadın";
        }
        String kullanıcıAdı = "" + jTextFieldAd.getText().charAt(0) + "" + jTextFieldSoyad.getText().charAt(0) + "123";
        String şifre = "" + jTextFieldTC.getText().substring(0, 5);
        String[] seçimler = {"Evet", "Hayır"};
        int seçim = JOptionPane.showOptionDialog(rootPane, "Bu bilgilerinizle kaydolmak istediğinize emin misiniz?", "Uyarı!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, seçimler, seçimler[0]);
        if (seçim == 0) {
            Kullanıcı k = new Kullanıcı(jTextFieldAd.getText(), jTextFieldSoyad.getText(), jTextFieldEmail.getText(), cinsiyet,
                    jTextFieldTel.getText(), jTextFieldTC.getText(), Integer.parseInt(jTextFieldYaş.getText()));
            k.kullanıcıAdı = kullanıcıAdı;
            k.şifre = şifre;
            AnaSayfa.müşteriler.add(k);
            String mesaj = "Kullanıcı adınız: " + kullanıcıAdı + "\n"
                    + "Şifreniz: " + şifre;
            JOptionPane.showMessageDialog(this, "İşlminiz başarıyla tanımlanmıştır!", "Tebrikler!", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("kullanıcılar: " + AnaSayfa.müşteriler);
            System.out.println(k.ad + " " + k.soyad + " " + k.kullanıcıAdı + " " + k.şifre);
            JOptionPane.showMessageDialog(rootPane, mesaj, "Bilgilendirme!", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else if (seçim == 1) {
            JOptionPane.showMessageDialog(this, "İşleiniz iptal edilmiştir!", "Uyarı", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonKaydolActionPerformed
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
            java.util.logging.Logger.getLogger(KullanıcıHesap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullanıcıHesap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullanıcıHesap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullanıcıHesap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullanıcıHesap().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonKaydol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAd;
    private javax.swing.JLabel jLabelCinsiyet;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelSoyad;
    private javax.swing.JLabel jLabelTC;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelYaş;
    private javax.swing.JRadioButton jRadioButtonErkek;
    private javax.swing.JRadioButton jRadioButtonKadın;
    private javax.swing.JSlider jSliderYaş;
    private javax.swing.JTextField jTextFieldAd;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldSoyad;
    private javax.swing.JTextField jTextFieldTC;
    private javax.swing.JTextField jTextFieldTel;
    private javax.swing.JTextField jTextFieldYaş;
    // End of variables declaration//GEN-END:variables
}
