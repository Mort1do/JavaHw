package Hw4N4;

public class Computer {
    Company com;
    Monitor monitor;
    Processor processor;
    Memory memory;


    Computer(Company com, Monitor monitor, Processor processor, Memory memory)
    {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.com = com;
    }

    Monitor getMonitor () {
        return this.monitor;
    }

    Processor getProcessor () {
        return processor;
    }

    Memory getMemory () {
        return memory;
    }

    Company getCom () {
        return com;
    }

    void setMonitor (Monitor monitor) {
        this.monitor = monitor;
    }

    void setName (Company com) {
        this.com = com;
    }

    void setMemory (Memory memory) {
        this.memory = memory;
    }

    void setProcessor (Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString(){
        return "Company is " + com + " processor is " + processor + ' ' + memory + ' ' + monitor;
    }
}
