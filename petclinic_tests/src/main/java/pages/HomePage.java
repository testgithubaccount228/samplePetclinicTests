package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
    private final String WELCOME_LABEL_XPATH = "//img[@class='img-responsive']";

    @FindBy(xpath = WELCOME_LABEL_XPATH)
    private WebElement welcomeLabel;

    public HomePage checkThatHomepageIsOpened() {
        try {
            welcomeLabel.isDisplayed();
        } catch (AssertionError e) {
            throw new AssertionError("Homepage is not opened!");
        }
        return this;
    }
}
