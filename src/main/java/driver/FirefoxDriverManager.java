package driver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import util.ConfigProvider;

import java.util.logging.Level;

public class FirefoxDriverManager extends DriverManager {

    @Override
    public void createDriver() {
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

        String webDriver = ConfigProvider.getInstance().getProperty("fireFoxWebDriver");
        String webDriverPath = ConfigProvider.getInstance().getProperty("fireFoxWebDriverPath");
        System.setProperty(webDriver, webDriverPath);
        driver=new FirefoxDriver(options);
    }

}
