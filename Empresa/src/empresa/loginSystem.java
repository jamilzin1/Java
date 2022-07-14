
package empresa;

import java.util.HashMap;


public class loginSystem {
    HashMap<String, String> login = new HashMap<>();
    
    loginSystem(String usuario, String senha){
    this.login = new HashMap<>();
    }
    
 void   Register(String usuario, String senha){
    login.put(usuario, senha);
    }
    
    
}
