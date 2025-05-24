package Vignesh_Automation.Day08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class alertHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//Handling simple Alert
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
        Alert a=driver.switchTo().alert();

        a.accept();


    //Handling Confirmation Alert
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
        Alert a1=driver.switchTo().alert();

        a1.accept();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
        Alert a2=driver.switchTo().alert();

        a2.dismiss();

//Handling prompt alert
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        Alert a3=driver.switchTo().alert();
        a3.sendKeys("welcome");

        a3.dismiss();


        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();

        Alert a4=driver.switchTo().alert();
        a4.sendKeys("welcome");

        a4.accept();


    }
}
