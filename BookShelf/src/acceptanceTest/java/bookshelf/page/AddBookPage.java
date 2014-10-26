package bookshelf.page;

import bookshelf.page.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Davenkin on 10/23/14.
 */
public class AddBookPage extends AbstractPage {

    public AddBookPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativePath() {
        return "addbook";
    }

    public void clickAdd() {
        driver.findElement(By.id("submitLink")).click();
    }
}
