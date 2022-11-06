package HW1N7;
import java.util.Scanner;

public class HW1N7 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int fact = cin.nextInt();
        long fact_res = 1;
        if(fact < 1){
            System.out.println("Check the number");
        }
        else {
            for (int i = 1; i <= fact; i++) {
                fact_res = fact_res * i;
                System.out.println(fact_res);
            }
            System.out.println("Result of factorial " + fact + " is " + fact_res);
        }
    }
}
