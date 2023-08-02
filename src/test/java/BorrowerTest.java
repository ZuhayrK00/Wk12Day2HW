import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void setUp() {
        borrower = new Borrower("John");
        library = new Library(3);
        book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy");
        book2 = new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction");
        book3 = new Book("The Chronicles of Narnia", "C.S. Lewis", "Fantasy");
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void shouldBorrowBookFromLibrary() {
        borrower.borrowBook(library, book1);
        assertEquals(1, borrower.getCollectionSize());
        assertEquals(1, library.countBooks());
    }

    @Test
    public void shouldNotBorrowBookNotAvailableInLibrary() {
        borrower.borrowBook(library, book3);
        assertEquals(0, borrower.getCollectionSize());
        assertEquals(2, library.countBooks());
    }

    @Test
    public void shouldNotBorrowBookWhenLibraryStockIsEmpty() {
        borrower.borrowBook(library, book1);
        borrower.borrowBook(library, book2);
        borrower.borrowBook(library, book3);
        assertEquals(2, borrower.getCollectionSize());
        assertEquals(0, library.countBooks());
    }
}

