package Batch5_JavaLearning.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class headless {
    public static void main(String[] args) {

    ChromeOptions options=new ChromeOptions();
        //options.addArguments("--headless=new");
        // options.setAcceptInsecureCerts(true);
        //options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
        //options.addArguments("--incognito");
        options.addExtensions(new File("C:\\Users\\Sushanth\\Downloads\\Stands-AdBlocker-Chrome-Web-Store.crx"));

        WebDriver driver=new ChromeDriver(options);
        driver.get("https://text-compare.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Successfully url opened");



    }
}
