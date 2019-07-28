import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
   @Test
    public void checkThatHomePageIsOpened() {
      homePage.checkThatHomepageIsOpened();
   }

   @Test
   public void checkThatHomeButtonLeadToHomePage() {
      header.clickHomeButton();
      homePage.checkThatHomepageIsOpened();
   }
}
