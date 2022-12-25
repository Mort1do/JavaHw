package Hw7N4;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(int a, int b) {
        if(b == 1) return a;
        return a * pow(a, b - 1);
    }

    @Override
    public double absComplex(int real, int img) {
        return Math.sqrt(this.pow(real, 2) + this.pow(img, 2));
    }
}
