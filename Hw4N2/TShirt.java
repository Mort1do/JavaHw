package Hw4N2;

public class TShirt extends Clothes implements Clothing.ManClothing, Clothing.WomanClothing {
    public TShirt(ClSize.clsize size, int cost, String color){
        super(size,cost,color);
    }

    public void dressMan() {
        System.out.println("Man was dressed with Tshirt");
    }

    public void dressWoman() {
        System.out.println("Woman was dressed with Tshirt");
    }
}
