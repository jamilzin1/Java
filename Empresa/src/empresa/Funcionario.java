package empresa;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Funcionario extends javax.swing.JFrame {
    
Cadastro cadastro = new Cadastro();

   public String nome, email, cargo,sexo, CPF, telefone,usuario,senha;
   double salario;
DefaultListModel<String> lista = new DefaultListModel<String>();
    JList<String> listaFuncionarios = new JList();

    public Funcionario(String nome, String CPF, String email, String telefone,
            String cargo, String sexo, String usuario, String senha, double salario){
        initComponents();
        
        this.setTitle("GESTAO DE FUNCIONARIOS");
              this.setLocationRelativeTo(null);
        this.nome=nome;
        this.CPF=CPF;
        this.email=email;
        this.telefone=telefone;
        this.cargo=cargo;
        this.sexo=sexo;
        this.usuario=usuario;
        this.senha=senha;
        this.salario=salario;
    }

    boolean verify(String usuario, String senha){
return cadastro.loginVerify(usuario, senha)==true;
}

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getCPF() {
        return CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getUsuario() {
        return usuario;
    }
    
    void listaFuncionarios(){
     
    JFrame frame = new JFrame("Lista de Funcionarios");
    frame.setSize(600,600);
    JPanel panel = new JPanel();
    frame.setLocationRelativeTo(null);
    panel.setBackground(Color.WHITE);
    listaFuncionarios.setFont( new Font("Arial",Font.BOLD,12));
    for(int k=0; k<cadastro.contar();k++){
     lista.add(0, cadastro.toString(k));}
 
    listaFuncionarios.setModel(lista);
  panel.add(listaFuncionarios);
    frame.add(panel);
    frame.setVisible(true);

    }
    
    @Override
    public String toString() {
        return "\n Nome: "+this.nome+ "  -  "+"CPF: " + this.CPF+ "  -  "+"Cargo: " + this.cargo+
                "  -  "+"Telefone: " + this.telefone+"\n";
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CADASTRAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DEMITIR = new javax.swing.JButton();
        LISTA = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CADASTRAR.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        CADASTRAR.setText("CADASTRAR");
        CADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTRARActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GERIR FUNCIONARIOS");

        DEMITIR.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        DEMITIR.setText("DEMITIR");
        DEMITIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEMITIRActionPerformed(evt);
            }
        });

        LISTA.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        LISTA.setText("LISTA DE FUNCIONARIOS");
        LISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LISTAActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LISTA)
                            .addComponent(DEMITIR, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LISTA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(CADASTRAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DEMITIR)
                .addGap(12, 12, 12)
                .addComponent(jButton4)
                .addGap(25, 25, 25))
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

    private void DEMITIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEMITIRActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Você não tem permissão para isso.");
        

    }//GEN-LAST:event_DEMITIRActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void LISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LISTAActionPerformed
        // TODO add your handling code here:
        listaFuncionarios();
    }//GEN-LAST:event_LISTAActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CADASTRAR;
    private javax.swing.JButton DEMITIR;
    private javax.swing.JButton LISTA;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
