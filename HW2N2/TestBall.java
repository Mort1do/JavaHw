package HW2N2;

public class TestBall {
    public static void main(String[] args) {
        Ball basket_ball = new Ball(12,14);
        System.out.println(basket_ball.toString());
        System.out.println("Ball moving simulation: ");
        basket_ball.move();
        System.out.println(basket_ball.toString());
    }
}
