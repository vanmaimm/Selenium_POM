package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(xpath = "//body/div[7]/div[3]/div[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/a[1]/div[2]")
    WebElement homePage;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getHomePage(){
        return  homePage.getText();
    }
}

