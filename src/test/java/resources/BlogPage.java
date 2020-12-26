package resources;

import org.testng.annotations.Test;
import pageObjects.LandingPage;

public class BlogPage extends TestBase {
    @Test
    public void getBlogPage(){
        LandingPage lp = new LandingPage(driver);
        lp.getBlogLinkPage().click();

    }

}
    //2 ways through which you can access object of other class 1.inheritance 2.create object of class



