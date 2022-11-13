package Hw4N2;
import java.util.ArrayList;
import java.util.Objects;

public class Atelier{

    public String dressMan(ArrayList<Clothes> clt) {
        for (int i = 0; i < clt.toArray().length; i++) {
            if (clt.get(i) instanceof Skirt){
                clt.remove(i);
            }
        }
        return clt.toString();
    }

    public String dressWoman(ArrayList<Clothes> clt) {
        for (int i = 0; i < clt.toArray().length; i++) {
            if (clt.get(i) instanceof Tie){
                clt.remove(i);
            }
        }
        return clt.toString();
    }
}
