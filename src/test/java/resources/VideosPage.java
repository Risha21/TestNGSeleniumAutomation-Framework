package resources;

import org.testng.annotations.Test;
import pageObjects.LandingPage;

public class VideosPage extends TestBase {

    @Test
    public void getVideoPage() {
        driver.get(url);
        refreshPage();
        LandingPage lp = new LandingPage(driver);
        lp.getVideosLinkPage().click();
    }

}
