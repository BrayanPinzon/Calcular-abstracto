/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Calcular extends javax.swing.JFrame {

    /**
     * Creates new form Calcular
     */
    public Calcular() {
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

        jPanel1 = new javax.swing.JPanel();
        s1 = new javax.swing.JButton();
        r1 = new javax.swing.JButton();
        m1 = new javax.swing.JButton();
        d1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        s1.setBackground(new java.awt.Color(0, 204, 153));
        s1.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        s1.setText("Suma");
        s1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        r1.setBackground(new java.awt.Color(0, 204, 153));
        r1.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        r1.setText("Resta");
        r1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        m1.setBackground(new java.awt.Color(0, 204, 153));
        m1.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        m1.setText("Multiplicacion");
        m1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });

        d1.setBackground(new java.awt.Color(0, 204, 153));
        d1.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        d1.setText("Division");
        d1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setText("Opereciones de N x M");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(s1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(s1)
                .addGap(18, 18, 18)
                .addComponent(r1)
                .addGap(18, 18, 18)
                .addComponent(m1)
                .addGap(18, 18, 18)
                .addComponent(d1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite numero: "));
        int m = Integer.parseInt(JOptionPane.showInputDialog("digite numero: "));
        JOptionPane.showMessageDialog(null, ml.operaciones(n, m));
    }//GEN-LAST:event_m1ActionPerformed

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite numero: "));
        int m = Integer.parseInt(JOptionPane.showInputDialog("digite numero: "));
        JOptionPane.showMessageDialog(null, d.operaciones(n, m));
    }//GEN-LAST:event_d1ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite numero: "));
        int m = Integer.parseInt(JOptionPane.showInputDialog("digite numero: "));
        JOptionPane.showMessageDialog(null, r.operaciones(n, m));
    }//GEN-LAST:event_r1ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite numero: "));
        int m = Integer.parseInt(JOptionPane.showInputDialog("digite numero: "));
        JOptionPane.showMessageDialog(null, s.operaciones(n, m));
    }//GEN-LAST:event_s1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcular().setVisible(true);
            }
        });
    }
    Interface s = new Suma();
    Interface r = new Resta();
    Interface ml = new Multiplicacion();
    Interface d = new Division();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton d1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton m1;
    private javax.swing.JButton r1;
    private javax.swing.JButton s1;
    // End of variables declaration//GEN-END:variables
}