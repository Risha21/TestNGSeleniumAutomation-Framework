package resources;

import org.testng.annotations.Test;
import pageObjects.LandingPage;

public class AboutPage extends TestBase{
    @Test
    public void getAboutUsePage(){
        LandingPage lp = new LandingPage(driver);
        lp.getAboutLinkLinkPage().click();
        lp.getAboutLinkLinkPage().click();
    }
}
