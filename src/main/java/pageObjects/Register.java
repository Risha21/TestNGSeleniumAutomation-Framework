package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {
    public WebDriver driver;
   By fullName= By.xpath("//input[@autofocus='autofocus']");
   By email=By.id("user_email");
   By password=By.id("user_password");
   By confirmPassword=By.id("user_password_confirmation");
   By agreementCheckbox=By.id("user_agreed_to_terms");
   By signUp=By.xpath("//input[@value='Sign Up']");


    public Register(WebDriver driver) {

        this.driver=driver;
    }

    public WebElement getFullName(){

        return driver.findElement(fullName);
   }
    public WebElement email(){

        return driver.findElement(email);
    }
    public WebElement password(){

        return driver.findElement(password);
    }
    public WebElement confirmPassword(){

        return driver.findElement(confirmPassword);
    }
    public WebElement agreementCheckbox(){

        return driver.findElement(agreementCheckbox);
    }
    public WebElement signUP(){

        return driver.findElement(signUp);
    }


}
