package Hw6N10;

public class Tester {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Processor proccesor = new Processor((byte)12,1440,64);
        Monitor monitor = new Monitor(17);
        Computer computer = new Computer(proccesor, monitor, ComputerBrand.Asus);
        shop.addComputer(computer);
        shop.seeCatalog();
        shop.deleteComputer(computer);
        shop.deleteComputer(computer);
        shop.seeCatalog();
    }
}
