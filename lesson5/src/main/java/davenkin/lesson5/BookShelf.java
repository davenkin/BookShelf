package davenkin.lesson5;

import com.google.common.base.Predicate;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.FluentIterable.from;

/**
 * Created by Davenkin on 8/3/14.
 */
public class BookShelf {
    private List<Book> books = new ArrayList<Book>();

    public void add(Book book) {
        books.add(book);
    }

    public int size() {
        return books.size();
    }

    public Book bookByIsbn(final String isbn) {
        return from(books).firstMatch(new Predicate<Book>() {
            @Override
            public boolean apply(Book input) {
                return input.getIsbn().equals(isbn);
            }
        }).get();
    }

    public List<Book> bookByName(final String name) {
        return from(books).filter(new Predicate<Book>() {
            @Override
            public boolean apply(Book input) {
                //This "like" search algorithm, there should be a better solution
                return input.getName().contains(name);
            }
        }).toList();
    }
}
