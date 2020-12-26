package resources;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

public class ValidateTitle extends TestBase {
    @Test
    public void login() {
        LandingPage lp = new LandingPage(driver);
        String expectedText = "FEATURED COURSE";
        String actualText = lp.getTitle().getText();
        Assert.assertEquals(actualText, expectedText);
    }

}