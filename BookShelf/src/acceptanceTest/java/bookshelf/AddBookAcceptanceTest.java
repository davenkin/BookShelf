package bookshelf;

import org.junit.Test;

/**
 * Created by Davenkin on 10/4/14.
 */
public class AddBookAcceptanceTest extends AbstractAcceptanceTest {

    @Test
    public void shouldVisitAddBookPage() {
        User user = new User(driver);
        user.visitAddBookPage();
        user.shouldSeeDisplayedOnAddBookPage("Add a Book:");
    }
}
