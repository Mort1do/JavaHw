package Hw6N3and4;

public class Cars implements Nameable, Priceable{
    private String name;
    private int maxspeed;
    private int price;

    public Cars(String name, int maxspeed, int price){
        this.name = name;
        this.maxspeed = maxspeed;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
}
