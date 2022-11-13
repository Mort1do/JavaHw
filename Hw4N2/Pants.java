package Hw4N2;

public class Pants extends Clothes implements Clothing.ManClothing, Clothing.WomanClothing{
    public Pants(ClSize.clsize size, int cost, String color){
        super(size,cost,color);
    }

    public void dressMan() {
        System.out.println("Man was dressed with Pants");
    }

    public void dressWoman() {
        System.out.println("Woman was dressed with Pants");
    }
}
