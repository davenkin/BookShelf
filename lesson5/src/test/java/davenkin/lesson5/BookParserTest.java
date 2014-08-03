package davenkin.lesson5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookParserTest {

    @Test
    public void shouldParseInput() {
        BookParser bookParser = new BookParser();
        Book book = bookParser.parse("1234,Gone with the wind,12.0,Margaret");
        assertEquals(book.getIsbn(), "1234");
    }

}