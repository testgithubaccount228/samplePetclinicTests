import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class HeaderTest extends BaseTest {
    @Test
    public void checkThatHeaderIsDisplayed() throws NoSuchFieldException {
        header.waitSeconds(10);
        header.checkThatHeaderIsDisplayed();
    }

    @Test
    public void checkThatAllHeaderButtonsAreDisplayed() throws NoSuchElementException {
        header.checkThatHomeButtonIsDisplayed().checkThatVeterinariansButtonIsDisplayed()
                .checkThatFindOwnersIsDisplayed();
    }
}
