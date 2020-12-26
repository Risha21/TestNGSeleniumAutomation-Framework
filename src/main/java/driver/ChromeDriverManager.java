package driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class ChromeDriverManager extends DriverManager {

    @Override
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver","D:\\AutomationFramework\\src\\main\\java\\org\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

}
