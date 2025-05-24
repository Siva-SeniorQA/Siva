package Vignesh_Automation.Day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class webdriverMethods {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //isDisplayed()
        boolean result=driver.findElement(By.xpath("//*[@id=\"HTML5\"]/div[1]/button")).isDisplayed();
        System.out.println(result);

        //isEnabled()
        boolean enable=driver.findElement(By.xpath("//*[@id=\"name\"]")).isEnabled();
        System.out.println(enable);

        boolean enable1=driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[8]/button")).isEnabled();
        System.out.println(enable1);//true

        driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[8]/button")).click();

        boolean enable2=driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[8]/button")).isEnabled();
        System.out.println(enable2);//true

        //isselected()

        boolean select=driver.findElement(By.xpath("//*[@id=\"male\"]")).isSelected();
        System.out.println(select);//false

        driver.findElement(By.xpath("//*[@id=\"male\"]")).click();

        boolean select1=driver.findElement(By.xpath("//*[@id=\"male\"]")).isSelected();
        System.out.println(select1);//true








    }
}
