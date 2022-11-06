package Hw2N8;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        String ls;
        for(int i = 0; i < list.size()/2; i++){
            ls = list.get(i);
            list.set(i,list.get(list.size()-1-i));
            list.set(list.size()-1-i,ls);
        }

        System.out.println('\n' + "Sorting..." + '\n');

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
