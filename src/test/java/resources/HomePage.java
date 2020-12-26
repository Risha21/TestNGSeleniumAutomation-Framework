package resources;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.Login;

public class HomePage extends TestBase {
    @Test
    public void login() {
        LandingPage lp = new LandingPage(driver);
        lp.getLoginClick().click();
    }

    @Test(dataProvider = "getDataLogin")
    public void loginCredentials(String email, String password) {
        Login l = new Login(driver);
        l.setEmailLogin().sendKeys(email);
        l.setPasswordLogin().sendKeys(password);
        l.clickLogin().click();

    }

    @DataProvider
    public Object[] getDataLogin() {
        Object[][] data = new Object[1][2];
        data[0][0] = "asha@gmail.com";
        data[0][1] = "asha21@";

        return data;
    }
}








