/*
Jamil de Souza - 5T34
Projeto Final

*/
package empresa;

import java.util.Arrays;


public class Main {
    
    public static void main(String[] args) {
        try{
       {       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        }); }
    }
    catch(Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
}
}}
