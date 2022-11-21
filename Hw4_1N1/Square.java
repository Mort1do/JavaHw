package Hw4_1N1;

public class Square extends Shape{
    private double a;
    public Square(String type, double a){
        super(type);
        this.a = a;
    }

    public double getArea(){
        return Math.pow(a,2);
    }

    public double getPer(){
        return 4 * a;
    }

    @Override
    public String toString(){
        return getType() + " with a = " + a;
    }
}

