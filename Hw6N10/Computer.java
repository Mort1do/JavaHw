package Hw6N10;

public class Computer {
    Monitor monitor;
    Processor processor;
    Memory memory;
    ComputerBrand name;

    Computer(ComputerBrand name, Monitor monitor, Processor processor, Memory memory)
    {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.name = name;
    }

    public Computer(Processor proccesor, Monitor monitor, ComputerBrand aser) {
    }

    Monitor getMonitor () {return this.monitor;}
    void setMonitor (Monitor monitor) {this.monitor = monitor;}

    Processor getProcessor () {return processor;}
    void setProcessor (Processor processor) {this.processor = processor;}

    Memory getMemory () {return memory;}
    void setMemory (Memory memory) {this.memory = memory;}

    ComputerBrand getName () {return name;}
    void setName (ComputerBrand name) {this.name = name;}
}
