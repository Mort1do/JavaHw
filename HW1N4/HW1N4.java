package HW1N4;
import java.util.Scanner;

public class HW1N4 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Input the numbers: ");
        for(int i = 0; i < 10; i++){
            array[i] = cin.nextInt();
        }
        int n = 1;
        int max = -10000;
        int min = 10000;
        while(array.length - n >= 0){
            if (array[n-1] > max){
                max = array[n-1];
            }
            if (array[n-1] < min){
                min = array[n-1];
            }
            n++;
        }
        int m = 1;
        int sum = 0;
        while(array.length - m >= 0){
            sum = sum + array[m-1];
            m++;
        }
        System.out.println("The sum of array elements is " + sum);
        System.out.println("The max element of array is " + max);
        System.out.println("The min element of array is " + min);
    }
}
