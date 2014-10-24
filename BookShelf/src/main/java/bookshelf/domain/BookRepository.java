package bookshelf.domain;

import java.util.List;

/**
 * Created by Davenkin on 10/24/14.
 */
public interface BookRepository {
    public void addBook(Book book);

    public Book bookByIsbn(String isbn);

    public List<Book> allBooks();
}
