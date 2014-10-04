package bookshelf.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookTest {

    @Test
    public void shouldChangePrice() {
        final Book book = new Book("isbn-001", "Gone with the wind", 12.0, "Author");
        book.changePriceTo(13.0);
        assertThat(13.0, is(book.getPrice()));
    }
}
