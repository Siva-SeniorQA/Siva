package BTS_Automation.Day08;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Javascript {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement name=driver.findElement(By.xpath("//*[@id=\"name\"]"));
        WebElement male=driver.findElement(By.xpath("//*[@id=\"male\"]"));

        JavascriptExecutor js=(JavascriptExecutor) driver;

        //SendKeys()
        js.executeScript("arguments[0].setAttribute('value','Sivakumar')",name);

        //click()

        js.executeScript("arguments[0].click()",male);

        //scrolldown

        js.executeScript("window.scrollBy(0,3000)");

        Thread.sleep(5000);

        js.executeScript("window.scrollBy(0,-2000)");

        //ZoomIn

//        js.executeScript("document.body.style.zoom='50%' ");
//
//        js.executeScript("document.body.style.zoom='150%' ");


    }
}
