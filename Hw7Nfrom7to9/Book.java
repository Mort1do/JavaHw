package Hw7Nfrom7to9;

public class Book implements Printable{
    private String name;

    public Book(String name){this.name = name;}

    @Override
    public void print() {System.out.println(this.name);}

    static void printMagazines(Printable[] printable){
        for (Printable pr: printable) {
            if(pr instanceof Book){pr.print();}
        }
    }
}
