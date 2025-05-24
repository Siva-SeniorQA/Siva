package Batch5_JavaLearning.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class conditionalMethods {

    public static void main(String[] args) throws InterruptedException {
//
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://testautomationpractice.blogspot.com/");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        //isSelected
//
//        WebElement gender=driver.findElement(By.xpath("//*[@id=\"male\"]"));
//       boolean result= gender.isSelected();//false
//        System.out.println(result);
//
//        driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
//        WebElement male=driver.findElement(By.xpath("//*[@id=\"male\"]"));
//        boolean result1=male.isSelected();//true
//        System.out.println(result1);

        //isEnabled

        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

      // boolean result= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).isEnabled();
        boolean result= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).isDisplayed();


        System.out.println(result);
    }

}
