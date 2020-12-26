package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    public WebDriver driver;

    By emailLogin=By.id("user_email");
    By passwordLogin=By.id("user_password");
    By logInClick=By.xpath("//input[@value='Log In']");

    public Login(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement setEmailLogin(){
        return driver.findElement(emailLogin);
    }
    public WebElement setPasswordLogin(){
        return driver.findElement(passwordLogin);
    }

    public WebElement clickLogin(){
        return driver.findElement(logInClick);
    }

}
