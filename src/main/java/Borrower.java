import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public void borrowBook(Library library, Book book) {
        if (library.stockContains(book)) {
            library.removeBook(book);
            collection.add(book);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println(name + " cannot borrow " + book.getTitle());
        }
    }

    public int getCollectionSize() {
        return collection.size();
    }
}
