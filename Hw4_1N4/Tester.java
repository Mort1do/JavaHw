package Hw4_1N4;
import java.util.Scanner;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Matrix> matrixes = new ArrayList<>();
        double[][] mt1 = new double[3][3];
        double[][] mt2 = new double[3][3];
        double[][] mt3 = new double[3][4];
        int t = 1;
        for(int i = 0; i < 3; i++){
            for(int u = 0; u < 3; u++){
                mt1[i][u] = t;
                t++;
            }
        }
        t = 9;
        for(int i = 0; i < 3; i++){
            for(int u = 0; u < 3; u++){
                mt2[i][u] = t;
                t--;
            }
        }
        Matrix mat1 = new Matrix(3,3,mt1);
        Matrix mat2 = new Matrix(3,3,mt2);
        matrixes.add(mat1);
        matrixes.add(mat2);
        System.out.println("The list of matrixes:");
        for(int i = 0; i < matrixes.size(); i++){
            System.out.println((i+1));
            matrixes.get(i).getFullMat();
            System.out.println('\n');
        }
        System.out.println('\n');

        System.out.println("Menu:" + '\n' + "1)The sum of matrix" + '\n' + "2)Multiplication matrix to integer");
        int n = cin.nextInt();
        switch(n) {
            case 1:
                if (mat1.getM() == mat2.getM() && mat1.getN() == mat2.getN()) {
                    double[][] nmt = new double[mat1.getM()][mat1.getN()];
                    for (int i = 0; i < mat1.getM(); i++) {
                        for (int u = 0; u < mat1.getN(); u++) {
                            nmt[i][u] = mat1.getMat()[i][u] + mat2.getMat()[i][u];
                        }
                    }
                    Matrix nmat = new Matrix(mat1.getM(), mat1.getN(), nmt);
                    matrixes.add(nmat);
                    //nmat.getFullMat();
                } else {
                    System.out.println("Martixes have various values");
                    System.exit(0);
                }
                break;
            case 2:
                System.out.println("Input the constant");
                double cnst = cin.nextDouble();
                double[][] nmt = new double[mat1.getM()][mat1.getN()];
                for (int i = 0; i < mat1.getM(); i++) {
                    for (int u = 0; u < mat1.getN(); u++) {
                        nmt[i][u] = mat1.getMat()[i][u] * cnst;
                    }
                }
                Matrix nmat = new Matrix(mat1.getM(), mat1.getN(), nmt);
                matrixes.add(nmat);
                //nmat.getFullMat();
                break;
        }
        System.out.println("----------------------------------");
        System.out.println("The result:");
        matrixes.get(2).getFullMat();
    }
}
