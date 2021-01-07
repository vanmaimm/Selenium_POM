package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedinLogin {
    WebDriver driver;

    @FindBy(xpath="//input[@id='session_key']")

    WebElement username;

    @FindBy(xpath = "//input[@id='session_password']")
    WebElement password;

    @FindBy (xpath = "//button[contains(text(),'Sign in')]")
    WebElement login;

    public LinkedinLogin (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String username){
        this.username.sendKeys(username);
    }

    public void setPassword(String password){
        this.password.sendKeys(password);
    }
    public void clickLogin(){
        this.login.click();
    }
    public void loginToGuru99(String username,String password){
        this.setUsername(username);

        this.setPassword(password);

        this.clickLogin();

    }

}
