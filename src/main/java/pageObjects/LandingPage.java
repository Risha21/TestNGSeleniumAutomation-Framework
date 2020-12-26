package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;
    By registerClick = By.xpath("//span[text()='Register']");
    By loginClick = By.xpath("//span[text()='Login']");
    By title = By.xpath("//h2[text()='Featured Courses']");
    By navigationClick = By.xpath("//div[@role='navigation']");
    By homeLink = By.xpath("//a[text()='Home']");
    By courseLink = By.xpath("//a[text()='Courses']");
    By videosLink = By.xpath("//a[text()='Videos']");
    By interviewLink = By.xpath("//a[text()='Interview Guide']");
    By practiceLink=By.xpath("//a[text()='Practice']");
    By BlogLink=By.xpath("//a[text()='Blog']");
    By aboutLink=By.xpath("//a[text()='About']");
    By contactLink=By.xpath("//a[text()='Contact']");


    public LandingPage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement getRegisterPage(){

        return driver.findElement(registerClick);
    }

    public WebElement getLoginClick(){

        return driver.findElement(loginClick);
    }

    public WebElement getTitle(){

        return driver.findElement(title);
    }

    public WebElement getNavigationClick(){
        return driver.findElement(navigationClick);
    }


    public WebElement getHomeLinkPage(){
        return driver.findElement(homeLink);
    }

    public WebElement getCourseLinkPage(){
        return driver.findElement(courseLink);
    }

    public WebElement getVideosLinkPage(){
        return driver.findElement(videosLink);
    }

    public WebElement getAboutLinkLinkPage(){

        return driver.findElement(aboutLink);
    }
    public WebElement practiceLinkPage(){
        return driver.findElement(practiceLink);
    }
    public WebElement getBlogLinkPage(){

        return driver.findElement(BlogLink);
    }
    public WebElement getInterviewLinkPage()
    {
        return driver.findElement(interviewLink);
    }
    public WebElement getContactLinkPage(){

        return driver.findElement(contactLink);
    }


}