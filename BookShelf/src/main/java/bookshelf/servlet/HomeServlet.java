package bookshelf.servlet;

import bookshelf.domain.Book;
import bookshelf.domain.BookRepository;
import bookshelf.servlet.listener.SpringContextInitiator;
import org.springframework.context.ApplicationContext;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Davenkin on 10/3/14.
 */
public class HomeServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        List<Book> books = getBookRepository().allBooks();
        request.setAttribute("books", books);
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/Home.jsp");
        dispatcher.forward(request, response);
    }


    private BookRepository getBookRepository() {
        final ApplicationContext context = (ApplicationContext) getServletContext().getAttribute(SpringContextInitiator.SPRING_CONTEXT);
        return (BookRepository) context.getBean("bookRepository");
    }
}
