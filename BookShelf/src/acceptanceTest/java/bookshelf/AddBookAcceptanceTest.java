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
        user.addBook("ISBN-001","Gone with the wind",123.3,"Author-Who");
        user.canSeeBookAdded("ISBN-001");
    }
}
