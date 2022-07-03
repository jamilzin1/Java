package jamilzin.cassino;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class Player {
 ArrayList<Card>  hands = new ArrayList<>();
 
   public Player(){
        this.hands = new ArrayList<>();
    }
   
    public ArrayList<Card> getHands() {
        return hands;
    }
    
    public int getTestando(){
   return  hands.stream().mapToInt(Card::getValue).sum();
    }
    
    public void setHands(ArrayList<Card> hands) {
        this.hands = hands;
    }
}
