package davenkin.lesson5;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BookShelfTest {

    @Test
    public void shouldAddAndFindBook() {
        BookShelf bookShelf = new BookShelf();
        String name = "Gone with The Wind";
        String isbn = "1234";
        Book book = new Book(isbn, name, 12.0, "Author");
        bookShelf.add(book);
        assertEquals(bookShelf.size(), 1);
        assertThat(bookShelf.bookByIsbn(isbn).getName(), is(name));
    }

    @Test
    public void shouldFindBookByName() {
        BookShelf bookShelf = new BookShelf();
        Book book = new Book("1234", "Gone with the Wind", 12.0, "Author");
        Book book1 = new Book("1234", "The tale of two cities", 12.0, "Author");
        bookShelf.add(book);
        bookShelf.add(book1);
        assertEquals(bookShelf.size(), 2);
        assertEquals(bookShelf.bookByName("tale").size(), 1);
    }


}