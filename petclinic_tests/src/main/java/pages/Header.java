package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {
    private final String LOGO_XPATH = "//a[@class = 'navbar-brand']";
    private final String HOME_BUTTON_XPATH = "//a[@title = 'home page']";
    private final String VETERINARIANS_BUTTON_XPATH = "//a[@title = 'veterinarians']";
    private final String FIND_OWNERS_BUTTON_XPATH = "//a[@title = 'find owners']";

    @FindBy(xpath = LOGO_XPATH)
    private WebElement logo;

    @FindBy(xpath = HOME_BUTTON_XPATH)
    private WebElement homeButton;

    @FindBy(xpath = VETERINARIANS_BUTTON_XPATH)
    private WebElement veterinariansButton;

    @FindBy(xpath = FIND_OWNERS_BUTTON_XPATH)
    private WebElement findOwnersButton;

    public Header checkThatHeaderIsDisplayed() throws java.util.NoSuchElementException {
        try {
            logo.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new java.util.NoSuchElementException("Header is not displayed");
        }
        return this;
    }

    public Header checkThatHomeButtonIsDisplayed() throws java.util.NoSuchElementException {
        try {
            homeButton.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new java.util.NoSuchElementException("Home button is not displayed");
        }
        return this;
    }

    public Header checkThatVeterinariansButtonIsDisplayed() throws java.util.NoSuchElementException {
        try {
            veterinariansButton.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new java.util.NoSuchElementException("Veterinarians is not displayed");
        }
        return this;
    }

    public Header checkThatFindOwnersIsDisplayed() throws java.util.NoSuchElementException {
        try {
            findOwnersButton.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new java.util.NoSuchElementException("Find Owners is not displayed");
        }
        return this;
    }

    public void clickHomeButton() {
        homeButton.click();
    }

    public void clickVeterinariansButtom() {
        veterinariansButton.click();
    }

    public void clickFindOwnersButton() {
        findOwnersButton.click();
    }
}
