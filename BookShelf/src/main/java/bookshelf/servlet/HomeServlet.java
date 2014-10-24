package bookshelf.servlet;

import bookshelf.domain.BookRepository;
import bookshelf.servlet.listener.RepositoryInitiator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Davenkin on 10/3/14.
 */
public class HomeServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        int count = getBookRepository().allBooks().size();
        request.setAttribute("count", count);
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/Home.jsp");
        dispatcher.forward(request, response);
    }


    private BookRepository getBookRepository() {
        return (BookRepository) getServletContext().getAttribute(RepositoryInitiator.BOOK_REPOSITORY);
    }


}
