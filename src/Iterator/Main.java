package Iterator;

/**
 * @author TaoWong
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("ABC"));
        bookShelf.addBook(new Book("123"));
        bookShelf.addBook(new Book("abc"));
        MyIteratorInterface iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
