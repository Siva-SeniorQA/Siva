package BTS_Automation.Day08;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class screenshot {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        TakesScreenshot ts=(TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        File target=new File("screenshot/fullscreen1.png");
        source.renameTo(target);
/*
       WebElement partial= driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[4]/div[2]"));
      File source1= partial.getScreenshotAs(OutputType.FILE);
        File target1=new File("screenshot/partial.jpg");
        source1.renameTo(target1);

        WebElement single= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
        File source2= single.getScreenshotAs(OutputType.FILE);
        File target2=new File("screenshot/single1.jpg");
        source2.renameTo(target2);


*/
    }
}
