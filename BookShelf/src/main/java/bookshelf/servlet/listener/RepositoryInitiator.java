package bookshelf.servlet.listener;

import bookshelf.domain.BookRepository;
import bookshelf.domain.HsqlBookRepository;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Davenkin on 10/24/14.
 */
public class RepositoryInitiator implements ServletContextListener {

    public static final String BOOK_REPOSITORY = "BOOK_REPOSITORY";

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        BookRepository repository = new HsqlBookRepository();
        sce.getServletContext().setAttribute(BOOK_REPOSITORY, repository);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
