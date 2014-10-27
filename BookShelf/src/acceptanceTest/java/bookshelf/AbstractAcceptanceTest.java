package bookshelf;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 * Created by Davenkin on 10/24/14.
 */
public abstract class AbstractAcceptanceTest {
    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = new PhantomJSDriver();
    }

    @After
    public void cleanUp() {
        driver.quit();
    }
}
