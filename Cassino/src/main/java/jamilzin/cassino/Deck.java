package jamilzin.cassino;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.function.Function;

 // /*
   public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();
    public  ArrayList<Card> retorno = new ArrayList<>();
    private ArrayList<String> suits = new ArrayList(Arrays.asList(" Diamonds", " Clubs", " Spades", " Hearts"));
    Random gerador = new Random(52);
    
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
   Card testa = (deck.get(number));
  retorno.add(testa);
   deck.set(number, null);
        return  retorno ;} 

@Override
public String toString(){
    return deck.toString();
    }   
   } //public class Deck
// 



































////////////////////////////////////// ARRAY CODE
      /*
     public class Deck {

    private Card[] deck;
    private String[] suits = {"Diamonds", "Clubs", "Spades", "Hearts"};
    private Random gerador = new Random();
    
    public Deck(){
        deck = new Card[52];
        int k = 0;
        for(int j = 0; j< suits.length;j++){
            for(int i = 0;i< 13;i++){
                deck[k] = new Card((i+1),suits[j]); 
                k++;
            }// for i
        } // for j
    } // deck()
   
  
        
@Override
public String toString() {
    return Arrays.toString(deck);
} 
 } // public class Deck 

 */


///////////////////////////////////////// ARRAYLIST CODE