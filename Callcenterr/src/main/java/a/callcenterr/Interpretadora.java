/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.callcenterr;

import java.util.HashSet;


public class Interpretadora {
     private HashSet<String> palavraChave;
    
    public HashSet textoChave (String frase){
    
    String[] tokens = frase.split(" ");
    palavraChave = new HashSet<String>();
    
    for(int i=0; i<tokens.length;i++){
    palavraChave.add(tokens[i]);
    }
    return palavraChave;
    }
    
}
