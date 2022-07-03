
package jamilzin.cassino;

import java.util.ArrayList;


public class Dealer {
  ArrayList<Card> dealerHands = new ArrayList<>();

    Dealer(){
    }

    public ArrayList<Card> getDealerHands() {
        System.out.println("Dealer Hands: ");
       return dealerHands;
    }

    public void setDealerHands(ArrayList<Card> dealerHands) {
        this.dealerHands = dealerHands;
    } 
}
