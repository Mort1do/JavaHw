package HW3N2;

public class Circle {
    private double r;
    private Point p;


    public Circle(double r, Point p){
        this.r = r;
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public Point getP() {
        return p;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString(){
        return '\n' + "Radius is " + r + " Point is " + p;
    }
}
