package Hw6N12;
import java.util.Stack;

public class StringBuilder {
    private StringBuilder stringBuilder;
    private Stack<Action> actions = new Stack<>();

    public StringBuilder() {
        this.stringBuilder = new StringBuilder();
    }

    public StringBuilder reverse() {
        stringBuilder.reverse();
        Action action = () -> stringBuilder.reverse();
        actions.add(action);
        return this;
    }


    //public StringBuilder append(String str) {
    //    stringBuilder.append(str);
    //    Action action = () -> stringBuilder.delete(
    //            stringBuilder.length() - str.length() -1,
    //            stringBuilder.length());
    //    actions.add(action);
    //    return this;
    //}
}
