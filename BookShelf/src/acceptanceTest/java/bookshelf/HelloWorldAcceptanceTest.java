package bookshelf;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by Davenkin on 10/4/14.
 */
public class HelloWorldAcceptanceTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new HtmlUnitDriver();
    }

    @After
    public void cleanUp() {
        driver.quit();
    }

    @Test
    public void testHelloWorld() {
        User user = new User(driver);
        user.visitBookShelfHomePage();
        user.shouldSeeDisplayed("Hello World!");
    }
}
