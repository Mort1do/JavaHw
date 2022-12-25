package Hw6N10;
import java.util.ArrayList;

public class Shop implements ShopInterface{
    private ArrayList<Computer> shop = new ArrayList<>();

    @Override
    public void addComputer(Computer computer) {
        this.shop.add(computer);
        System.out.println("Computer was added");
    }

    @Override
    public void deleteComputer(Computer computer) {
        if(shop.contains(computer)){
            this.shop.remove(computer);
            System.out.println("Computer was removed");
        }
        else System.out.println("The list of computers is clear");
    }

    @Override
    public void seeCatalog() {
        for (Computer computer: this.shop) {
            System.out.println(computer);
        }
    }
}
