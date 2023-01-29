package IteratorPattern;


import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

//책장을 나타내는 클래스
public class BookShelf implements Iterable<Book> {

	private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
    
//    private List<Book> books;
//
//    public BookShelf(int initialsize) {
//        this.books = new ArrayList<>(initialsize);
//    }
//
//    public Book getBookAt(int index) {
//        return books.get(index);
//    }
//
//    public void appendBook(Book book) {
//        books.add(book);
//    }
//
//    public int getLength() {
//        return books.size();
//    }
//
//    @Override
//    public Iterator<Book> iterator() {    
//        return new BookShelfIterator(this);
//    }

}
