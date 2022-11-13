package Hw4N3;

public abstract class Wear {
    private String color;
    private int cost;
    private int size;

    public Wear(String color, int cost, int size){
        this.color = color;
        this.cost = cost;
        this.size = size;
    }

    @Override
    public String toString(){
        return  "color = " + color + " cost = " + cost + " size = " + size;
    }
}
