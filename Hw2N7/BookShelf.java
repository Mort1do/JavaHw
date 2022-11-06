package Hw2N7;

import java.util.ArrayList;

public class BookShelf {
    private ArrayList<Book> book;
    private int numb;

    public BookShelf(ArrayList<Book> book, int numb){
        this.book = book;
        this.numb = numb;
    }

    @Override
    public String toString(){
        return book + " " + numb;
    }
}
