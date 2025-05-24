package Batch5_JavaLearning.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FramesHandling {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       WebElement frame1= driver.findElement(By.xpath("/html/frameset/frame[1]"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("frame1");
        driver.switchTo().defaultContent();
       WebElement frame4= driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
       driver.switchTo().frame(frame4);
       driver.findElement(By.xpath("//*[@id=\"id4\"]/div/input")).sendKeys("Siva");
        driver.switchTo().defaultContent();
        WebElement frame3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("Sush");
        WebElement iframe=driver.findElement(By.xpath("/html/body/center/iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//*[@id=\"i9\"]/div[3]/div")).click();


    }
}
