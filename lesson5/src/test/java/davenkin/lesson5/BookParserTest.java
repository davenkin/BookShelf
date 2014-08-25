package davenkin.lesson5;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class BookParserTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Test
    public void shouldParseInput() {
        BookParser bookParser = new BookParser();
        Book book = bookParser.parse("1234,Gone with the wind,12.0,Margaret");
        assertEquals(book.getIsbn(), "1234");
    }

    @Test(expected = BookParseException.class)
    public void shouldGenerateExceptionWhenParsingWrongInputFormat() {
        BookParser bookParser = new BookParser();
        String wrongPrice = "wrongPrice";
        Book book = bookParser.parse("1234,Gone with the wind," + wrongPrice + ",Margaret");
    }

}