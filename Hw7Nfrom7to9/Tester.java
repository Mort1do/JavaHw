package Hw7Nfrom7to9;

public class Tester {
    public static void main(String[] args) {
        Printable[] arr = {new Book("book1"), new Book("book2"), new Magazine("magazine1")};
        System.out.println("Books:");
        Book.printMagazines(arr);
        System.out.println();
        System.out.println("Magazines:");
        Magazine.printMagazines(arr);
    }
}
