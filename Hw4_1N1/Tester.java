package Hw4_1N1;

public class Tester {
    public static void main(String[] args) {
        Circle crcl = new Circle("Circle 1", 5);
        Rectangle rctngl = new Rectangle("Rectangle 1", 4, 5);
        Square sqr = new Square("Square 1", 4);

        System.out.println("Area of circle: " + crcl.getArea());
        System.out.println("Perimetr of circle: " + crcl.getPer());
        System.out.println(crcl.toString());
        System.out.println('\n' + "------------------------------------------");

        System.out.println("Area of rectangle: " + rctngl.getArea());
        System.out.println("Perimetr of rectangle: " + rctngl.getPer());
        System.out.println(rctngl.toString());
        System.out.println('\n' + "------------------------------------------");

        System.out.println("Area of square: " + sqr.getArea());
        System.out.println("Perimetr of square: " + sqr.getPer());
        System.out.println(sqr.toString());
    }
}
