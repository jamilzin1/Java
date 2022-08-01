/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package a.callcenterr;

import java.util.Scanner;

/**
 *
 * @author jamil
 */
public class Callcenterr {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    String frase, rodando;
        System.out.println("Bem-vindo ao sistema de Suporte Técnico");
        System.out.println("Pressione <enter> para continuar ou digite 'sair' para sair do sistema.");
            rodando = ler.nextLine();
   
    while(!rodando.equals("sair")){
        System.out.println("Descreva seu problema de maneira sucinta.");
frase = ler.nextLine();
SuporteTecnico suporte = new SuporteTecnico();
        System.out.println(suporte.buscarSolucao(frase));
    
         System.out.println("Pressione <enter> para continuar ou digite 'sair' para sair do sistema.");
       rodando = ler.nextLine();

    }
    
        System.out.println("Obrigada por utilizar nossos serviços!");
    
    }
}
