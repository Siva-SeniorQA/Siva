package BTS_Automation.Day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class frames {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //driver.switchTo().frame(0);

        WebElement frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
        driver.switchTo().frame(frame1);


        driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("frame1");
driver.switchTo().defaultContent();
    driver.switchTo().frame(1);
        driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input")).sendKeys("frame2");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("Siva");

       WebElement iframe= driver.findElement(By.xpath("/html/body/center/iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//*[@id=\"i9\"]/div[3]/div")).click();

    }
}
