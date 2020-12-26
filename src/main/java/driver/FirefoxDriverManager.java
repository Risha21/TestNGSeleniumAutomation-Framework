package driver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {

    @Override
    public void createDriver() {
        System.setProperty("webdriver.gecko.driver","D:\\AutomationFramework\\src\\main\\java\\org\\drivers\\geckodriver-v0.28.0-win64\\geckodriver.exe");
        driver=new FirefoxDriver();
    }

}
