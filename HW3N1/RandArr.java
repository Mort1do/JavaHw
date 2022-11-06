package HW3N1;
import java.util.Arrays;
import java.util.Random;

public class RandArr {
    public static void main(String[] args) {
        Random rnd = new Random();
        double[] arr = new double[10];
        for (int i = 0; i < 4; i++) {
            arr[i] = Math.random() * 1000;
        }

        for (int i = 4; i < 10; i++) {
            arr[i] = rnd.nextDouble(1000);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println('\n');
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
