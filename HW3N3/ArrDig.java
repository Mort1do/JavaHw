package HW3N3;

import java.util.Random;

public class ArrDig {
    public static void main(String[] args) {
        Random rnd = new Random();
        double[] arr = new double[4];
        for(int i = 0; i < 4; i++){
            arr[i] = rnd.nextDouble(10,99);
        }
        int num = 0;
        for(int i = 0; i < 3; i++){
            if(arr[i] > arr[i+1]){
                num++;
            }
        }
        for(int i = 0; i < 4; i++){
            System.out.println(arr[i]);
        }
        if(num == 0){
            System.out.println("The array is strictly increasing");
        }
        else{
            System.out.println("The array is not strictly increasing");
        }
    }
}
