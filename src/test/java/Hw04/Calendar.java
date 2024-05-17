package Hw04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

/*
    goto syntax hrms
    login
    click on leave
    from calander select any date of your choice
 */
public class Calendar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();
        driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[1]/img")).click();

        //select 2022 from drop down
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1 = new Select(year);
        select1.selectByValue("2022");

        // select May from drop down
        WebElement months = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select(months);
        select.selectByValue("8");

        // select date 16 from calendar table
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement date : dates) {
            if (date.getText().equalsIgnoreCase("16")) {
                date.click();
                break;
            }
        }

       // select month Jul from drop down
        driver.findElement(By.xpath("//input[@id='calToDate']/following::img[1]")).click();
        WebElement month2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select selectMonth2 = new Select(month2);
        selectMonth2.selectByVisibleText("Jul");

        // select 2025 from drop down
        WebElement year2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYears = new Select(year2);
        selectYears.selectByValue("2025");

        // select date 4 from calendar table
        List<WebElement> dates2 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement date2 : dates2) {
            if (date2.getText().equalsIgnoreCase("4")) {
                date2.click();
                break;
            }
        }
    }
}
