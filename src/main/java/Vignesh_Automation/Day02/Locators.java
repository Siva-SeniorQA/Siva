package Vignesh_Automation.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.lambdatest.com/login");
        Thread.sleep(5000);
        //Using ID Locator
        driver.findElement(By.id("email")).sendKeys("siva");
        //Using Name Locator
        driver.findElement(By.name("password")).sendKeys("Hello234432");

        //Using ClassName Locator
        //driver.findElement(By.className("t_shadow-none")).click();

        //Using Linktext Locator
        //driver.findElement(By.linkText("Forgot Password?")).click();

        //Using Partial Linktext Locator
        //driver.findElement(By.partialLinkText("Forgot")).click();

        //Using Tagname

        List<WebElement> list=driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i).getText());
        }

    }
}
