package Batch5_JavaLearning.Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerthandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //simple Alert-warning message

        //driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
        //driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();

        Alert alert=driver.switchTo().alert();
        Thread.sleep(5000);
        alert.sendKeys("sivakumar");
        Thread.sleep(5000);
        alert.dismiss();

    }
}
