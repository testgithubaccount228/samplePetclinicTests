import org.testng.annotations.Test;

public class FindOwnersPageTest extends BaseTest {
    @Test
    public void checkThatFindOwnersButtonLeadToFindOwnersPage() {
        header.waitSeconds(10);
        header.clickFindOwnersButton();
        header.waitSeconds(10);
        findOwnersPage.checkThatFindOwnersPageIsOpened();
    }
 }
