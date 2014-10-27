package bookshelf.controller;

import bookshelf.domain.Book;
import bookshelf.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
        return "AddBook";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView addBook(@ModelAttribute Book book) throws IOException {
        bookRepository.addBook(book);
        return new ModelAndView("redirect:/");

    }


}
