package driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import util.ConfigProvider;

import java.io.File;

public class ChromeDriverManager extends DriverManager {

    @Override
    public void createDriver() {
        String webDriver = ConfigProvider.getInstance().getProperty("chromeWebDriver");
        String webDriverPath = ConfigProvider.getInstance().getProperty("chromeWebDriverPath");
        System.setProperty(webDriver, webDriverPath);
        driver = new ChromeDriver();
    }

}
