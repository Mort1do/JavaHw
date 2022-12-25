package Hw6N1and2;

public class Tester {
    public static void main(String[] args) {
        //n1
        MovablePoint center = new MovablePoint(0,0,1,1);
        MovableCircle circle = new MovableCircle(center, 5);

        circle.moveDown();
        circle.moveRight();
        circle.moveDown();

        System.out.println(circle.getCenter().toString() + '\n');

        //n2
        MovablePoint p1 = new MovablePoint(0,0,1,1);
        MovablePoint p2 = new MovablePoint(2,-3, 1,1);
        MovablePoint p3 = new MovablePoint(2,-3,2,2);

        MovableRectangle rec1 = new MovableRectangle(p1,p2,2,3);
        MovableRectangle rec2 = new MovableRectangle(p1,p3,2,3);

        rec1.moveUp();
        rec1.moveRight();
        System.out.println("First point: " + rec1.getP1().toString() + ", second point: " + rec1.getP2().toString() + '\n');

        rec2.moveRight();
        System.out.println(rec2.getP1().toString());
    }
}
