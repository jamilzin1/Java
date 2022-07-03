
package jamilzin.cassino;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cassino {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println("                      Sejam bem-vindos ao Cassino de jamilzin! ");
    System.out.println("----------------------------------------------------------------------------------");
   //     System.out.println("quantas cartas deseja?");
    // int user = scanner.nextInt();
 Deck deckMaster = new Deck();
 Dealer dealerHouse = new Dealer();
 dealerHouse.setDealerHands(deckMaster.provideDealerCards());
Player PlayerA = new Player();
Player PlayerB = new Player();
//System.out.println("Jogador 1 digite seu nome: ");
//String nameA = scanner.next();
//PlayerA.setName(nameA);
PlayerA.setName("Joao");
PlayerB.setName("Vitor");
System.out.println("O jogo comecou e o dealer retirou a primeira carta.\n"+dealerHouse.getDealerHands());
System.out.println("----------------------------------------------------------------------------------");

 System.out.println(PlayerA.getName()+"Deseja pegar outra carta? Digite y para pegar, caso nao queira, digita qualquer coisa");
 String jogar = scanner.next();
 
switch(jogar){
    case "y":
        PlayerA.setHands(deckMaster.provideCards());
        System.out.println(PlayerA.getHands());
        System.out.println("Soma dos valores das cartas de "+PlayerA.getName()+": "+PlayerA.getTestando());
        System.out.println("----------------------------------------------------------------------------------");
    default :
    System.out.println("\n nada");
}

for(int i=1;i<=5;i++){
PlayerB.setHands(deckMaster.provideNewCards());}
        
        System.out.println(PlayerB.getHands());
        System.out.println("Soma dos valores das cartas de "+PlayerB.getName()+": "+PlayerB.getTestando());
        System.out.println("----------------------------------------------------------------------------------");
       // System.out.println("Selecione o jogo que deseja jogar: ");

    }
 }
