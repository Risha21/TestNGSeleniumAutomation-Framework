package resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.Login;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePage extends Base {


    @Test
    // public void basePageNavigation(String fullName, String email, String password, String confirmPassword) throws IOException {
    public void login() throws InterruptedException, IOException {
        initializeDriver();

        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2 ways through which you can access object of other class 1.inheritance 2.create object of class
        LandingPage lp = new LandingPage(driver);
        lp.getLoginClick().click();
        System.out.println("User has clicked log in successfully");

    }

    @Test(dataProvider = "getDataLogin")
    public void loginCredentials(String email, String password) throws InterruptedException {
            //() {
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

// Thread.sleep(3000);

        // Alert a =driver.switchTo().alert();
        //WebElement dismiss= driver.findElement(By.id("homepage"));
        //System.out.println(dismiss.getText());
        // String alertText=a.getText();
        //System.out.println(alertText);
        //a.dismiss();*/

     //   lp.getRegisterPage().click();


        // System.out.println("Hi,You are in registration page");

        //  }



    // @Test(priority =1)
 //   public void fillRegistrationForm() {

      /*  Register r = new Register(driver);
        r.getFullName().sendKeys(fullName);
        r.email().sendKeys(email);
        r.password().sendKeys(password);
        r.confirmPassword().sendKeys(confirmPassword);
        r.agreementCheckbox().click();
        r.signUP().click();
    }


    @DataProvider
    public Object[][] getData() {
        //row stands for how many different data sets test should run in our case we are passing 2 data sets
        //column stands for how many values are being passed per set in this case 4 values per set being passed

        Object[][] data = new Object[2][4];
        data[0][0] = "asha";
        data[0][1] = "asha@gmail.com";
        data[0][2] = "asha21@";
        data[0][3] = "asha21@";

        data[1][0] = "kreya";
        data[1][1] = "kreya@gmail.com";
        data[1][2] = "kreya2@";
        data[1][3] = "kreya2@";

        return data;
    }
}


   /* @Test
    public void getLogin(){
        driver.get("http://qaclickacademy.com/");
        driver.manage().window().maximize();
    }*/








