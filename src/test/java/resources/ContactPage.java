package resources;

import org.testng.annotations.Test;
import pageObjects.LandingPage;

public class ContactPage extends TestBase {

        @Test
        public void getContactPage() throws InterruptedException {
//            driver.get(url);
//            refreshPage();
            LandingPage lp = new LandingPage(driver);
            lp.getContactLinkPage();
            Thread.sleep(1000);
            lp.getContactLinkPage();
        }
    }