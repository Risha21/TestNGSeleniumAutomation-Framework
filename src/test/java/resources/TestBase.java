package resources;

import driver.DriverManager;
import driver.DriverManagerFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.ConfigProvider;

import java.util.concurrent.TimeUnit;

public class TestBase {

    DriverManager driverManager;
    WebDriver driver;
    String url;
    String browser;

    @BeforeMethod
    public void beforeMethod() {
        url = ConfigProvider.getInstance().getProperty("url");
        browser = ConfigProvider.getInstance().getProperty("browser");
        driverManager = DriverManagerFactory.getManager(map(browser));
        driver = driverManager.getDriver();
        driver.get(url);
        refreshPage();
    }

    @AfterMethod
    public void afterMethod() {
        driverManager.quitDriver();
    }

    public void refreshPage() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().refresh();
    }

    private DriverManager.DriverType map(String browser) {
        String browserLowerCase = browser.toLowerCase();
        if (browserLowerCase.equals("chrome")) {
            return DriverManager.DriverType.CHROME;
        } else if (browserLowerCase.equals("firebox") || browserLowerCase.equals("ff")) {
            return DriverManager.DriverType.FIREFOX;
        }

        return DriverManager.DriverType.CHROME;
    }

}



