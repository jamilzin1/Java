package empresa;
import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;


public class Pagar extends javax.swing.JFrame{
        public Pagar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
        Funcionario funcionario = new Funcionario(null,null,null,null,null,null,null,null,0);

int caixa = 77500;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saldoCaixa2 = new javax.swing.JTextField();
        saldoCaixa3 = new javax.swing.JTextField();
        VOLTAR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        salarios = new javax.swing.JLabel();
        titulos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        saldoCaixa = new javax.swing.JTextField();
        saldoCaixa1 = new javax.swing.JTextField();
        saldoCaixa4 = new javax.swing.JTextField();
        VOLTAR1 = new javax.swing.JButton();

        saldoCaixa2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        saldoCaixa2.setText("0");
        saldoCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoCaixa2ActionPerformed(evt);
            }
        });

        saldoCaixa3.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        saldoCaixa3.setText("0");
        saldoCaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoCaixa3ActionPerformed(evt);
            }
        });

        VOLTAR.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        VOLTAR.setText("VOLTAR");
        VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTARActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel2.setText("Saldo em caixa:");

        salarios.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        salarios.setText("Salarios a pagar:");

        titulos.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        titulos.setText("Títulos a pagar:");

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BALANCEAMENTO");
        jLabel1.setToolTipText("");

        saldoCaixa.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        saldoCaixa.setText("0");
        saldoCaixa.setEnabled(false);
        saldoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoCaixaActionPerformed(evt);
            }
        });

        saldoCaixa1.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        saldoCaixa1.setEnabled(false);
        saldoCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoCaixa1ActionPerformed(evt);
            }
        });

        saldoCaixa4.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        saldoCaixa4.setEnabled(false);
        saldoCaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoCaixa4ActionPerformed(evt);
            }
        });

        VOLTAR1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        VOLTAR1.setText("VOLTAR");
        VOLTAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTAR1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(titulos, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2))
                    .addComponent(salarios))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(saldoCaixa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saldoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saldoCaixa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(VOLTAR1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(saldoCaixa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saldoCaixa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulos)
                    .addComponent(saldoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(VOLTAR1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saldoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoCaixaActionPerformed

    private void saldoCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoCaixa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoCaixa1ActionPerformed

    private void saldoCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoCaixa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoCaixa2ActionPerformed

    private void saldoCaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoCaixa3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoCaixa3ActionPerformed

    private void saldoCaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoCaixa4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoCaixa4ActionPerformed

    private void VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTARActionPerformed
        // TODO add your handling code here:
       dispose();
    }//GEN-LAST:event_VOLTARActionPerformed

    private void VOLTAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTAR1ActionPerformed
        // TODO add your handling code here:
       // System.out.println(salarioSum);
        dispose();
    }//GEN-LAST:event_VOLTAR1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VOLTAR;
    private javax.swing.JButton VOLTAR1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel salarios;
    private javax.swing.JTextField saldoCaixa;
    private javax.swing.JTextField saldoCaixa1;
    private javax.swing.JTextField saldoCaixa2;
    private javax.swing.JTextField saldoCaixa3;
    private javax.swing.JTextField saldoCaixa4;
    private javax.swing.JLabel titulos;
    // End of variables declaration//GEN-END:variables
  
}
