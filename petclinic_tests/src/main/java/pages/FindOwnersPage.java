package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindOwnersPage extends BasePage {
    private final String FIND_OWNERS_LOGO_XPATH = "//h2[text() = 'Find Owners']";

    @FindBy(xpath = FIND_OWNERS_LOGO_XPATH)
    private WebElement findOwnersLogo;

    public FindOwnersPage checkThatFindOwnersPageIsOpened() {
        try {
          findOwnersLogo.isDisplayed();
        } catch (AssertionError e) {
            throw new AssertionError("Find Owners page is not opened");
        }
        return this;
    }
}
