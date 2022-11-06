package HW2N1;
import java.util.Scanner;
import java.lang.*;

public class Tester {
    public static void main(String[] args) {
        Author Pushkin = new Author("Aleksandr", "Push.com", 'm');

        System.out.println(Pushkin.toString());
        Pushkin.setEmail("ASPush.com");
        System.out.println(Pushkin.toString());
    }
}
