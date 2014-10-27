package bookshelf.controller;

import bookshelf.domain.Book;
import bookshelf.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Davenkin on 10/27/14.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model)  {
        List<Book> books = bookRepository.allBooks();
        model.addAttribute("books", books);
        return "Home";
    }

}
