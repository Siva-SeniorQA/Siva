package Batch4_Automation.Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class upload {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"multipleFilesInput\"]")).sendKeys("C:\\Users\\Sushanth\\OneDrive\\Documents\\Manual.pdf");
        driver.findElement(By.xpath("//*[@id=\"multipleFilesInput\"]")).sendKeys("C:\\Users\\Sushanth\\OneDrive\\Documents\\Manual.pdf");
        //driver.findElement(By.xpath("//*[@id=\"singleFileInput\"]")).sendKeys("C:\\Users\\Sushanth\\OneDrive\\Documents\\Manual.pdf");
    }
}
