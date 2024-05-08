package Hw03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class WebElementsCheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
       List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

       // check if all the checkBoxes  are displayed?

       for(int i=0; i<checkBoxes.size(); i++){
          WebElement check =  checkBoxes.get(i);
         boolean checkStatus = check.isDisplayed();
         System.out.println("Option " +(i+1)+" check box is Display = "+checkStatus);
       }

        System.out.println(); // check if all the checkBoxes  are Enabled?

       for(int i =0; i<checkBoxes.size(); i++){
          WebElement checkBoxEnable =  checkBoxes.get(i);
         boolean enabled = checkBoxEnable.isEnabled();
           System.out.println("Option "+(i+1)+ " check box is Enabled = "+ enabled);
       }

        System.out.println(); // check if all the checkBoxes  are Selected?

       for( int i=0; i<checkBoxes.size(); i++){
          WebElement selected = checkBoxes.get(i);
         boolean check = selected.isSelected();
           System.out.println("Option "+ (i+1) +" check box is select = "+ check);
       }
        System.out.println(); // click of on all the checkBoxes

       for(WebElement clickBoxes: checkBoxes){
           clickBoxes.click();
       }

        System.out.println();
        System.out.println("check if it is clicked");
        System.out.println();

        for(int i=0; i<checkBoxes.size(); i++){
           WebElement storeCheckBoxes = checkBoxes.get(i);
          boolean clickedStatus =  storeCheckBoxes.isSelected();
            System.out.println("Option "+ (i+1) +" check box is select = "+ clickedStatus);

        }
    }
}
