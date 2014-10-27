package bookshelf;

import bookshelf.page.AddBookPage;
import bookshelf.page.HomePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by Davenkin on 10/23/14.
 */
public class User {
    private AddBookPage addBookPage;
    private HomePage homePage;

    public User(WebDriver webDriver) {
        addBookPage = new AddBookPage(webDriver);
        homePage = new HomePage(webDriver);
    }

    public void addBook(String isbn, String name, double price, String author) {
        addBookPage.fillInput("bookIsbn", isbn);
        addBookPage.fillInput("bookName", name);
        addBookPage.fillInput("bookPrice", String.valueOf(price));
        addBookPage.fillInput("bookAuthor", author);
        addBookPage.clickAdd();
    }

    public void canSeeBookAddedOnSpringHomePage(String isbn) {
        homePage.verifyBookExist(isbn);
    }

    public void visitHomePage() {
        homePage.open();
    }

    public void goToAddBookPage() {
        homePage.goToAddBookPage();
    }
}
