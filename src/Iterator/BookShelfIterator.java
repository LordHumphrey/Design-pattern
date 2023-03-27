package Iterator;

/**
 * @author TaoWong
 */
public class BookShelfIterator implements MyIteratorInterface {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (bookShelf.getLength() > index) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        return bookShelf.getBookAt(index++);
    }
}
