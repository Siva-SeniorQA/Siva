package Batch4_Automation.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        //Tagname&ID
       // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirt");
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirt");
        //Tagname&classname
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirt");
        //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirt");
        //Tagname&attribute
        //driver.findElement(By.cssSelector("input[aria-label=\"Search store\"]")).sendKeys("Tablet");
        //Tagname&class&Attribute
        driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("dress ");

    }
}
