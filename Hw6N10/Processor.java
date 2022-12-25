package Hw6N10;

public class Processor {
    String name;
    float Ghz;

    Processor(String name, float Ghz){
        this.name=name;
        this.Ghz=Ghz;
    }

    public Processor(byte b, int ghz, int i) {
    }

    float getGHZ() {return Ghz;}
    void setGhz(float Ghz) {this.Ghz=Ghz;}

    String getName(){return name;}
    void setName(String name) {this.name=name;}
}
