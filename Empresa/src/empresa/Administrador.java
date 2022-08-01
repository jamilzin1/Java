package empresa;

import java.util.stream.Stream;
import javax.swing.JOptionPane;

public class Administrador extends javax.swing.JFrame {
    Funcionario funcionario = new Funcionario(null,null,null,null,null,null,null,null,0);
    Financas financas = new Financas();
    public Administrador() {
        initComponents();
      this.setLocationRelativeTo(null);
        this.setTitle("GESTAO DO ADMINISTRADOR");

    }

    boolean verify(String usuario, String senha){
return funcionario.verify(usuario, senha)==true;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        VOLTAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gerir = new javax.swing.JButton();
        MENSAGENS = new javax.swing.JButton();
        FINANCAS = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VOLTAR.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        VOLTAR.setText("VOLTAR");
        VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTARActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTÃO");

        jLabel2.setText("Você está logado como administrador");

        gerir.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        gerir.setText("GESTAO DE PESSOAS");
        gerir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerirActionPerformed(evt);
            }
        });

        MENSAGENS.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        MENSAGENS.setText("MENSAGENS");
        MENSAGENS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENSAGENSActionPerformed(evt);
            }
        });

        FINANCAS.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        FINANCAS.setText("CONTABILIDADE");
        FINANCAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FINANCASActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MENSAGENS, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FINANCAS, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gerir, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(VOLTAR)
                        .addGap(18, 18, 18))))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(gerir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FINANCAS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MENSAGENS)
                .addGap(24, 24, 24)
                .addComponent(VOLTAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTARActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_VOLTARActionPerformed

    private void gerirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerirActionPerformed
        // TODO add your handling code here:
        funcionario.setVisible(true);
    }//GEN-LAST:event_gerirActionPerformed

    private void MENSAGENSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENSAGENSActionPerformed
        // TODO add your handling code here:
      JOptionPane.showMessageDialog(null, "Não há nenhuma mensagem a ser lida");

    }//GEN-LAST:event_MENSAGENSActionPerformed

    private void FINANCASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FINANCASActionPerformed
        // TODO add your handling code here:
    financas.setVisible(true);
    }//GEN-LAST:event_FINANCASActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FINANCAS;
    private javax.swing.JButton MENSAGENS;
    private javax.swing.JButton VOLTAR;
    private javax.swing.JButton gerir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
