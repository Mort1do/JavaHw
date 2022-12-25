package Hw8N8;
import java.util.Scanner;

public class Tester {
    public static void isPalindrom(String s){
        boolean ans = isPalindromRecur(s, 0, s.length() - 1);
        if(ans) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean isPalindromRecur(String s, int left_ind, int right_ind){
        if (left_ind > right_ind) return true;
        if (s.charAt(left_ind) == s.charAt(right_ind)){
            return isPalindromRecur(s, left_ind + 1, right_ind - 1);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        isPalindrom(s);
    }
}
