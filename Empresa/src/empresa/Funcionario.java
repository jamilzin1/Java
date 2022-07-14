package empresa;


public class Funcionario {
   public String nome, email, cargo,sexo, CPF, telefone,usuario,senha;

    Funcionario(String nome, String CPF, String email, String telefone,
            String cargo, String sexo, String usuario, String senha){
        this.nome=nome;
        this.CPF=CPF;
        this.email=email;
        this.telefone=telefone;
        this.cargo=cargo;
        this.sexo=sexo;
        this.usuario=usuario;
        this.senha=senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCargo() {
        return cargo;
    }

    public String getSexo() {
        return sexo;
    }


    
}
