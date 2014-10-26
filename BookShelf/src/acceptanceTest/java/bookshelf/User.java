package bookshelf;

import bookshelf.page.AddBookPage;
import bookshelf.page.BookShelfHomePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by Davenkin on 10/23/14.
 */
public class User {
    private BookShelfHomePage bookShelfHomePage;
    private AddBookPage addBookPage;

    public User(WebDriver webDriver) {
        bookShelfHomePage = new BookShelfHomePage(webDriver);
        addBookPage = new AddBookPage(webDriver);
    }


    public void visitBookShelfHomePage() {
        bookShelfHomePage.open();
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
}
