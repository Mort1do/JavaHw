package Hw2N4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class Tester {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        ArrayList<Computer> Pc = new ArrayList<Computer>();
        Pc.add(new Computer("asus", "rtx3060", 80000));
        Pc.add(new Computer("lenovo", "rtx3080", 130000));
        Pc.add(new Computer("hp", "gtx1060", 70000));
        Pc.add(new Computer("apple", "m1", 170000));

        System.out.println("Menu" + "\n" + "1)Add new computer to the List" + "\n" + "2)Delete computer from the List" + "\n" +
                "3)Find computer using GPU");
        System.out.println(Pc.toString());
        int num = cin.nextInt();
        if (num == 1) {                                          //Add computer
            System.out.println("Input the name of computer: ");
            String name = cin.next();
            System.out.println("Input the GPU of computer: ");
            String GPU = cin.next();
            System.out.println("Input the costs of computer: ");
            int costs = cin.nextInt();
            Pc.add(new Computer(name, GPU, costs));
            System.out.println("Complete!" + "\n");
            System.out.println(Pc.toString());
        }
        else if (num == 2) {                                      //Delete computer
            System.out.println("Input the number of computer for removing: ");
            int n = cin.nextInt();
            Pc.remove(n - 1);
            System.out.println("Complete!" + "\n");
            System.out.println(Pc.toString());
        }
        else if (num == 3) {                                    //Finding computer
            System.out.println("Input the GPU of computer you need to find: ");
            String finding = cin.next();
            for (int i = 0; i < Pc.size(); i++) {
                if(Objects.equals(findGPU(Pc.get(i)), finding)){
                    System.out.println(Pc.get(i));
                    System.out.println("Complete!" + "\n");
                }
                else{
                    System.out.println("No one computer using this GPU, try other GPU!");
                    break;
                }
            }
        }
        else {
            System.out.println("Please input 1, 2 or 3!");
        }
    }
    static String findGPU(Computer Pc_gpu){
        return Pc_gpu.getGPU();
    }
}