package BTS_Automation.Day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class fileupload {

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        File file=new File("C:\\Users\\Sushanth\\Downloads\\CRX\\AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx");
        options.addExtensions(file);


        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://text-compare.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //driver.findElement(By.xpath("//button[@type=\"submit\"]")).sendKeys("C:\\Users\\Sushanth\\Downloads\\welcome1.java");
       // driver.findElement(By.xpath("//*[@id=\"singleFileForm\"]/button")).sendKeys("C:\\Users\\Sushanth\\Downloads\\welcome.java");





    }
}
