import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void setUp() {
        book = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction");
    }

    @Test
    public void shouldReturnTitle() {
        assertEquals("To Kill a Mockingbird", book.getTitle());
    }

    @Test
    public void shouldReturnAuthor() {
        assertEquals("Harper Lee", book.getAuthor());
    }

    @Test
    public void shouldReturnGenre() {
        assertEquals("Fiction", book.getGenre());
    }
}
