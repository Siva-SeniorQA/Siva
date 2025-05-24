package Batch4_Automation.Day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class alerthandling {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Alert myalert;

        //Simple Alert
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent()).accept();

        //Alert myalert=driver.switchTo().alert();
        //Thread.sleep(5000);
        //myalert.accept();


     /*   //Prompt alert-accept()

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
        myalert=driver.switchTo().alert();
        Thread.sleep(5000);
        myalert.accept();

        //cancel()
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
        myalert=driver.switchTo().alert();
        Thread.sleep(5000);
        myalert.dismiss();

        //Confirmation Alert()-Accept()

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        myalert=driver.switchTo().alert();
        myalert.sendKeys("welcome");
        Thread.sleep(5000);
        myalert.accept();

        //cancel()

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        myalert=driver.switchTo().alert();
        myalert.sendKeys("welcome");
        Thread.sleep(5000);
        myalert.dismiss();

        //cancel()

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        myalert=driver.switchTo().alert();
       // myalert.sendKeys("welcome");
        Thread.sleep(5000);
        myalert.dismiss();


        //Authentication Popup()

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin1:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
*/


    }
}
