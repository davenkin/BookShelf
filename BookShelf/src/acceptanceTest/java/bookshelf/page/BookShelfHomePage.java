package bookshelf.page;

import org.openqa.selenium.WebDriver;

/**
 * Created by Davenkin on 10/23/14.
 */
public class BookShelfHomePage extends AbstractPage {

    public BookShelfHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativePath() {
        return "";
    }

}
