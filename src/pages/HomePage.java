package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By homepage = By.xpath("//body/div[7]/div[3]/div[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/a[1]/div[2]");
    public HomePage (WebDriver driver){
        this.driver = driver;
    }
    public String getHomePage(){
        return driver.findElement(homepage).getText();
    }
}
