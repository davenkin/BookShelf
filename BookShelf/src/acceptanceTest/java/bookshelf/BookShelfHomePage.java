package bookshelf;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by Davenkin on 10/23/14.
 */
public class BookShelfHomePage {
    private WebDriver driver;

    public BookShelfHomePage(WebDriver webDriver) {
        driver = webDriver;
    }


    public void open() {
        driver.get("http://localhost:8080/BookShelf/helloworld");
    }

    public void verifyContentExist(String content) {
        assertTrue(driver.getPageSource().contains(content));

    }
}
