package Hw7Nfrom7to9;

public class Magazine implements Printable{
    private String name;

    public Magazine(String name){this.name = name;}

    @Override
    public void print() {System.out.println(this.name);}

    static void printMagazines(Printable[] printable){
        for (Printable pr: printable) {
            if(pr instanceof Magazine){pr.print();}
        }
    }
}
