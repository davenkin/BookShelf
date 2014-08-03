package davenkin.lesson5;

/**
 * Created by Davenkin on 8/3/14.
 */
public class BookParser {

    public Book parse(String input) {
        //Please find a better solution for the parsing algorithm
        try {
            String[] inputs = input.split(",");
            return new Book(inputs[0], inputs[1], Double.valueOf(inputs[2]), inputs[3]);
        } catch (Exception e) {
            throw new BookParseException(e);
        }
    }
}
