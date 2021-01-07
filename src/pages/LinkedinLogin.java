package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedinLogin {
    WebDriver driver;

    By username  = By.name("session_key");

    By password = By.name("session_password");

    By login = By.xpath("//button[contains(text(),'Sign in')]");



    public LinkedinLogin(WebDriver driver){
        this.driver = driver;
    }
    public void setUsername(String username){
        driver.findElement(this.username).sendKeys(username);
    }
    public void setPassword (String password){
        driver.findElement(this.password).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(login).click();
    }
    public void login(String username, String password){
        this.setUsername(username);
        this.setPassword(password);
        this.clickLogin();
    }
}
