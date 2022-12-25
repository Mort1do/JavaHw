package Hw6N3and4;

public class Pets implements Nameable, Priceable{
    private String name;
    private int price;

    public Pets(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
}
