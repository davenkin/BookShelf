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

/**
 * Created by Davenkin on 10/4/14.
 */
public class AddBookServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/AddBook.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {

        String isbn = request.getParameter("isbn");
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String author = request.getParameter("author");

        getBookRepository().addBook(new Book(isbn, name, price, author));
        response.sendRedirect("");
    }

    private BookRepository getBookRepository() {
        final ApplicationContext context = (ApplicationContext) getServletContext().getAttribute(SpringContextInitiator.SPRING_CONTEXT);
        return (BookRepository) context.getBean("bookRepository");
    }
}
