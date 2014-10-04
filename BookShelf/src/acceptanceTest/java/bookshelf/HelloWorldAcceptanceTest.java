package bookshelf;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by Davenkin on 10/4/14.
 */
public class HelloWorldAcceptanceTest {

    @Test
    public void testHelloWorld() {

        //can change to FirefoxDriver if you want to see the browser
        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://localhost:8080/BookShelf/helloworld");

        assertTrue(driver.getPageSource().contains("Hello World!"));
    }
}
