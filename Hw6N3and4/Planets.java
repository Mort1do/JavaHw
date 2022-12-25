package Hw6N3and4;

public class Planets implements Nameable{
    private String name;
    private int r;

    public Planets(String name, int r){
        this.name = name;
        this.r = r;
    }

    public String getName(){
        return name;
    }
}
