package Hw01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHw {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement clickCreate = driver.findElement(By.partialLinkText("new account"));
        clickCreate.click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("John");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Abdul");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("Barkat@gmail.com");

        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("09988877665");
        driver.findElement(By.id("u_3_j_Xk")).sendKeys("Barkat@gmail.com");
        driver.findElement(By.name("websubmit")).click();
    }
}
