package Hw2N10;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Input the sentense: ");
        String text = cin.nextLine();
        int num = 1;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                num++;
            }
        }
        System.out.println("The number of words = " + num);
    }
}
