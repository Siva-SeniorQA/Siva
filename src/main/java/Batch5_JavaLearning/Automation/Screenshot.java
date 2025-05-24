package Batch5_JavaLearning.Automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Screenshot {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        TakesScreenshot ts= (TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);//Capturing image
        File target=new File("Screenshot1/fullscreen.jpg");//Destination
        source.renameTo(target);

        WebElement partial=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[4]/div[2]/div[1]/div/div[1]/a/img"));

        File source1= partial.getScreenshotAs(OutputType.FILE);
        File target1=new File("Screenshot1/single.jpg");
        source1.renameTo(target1);

    }
}
