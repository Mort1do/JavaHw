package Hw6Nfrom6to9;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Printable> print = new ArrayList<>();
        print.add(new Book("1984", "Oruel", 300));
        print.add(new Book("Master and Margarita", "Bulgakov", 400));
        print.add(new Magazine("Playboy", 7));

        for(int i = 0; i < print.size(); i++){
            print.get(i).print();
        }
    }
}
