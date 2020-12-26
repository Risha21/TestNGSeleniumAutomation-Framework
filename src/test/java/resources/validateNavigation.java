package resources;

import org.junit.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class validateNavigation extends Base{

    @Test
    public void homePageNavigation() throws IOException {
        initializeDriver();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);LandingPage lp = new LandingPage(driver);
        LandingPage l = new LandingPage(driver);
        Assert.assertTrue(l.getNavigationClick().isDisplayed());
    }
}
