package Hw4_1N1;

public class Rectangle extends Shape{
    private double a;
    private double b;
    public Rectangle(String type, double a, double b){
        super(type);
        this.a = a;
        this.b = b;
    }

    public double getArea(){
        return a * b;
    }

    public double getPer(){
        return 2 * (a + b);
    }

    @Override
    public String toString(){
        return getType() + " with a = " + a + " b = " + b;
    }
}
