// Nama  : Hayya Apriligiani Mutiara Riadi
// Nim   : 11200930000003
// Kelas : 2A - Sistem Informasi

package GUI;

/**
 *
 * @author Hayya AM Riadi
 */
public class KonversiSuhu extends javax.swing.JFrame {
    double celcius;
    double fahrenheit;
    double kelvin;
    double reamur;
    
    public KonversiSuhu() {
        initComponents();
    }

    private void Celcius(){
        celcius = Double.parseDouble(TextField.getText());
        fahrenheit =celcius * 1.8 + 32;
        kelvin =celcius +273.15;
        reamur = celcius * 0.8;
    CelciusLabel.setText(celcius+" Celcius");
    FahrenheitLabel.setText(fahrenheit+" Fahrenheit");
    KelvinLabel.setText(kelvin+" Kelvin");
    ReamurLabel.setText(reamur+" Reamur");
    }
    
    private void Fahrenheit(){
        fahrenheit = Double.parseDouble(TextField.getText());
        celcius = (fahrenheit - 32) / 1.8;
        reamur = (fahrenheit - 32) / 2.25;
        kelvin = (fahrenheit + 459.67) / 1.8;
    CelciusLabel.setText(celcius+" Celcius");
    FahrenheitLabel.setText(fahrenheit+" Fahrenheit");
    KelvinLabel.setText(kelvin+" kelvin");
    ReamurLabel.setText(reamur+" Reamur");
    }
    
    private void Kelvin(){
        kelvin = Double.parseDouble(TextField.getText());
        fahrenheit = kelvin * 1.8 - 459.67;
        celcius = kelvin - 273.15;
        reamur = (kelvin - 273.15) * 0.8;
    CelciusLabel.setText(celcius+" Celcius");
    FahrenheitLabel.setText(fahrenheit+" Fahrenheit");
    KelvinLabel.setText(kelvin+" Kelvin");
    ReamurLabel.setText(reamur+" Reamur");
    }
        
    private void Reamur(){
        reamur = Double.parseDouble(TextField.getText());
        fahrenheit =(reamur *2.25)+32;
        kelvin =(reamur / 0.8) + 273.15;
        celcius = reamur/ 0.8;
    CelciusLabel.setText(celcius+" Celcius");
    FahrenheitLabel.setText(fahrenheit +" Fahrenheit");
    KelvinLabel.setText(kelvin +" Kelvin");
    ReamurLabel.setText(reamur+" Reamur");
    }
    
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AplikasiKonversiSuhuLabel = new javax.swing.JLabel();
        TextField = new java.awt.TextField();
        KonversiButton = new javax.swing.JButton();
        CelciusButton = new javax.swing.JRadioButton();
        FahrenheitButton = new javax.swing.JRadioButton();
        KelvinButton = new javax.swing.JRadioButton();
        ReamurButton = new javax.swing.JRadioButton();
        ResetButton = new javax.swing.JButton();
        InputNilaiSuhuLabel = new javax.swing.JLabel();
        HasilKonversiLabel = new javax.swing.JLabel();
        CelciusLabel = new javax.swing.JLabel();
        KelvinLabel = new javax.swing.JLabel();
        FahrenheitLabel = new javax.swing.JLabel();
        ReamurLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AplikasiKonversiSuhuLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        AplikasiKonversiSuhuLabel.setText("Aplikasi Konversi Suhu");

        KonversiButton.setText("Konversi");
        KonversiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KonversiButtonActionPerformed(evt);
            }
        });

        CelciusButton.setText("Celcius");

        FahrenheitButton.setText("Fahrenheit");

        KelvinButton.setText("Kelvin");

        ReamurButton.setText("Reamur");
        ReamurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReamurButtonActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        InputNilaiSuhuLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        InputNilaiSuhuLabel.setText("Input Nilai Suhu ");

        HasilKonversiLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        HasilKonversiLabel.setText("Hasil Konversi");

        CelciusLabel.setText("Celcius");

        KelvinLabel.setText("Kelvin");

        FahrenheitLabel.setText("Fahrenheit");

        ReamurLabel.setText("Reamur");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HasilKonversiLabel)
                    .addComponent(InputNilaiSuhuLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(KonversiButton)
                        .addGap(31, 31, 31)
                        .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AplikasiKonversiSuhuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(CelciusButton)
                                            .addGap(18, 18, 18)
                                            .addComponent(FahrenheitButton))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(FahrenheitLabel)
                                                .addComponent(CelciusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(KelvinLabel)
                                                .addComponent(ReamurLabel))))
                                    .addGap(18, 18, 18)
                                    .addComponent(KelvinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ReamurButton))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AplikasiKonversiSuhuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(InputNilaiSuhuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CelciusButton)
                    .addComponent(FahrenheitButton)
                    .addComponent(KelvinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReamurButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(HasilKonversiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CelciusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FahrenheitLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(KelvinLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ReamurLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KonversiButton)
                            .addComponent(ResetButton))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReamurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReamurButtonActionPerformed
 
    }//GEN-LAST:event_ReamurButtonActionPerformed

    private void KonversiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KonversiButtonActionPerformed
        if(CelciusButton.isSelected()){
            Celcius();
        }else if(FahrenheitButton.isSelected()){
            Fahrenheit();      
        }else if(KelvinButton.isSelected()){
            Kelvin();
        }else if(ReamurButton.isSelected()){
            Reamur();
        }
    }//GEN-LAST:event_KonversiButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        InputNilaiSuhuLabel.setText("");
        CelciusLabel.setText("Celcius");
        FahrenheitLabel.setText("Fahrenheit");
        KelvinLabel.setText("Kelvin");
        ReamurLabel.setText("Reamur");
        CelciusButton.setSelected(false);
        FahrenheitButton.setSelected(false);
        KelvinButton.setSelected(false);
        ReamurButton.setSelected(false);
    }//GEN-LAST:event_ResetButtonActionPerformed
 
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AplikasiKonversiSuhuLabel;
    private javax.swing.JRadioButton CelciusButton;
    private javax.swing.JLabel CelciusLabel;
    private javax.swing.JRadioButton FahrenheitButton;
    private javax.swing.JLabel FahrenheitLabel;
    private javax.swing.JLabel HasilKonversiLabel;
    private javax.swing.JLabel InputNilaiSuhuLabel;
    private javax.swing.JRadioButton KelvinButton;
    private javax.swing.JLabel KelvinLabel;
    private javax.swing.JButton KonversiButton;
    private javax.swing.JRadioButton ReamurButton;
    private javax.swing.JLabel ReamurLabel;
    private javax.swing.JButton ResetButton;
    private java.awt.TextField TextField;
    // End of variables declaration//GEN-END:variables
}
