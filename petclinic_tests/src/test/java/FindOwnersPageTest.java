import org.testng.annotations.Test;

public class FindOwnersPageTest extends BaseTest {
    @Test
    public void checkThatFindOwnersButtonLeadToFindOwnersPage() {
        header.clickFindOwnersButton();
        findOwnersPage.checkThatFindOwnersPageIsOpened();
    }
 }
