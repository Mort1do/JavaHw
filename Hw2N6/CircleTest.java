package Hw2N6;
import java.util.Scanner;
import java.util.ArrayList;

public class CircleTest {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Circle> cir = new ArrayList<Circle>();

        System.out.println("Input the x of circle 1: ");
        int x = cin.nextInt();
        System.out.println("Input the y of circle 1: ");
        int y = cin.nextInt();
        System.out.println("Input the r of circle 1: ");
        int r = cin.nextInt();
        cir.add(new Circle(x,y,r));

        System.out.println("1)Find P of circle" + '\n' + "2)Find S of circle" + '\n' + "3)Compare the circles" + '\n' + "Input the number of operation: ");
        int num = cin.nextInt();
        if(num == 1){
            System.out.println(FindP(cir.get(0)));
        }
        else if(num == 2){
            System.out.println(FindS(cir.get(0)));
        }
        else if(num == 3){
            System.out.println("Input the x of circle 2: ");
            int x1 = cin.nextInt();
            System.out.println("Input the y of circle 2: ");
            int y1 = cin.nextInt();
            System.out.println("Input the r of circle 2: ");
            int r1 = cin.nextInt();
            cir.add(new Circle(x1,y1,r1));
            System.out.println(CheckCir(cir.get(0),cir.get(1)));
        }
    }
    public static double FindP(Circle PCir){
        return PCir.getR() * Math.PI + 2;
    }
    public static double FindS(Circle SCir){
        return 2 * Math.pow(SCir.getR(),2);
    }
    public static String CheckCir(Circle cir1, Circle cir2){
        if(cir1.getR() > cir2.getR()){
            return "Circle 1 more than circle 2";
        }
        else if(cir1.getR() < cir2.getR()){
            return "Circle 2 more than circle 1";
        }
        else{
            return "Cirles are equal";
        }
    }



}
