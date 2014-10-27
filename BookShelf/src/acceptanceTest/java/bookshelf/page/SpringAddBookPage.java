package bookshelf.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Davenkin on 10/23/14.
 */
public class SpringAddBookPage extends AbstractPage {

    public SpringAddBookPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativePath() {
        return "spring/addbook";
    }

    public void clickAdd() {
        driver.findElement(By.id("submitLink")).click();
    }
}
