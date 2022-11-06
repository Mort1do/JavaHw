package HW3N4;

import java.util.Scanner;
import java.util.Random;

public class ArrNEl {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Random rnd = new Random();
        int n = cin.nextInt();
        //if(n%1 != 0 && n <= 0){
        //    System.out.println("Error! Check the inputting number");
        //}
        double[] arr_1 = new double[n+1];
        double[] arr_2 = new double[n/2+1];


        for(int i = 0; i < n; i++){
            arr_1[i] = (int)rnd.nextDouble(1,100)/1;
        }
        for(int i = 0; i < n/2+1; i++){
            arr_2[i] = arr_1[2 * i];
        }
        for(int i = 0; i < n; i++){
            System.out.println("First array: " + arr_1[i]);
        }
        System.out.println('\n');
        if(n%2 == 1) {
            for (int i = 0; i < n / 2 + 1; i++) {
                System.out.println("Second array: " + arr_2[i]);
            }
        }
        else{
            for (int i = 0; i < n / 2; i++) {
                System.out.println("Second array: " + arr_2[i]);
            }
        }
    }
}
