package BTS_Automation.Day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ConditionalMethods {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//        boolean result=driver.findElement(By.xpath("//*[@id=\"male\"]")).isSelected();
//        System.out.println(result);
//        driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
//        boolean result1=driver.findElement(By.xpath("//*[@id=\"male\"]")).isSelected();
//        System.out.println(result1);

//        boolean enabled1=driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[8]/button")).isEnabled();
//        System.out.println(enabled1);
//        driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[8]/button")).click();
//        boolean enabled2=driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[8]/button")).isEnabled();
//        System.out.println(enabled2);


       String expected_lable="Name:";
        String actual_label=driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[1]/label[1]")).getText();

        if(expected_lable.equals(actual_label))
        {
            System.out.println("Client Required is passed");
        }
        else
        {
            System.out.println("Client Required is fail");
        }
    }
}
