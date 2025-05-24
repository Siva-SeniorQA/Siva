package Vignesh_Automation.Day08;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class screenshot {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement partial=driver.findElement(By.xpath("/html/body/div[6]"));
        WebElement single=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[3]/div/div[1]/div/div/a/img"));

        TakesScreenshot ts=(TakesScreenshot) driver;//Interface initialiazation
        File source=ts.getScreenshotAs(OutputType.FILE);//capture
        File target=new File("Screen/full.jpg");//Location
source.renameTo(target)   ;


        File p1=partial.getScreenshotAs(OutputType.FILE);
        File t1=new File("Screen/partial.jpg");//Location
        p1.renameTo(t1);

        File p2=single.getScreenshotAs(OutputType.FILE);
        File t2=new File("Screen/single.jpg");//Location
        p2.renameTo(t2);





    }
}
