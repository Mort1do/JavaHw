package Hw11N1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tester {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date initialDate = sdf.parse("01/09/2022");
        Date currentDate = new Date();
        System.out.println("Author: Dmitry Yakovlev");
        System.out.println("Task received: " + initialDate);
        System.out.println("Task completed: " + currentDate);
    }
}