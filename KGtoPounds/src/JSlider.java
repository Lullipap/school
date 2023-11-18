/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author chupa
 */
public class JSlider extends javax.swing.JFrame {

    /**
     * Creates new form JSlider
     */
    public JSlider() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValue = new javax.swing.JLabel();
        sldKG = new javax.swing.JSlider();
        lblLBS = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblValue.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        lblValue.setForeground(new java.awt.Color(0, 102, 102));
        lblValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 90, 86));

        sldKG.setMaximum(150);
        sldKG.setMinorTickSpacing(2);
        sldKG.setPaintLabels(true);
        sldKG.setPaintTicks(true);
        sldKG.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldKGStateChanged(evt);
            }
        });
        getContentPane().add(sldKG, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 640, 100));

        lblLBS.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblLBS.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(lblLBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 190, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kgtolbs (2).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldKGStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldKGStateChanged
        lblValue.setText(""+sldKG.getValue());
        int kiloGram = sldKG.getValue();
        //convert the kiloggram into pounds
        float pounds = (float) (kiloGram * 2.205);
        lblLBS.setText(""+pounds);
    }//GEN-LAST:event_sldKGStateChanged

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
            java.util.logging.Logger.getLogger(JSlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JSlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JSlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JSlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JSlider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLBS;
    private javax.swing.JLabel lblValue;
    private javax.swing.JSlider sldKG;
    // End of variables declaration//GEN-END:variables
}