package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {
public WebDriver driver;
  By radio= By.xpath("//input[@type='radio']");
  By autoSuggestionBox=By.xpath("//input[@id='autocomplete']");
  By dropDown=By.xpath("//select[@id='dropdown-class-example']");
  By checkBox=By.xpath("//div[@id='checkbox-example']");
  By switchWindow=By.xpath("//button[@id='openwindow']");
  By switchTab=By.xpath("//a[@id='opentab']");
  By switchToAlertTextBox=By.xpath("//input[@id='name']");
  By alert=By.id("alertbtn");
  By confirm=By.id("confirmbtn");
  By mouseHover=By.id("mousehover");

  public WebElement getRadio(){
      return driver.findElement(radio);
  }


}
