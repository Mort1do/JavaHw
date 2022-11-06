package Hw2N4;

public class Computer {
    private String name;
    private String GPU;
    private int cost;


    public Computer(String name, String GPU, int cost){
        this.name = name;
        this.GPU = GPU;
        this.cost = cost;
    }

    public String getGPU() {
        return GPU;
    }

    @Override
    public String toString(){
        return "\n" + "name: " + name + " GPU: " + GPU + " costs: " + cost;
    }
}
