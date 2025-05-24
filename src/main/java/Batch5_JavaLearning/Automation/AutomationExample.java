package Batch5_JavaLearning.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AutomationExample {

    public static void main(String[] args) {

        //Bypass the SSL issue
//        ChromeOptions option=new ChromeOptions();
//        option.setAcceptInsecureCerts(true);
//        WebDriver driver=new ChromeDriver(option);

        //Remove Custom message
//        ChromeOptions options=new ChromeOptions();
//        options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
//        WebDriver driver=new ChromeDriver(options);

        ChromeOptions options=new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\Sushanth\\Downloads\\CRX-Extractor-Downloader-Chrome-Web-Store.crx"));
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);





    }
}
