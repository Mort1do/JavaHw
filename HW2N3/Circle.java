package HW2N3;

public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String toString(){
        return "Circle{x=" + x + " y=" + y + "r=" + r + '}';
    }
}
