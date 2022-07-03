package jamilzin.cassino;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class Player {
 ArrayList<Card>  hands = new ArrayList<>();
    public String name;

 
   public Player(){
       this.name= name;
this.hands = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public ArrayList<Card> getHands() {
        System.out.println("As cartas do "+name+ " sao: ");
    return hands;
    }
    
    public int getTestando(){
   return  hands.stream().mapToInt(Card::getValue).sum();
    }

    public String getName() {
        return name;
    }
    
    public void setHands(ArrayList<Card> hands) {
        this.hands = hands;
    }
}
