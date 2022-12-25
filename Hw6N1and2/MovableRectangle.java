package Hw6N1and2;

public class MovableRectangle implements Movable{

    private MovablePoint p1;
    private MovablePoint p2;
    private int a;
    private int b;

    MovableRectangle(MovablePoint p1, MovablePoint p2, int a, int b){
        this.p1 = p1;
        this.p2 = p2;
        this.a = a;
        this.b = b;
    }

    public MovablePoint getP1() {
        return p1;
    }

    public MovablePoint getP2() {
        return p2;
    }

    @Override
    public void moveUp() {
        if(p1.getySpeed() == p2.getySpeed()) {
            p1.moveUp();
            p2.moveUp();
        }
        else{
            System.out.println("Speed of points are not equal!");
        }
    }

    @Override
    public void moveDown() {
        if(p1.getySpeed() == p2.getySpeed()) {
            p1.moveDown();
            p2.moveDown();
        }
        else{
            System.out.println("Speed of points are not equal!");
        }
    }

    @Override
    public void moveLeft() {
        if(p1.getxSpeed() == p2.getxSpeed()) {
            p1.moveLeft();
            p2.moveLeft();
        }
        else{
            System.out.println("Speed of points are not equal!");
        }
    }

    @Override
    public void moveRight() {
        if(p1.getxSpeed() == p2.getxSpeed()) {
            p1.moveRight();
            p2.moveRight();
        }
        else{
            System.out.println("Speed of points are not equal!");
        }
    }
}
