package bookshelf.page;

import org.openqa.selenium.WebDriver;

/**
 * Created by Davenkin on 10/23/14.
 */
public class HelloWorldPage extends AbstractPage {

    public HelloWorldPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativePath() {
        return "helloworld";
    }

}
