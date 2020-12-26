package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public WebDriver driver;
    public Properties prop;
    public WebDriver initializeDriver() throws IOException {
        //Based on the brow7ser type method should be invoked (chrome,IE,Firefox)

        prop=new Properties();
        FileInputStream fis=new FileInputStream("D:\\AutomationFramework\\src\\main\\java\\resources\\configuration.properties");
        prop.load(fis);
        String browserName=prop.getProperty("browser");
        System.out.println(browserName);
        if(browserName.equals("chrome")){

            //executein chrome driver
            System.setProperty("webdriver.chrome.driver","D:\\AutomationFramework\\src\\main\\java\\org\\drivers\\chromedriver.exe");
             driver=new ChromeDriver();
        }
        else if(browserName.equals("firefox")){
            //execute in firefox driver
            System.setProperty("webdriver.gecko.driver","D:\\AutomationFramework\\src\\main\\java\\org\\drivers\\geckodriver-v0.28.0-win64\\geckodriver.exe");
             driver=new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("IE")){
            //execute in Internet Explorer driver
            System.setProperty("webdriver.ie.driver","D:\\AutomationFramework\\src\\main\\java\\org\\drivers\\IEDriverServer.exe");
             driver=new InternetExplorerDriver();
        }
       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        return driver;
    }
public WebDriver getDriver() throws IOException {
        if(driver==null){
           return initializeDriver();
        }
        else
        {
            return  driver;
        }
}
}
