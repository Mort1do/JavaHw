package Hw4N4;

public class Tester {
    public static void main(String[] args) {
        Monitor mon = new Monitor(17, 144,1080);
        Processor cpu = new Processor("i7 10600", 2500);
        Memory hd = new Memory(2000);
        Computer comp = new Computer(Company.Asus, mon,cpu,hd);

        System.out.println(comp.toString());
    }
}
