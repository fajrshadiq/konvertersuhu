
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Rad
 */
public class JFrameKonvertSuhu extends javax.swing.JFrame {

    /**
     * Creates new form JFrameKonvertSuhu
     */
    
    public Double input;
    public Double celcius;
    public Double fahreinheit;
    public Double reamur;
    public Double kelvin;
    public String hasilcelcius;
    public String hasilreamur;
    public String hasilfahreinheit;
    public String hasilkelvin;
    
    public JFrameKonvertSuhu() {
        initComponents();
    }

    private void celcius() {
        input=Double.parseDouble(SuhuAwal.getText());
        
        celcius=input;
        fahreinheit=celcius*1.8+32 ;
        kelvin=celcius*0.8;
        reamur=celcius+273.15;
        
        hasilcelcius=Double.toString(celcius);
        txtCelcius.setText(hasilcelcius);
        
        hasilfahreinheit=Double.toString(fahreinheit);
        txtFahreinheit.setText(hasilfahreinheit);
        
        hasilkelvin=Double.toString(kelvin);
        txtKelvin.setText(hasilkelvin);
        
        hasilreamur=Double.toString(reamur);
        txtReamur.setText(hasilreamur);
        
       }
    
    private void fahreinheit() {
        input = Double.parseDouble(SuhuAwal.getText());
        
            fahreinheit=input;
            celcius=(fahreinheit-32)/1.8;
            reamur=(fahreinheit-32)/2.25;
            kelvin=(fahreinheit+459.67)/1.8;
            
            hasilcelcius=Double.toString(celcius);
        txtCelcius.setText(hasilcelcius);
        
        hasilfahreinheit=Double.toString(fahreinheit);
        txtFahreinheit.setText(hasilfahreinheit);
        
        hasilkelvin=Double.toString(kelvin);
        txtKelvin.setText(hasilkelvin);
        
        hasilreamur=Double.toString(reamur);
        txtReamur.setText(hasilreamur);
            
    }
    
    private void kelvin(){
        input = Double.parseDouble(SuhuAwal.getText());
        
        kelvin=input;
        celcius=kelvin-273.15;
        fahreinheit=kelvin*1.8-459.67;
        reamur=(kelvin-273.15)*0.8;
        
        hasilcelcius=Double.toString(celcius);
        txtCelcius.setText(hasilcelcius);
        
        hasilfahreinheit=Double.toString(fahreinheit);
        txtFahreinheit.setText(hasilfahreinheit);
        
        hasilkelvin=Double.toString(kelvin);
        txtKelvin.setText(hasilkelvin);
        
        hasilreamur=Double.toString(reamur);
        txtReamur.setText(hasilreamur);
    }
    
    private void reamur(){
        input= Double.parseDouble(SuhuAwal.getText());
        
        reamur=input;
        celcius=reamur/0.8;
        fahreinheit=(reamur*2.25)+32;
        kelvin=reamur/0.8+237.15;
        
        hasilcelcius=Double.toString(celcius);
        txtCelcius.setText(hasilcelcius);
        
        hasilfahreinheit=Double.toString(fahreinheit);
        txtFahreinheit.setText(hasilfahreinheit);
        
        hasilkelvin=Double.toString(kelvin);
        txtKelvin.setText(hasilkelvin);
        
        hasilreamur=Double.toString(reamur);
        txtReamur.setText(hasilreamur);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        labelSuhuAwal = new javax.swing.JLabel();
        SuhuAwal = new javax.swing.JTextField();
        rbCelcius = new javax.swing.JRadioButton();
        rbFahreinheit = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        rbReamur = new javax.swing.JRadioButton();
        jBResult = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCelcius = new javax.swing.JTextField();
        txtFahreinheit = new javax.swing.JTextField();
        txtKelvin = new javax.swing.JTextField();
        txtReamur = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelSuhuAwal.setText("Suhu Awal");

        SuhuAwal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SuhuAwalKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbCelcius);
        rbCelcius.setText("Celcius");
        rbCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCelciusActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFahreinheit);
        rbFahreinheit.setText("Fahreinheit");

        buttonGroup1.add(rbKelvin);
        rbKelvin.setText("Kelvin");

        buttonGroup1.add(rbReamur);
        rbReamur.setText("Reamur");

        jBResult.setText("Konversi");
        jBResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResultActionPerformed(evt);
            }
        });

        jLabel2.setText("Celcius");

        jLabel3.setText("Fahreinheit");

        jLabel4.setText("Kelvin");

        jLabel5.setText("Reamur");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(labelSuhuAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SuhuAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBResult))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbFahreinheit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbReamur, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtKelvin, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(txtReamur)
                                    .addComponent(txtFahreinheit))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSuhuAwal)
                    .addComponent(SuhuAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBResult))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCelcius)
                    .addComponent(rbFahreinheit)
                    .addComponent(rbKelvin)
                    .addComponent(rbReamur))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFahreinheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtReamur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResultActionPerformed
        // TODO add your handling code here:
        if(rbCelcius.isSelected()){
            celcius();
        }
        else if(rbFahreinheit.isSelected()){
            fahreinheit();
        }
        else if(rbKelvin.isSelected()){
            kelvin();
        }
        else if(rbReamur.isSelected()){
            reamur();
        }
    }//GEN-LAST:event_jBResultActionPerformed

    private void rbCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCelciusActionPerformed

    }//GEN-LAST:event_rbCelciusActionPerformed

    private void SuhuAwalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SuhuAwalKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))
                )){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"masukkan hanya 0-9!");
            evt.consume();
        }
    }//GEN-LAST:event_SuhuAwalKeyTyped

    /*
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
            java.util.logging.Logger.getLogger(JFrameKonvertSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameKonvertSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameKonvertSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameKonvertSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameKonvertSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SuhuAwal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBResult;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelSuhuAwal;
    private javax.swing.JRadioButton rbCelcius;
    private javax.swing.JRadioButton rbFahreinheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbReamur;
    private javax.swing.JTextField txtCelcius;
    private javax.swing.JTextField txtFahreinheit;
    private javax.swing.JTextField txtKelvin;
    private javax.swing.JTextField txtReamur;
    // End of variables declaration//GEN-END:variables
}
