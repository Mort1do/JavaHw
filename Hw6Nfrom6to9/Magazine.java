package Hw6Nfrom6to9;

public class Magazine implements Printable{
    private String name;
    private int nummag;

    public Magazine(String name, int nummag){
        this.name = name;
        this.nummag = nummag;
    }

    @Override
    public void print() {
        System.out.println("Magazine " + name + " number " + nummag);
    }
}
