package Batch5_JavaLearning.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckboxHandling {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type=\"checkbox\"][@class=\"form-check-input\"]"));
        for(int i=0;i<checkbox.size();i++)
        {
            checkbox.get(i).click();
            //checkbox.get(i).click();
        }


    }
}
