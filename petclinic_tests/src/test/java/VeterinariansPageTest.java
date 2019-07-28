import org.testng.annotations.Test;

public class VeterinariansPageTest extends BaseTest {
    @Test
    public void checkThatVeterinariansButtonLeadToVeterinariansPage() {
        header.clickVeterinariansButtom();
        veterinariansPage.checkThatVeterinariansPageIsOpened();
    }
}
