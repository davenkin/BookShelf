package bookshelf.page;

import org.openqa.selenium.By;
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

    public void verifyBookExist(String content) {
        assertTrue(driver.findElement(By.id("books")).getText().contains(content));
    }

    public void fillInput(String id, String value) {
        driver.findElement(By.id(id)).sendKeys(value);
    }


}
