
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
    System.out.println("Sejam bem-vindos ao Cassino de jamilzin! ");
    
   //     System.out.println("quantas cartas deseja?");
    //int user = scanner.nextInt();
 Deck deckMaster = new Deck();
Player PlayerA = new Player();
Player PlayerB = new Player();
for(int i=1;i<=5;i++){
 PlayerA.setHands(deckMaster.provideCards());}
for(int i=1;i<=5;i++){
PlayerB.setHands(deckMaster.provideNewCards());}

        System.out.println(PlayerA.getHands());
        System.out.println(PlayerB.getHands());
        
 //System.out.println("soma: "+PlayerA.getTestando());
        System.out.println(deckMaster);

       // System.out.println("Selecione o jogo que deseja jogar: ");


    }
 }
