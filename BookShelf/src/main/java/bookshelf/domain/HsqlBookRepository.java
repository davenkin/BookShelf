package bookshelf.domain;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hsqldb.Server;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Davenkin on 10/26/14.
 */
public class HsqlBookRepository implements BookRepository {
    private static Server hsqlServer = null;
    private static DataSource dataSource = null;

    static {
        hsqlServer = new Server();
        hsqlServer.setLogWriter(null);
        hsqlServer.setSilent(true);
        hsqlServer.setDatabaseName(0, "xdb");
        hsqlServer.setDatabasePath(0, "file:testdb");
        hsqlServer.start();
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("org.hsqldb.jdbcDriver");
        basicDataSource.setUrl("jdbc:hsqldb:hsql://localhost/xdb");
        basicDataSource.setUsername("sa");
        basicDataSource.setPassword("");
        dataSource = basicDataSource;

        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            connection.prepareStatement("drop table books if exists;").execute();
            connection.prepareStatement("create table books (isbn varchar(100), name varchar(100),price double,author varchar(100));").execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assert connection != null;
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void finalize() throws Throwable {
        hsqlServer.stop();
        super.finalize();
    }


    @Override
    public void addBook(Book book) {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            connection.prepareStatement("insert into books values ('" + book.getIsbn() + "','" + book.getName() + "'," + book.getPrice() + ",'" + book.getAuthor() + "');").execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assert connection != null;
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Book bookByIsbn(String isbn) {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            ResultSet resultSet = connection.prepareStatement("select * from books where isbn=" + "'" + isbn + "'").executeQuery();
            ArrayList<Book> books = new ArrayList<Book>();

            while (resultSet.next()) {
                final String aIsbn = resultSet.getString("isbn");
                final String name = resultSet.getString("name");
                final double price = resultSet.getDouble("price");
                final String author = resultSet.getString("author");
                books.add(new Book(aIsbn, name, price, author));
            }
            return books.get(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assert connection != null;
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<Book> allBooks() {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            ResultSet resultSet = connection.prepareStatement("select * from books").executeQuery();
            ArrayList<Book> books = new ArrayList<Book>();

            while (resultSet.next()) {
                final String isbn = resultSet.getString("isbn");
                final String name = resultSet.getString("name");
                final double price = resultSet.getDouble("price");
                final String author = resultSet.getString("author");
                books.add(new Book(isbn, name, price, author));
            }
            return books;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assert connection != null;
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
