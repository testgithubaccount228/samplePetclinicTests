import org.testng.annotations.Test;

public class VeterinariansPageTest extends BaseTest {
    @Test
    public void checkThatVeterinariansButtonLeadToVeterinariansPage() {
        header.waitSeconds(10);
        header.clickVeterinariansButtom();
        header.waitSeconds(10);
        veterinariansPage.checkThatVeterinariansPageIsOpened();
    }
}
