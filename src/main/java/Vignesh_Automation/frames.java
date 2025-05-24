package Vignesh_Automation;

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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println(driver.findElements(By.tagName("frame")).size());

        driver.switchTo().frame(0);
       driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("Siva");
       driver.switchTo().defaultContent();

       driver.switchTo().frame(1);
       driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input")).sendKeys("Vignesh");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);

        driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("Frame3");

        WebElement iframe=driver.findElement(By.xpath("/html/body/center/iframe"));
        driver.switchTo().frame(iframe);

        driver.findElement(By.xpath("//*[@id=\"i9\"]/div[3]/div")).click();


    }
}
