package bookshelf.page;

import org.openqa.selenium.WebDriver;

/**
 * Created by Davenkin on 10/23/14.
 */
public class JspHelloWorldPage extends AbstractPage {

    public JspHelloWorldPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativePath() {
        return "helloworldjsp";
    }

}
