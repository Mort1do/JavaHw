package Hw2N9;

public class Card {
    private int num;
    private String suit;

    public Card(int num, String suit){
        this.num = num;
        this.suit = suit;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString(){
        return num + " - " + suit;
    }
}
