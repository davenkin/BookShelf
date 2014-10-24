package bookshelf.domain;

import com.google.common.base.Predicate;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.FluentIterable.from;

/**
 * Created by Davenkin on 10/24/14.
 */
public class ListBasedBookRepository implements BookRepository {

    private List<Book> books = new ArrayList<Book>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Book bookByIsbn(final String isbn) {
        return from(books).filter(new Predicate<Book>() {
            @Override
            public boolean apply(Book input) {
                return isbn.equals(input.getIsbn());
            }
        }).first().get();
    }

    @Override
    public List<Book> allBooks() {
        return books;
    }
}
