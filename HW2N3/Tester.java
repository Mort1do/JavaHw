package HW2N3;

public class Tester {
    public static void main(String[] args) {
            Circle Cir_1 = new Circle(3, 3, 3);
            Circle Cir_2 = new Circle(5, 4, 1);
            Circle Cir_3 = new Circle(6, 2, 10);
            Circle []arr = new Circle[3];

            arr[0] = Cir_1;
            arr[1] = Cir_2;
            arr[2] = Cir_3;

            for(int i = 0; i< arr.length; i++){
                System.out.println(arr[i]);
            }



    }
}
