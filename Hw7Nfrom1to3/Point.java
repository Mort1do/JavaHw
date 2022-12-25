package Hw7Nfrom1to3;

public class Point implements Movable{
    private int x;
    private int y;
    private int speed;

    public Point(){this.x = 0; this.y = 0; this.speed = 1;}
    public Point(int x, int y){this.x = x; this.y = y; this.speed = 1;}
    public Point(int x, int y, int speed){this.x = x; this.y = y; this.speed = speed;}

    public int getX() {return x;}
    public int getY() {return y;}
    public int getSpeed() {return speed;}

    public void setSpeed(int speed) {this.speed = speed;}

    @Override
    public String toString() {return "MovablePoint{" + "x=" + x + ", y=" + y + ", speed=" + speed + '}';}

    @Override
    public void moveUp() {this.y += this.speed;}

    @Override
    public void moveDown() {this.y -= this.speed;}

    @Override
    public void moveRight() {this.x += speed;}

    @Override
    public void moveLeft() {this.x -= speed;}
}
