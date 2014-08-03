package davenkin.lesson5;

/**
 * Created by Davenkin on 8/3/14.
 */
public class Book {
    private String isbn;
    private String name;
    private double price;
    private String author;

    public Book(String isbn, String name, double price, String author) {
        this.isbn = isbn;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }
}
