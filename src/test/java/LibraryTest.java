import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void setUp() {
        library = new Library(3);
        book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy");
        book2 = new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction");
        book3 = new Book("The Chronicles of Narnia", "C.S. Lewis", "Fantasy");
    }

    @Test
    public void shouldReturnZeroBooksWhenEmpty() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void shouldAddBookToStock() {
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void shouldNotAddBookWhenStockIsFull() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction"));
        assertEquals(3, library.countBooks());
    }
}
