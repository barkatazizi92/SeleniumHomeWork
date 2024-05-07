package Hw02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingXpath {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");
        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Najib");
        String getText1 = driver.findElement(By.xpath("//div[contains(text(),'Select using Attribute')]"))
                .getText();
        System.out.println(getText1);
        String text2 = driver.findElement(By.xpath("//div[contains(text(),'Select using Text:')]"))
                .getText();
        System.out.println(text2);
        driver.findElement(By.xpath("//button[@id='DisplayName']")).click();
        driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"))
                .sendKeys("Select using text contains");
        String text3 = driver.findElement(By.xpath("//div[text()='Select using Contains Method:']"))
                .getText();
        System.out.println(text3);
        String text4 = driver.findElement(By.xpath("//label[contains(text(),'consectetur adipisicing elit')]"))
                .getText();
        System.out.println(text4);
        String text5 = driver.findElement(By.xpath("//div[starts-with(text(),'Select using Starts')]"))
                .getText();
        System.out.println(text5);
        driver.findElement(By.xpath("//input[contains(@id,'apiSettings')]")).sendKeys("Khan");
        String text6 = driver.findElement(By.xpath("//div[text()='Select using Indexing:']")).getText();
        System.out.println(text6);
        String text7 = driver.findElement(By.xpath("//label[text()='Email 1:']")).getText();
        System.out.println(text7);
        driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"))
                .sendKeys("Barkat@milad.com");
        driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"))
                .sendKeys("barkat@milad444.com");
        driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"))
                .sendKeys("barkat@milad555.com");
        driver.findElement(By.xpath("//input[@name='customField' and @data-detail='one'] "))
                .sendKeys("Milad1");
        driver.findElement(By.xpath("//input[@name='customField' and @data-detail='two']"))
                .sendKeys("Milad2");
        driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='one']"))
                .sendKeys("Select using Multiple Attributes (& Operator)");
        driver.findElement(By.xpath("(//input[@name='customField1'])[2]"))
                .sendKeys("Select using Multiple Attributes (& Operator");
        driver.close();
    }
}
