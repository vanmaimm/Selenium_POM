package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LinkedinLogin;

import java.util.Locale;

public class TestLinkedinLogin {
    String driverPath = "C:\\SeleniumWebDriver\\chromedriver.exe";
    WebDriver driver;
    LinkedinLogin login;
    HomePage homePage;

    @BeforeTest
        public void setup(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
    }
    @Test(priority = 0)

    public void test_Login_successfully(){
        this.login = new LinkedinLogin(driver);

        String loginTitle = "Welcome, mian!";

        this.login.login("mianclould@gmail.com", "mian@123");
        this.homePage = new HomePage(driver);
        Assert.assertEquals(loginTitle, homePage.getHomePage());


    }

}
