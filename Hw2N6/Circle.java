package Hw2N6;

public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public String toString(){
        return "\n" + "x=" + x + "y=" + y + "r=" + r;
    }
}
