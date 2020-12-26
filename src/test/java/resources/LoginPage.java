package resources;

import org.testng.annotations.Test;
import pageObjects.LandingPage;

public class LoginPage extends TestBase {

    @Test
    public void login() {
        LandingPage lp = new LandingPage(driver);
        lp.getLoginClick().click();
    }
}
