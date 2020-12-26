package resources;

import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.Login;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class coursesPage extends TestBase{
    @Test
    public void getcoursePage() throws InterruptedException, IOException {
       /* try {
            LandingPage lp = new LandingPage(driver);
            lp.getCourseLinkPage().click();
        }
        catch (NoAlertPresentException e) {
            Alert alert = driver.switchTo().alert();

            // Capturing alert message.
            String alertMessage = driver.switchTo().alert().getText();

            // Displaying alert message
            System.out.println(alertMessage);
        }
*/

        //2 ways through which you can access object of other class 1.inheritance 2.create object of class

        LandingPage lp = new LandingPage(driver);
        lp.getCourseLinkPage().click();
        Thread.sleep(1000);
        lp.getCourseLinkPage().click();

    }

}
