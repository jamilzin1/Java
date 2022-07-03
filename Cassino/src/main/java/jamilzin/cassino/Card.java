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
        switch(value){
            case 1: return 11;
            case 11: return 10;
            case 12: return 10;
            case 13: return 10;
            default: return value;
        }
    }

public String getValueString(){
switch(value){
    case 1: return "A";
    case 2: return "2";
    case 3: return "3";
    case 4: return "4";
    case 5: return "5";
    case 6: return "6";
    case 7: return "7";
    case 8: return "8";
    case 9: return "9";
    case 10: return "10";
    case 11: return "J";
    case 12: return "Q";
    case 13: return "K";
    default: return "";
}
}

    @Override
    public String toString() {
     return getValueString() + getSuit();
}
}