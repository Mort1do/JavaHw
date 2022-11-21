package Hw4_1N4;

public class Matrix {
    private int m;
    private int n;
    private double mat[][];

    public Matrix(int m, int n, double mat[][]){
        this.m = m;
        this.n = n;
        this.mat = mat;
    }

    public double[][] getMat() {
        return mat;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public void getFullMat(){
        for(int i = 0; i < m; i++){
            System.out.print('\n');
            System.out.print('[');
            for(int u = 0; u < n; u++){
                //System.out.println(i + ' ' + u);
                System.out.print(mat[i][u]);
                System.out.print(' ');
            }
            System.out.print(']');
        }
    }
}
