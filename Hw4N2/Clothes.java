package Hw4N2;

public abstract class Clothes {
    private ClSize.clsize size;
    private int cost;
    private String color;

    public Clothes(ClSize.clsize size, int cost, String color){
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClSize.clsize getSize() {
        return size;
    }

    @Override
    public String toString(){
        return '\n' + "size is " + size + " color is " + color + " which has costs: " + cost;
    }
}
