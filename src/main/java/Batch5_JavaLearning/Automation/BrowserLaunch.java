package Batch5_JavaLearning.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.List;

public class BrowserLaunch {
    public static void main(String[] args) {

        ChromeOptions option=new ChromeOptions();
        option.addArguments("--headless=new");
      WebDriver driver=new ChromeDriver();
      driver.get("https://testautomationpractice.blogspot.com/");

      driver.findElement(By.partialLinkText("Hidden")).click();
        System.out.println("Executed successfully");
//
//      //driver.findElement(By.id("email")).sendKeys("sivakumar@gmail.com");
//        driver.findElement(By.name("email")).sendKeys("Siva");
//        driver.findElement(By.className("_9npi")).sendKeys("Mani");
//        List<WebElement> links=driver.findElements(By.tagName("button"));
//        int length=links.size();
//        System.out.println(length);
////        for(int i=0;i<length;i++)
////        {
////            String linkename=links.get(i).getText();
////            System.out.println(linkename);
////        }




    }

}
