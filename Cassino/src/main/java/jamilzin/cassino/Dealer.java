
package jamilzin.cassino;

import java.util.ArrayList;
import java.util.stream.*;

public class Dealer {
  ArrayList<Card> dealerHands = new ArrayList<>();

    Dealer(){
    }

    public ArrayList<Card> getDealerHands() {
     //   System.out.println("Dealer Hands: ");
       return dealerHands;
    }

    public void setDealerHands(ArrayList<Card> dealerHands) {
        this.dealerHands = dealerHands;
    } 
    public int getSumDealer(){
    return  dealerHands.stream().mapToInt(Card::getValue).sum();
    }
}
