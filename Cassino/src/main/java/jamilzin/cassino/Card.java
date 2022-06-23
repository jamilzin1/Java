package jamilzin.cassino;

public class Card {
    
    private String suit;
    private int value;
    
    Card(int value, String suit){
    this.value = value;
    this.suit = suit;
    
    }

    public String getSuit() {
        return suit;
    }


    public int getValue() {
        return value;
    }
    
    @Override
public String toString() {
    return getValue() + getSuit();
}
    
    
}


    

