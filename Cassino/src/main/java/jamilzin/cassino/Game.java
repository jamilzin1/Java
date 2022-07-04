
package jamilzin.cassino;

import java.util.Scanner;


public class Game {
    
       Game(){
    }
// Creating deck, dealer, player
 Scanner scanner = new Scanner(System.in);
 Deck deckMaster = new Deck();
 Dealer dealerHouse = new Dealer();
 Player PlayerA = new Player();
 Player PlayerB = new Player();

 public void compare(){
 }
     public void startGame(){ 
     System.out.println("----------------------------------------------------------------------------------");
    System.out.println("                      Sejam bem-vindos ao Cassino de jamilzin! ");
    System.out.println("----------------------------------------------------------------------------------");
     dealerHouse.setDealerHands(deckMaster.provideDealerCards());
     PlayerA.setHands(deckMaster.provideCards());
     PlayerB.setHands(deckMaster.provideNewCards());
     dealerHouse.setDealerHands(deckMaster.provideDealerCards());
     PlayerA.setHands(deckMaster.provideCards());
     PlayerB.setHands(deckMaster.provideNewCards());
     PlayerName();

    }
     
     public void dealerCard(){
 dealerHouse.setDealerHands(deckMaster.provideDealerCards());
         System.out.println(dealerHouse.getDealerHands());
 }
     
     public int getSumDealer(){
   return dealerHouse.getSumDealer();}
     
     public void PlayerName(){
     System.out.println("Ola jogador 1, diga seu nome: ");
     String name = scanner.next();
     PlayerA.setName(name);
     System.out.println("Seja bem-vindo "+PlayerA.getName());
     System.out.println("Ola jogador 2, diga seu nome: ");
     name = scanner.next();
     PlayerB.setName(name);
     System.out.println("Seja bem-vindo "+PlayerB.getName());

     }
     
     public void playerCard(Player player){
         if (player == PlayerA){
     player.setHands(deckMaster.provideCards());}
         
     else if (player == PlayerB){
       player.setHands(deckMaster.provideNewCards());}
       
        else {
             System.out.println("JOGADOR INEXISTENTE. TENTE NOVAMENTE");}}
     
     public int getSumPlayer(Player player){
        return player.getSumPlayer();
     }
     
}
