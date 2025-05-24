package Batch5_JavaLearning.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class javaScriptExecutor {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement radio=driver.findElement(By.xpath("//*[@id=\"male\"]"));
        WebElement name= driver.findElement(By.xpath("//*[@id=\"name\"]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;

        //click()
        js.executeScript("arguments[0].click()",radio);

        //Sendkeys

        js.executeScript("arguments[0].setAttribute('value','sivakumar')",name);

        //Scroll down

        js.executeScript("window.scrollBy(0,2000)", " ");
//scroll up

        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,-2000)", " ");

        //ZoonIn

        js.executeScript("document.body.style.zoom='150%' ");




    }
}
