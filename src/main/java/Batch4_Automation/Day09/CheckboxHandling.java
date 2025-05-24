package Batch4_Automation.Day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckboxHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
/*
        //Select Specific checkbox
        driver.findElement(By.id("sunday")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("sunday")).click();


*/
        //Select all check box

        List<WebElement> checkbox=driver.findElements(By.xpath("div[class=\"form-check form-check-inline\"]"));
/*
        for(int i=0;i<checkbox.size()-3;i++)
        {
            String box=checkbox.get(i).getText();
            System.out.println(box);
        }

        */

 for(WebElement ele:checkbox)
 {
     String options=ele.getText();
     System.out.println(options);
 }


    }
}
