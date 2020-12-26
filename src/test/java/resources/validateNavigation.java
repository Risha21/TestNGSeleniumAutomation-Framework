package resources;

import org.junit.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

public class validateNavigation extends TestBase {
    @Test
    public void homePageNavigation() {
        LandingPage lp = new LandingPage(driver);
        Assert.assertTrue(lp.getNavigationClick().isDisplayed());
    }
}
