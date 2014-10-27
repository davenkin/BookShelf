package bookshelf.controller;

import bookshelf.domain.Book;
import bookshelf.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Davenkin on 10/27/14.
 */
@Controller
@RequestMapping("addbook")
public class AddBookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String displayAddBook() {
        return "/WEB-INF/jsp/AddBook.jsp";
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addBook(HttpServletRequest request,
                          HttpServletResponse response) throws IOException {
        String isbn = request.getParameter("isbn");
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String author = request.getParameter("author");

        bookRepository.addBook(new Book(isbn, name, price, author));
        response.sendRedirect("home");

    }


}
