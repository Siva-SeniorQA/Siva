package Batch4_Automation.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathMethods {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //Xpath using text() Method
        boolean text=driver.findElement(By.xpath("//h2[text()=\"Welcome to our store\"]")).isDisplayed();
        System.out.println(text);

        //xpath using Contains method
           // Approach -1
       // driver.findElement(By.xpath("//input[contains(@id,\"small\")]")).sendKeys("mobiles");

       //xpath using starts-with() method

        //driver.findElement(By.xpath("//input[starts-with(@placeholder,\"Search store\")]")).sendKeys("Shirts");
      //xpath using xpath chain

        driver.findElement(By.xpath("//div[@class=\"search-box store-search-box\"]/form/input")).sendKeys("computer");

    }
}
