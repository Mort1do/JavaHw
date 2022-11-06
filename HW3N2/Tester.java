package HW3N2;

import Hw2N7.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Circle> cir = new ArrayList<Circle>();
        cir.add(new Circle(rnd.nextDouble(50), new Point(rnd.nextDouble(100), rnd.nextDouble(100))));
        cir.add(new Circle(rnd.nextDouble(50), new Point(rnd.nextDouble(100), rnd.nextDouble(100))));
        cir.add(new Circle(rnd.nextDouble(50), new Point(rnd.nextDouble(100), rnd.nextDouble(100))));
        cir.add(new Circle(rnd.nextDouble(50), new Point(rnd.nextDouble(100), rnd.nextDouble(100))));

        double max = 0;
        int maxN = 0;
        double min = 51;
        int minN = 0;
        for(int i = 0; i < cir.size(); i++){
            if(cir.get(i).getR() < min){
                min = cir.get(i).getR();
                minN = i;
            }
            if(cir.get(i).getR() > max){
                max = cir.get(i).getR();
                maxN = i;
            }
        }
        System.out.println("The min circle is " + cir.get(minN) + '\n' + "The max circle is " + cir.get(maxN));

        System.out.println(cir.toString());

        int i = 0;
        while(i != cir.size()-1){
            if(cir.get(i).getR() > cir.get(i+1).getR()){
                Circle cash = cir.get(i);
                cir.set(i, cir.get(i+1));
                cir.set(i+1, cash);
                i = 0;
            }
            else {
                i++;
            }
        }
        System.out.println('\n' + "After sort:" + '\n');
        System.out.println(cir.toString());

    }


}
