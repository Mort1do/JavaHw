package Hw11N2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter date in format \"dd/MM/yyyy\"");
        Scanner scan = new Scanner(System.in);
        String stringDate = scan.nextLine();
        try {
            Date usersDate = sdf.parse(stringDate);
            int result = date.compareTo(usersDate);
            switch (result) {
                case 1 ->
                        System.out.println("Less");
                case -1 ->
                        System.out.println("Bigger");
                case 0 ->
                        System.out.println("Equals");
            }
        } catch (ParseException e) {
            System.out.println("U entered date the wrong way");
        }
    }
}