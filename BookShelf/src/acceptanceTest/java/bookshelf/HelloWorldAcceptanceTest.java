package bookshelf;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by Davenkin on 10/4/14.
 */
public class HelloWorldAcceptanceTest {

    @Test
    public void testHelloWorld() {

        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://localhost:8080/BookShelf/helloworld");

        assertTrue(driver.getPageSource().contains("Hello World!"));
    }
}
