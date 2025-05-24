package Batch4_Automation.Day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HeadlessBrowser {

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();

        File file=new File("C:\\Users\\Sushanth\\Downloads\\crx\\uBlock.crx");
        options.addExtensions(file);
        WebDriver driver=new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://text-compare.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//*[@id=\"download\"]")).click();

    }
    }

