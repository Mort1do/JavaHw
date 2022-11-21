package Hw4_1N7;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Learner> lrnrs = new ArrayList<>();
        lrnrs.add(new Student("Andrey", 20, 2));
        lrnrs.add(new Student("Masha", 19, 1));
        lrnrs.add(new Scholar("Ivan", 17, 10));
        lrnrs.add(new Scholar("Vera", 12, 7));

        System.out.println("Students:");
        for(int i = 0; i < lrnrs.size(); i++){
            if(lrnrs.get(i) instanceof Student){
                System.out.println(lrnrs.get(i).toString());
            }
        }

        System.out.println("Scholars:");
        for(int i = 0; i < lrnrs.size(); i++){
            if(lrnrs.get(i) instanceof Scholar){
                System.out.println(lrnrs.get(i).toString());
            }
        }
    }
}
