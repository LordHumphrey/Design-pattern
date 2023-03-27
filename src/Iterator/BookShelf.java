package Iterator;


import java.util.ArrayList;

/**
 * @author TaoWong
 */
public class BookShelf implements Aggregate {
    private ArrayList<Book> bookArrayList;

    public BookShelf() {
        this.bookArrayList = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return bookArrayList.get(index);
    }

    public int getLength() {
        return bookArrayList.size();
    }

    public boolean addBook(Book book) {
        return bookArrayList.add(book);
    }

    @Override
    public MyIteratorInterface iterator() {
        return new BookShelfIterator(this);
    }

}
