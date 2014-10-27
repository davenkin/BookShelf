package bookshelf.domain;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Davenkin on 10/27/14.
 */
public class BookRowMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        String aIsbn = rs.getString("ISBN");
        String name = rs.getString("NAME");
        double price = rs.getDouble("PRICE");
        String author = rs.getString("AUTHOR");
        return new Book(aIsbn, name, price, author);
    }
}
