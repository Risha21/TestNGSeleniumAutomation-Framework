package resources;

import org.testng.annotations.Test;
import pageObjects.LandingPage;

public class InterviewGuidePage extends TestBase{

    @Test
    public void getInterviewGuide(){
        LandingPage lp = new LandingPage(driver);
        lp.getInterviewLinkPage().click();
    }
}
