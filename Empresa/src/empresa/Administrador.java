/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package empresa;

/**
 *
 * @author jamil
 */
public class Administrador extends javax.swing.JFrame {

Cadastro cadastro = new Cadastro();
    public Administrador() {
        initComponents();
    }

boolean verify(String usuario, String senha){
    if(cadastro.loginVerify(usuario, senha)==1){
    return true;}

    else
        return false;
}
void imprime(){
                cadastro.imprime();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CADASTRAR = new javax.swing.JButton();
        DEMITIR = new javax.swing.JButton();
        PAGAR = new javax.swing.JButton();
        LISTA = new javax.swing.JButton();
        VOLTAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CADASTRAR.setText("CADASTRAR");
        CADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTRARActionPerformed(evt);
            }
        });

        DEMITIR.setText("DEMITIR");
        DEMITIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEMITIRActionPerformed(evt);
            }
        });

        PAGAR.setText("PAGAR");
        PAGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAGARActionPerformed(evt);
            }
        });

        LISTA.setText("LISTA DE FUNCIONARIOS");

        VOLTAR.setText("VOLTAR");
        VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTARActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setText("GERENCIAMENTO");

        jLabel2.setText("Você está logado como administrador");

        jButton1.setText("GERIR FUNCIONARIOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(CADASTRAR)
                                .addGap(52, 52, 52)
                                .addComponent(VOLTAR))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(PAGAR))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(LISTA))))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(DEMITIR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(33, 33, 33)
                .addComponent(PAGAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LISTA)
                .addGap(5, 5, 5)
                .addComponent(DEMITIR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VOLTAR)
                    .addComponent(CADASTRAR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTRARActionPerformed
        // TODO add your handling code here:

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 cadastro.setVisible(true);
            }
        });
    }//GEN-LAST:event_CADASTRARActionPerformed

    private void PAGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAGARActionPerformed
        // TODO add your handling code here:
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagar().setVisible(true);
            }
        });
    }//GEN-LAST:event_PAGARActionPerformed

    private void DEMITIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEMITIRActionPerformed
        // TODO add your handling code here:
                cadastro.imprime();

          /*   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demitir().setVisible(true);
            }
        }); */
    }//GEN-LAST:event_DEMITIRActionPerformed

    private void VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTARActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_VOLTARActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CADASTRAR;
    private javax.swing.JButton DEMITIR;
    private javax.swing.JButton LISTA;
    private javax.swing.JButton PAGAR;
    private javax.swing.JButton VOLTAR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
