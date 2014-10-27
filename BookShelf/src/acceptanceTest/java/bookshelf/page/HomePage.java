package bookshelf.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Davenkin on 10/23/14.
 */
public class HomePage extends AbstractPage {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativePath() {
        return "";
    }

    public void goToAddBookPage(){
        driver.findElement(By.id("addBookLink")).click();
    }

}
