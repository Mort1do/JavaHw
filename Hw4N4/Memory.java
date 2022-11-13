package Hw4N4;

public class Memory {
    int value;
    Memory(int value)
    {
        this.value = value;
    }

    int getValue () {
        return value;
    }
    void setValue (int value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "the value of memory is " + value;
    }
}
