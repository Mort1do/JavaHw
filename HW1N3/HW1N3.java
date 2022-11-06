package HW1N3;
import java.util.Scanner;
public class HW1N3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double array[] = new double[10];
        System.out.println("Input the numbers: ");
        for(int i = 0; i < 10; i++){
            array[i] = cin.nextDouble();
        }
        double sum = 0;
        for(int i = 0; i < 10; i++){
            //System.out.println(array[i]);
            sum = sum + array[i];
        }
        System.out.println("The sum of array elements is " + sum);
        double avrg = sum/10;
        System.out.println("The average of array elements is  " + avrg);
    }
}