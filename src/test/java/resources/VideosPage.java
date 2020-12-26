package resources;

import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class VideosPage extends TestBase {
    @Test
    public void getVideoPage() throws InterruptedException, IOException {          

       //openHomePage();
        //2 ways through which you can access object of other class 1.inheritance 2.create object of class
//        driver.get(url);
//        refreshPage();
        LandingPage lp = new LandingPage(driver);
        lp.getVideosLinkPage().click();
    //    lp.getvideosLinkPage().click();
        System.out.println("User has clicked on video link page successfully");

    }

}
