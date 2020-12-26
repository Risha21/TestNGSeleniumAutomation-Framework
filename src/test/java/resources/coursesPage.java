package resources;

import org.testng.annotations.Test;
import pageObjects.LandingPage;

public class CoursesPage extends TestBase {

    @Test
    public void getCoursePage() throws InterruptedException {
        LandingPage lp = new LandingPage(driver);
        lp.getCourseLinkPage().click();
        Thread.sleep(1000);
        lp.getCourseLinkPage().click();

    }

}
