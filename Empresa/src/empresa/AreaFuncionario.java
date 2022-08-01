package empresa;

import javax.swing.JOptionPane;

public class AreaFuncionario extends javax.swing.JFrame {

    public AreaFuncionario() {
        initComponents();
              this.setLocationRelativeTo(null);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MENSAGENS1 = new javax.swing.JButton();
        sendMessage = new javax.swing.JButton();
        DEMITIR = new javax.swing.JButton();
        MENSAGENS = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        MENSAGENS1.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        MENSAGENS1.setText("MENSAGENS");
        MENSAGENS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENSAGENS1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AREA DO FUNCIONARIO");
        setLocation(new java.awt.Point(0, 0));

        sendMessage.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        sendMessage.setText("ENVIAR MENSAGEM");
        sendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageActionPerformed(evt);
            }
        });

        DEMITIR.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        DEMITIR.setText("PEDIR DEMISSÃO");
        DEMITIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEMITIRActionPerformed(evt);
            }
        });

        MENSAGENS.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        MENSAGENS.setText("MENSAGENS");
        MENSAGENS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENSAGENSActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton4.setText("VOLTAR");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AREA DO FUNCIONARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 365, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(34, 34, 34))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MENSAGENS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sendMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(DEMITIR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MENSAGENS)
                .addGap(12, 12, 12)
                .addComponent(sendMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DEMITIR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MENSAGENS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENSAGENS1ActionPerformed

    }//GEN-LAST:event_MENSAGENS1ActionPerformed

    private void sendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null, "Função em manutenção, tente novamente mais tarde.");

     
    }//GEN-LAST:event_sendMessageActionPerformed

    private void DEMITIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEMITIRActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Sua solicitação foi encaminhada, favor comparecer no RH");
    }//GEN-LAST:event_DEMITIRActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void MENSAGENSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENSAGENSActionPerformed
        // TODO add your handling code here:
              JOptionPane.showMessageDialog(null, "Não há nenhuma mensagem a ser lida");

    }//GEN-LAST:event_MENSAGENSActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DEMITIR;
    private javax.swing.JButton MENSAGENS;
    private javax.swing.JButton MENSAGENS1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sendMessage;
    // End of variables declaration//GEN-END:variables
}
