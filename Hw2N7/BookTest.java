package Hw2N7;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Book> book_arr = new ArrayList<Book>();
        BookShelf shelf = new BookShelf(book_arr,4);
        for(int i = 0; i < 4; i++) {
            System.out.println("Input author of " + (i+1) + " book: ");
            String author = cin.next();
            System.out.println("Input name of " + (i+1) + " book: ");
            String name = cin.next();
            System.out.println("Input year of " + (i+1) + " book: ");
            int year = cin.nextInt();
            book_arr.add(new Book(author,name,year));


        }
        System.out.println(shelf.toString());
        int max = 0;
        int min = 100000;
        int t = 0 ,f = 0;
        for(int i = 0; i < 4; i++) {
            if (book_arr.get(i).getYear() > max) {
                max = book_arr.get(i).getYear();
                t = i;
            }
            if (book_arr.get(i).getYear() < min) {
                min = book_arr.get(i).getYear();
                f = i;
            }
        }
        System.out.println("The book with min year is " + book_arr.get(f).getName());
        System.out.println("The book with max year is " + book_arr.get(t).getName());

        int i = 0;
        while(i != book_arr.size()-1){
            if(book_arr.get(i).getYear() > book_arr.get(i+1).getYear()){
                Book bk = book_arr.get(i);
                book_arr.set(i, book_arr.get(i+1));
                book_arr.set(i+1, bk);
                i = 0;
            }
            else {
                i++;
            }
        }
        System.out.println(book_arr.toString());
    }
}