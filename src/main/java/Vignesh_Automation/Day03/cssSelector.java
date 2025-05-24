package Vignesh_Automation.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        //Css selector using Tagname and ID combination
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Siva");
        //Css selector using Tagname and classname combination
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("desktop");
        //Tagname& attributes
        //driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).sendKeys("Welcome");
        //Tagname,classname and attributes


    }
}
