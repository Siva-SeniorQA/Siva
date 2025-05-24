package Batch4_Automation.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HandlingFrames {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println(driver.findElements(By.tagName("frame")).size());
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("frame1");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input")).sendKeys("frame2");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("Frame3");
       WebElement iframe= driver.findElement(By.xpath("/html/body/center/iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[2]/div/span")).click();
        driver.switchTo().defaultContent();

        WebElement frame4=driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
        driver.switchTo().frame(frame4);
        driver.findElement(By.xpath("//*[@id=\"i12\"]/div[3]/div")).sendKeys("siva");



    }
}
