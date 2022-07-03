package jamilzin.cassino;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

 // /*
   public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();
    public  ArrayList<Card> playerA = new ArrayList<>();
    public  ArrayList<Card> playerB = new ArrayList<>();
    public  ArrayList<Card> dealerCards = new ArrayList<>();
    private ArrayList<String> suits = new ArrayList(Arrays.asList(" Diamonds", " Clubs", " Spades", " Hearts"));
    Random gerador = new Random();
    
    public Deck(){
  for(int j=0; j<suits.size(); j++){ // Idea: create a 13 cards for each suits
      for(int i=0; i<13; i++){ 
 deck.add(new Card((i + 1), suits.get(j))); 
    } // for i
  } // for j
   Collections.shuffle(deck); // randomize the deck
} // deck()
    
public ArrayList<Card> provideCards(){
   int  number = gerador.nextInt(52);
   while(deck.get(number)==null){ 
        number = gerador.nextInt(52);}
   Card card = (deck.get(number));
  playerA.add(card);
   deck.set(number, null);
        return  playerA ;} 

public ArrayList<Card> provideNewCards(){
   int  number = gerador.nextInt(52);
   while(deck.get(number)==null){ 
        number = gerador.nextInt(52);}
   Card card = (deck.get(number));
  playerB.add(card);
   deck.set(number, null);
        return  playerB ;} 

public ArrayList<Card> provideDealerCards(){
   int  number = gerador.nextInt(52);
   while(deck.get(number)==null){ 
        number = gerador.nextInt(52);}
   Card card = (deck.get(number));
  dealerCards.add(card);
   deck.set(number, null);
        return  dealerCards ;} 


@Override
public String toString(){
    return deck.toString();
    }   
   } 
