package bookshelf;

import bookshelf.page.*;
import org.openqa.selenium.WebDriver;

/**
 * Created by Davenkin on 10/23/14.
 */
public class User {
    private HelloWorldPage helloWorldPage;
    private BookShelfHomePage bookShelfHomePage;
    private AddBookPage addBookPage;
    private SpringAddBookPage springAddBookPage;
    private JspHelloWorldPage jspHelloWorldPage;

    public User(WebDriver webDriver) {
        bookShelfHomePage = new BookShelfHomePage(webDriver);
        addBookPage = new AddBookPage(webDriver);
        helloWorldPage = new HelloWorldPage(webDriver);
        springAddBookPage = new SpringAddBookPage(webDriver);
        jspHelloWorldPage = new JspHelloWorldPage(webDriver);
    }


    public void shouldSeeDisplayed(String content) {
        bookShelfHomePage.verifyContentExist(content);
    }

    public void visitAddBookPage() {
        addBookPage.open();
    }

    public void addBook(String isbn, String name, double price, String author) {
        addBookPage.fillInput("bookIsbn", isbn);
        addBookPage.fillInput("bookName", name);
        addBookPage.fillInput("bookPrice", String.valueOf(price));
        addBookPage.fillInput("bookAuthor", author);
        addBookPage.clickAdd();
    }

    public void canSeeBookAdded(String isbn) {
        bookShelfHomePage.verifyContentExist(isbn);
    }

    public void visitHelloWorldPage() {
        helloWorldPage.open();
    }

    public void visitSpringAddBookPage() {
        springAddBookPage.open();
    }

    public void visitJspHelloWorldPage() {
        jspHelloWorldPage.open();
    }
}
