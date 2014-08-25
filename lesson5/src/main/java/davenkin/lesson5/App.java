package davenkin.lesson5;

import com.google.common.io.Resources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by Davenkin on 8/25/14.
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String... args) throws IOException {
        URL resource = Resources.getResource("books.txt");
        List<String> inputs = Resources.readLines(resource, Charset.defaultCharset());
        BookParser parser = new BookParser();
        BookShelf bookShelf = new BookShelf();
        for (String input : inputs) {
            try {
                bookShelf.add(parser.parse(input));
            } catch (BookParseException e) {
                logger.error("Error encountered when parsing book[{}]", input);
            }
        }

        System.out.println(bookShelf.size());
    }
}
