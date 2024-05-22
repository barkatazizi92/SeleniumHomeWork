package Hw04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Hw05TestNG {
    public static WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void loginIsDisplay(){
       WebElement loginIsDisplay = driver.findElement(By.id("btnLogin"));
        Assert.assertTrue(loginIsDisplay.isDisplayed());
    }

    @Test
    public void loginIsEnabled(){
        WebElement loginIsDisplay = driver.findElement(By.id("btnLogin"));
        Assert.assertTrue(loginIsDisplay.isEnabled());
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
