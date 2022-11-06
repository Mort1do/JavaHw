package Hw2N5;
import java.util.Scanner;
import java.util.ArrayList;

public class Nursery {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Dog> dog = new ArrayList<Dog>();

        for (int i = 0; i < 4; i++) {
            System.out.println("Input the name of " + (i + 1) + " dog: ");
            String name = cin.next();
            System.out.println("Input the age of " + (i + 1) + " dog: ");
            int age = cin.nextInt();
            dog.add(new Dog(name, age));
        }
        System.out.println(dog.toString());

        System.out.println("Input the number of dog you need to count human age: ");
        int num = cin.nextInt();
        System.out.println(Nursery.RecountAge(dog.get(num-1)));

    }

    public static int RecountAge(Dog dog_a) {
        return dog_a.DHage();
    }

}
