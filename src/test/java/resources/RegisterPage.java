package resources;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.Register;

public class RegisterPage extends TestBase {
    @Test(dataProvider = "getRegistrationData")
    public void getRegistrationPage(String fullName, String email, String password, String confirmPassword) {
        LandingPage lp = new LandingPage(driver);
        lp.getRegisterPage().click();

        Register r = new Register(driver);
        r.getFullName().sendKeys(fullName);
        r.email().sendKeys(email);
        r.password().sendKeys(password);
        r.confirmPassword().sendKeys(confirmPassword);
        r.agreementCheckbox().click();
        r.signUP().click();
    }

    @DataProvider
    public Object[] getRegistrationData() {
        Object[][] data = new Object[2][4];
        data[0][0] = "Swapan Anand";
        data[0][1] = "swapan@gmail.com";
        data[0][2] = "risha21@";
        data[0][3] = "risha21@";

        data[1][0] = "preya";
        data[1][1] = "kreya@gmail.com";
        data[1][2] = "kreya2@";
        data[1][3] = "kreya2@";

        return data;

    }
}










