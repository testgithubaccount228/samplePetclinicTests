package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VeterinariansPage {
    private final String VETERINARIANS_LOGO_XPATH = "//h2[text() = 'Veterinarians']";

    @FindBy(xpath = VETERINARIANS_LOGO_XPATH)
    private WebElement VeterinariansLogo;

    public VeterinariansPage checkThatVeterinariansPageIsOpened() {
        try {
            VeterinariansLogo.isDisplayed();
        } catch (AssertionError e) {
            throw new AssertionError("Veterinarians page is not opened");
        }
        return this;
    }
}
