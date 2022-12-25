package Hw6N13;

public class Tester {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.setObserver(new ConcretObserver());
        stringBuilder.append("ds");
        stringBuilder.reverse();
    }
}
