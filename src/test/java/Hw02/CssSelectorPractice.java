package Hw02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelectorPractice {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");
        driver.findElement(By.cssSelector("input[id='profileID']")).sendKeys("Profile ID:");
        driver.findElement(By.cssSelector("input[id='profileBox'] ")).sendKeys("Profile");
        driver.findElement(By.xpath("//input[@id='feedback' and @class='form-control feedbackBox1']"))
                .sendKeys("FeedBack");
        driver.findElement(By.xpath("//input[contains(@class,'feedbackBox2')]"))
                .sendKeys("FeedBack2");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Gmail.com");
        driver.findElement(By.xpath("//input[contains(@name,'contentInput')]"))
                .sendKeys("QA");
        driver.findElement(By.xpath("//input[contains(@name,'IntroInput')]"))
                .sendKeys("Intro to Advanced CSS:");
        driver.findElement(By.xpath("//input[contains(@name,'conclusion')]"))
                .sendKeys("Conclusion of CSS Module:");
        driver.close();
    }
}
