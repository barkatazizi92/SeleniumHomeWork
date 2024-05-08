package Hw03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PracticeCheckBox {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement display = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean isdisplay = display.isDisplayed() && display.isEnabled();
        System.out.println("The status of checkbox isDisplay and isEnabled = " + isdisplay);
        boolean selected = display.isSelected();
        System.out.println("The is selected status of the checkbox = " + selected);

        if (isdisplay) {
            display.click();
        }
        System.out.println("After execution");
        boolean checkBox = display.isSelected();
        System.out.println("The is selected status of the checkbox = " + checkBox);
       }
    }
