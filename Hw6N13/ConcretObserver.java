package Hw6N13;

public class ConcretObserver implements Observer{
    @Override
    public void HadleEvent(StringBuilder stringBuilder) {
        System.out.println("Changes: " + stringBuilder.toString());
    }
}
