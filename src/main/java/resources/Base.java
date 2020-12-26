package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

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
            LoggingPreferences loggingPrefs = new LoggingPreferences();
            loggingPrefs.enable(LogType.BROWSER, Level.ALL);
            loggingPrefs.enable(LogType.CLIENT, Level.ALL);
            loggingPrefs.enable(LogType.DRIVER, Level.ALL);
            loggingPrefs.enable(LogType.PERFORMANCE, Level.ALL);
            loggingPrefs.enable(LogType.PROFILER, Level.ALL);
            loggingPrefs.enable(LogType.SERVER, Level.ALL);
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("marionette", true);
            desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            desiredCapabilities.setCapability(CapabilityType.LOGGING_PREFS, loggingPrefs);
            FirefoxOptions options = new FirefoxOptions();
            options.merge(desiredCapabilities);
            options.setLogLevel(FirefoxDriverLogLevel.TRACE);
            System.setProperty("webdriver.gecko.driver","D:\\AutomationFramework\\src\\main\\java\\org\\drivers\\geckodriver-v0.28.0-win64\\geckodriver.exe");
            driver=new FirefoxDriver(options);
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
