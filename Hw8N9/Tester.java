package Hw8N9;
import java.util.Scanner;

public class Tester {
    public static void HowMuch(int a, int b){
        MyInt count = new MyInt(0);
        HowMuchRecur(a, b, count, 1);
        System.out.println(count.val);
    }

    public static void HowMuchRecur(int a, int b, MyInt count, int prev){
        if(a != 0 && prev != 0){
            HowMuchRecur(a - 1, b, count, 0);
        }
        else if (a == 0 && b == 0) {
            count.val += 1;
            return;
        }
        if (b != 0){
            HowMuchRecur(a, b - 1, count, 1);
        }
        else if (a == 0 && b == 0) {
            count.val += 1;
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нули");
        int a = sc.nextInt();
        System.out.println("Введите еденицы");
        int b = sc.nextInt();
        HowMuch(a, b);
    }

}
