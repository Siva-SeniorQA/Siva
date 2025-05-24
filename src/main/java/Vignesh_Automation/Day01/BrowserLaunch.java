package Vignesh_Automation.Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrowserLaunch {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/gropa");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String self = driver.findElement(By.xpath("//a[contains(text(),'Integra Capital L')]//self::a")).getText();
        System.out.println(self);

        String parent = driver.findElement(By.xpath("//a[contains(text(),'Integra Capital L')]//self::a//parent::td")).getText();
        System.out.println(parent);

        List<WebElement> child=driver.findElements(By.xpath("//a[contains(text(),'Integra Capital L')]//ancestor::tr//child::td"));
        System.out.println(child.size());

        String ancestor=driver.findElement(By.xpath("//a[contains(text(),'Integra Capital L')]//ancestor::tr")).getText();
        System.out.println(ancestor);
    }
}