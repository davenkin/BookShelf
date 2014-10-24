package bookshelf.page;

import bookshelf.page.AbstractPage;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by Davenkin on 10/23/14.
 */
public class BookShelfHomePage extends AbstractPage {
    private WebDriver driver;

    public BookShelfHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativePath() {
        return "helloworld";
    }

}
