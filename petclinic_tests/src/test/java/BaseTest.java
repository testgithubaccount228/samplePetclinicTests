import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.FindOwnersPage;
import pages.Header;
import pages.HomePage;
import pages.VeterinariansPage;
import utils.DriverFactory;
import utils.PropertyFactory;

public abstract class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    protected Header header;
    protected VeterinariansPage veterinariansPage;
    protected FindOwnersPage findOwnersPage;

    @BeforeClass
    public void setup() {
        driver = DriverFactory.getDriver();
        driver.get(PropertyFactory.getProperty("envUrl"));
        homePage = PageFactory.initElements(driver, HomePage.class);
        header = PageFactory.initElements(driver, Header.class);
        veterinariansPage = PageFactory.initElements(driver, VeterinariansPage.class);
        findOwnersPage = PageFactory.initElements(driver, FindOwnersPage.class);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
