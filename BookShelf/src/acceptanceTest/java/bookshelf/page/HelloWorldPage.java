package bookshelf.page;

import org.openqa.selenium.WebDriver;

/**
 * Created by Davenkin on 10/23/14.
 */
public class HelloWorldPage extends AbstractPage {
    private WebDriver driver;

    public HelloWorldPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativePath() {
        return "helloworld";
    }

}
