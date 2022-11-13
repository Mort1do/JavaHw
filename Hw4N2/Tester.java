package Hw4N2;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Clothes> clt = new ArrayList<>();
        Atelier atl = new Atelier();
        Scanner cin = new Scanner(System.in);
        clt.add(new TShirt(ClSize.clsize.XS, 3000, "red"));
        clt.add(new Pants(ClSize.clsize.M, 6000, "blue"));
        clt.add(new Skirt(ClSize.clsize.S, 4000, "pink"));
        clt.add(new Tie(ClSize.clsize.L, 1000, "purple"));

        System.out.println("1)Dress woman" + '\n' + "2)Dress man" + '\n' + "input the number of function: ");
        int num = cin.nextInt();
        switch(num){
            case 1:
                System.out.println(atl.dressWoman(clt));
                break;
            case 2:
                System.out.println(atl.dressMan(clt));
                break;
        }
    }
}
