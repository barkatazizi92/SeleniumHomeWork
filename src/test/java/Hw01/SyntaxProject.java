package Hw01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;

public class SyntaxProject {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/input-form-locator.php");
        driver.manage().window().maximize();
        driver.findElement(By.id("first_name")).sendKeys("Rahman");
        driver.findElement(By.name("last_name")).sendKeys("Walter");
        driver.findElement(By.name("email")).sendKeys("Rahman@gmail.com");
        driver.findElement(By.id("submit_button")).click();
        Thread.sleep(2000);
        driver.findElement(By.tagName("a")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("btn btn-primary")).click();
    }
}
