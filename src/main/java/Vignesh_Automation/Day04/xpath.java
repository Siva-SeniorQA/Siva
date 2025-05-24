package Vignesh_Automation.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath {

    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        //Absolute xpath
       // driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/form/input")).sendKeys("Desktop");
        //Relative xpath with single Attributes
        //driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("Computer");
        //Relative xpath with multiple Attributes
       // driver.findElement(By.xpath("//input[@id=\"small-searchterms\"][@placeholder=\"Search store\"]")).sendKeys("Tablet");
        //xpath using And Operator
       // driver.findElement(By.xpath("//input[@id=\"small-searchterms\" and @placeholder=\"Search store\"]")).sendKeys("Welcomee");
        //xpath using Or Operator
       // driver.findElement(By.xpath("//input[@id=\"small-searchterms1\" or @placeholder=\"Search store\"]")).sendKeys("Chennai");
        //xpath using text()
        boolean result=driver.findElement(By.xpath("//h2[text()=\"Welcome to our store\"]")).isDisplayed();
        System.out.println(result);
        //xpath using contains()
        boolean result1=driver.findElement(By.xpath("//h2[contains(text(),\"Welcome\")]")).isDisplayed();
        System.out.println(result1);
        //xpath using start-with()
        driver.findElement(By.xpath("//a[starts-with(text(),\" D\")]")).click();


    }
}
