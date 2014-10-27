package bookshelf;

import org.junit.Test;

/**
 * Created by Davenkin on 10/4/14.
 */
public class JspHelloWorldAcceptanceTest extends AbstractAcceptanceTest{

    @Test
    public void testHelloWorld() {
        User user = new User(driver);
        user.visitJspHelloWorldPage();
        user.shouldSeeDisplayed("Hello JSP!");
    }
}
