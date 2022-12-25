package Hw6N3and4;

public class Tester {
    public static void main(String[] args) {
        Planets earth = new Planets("Earth", 6400);
        Cars ferrari = new Cars("Ferrari", 350, 50000000);
        Pets dog = new Pets("Mops", 40000);

        System.out.println(earth.getName());
        System.out.println(ferrari.getName());
        System.out.println(ferrari.getPrice());
        System.out.println(dog.getPrice());
    }
}
