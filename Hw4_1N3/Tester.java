package Hw4_1N3;

public class Tester {
    public static void main(String[] args) {
        Person city = new Person("Alexey Alexeevich", 32);
        Person unknown = new Person();

        System.out.println(city.move());
        System.out.println(city.talk());
    }
}
