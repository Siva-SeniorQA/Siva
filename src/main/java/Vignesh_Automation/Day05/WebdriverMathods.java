package Vignesh_Automation.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebdriverMathods {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        //get()->It is navigating to mentioned url
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //getTitle()
        System.out.println(driver.getTitle());

        //getcurrenturl

        System.out.println(driver.getCurrentUrl());
        //getPagesource()

        System.out.println(driver.getPageSource());

        //getWindowHandle

        System.out.println(driver.getWindowHandle());

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();

        //getWindowHandles()

        System.out.println(driver.getWindowHandles());
        Thread.sleep(5000);

driver.quit();

    }
}
