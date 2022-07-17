package empresa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cadastro extends javax.swing.JFrame {

ArrayList<Funcionario> funcionarios = new ArrayList<>();
Map<String, String> login = new HashMap<String, String>();


    public Cadastro() {
     initComponents();
       this.setTitle("Cadastro");

    }

   public  Integer loginVerify(String usuario, String senha){
        if(login.containsKey(usuario)&&senha.equals(login.get(usuario))){
          return 1;        }
        else
          return  0;
    }

    Funcionario cadastrar(String nome, String CPF, String email, String telefone,
            String cargo, String sexo, String usuario, String senha){
    Funcionario trabalhador = new Funcionario(nome,CPF,email,telefone,cargo,sexo,usuario,senha);
    funcionarios.add(trabalhador);
    login.put(usuario, senha);
    return trabalhador;
    }
    
    void listar(){
    for(Funcionario trabalhador : funcionarios){
    if(trabalhador instanceof Funcionario){
        System.out.println(trabalhador.getNome());
        System.out.println(login.get(user.getText()));
                System.out.println("----user");
    }}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cargo = new javax.swing.JComboBox<>();
        password = new javax.swing.JPasswordField();
        sexo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cadastroBOTAO = new javax.swing.JButton();
        voltarBOTAO = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        phone.setText("31912345678");

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jLabel3.setText("E-mail");

        jLabel4.setText("Cargo");

        jLabel5.setText("Telefone");

        jLabel6.setText("Usuario");

        jLabel7.setText("Senha");

        cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programador Java", "Estagiario" }));

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));

        jLabel8.setText("Sexo");

        cadastroBOTAO.setText("CADASTRAR");
        cadastroBOTAO.setToolTipText("");
        cadastroBOTAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroBOTAOActionPerformed(evt);
            }
        });

        voltarBOTAO.setText("VOLTAR");
        voltarBOTAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBOTAOActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CADASTRO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(password)
                                .addComponent(phone)
                                .addComponent(cargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cadastroBOTAO)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(voltarBOTAO))))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroBOTAO)
                    .addComponent(voltarBOTAO))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroBOTAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroBOTAOActionPerformed
        // TODO add your handling code here:
     //String nome, double CPF, String email, double telefone,   String cargo, String sexo
          
        cadastrar(name.getText(),cpf.getText(), email.getText(), phone.getText(),
                (String.valueOf(cargo.getSelectedItem())), (String.valueOf(sexo.getSelectedItem())),
                user.getText(),String.valueOf(password.getPassword()));
        //imprimeHash();
      //  funcionarios.forEach( trabalhador -> System.out.println(trabalhador.getNome()));
      //cadastroLogin(user.getText(),String.valueOf(password.getPassword()));
      dispose();
    }//GEN-LAST:event_cadastroBOTAOActionPerformed

    private void voltarBOTAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBOTAOActionPerformed
        // TODO add your handling code here:
      //  dispose();
dispose();
    }//GEN-LAST:event_voltarBOTAOActionPerformed

        
    
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroBOTAO;
    private javax.swing.JComboBox<String> cargo;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JTextField user;
    private javax.swing.JButton voltarBOTAO;
    // End of variables declaration//GEN-END:variables
}
