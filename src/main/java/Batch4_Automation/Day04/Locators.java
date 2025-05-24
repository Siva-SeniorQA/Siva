package Batch4_Automation.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.lambdatest.com/login");
        Thread.sleep(5000);
/*
        //Using ID Locator
        driver.findElement(By.id("email")).sendKeys("sivakumarmr0506@gmail.com");

        //Using Name Locator
        driver.findElement(By.name("password")).sendKeys("Admin");

        //Using LinkText Locator
        driver.findElement(By.linkText("Forgot Password?")).click();

        //Using PartialLinkText Locator
        //driver.findElement(By.partialLinkText("Forgot")).click();

        //Using TagName Locator
        List<WebElement> list=driver.findElements(By.tagName("button"));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).getText());
        }
*/
        //Using Classname Locator

        driver.findElement(By.className("rounded")).click();

    }
}
