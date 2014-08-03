package davenkin.lesson5;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BookShelfTest {

    @Test
    public void shouldAddBook() {
        BookShelf bookShelf = new BookShelf();
        String name = "Gone with The Wind";
        String isbn = "1234";
        Book book = new Book(isbn, name, 12.0, "Author");
        bookShelf.add(book);
        assertEquals(bookShelf.size(), 1);
        assertThat(bookShelf.bookByIsbn(isbn).getName(), is(name));
    }



}