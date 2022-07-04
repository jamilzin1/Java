
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

     public void startGame(){ 
     linha();
    System.out.println("                      Welcome to Cassino of jamilzin! ");
     linha();
     dealerHouse.setDealerHands(deckMaster.provideDealerCards());
     PlayerA.setHands(deckMaster.provideCards());
     PlayerB.setHands(deckMaster.provideNewCards());
     dealerHouse.setDealerHands(deckMaster.provideDealerCards());
     PlayerA.setHands(deckMaster.provideCards());
     PlayerB.setHands(deckMaster.provideNewCards());
     PlayerName();
    System.out.print("\n \n \n \n");  
 System.out.println("Welcome "+PlayerA.getName()+"!");
     System.out.println("Welcome "+PlayerB.getName()+"!");

     linha();
     System.out.println("Blackjack will begin! GETS READY! \n");
     System.out.println("The dealer's first card is:\n" +dealerHouse.dealerHands.get(1));
     linha();
     gameplay();

    }
     public void gameplay(){
        buyHouse(PlayerA);
        buyHouse(PlayerB);
     }
     
     public void buyHouse(Player player){
      System.out.println("HELLO "+player.getName()+" DO YOU WANT BUY MORE?");
      cards(player);
       System.out.println("press 1 to buy or type anything if you're ok");
       linha();
       String shop = scanner.next();
         
         if("1".equals(shop)){
         playerCard(player);
         linha();
         buyHouse(player);}
         else 
         System.out.print("\n \n \n \n \n \n  \n \n \n \n \n \n \n \n \n \n");  
         System.out.println(" Ok "+player.getName()+ " thank you! Good luck! \n");
        cards(player);
           System.out.print("\n");  
            linha();
           System.out.print("\n");  

     }
     public  void cards(Player player){
     System.out.println("Your cards are: "+player.hands);}

     public void linha(){
     System.out.println("----------------------------------------------------------------------------------");
}
     public void dealerCard(){
 dealerHouse.setDealerHands(deckMaster.provideDealerCards());
 
         System.out.println(dealerHouse.getDealerHands());
 }
     
     public int getSumDealer(){
   return dealerHouse.getSumDealer();}
     
     public void PlayerName(){
     System.out.println("Hello Player 1, type your name: ");
     String name = scanner.next();
     PlayerA.setName(name);
     System.out.println("Hello Player 2, type your name: ");
     name = scanner.next();
     PlayerB.setName(name);

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
