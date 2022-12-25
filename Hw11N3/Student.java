package Hw11N3;

import com.sun.source.tree.BreakTree;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    Date birthDate;

    Student (String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.birthDate = sdf.parse(date);
        } catch (ParseException e) {
            System.out.println("wrong date format");
        }
    }

    public String toString (TypesOfData type) {
        SimpleDateFormat method;
        switch (type) {
            case SHORT -> {
                method = new SimpleDateFormat("dd MMMM");
                return method.format(birthDate);
            }
            case MID -> {
                method = new SimpleDateFormat("dd MMMM yyyy 'года'");
                return method.format(birthDate);
            }
            default -> {
                method = new SimpleDateFormat("dd MMMM yyyy 'года,' EEEE");
                return method.format(birthDate);
            }
        }
    }
}