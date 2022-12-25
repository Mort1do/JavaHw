package Hw8N7;
import java.util.Scanner;

public class Tester {
    public static void find_multipl(int n, int k){
        if(k > n) {System.out.println("End");}
        else{
            if(n % k == 0){
                System.out.println(k);
                while (n % k == 0){
                    n /= k;
                }
            }
            find_multipl(n, k + 1);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        find_multipl(n, 2);
    }
}
