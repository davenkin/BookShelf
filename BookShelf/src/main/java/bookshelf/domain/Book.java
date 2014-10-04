package bookshelf.domain;

/**
 * Created by Davenkin on 10/4/14.
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

    public void changePriceTo(double newPrice) {
        this.price = newPrice;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }
}
