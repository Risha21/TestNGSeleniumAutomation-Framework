package resources;

import driver.DriverManager;
import driver.DriverManagerFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pageObjects.LandingPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase extends Base{

//    DriverManager driverManager;
//    WebDriver driver;
//    Properties properties;
//    String url;
//
//    @BeforeTest
//    public void beforeTest() {
//        url = getBaseUrl();
//        driverManager = DriverManagerFactory.getManager(DriverManager.DriverType.CHROME);
//    }
//
//    @BeforeMethod
//    public void beforeMethod() {
//        driver = driverManager.getDriver();
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//        driverManager.quitDriver();
//    }
//
//    public String getBaseUrl() {
//        properties=new Properties();
//        FileInputStream fis= null;
//        try {
//            fis = new FileInputStream("D:\\AutomationFramework\\src\\main\\java\\resources\\configuration.properties");
//            properties.load(fis);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return properties.getProperty("url");
//    }
//
//    public void refreshPage() {
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.navigate().refresh();
//    }

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("Before test");
        initializeDriver();

        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().refresh();
               /* WebDriverWait wait=new WebDriverWait(driver,20);
             wait.until(ExpectedConditions.alertIsPresent());
                    Alert alert = driver.switchTo().alert();
                    String alertMessage=driver.switchTo().alert().getText();
                    alert.dismiss();
                    System.out.println("alert message is:" +alertMessage);*/
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}



