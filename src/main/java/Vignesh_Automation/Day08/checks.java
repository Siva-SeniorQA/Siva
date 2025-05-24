package Vignesh_Automation.Day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class checks {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


       List<WebElement> checkboxs= driver.findElements(By.xpath("//input[@class=\"form-check-input\"][@type=\"checkbox\"]"));
       for(int i=3;i<checkboxs.size();i++)
       {
           checkboxs.get(i).click();
       }
       Thread.sleep(5000);


    }
}
