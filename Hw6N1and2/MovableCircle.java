package Hw6N1and2;

public class MovableCircle implements Movable{
    private MovablePoint center;
    private int r;

    MovableCircle(MovablePoint center, int r){
        this.center = center;
        this.r = r;
    }

    public MovablePoint getCenter() {
        return center;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }


}
