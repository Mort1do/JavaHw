package Hw4N1;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);

    seasons.Seasons favseas = seasons.Seasons.Spring;               //1
    System.out.println("My favourite season is " + favseas + '\n');

    seasons.Seasons seas1 = seasons.Seasons.Summer;                 //2
    switch(seas1){
        case Autumn:
            System.out.println("I love " + seas1);
        case Winter:
            System.out.println("I love " + seas1);
        case Spring:
            System.out.println("I love " + seas1);
        case Summer:
            System.out.println("I love " + seas1);
    }
    System.out.println('\n');

    for(seasons.Seasons seas: seasons.Seasons.values()){
        System.out.println(seas);
        System.out.println(seas.gettemp());
        System.out.println(seas.getDescription() + '\n');
    }
    }
}
