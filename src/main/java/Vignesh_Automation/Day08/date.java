package Vignesh_Automation.Day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class date {

    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");




        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/p/download-files_25.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//*[@id=\"inputText\"]")).sendKeys("Sivakumar");


        driver.findElement(By.xpath("//*[@id=\"generatePdf\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"pdfDownloadLink\"]")).click();



    }
}
