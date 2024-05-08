package Hw03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class ClickOption4 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));

        //checking if all the checkBoxes are displayed or not?
        for (int i = 0; i < checkBoxes.size(); i++) {
            WebElement storeCheckBoxes = checkBoxes.get(i);
            boolean display = storeCheckBoxes.isDisplayed();
            System.out.println("Option " + (i + 1) + " is display = " + display);
        }

        System.out.println(); // this sout is just for space

        // check if all the checkBoxes are selected or not?
        for (int i = 0; i < checkBoxes.size(); i++) {
            WebElement storeCheckBoxes = checkBoxes.get(i);
            boolean selected = storeCheckBoxes.isSelected();
            System.out.println("Option " + (i + 1) + " is select = " + selected);
        }
        System.out.println(); // this sout is just for space

        //Check all the checkBoxes are enable or not?
        for (int i = 0; i < checkBoxes.size(); i++) {
            WebElement storeCheckBoxes = checkBoxes.get(i);
            boolean enabled = storeCheckBoxes.isEnabled();
            System.out.println("Option " + (i + 1) + " is enabled = " + enabled);
        }

        // click on Enable CheckBox to Enable the boxes.
        driver.findElement(By.xpath("//button[@id='enabledcheckbox']")).click();

        System.out.println(); // this sout is just for space

        //we clicked on Enable CheckBox button to enable the checkBoxes. again checking if all the boxes are enabled?
        for (int i = 0; i < checkBoxes.size(); i++) {
            WebElement storeCheckBoxes = checkBoxes.get(i);
            boolean enabled = storeCheckBoxes.isEnabled();
            System.out.println("option " + (i + 1) + " is enabled this time = " + enabled);
        }

        // click on option 4
        for (int i = 0; i < checkBoxes.size(); i++) {
            WebElement storeCheckBoxes = checkBoxes.get(i);
            String value = storeCheckBoxes.getAttribute("value");
            if (value.equals("Checkbox-4")) {
                storeCheckBoxes.click();

                // check if option 4 is selected of not?
                System.out.println("option 4 is selected = " + storeCheckBoxes.isSelected());
            }
        }
    }
}
