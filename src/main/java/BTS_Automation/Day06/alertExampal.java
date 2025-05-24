package BTS_Automation.Day06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class alertExampal {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
//
//        Alert alert=driver.switchTo().alert();
//        alert.accept();
//
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
//        driver.switchTo().alert().accept();
//
//        Thread.sleep(5000);
//
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
//
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
//
//        Alert alert=driver.switchTo().alert();
//        alert.sendKeys("Welcome");
//        alert.dismiss();

    }
}
