package bookshelf.page;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by Davenkin on 10/24/14.
 */
public abstract class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void open() {
        driver.get("http://localhost:8080/BookShelf/" + getRelativePath());
    }

    protected abstract String getRelativePath();

    public void verifyContentExist(String content) {
        assertTrue(driver.getPageSource().contains(content));
    }
}
