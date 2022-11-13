package Hw4N2;

public class Tie extends Clothes implements Clothing.ManClothing{
    public Tie(ClSize.clsize size, int cost, String color){
        super(size,cost,color);
    }

    public void dressMan() {
        System.out.println("Man was dressed with Tie");
    }
}
