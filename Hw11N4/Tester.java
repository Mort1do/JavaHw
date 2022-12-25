package Hw11N4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Tester {
    public static void main (String[] args) {
        try {
            System.out.println("Enter <Year><Month><Day>");
            //<2003><10><23>
            Scanner scanner = new Scanner(System.in);
            String ymd = scanner.nextLine();
            System.out.println("Enter <Hours><Minutes>");
            //<11><00>
            String hm = scanner.nextLine();
            String[] strYearMonthDay = ymd.substring(1, ymd.length() - 1).split("><");
            String[] strHoursMinutes = hm.substring(1, hm.length() - 1).split("><");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/hh/mm");
            Date date = sdf.parse(strYearMonthDay[0] + "/" +
                    strYearMonthDay[1] + "/" +
                    strYearMonthDay[2] + "/" +
                    strHoursMinutes[0] + "/" +
                    strHoursMinutes[1]);
            System.out.println(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println(calendar.getTime());
        } catch (ParseException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input");
        }
    }
}
