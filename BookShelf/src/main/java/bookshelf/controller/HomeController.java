package bookshelf.controller;

import bookshelf.domain.Book;
import bookshelf.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Davenkin on 10/27/14.
 */
@Controller
@RequestMapping("home")
public class HomeController {
    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(method = RequestMethod.GET)
    public void home(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = bookRepository.allBooks();
        request.setAttribute("books", books);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Home.jsp");
        dispatcher.forward(request, response);

    }


}
