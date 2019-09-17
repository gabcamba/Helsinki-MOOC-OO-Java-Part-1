
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gab Camba
 */
public class Library {

    private ArrayList<Book> bookList;

    public Library() {
        bookList = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.bookList.add(newBook);
    }

    public void printBooks() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> newBookList = new ArrayList<Book>();

        for (Book book : bookList) {
            if (StringUtils.included(book.title(), title)) {
                newBookList.add(book);
            }
        }
        return newBookList;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> newBookList = new ArrayList<Book>();
        
        for (Book book : bookList) {
            if (StringUtils.included(book.publisher(), publisher)) {
                newBookList.add(book);
            }
        }
        return newBookList;
    }
    
    public ArrayList<Book> searchByYear(int year)
    {
        ArrayList<Book> newBookList = new ArrayList<Book>();
        for(Book book : bookList)
        {
            if(book.year() == year)
            {
                newBookList.add(book);
            }
        }
        return newBookList;
    }

}
