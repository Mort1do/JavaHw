package HW2N2;

public class Ball {
    private double x = 0;
    private double y = 0;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(){
         for(int i = 0; i < 5; i++) {
             y = y + 5 - i;
             while (y != 0) {
                 y--;
                 x++;
                 System.out.println(x + " " + y);
             }
         }
    }

    @Override
    public String toString(){
        return "Ball{" +
                "x = " + x +
                "; y = " + y +
                '}';
    }
}
