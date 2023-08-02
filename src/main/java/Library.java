import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public int countBooks() {
        return stock.size();
    }

    public void addBook(Book book) {
        if (!isStockFull()) {
            stock.add(book);
        } else {
            System.out.println("Stock is full!! ");
        }
    }

    public boolean isStockFull() {
        return stock.size() >= capacity;
    }

    public boolean stockContains(Book book) {
        return stock.contains(book);
    }

    public void removeBook(Book book) {
        stock.remove(book);
    }
}
