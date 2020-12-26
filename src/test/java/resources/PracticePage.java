package resources;

import org.testng.annotations.Test;
import pageObjects.LandingPage;

public class PracticePage extends TestBase {
    @Test
    public void getPracticePage() {
        LandingPage lp = new LandingPage(driver);
        lp.practiceLinkPage().click();
    }
}
