package resources;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.Login;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ValidateTitle extends Base {
    @Test
    // public void basePageNavigation(String fullName, String email, String password, String confirmPassword) throws IOException {
    public void login() throws InterruptedException, IOException {
        driver = initializeDriver();

        driver.get("http://qaclickacademy.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2 ways through which you can access object of other class 1.inheritance 2.create object of class
        LandingPage lp = new LandingPage(driver);
        String expectedText="FEATURED COURSE";
      String actualText= lp.getTitle().getText();
        Assert.assertEquals(actualText,expectedText);
        System.out.println("User has clicked log in successfully");

    }

}