package Hw6Nfrom6to9;

public class Book implements Printable{
    private String name;
    private String author;
    private int numlet;

    public Book(String name, String author, int numlet){
        this.name = name;
        this.author = author;
        this.numlet = numlet;
    }

    @Override
    public void print(){
        System.out.println("Book " + name + " author: " + author + " (" + numlet + ')');
    }

}
