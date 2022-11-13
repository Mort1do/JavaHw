package Hw4N3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

public class Tester {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Hat> hat_cat = new ArrayList<>();
        ArrayList<Pants> pants_cat = new ArrayList<>();
        ArrayList<Tshirt> tshirt_cat = new ArrayList<>();
        ArrayList<Wear> shop_cart = new ArrayList<>();

        hat_cat.add(new Hat("blue",1200, 42));
        hat_cat.add(new Hat("red",1300, 40));
        hat_cat.add(new Hat("green",1200, 42));

        pants_cat.add(new Pants("red", 4000, 42));
        pants_cat.add(new Pants("blue", 3000, 40));

        tshirt_cat.add(new Tshirt("black", 2000, 40));

        String log = "admin";
        String pass = "12345";

        System.out.println("Enter username:");
        String log_in = cin.next();
        System.out.println("Enter the password:");
        String pass_in = cin.next();
        if(Objects.equals(log_in, log) && Objects.equals(pass_in, pass)){
                while(Objects.equals(log_in, log)){
                System.out.println("1)List of catalogs" + '\n' + "2)Shopping cart" + '\n' + "3)Exit" + '\n' + "Input the number of option: ");
                int num1 = cin.nextInt();
                switch(num1) {
                    case 1:
                        System.out.println("1)Hats" + '\n' + "2)Pants" + '\n' + "3)Tshirts" + '\n' + "Input the number of catalog: ");
                        int num2 = cin.nextInt();
                        int num_cl = 0;
                        switch (num2) {
                            case 1:
                                for (int i = 0; i < hat_cat.size(); i++) {
                                    System.out.println((i + 1) + ") " + hat_cat.get(i));
                                }
                                System.out.println("Do you want to buy somethink?");
                                num_cl = cin.nextInt();
                                shop_cart.add(hat_cat.get(num_cl-1));
                                break;
                            case 2:
                                for (int i = 0; i < pants_cat.size(); i++) {
                                    System.out.println((i + 1) + ") " + pants_cat.get(i));
                                }
                                System.out.println("Do you want to buy somethink?");
                                num_cl = cin.nextInt();
                                shop_cart.add(pants_cat.get(num_cl-1));
                                break;
                            case 3:
                                for (int i = 0; i < tshirt_cat.size(); i++) {
                                    System.out.println((i + 1) + ") " + tshirt_cat.get(i));
                                }
                                System.out.println("Do you want to buy somethink?");
                                num_cl = cin.nextInt();
                                shop_cart.add(tshirt_cat.get(num_cl-1));
                                break;
                        }
                        System.out.println("-------------------------");
                        break;
                    case 2:
                        System.out.println("Shopping cart:" + '\n');
                        if(shop_cart.size() == 0){
                            System.out.println("Shopping cart is empty");
                            System.out.println("-------------------------");
                            break;
                        }
                        for(int i = 0; i < shop_cart.size(); i++){
                            System.out.println((i + 1) + ") " + shop_cart.get(i));
                        }
                        System.out.println("1)Buy this clothes" + '\n' + "2)Delete something" + '\n' + "Input the number of option: ");
                        int num3 = cin.nextInt();
                        switch(num3){
                            case 1:
                                System.out.println("Clothes were bought, Thank you!");
                                shop_cart.clear();
                                break;
                            case 2:
                                System.out.println("Which clothes do you want to delete from shopping cart?");
                                num_cl = cin.nextInt();
                                shop_cart.remove(num_cl-1);
                        }
                        System.out.println("-------------------------");
                        break;
                    case 3:
                        return;
                }
            }
        }
        else{
            System.out.println("Login or password is wrong");
        }

    }
}
