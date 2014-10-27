package bookshelf.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Davenkin on 10/26/14.
 */
@Repository
public class HsqlBookRepository implements BookRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void addBook(Book book) {
        jdbcTemplate.update("INSERT INTO BOOKS VALUES (?,?,?,?);", book.getIsbn(), book.getName(), book.getPrice(), book.getAuthor());
    }

    @Override
    public Book bookByIsbn(final String isbn) {
        return jdbcTemplate.queryForObject("SELECT * FROM BOOKS WHERE ISBN=?;", new Object[]{isbn}, new BookRowMapper());
    }

    @Override
    public List<Book> allBooks() {
        return jdbcTemplate.query("SELECT * FROM BOOKS;", new BookRowMapper());
    }


}
