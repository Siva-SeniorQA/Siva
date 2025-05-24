package Batch4_Automation.Day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        //get()
        driver.get("https://demo.nopcommerce.com/");
       //getTitle()
        String title=driver.getTitle();//nopCommerce demo store
        System.out.println(title);
        //getCurrenturl
       String url=driver.getCurrentUrl();
        System.out.println(url);
        //getPagesource()
        System.out.println(driver.getPageSource());
        //getwindowhandle()



    }
}
