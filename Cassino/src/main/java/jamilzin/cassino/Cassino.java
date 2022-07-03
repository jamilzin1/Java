
package jamilzin.cassino;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
 dealerHouse.setDealerHands(deckMaster.provideCards());
Player PlayerA = new Player();
Player PlayerB = new Player();
//System.out.println("Jogador 1 digite seu nome: ");
//String nameA = scanner.next();
//PlayerA.setName(nameA);
PlayerA.setName("Joao");
PlayerB.setName("Vitor");
System.out.println(dealerHouse.getDealerHands());
        System.out.println("----------------------------------------------------------------------------------");
for(int i=1;i<=5;i++){
 PlayerA.setHands(deckMaster.provideCards());}

for(int i=1;i<=5;i++){
PlayerB.setHands(deckMaster.provideNewCards());}
        System.out.println(PlayerA.getHands());
        System.out.println("Soma dos valores das cartas de "+PlayerA.getName()+": "+PlayerA.getTestando());
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(PlayerB.getHands());
        System.out.println("Soma dos valores das cartas de "+PlayerB.getName()+": "+PlayerB.getTestando());
        System.out.println("----------------------------------------------------------------------------------");
       // System.out.println("Selecione o jogo que deseja jogar: ");

    }
 }
