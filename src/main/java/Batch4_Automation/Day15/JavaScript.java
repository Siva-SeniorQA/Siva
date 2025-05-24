package Batch4_Automation.Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScript {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement radioButton=driver.findElement(By.xpath("//*[@id=\"male\"]"));
        WebElement firstname=driver.findElement(By.xpath("//*[@id=\"name\"]"));
        WebElement button=driver.findElement(By.xpath("//*[@id=\"btn3\"]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;

        //click()
        js.executeScript("arguments[0].click()",radioButton);
        //SendKeys()
        js.executeScript("arguments[0].setAttribute('value','sivakumar')",firstname);
        //Scrolldown
        js.executeScript("window.scrollBy(0,2000)"," ");
        Thread.sleep(5000);
        //ScrollUp
        js.executeScript("window.scrollBy(0,-2000)"," ");

        //Scroll particular Element
Thread.sleep(5000);
        js.executeScript("arguments[0].scrollIntoView();",button);
        Thread.sleep(5000);
        //ZoomIn
        js.executeScript("document.body.style.zoom='50%' ");
Thread.sleep(5000);

        js.executeScript("document.body.style.zoom='150%' ");
    }
}
