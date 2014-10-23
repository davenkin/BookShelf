package bookshelf;

import org.openqa.selenium.WebDriver;

/**
 * Created by Davenkin on 10/23/14.
 */
public class User {
    private BookShelfHomePage bookShelfHomePage;

    public User(WebDriver webDriver) {
        bookShelfHomePage = new BookShelfHomePage(webDriver);
    }


    public void visitBookShelfHomePage() {
        bookShelfHomePage.open();
    }

    public void shouldSeeDisplayed(String content) {
        bookShelfHomePage.verifyContentExist(content);
    }
}
