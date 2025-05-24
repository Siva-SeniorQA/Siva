package Batch4_Automation.Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class doubleClick {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.switchTo().frame("iframeResult");

        WebElement input1=driver.findElement(By.xpath("//*[@id=\"field1\"]"));
        input1.clear();
        Thread.sleep(5000);
        input1.sendKeys("Siva");
        Thread.sleep(5000);

        WebElement button=driver.findElement(By.xpath("/html/body/button"));

        Actions a=new Actions(driver);
        a.doubleClick(button).perform();


    }
}
