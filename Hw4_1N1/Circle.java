package Hw4_1N1;

public class Circle extends Shape{
    private double r;
    public Circle(String type, double r){
        super(type);
        this.r = r;
    }

    public double getArea(){
        return Math.PI * Math.pow(r,2);
    }

    public double getPer(){
        return 2 * Math.PI * r;
    }

    @Override
    public String toString(){
        return getType() + " with r = " + r;
    }
}
