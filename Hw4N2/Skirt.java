package Hw4N2;

public class Skirt extends Clothes implements Clothing.WomanClothing{
    public Skirt(ClSize.clsize size, int cost, String color){
        super(size,cost,color);
    }

    public void dressWoman() {
        System.out.println("Woman was dressed with Skirt");
    }
}
