package resources;

import org.testng.annotations.Test;
import pageObjects.LandingPage;

public class BlogPage extends TestBase {
    @Test
    public void getBlogPage() {
        LandingPage lp = new LandingPage(driver);
        lp.getBlogLinkPage().click();

    }
}



