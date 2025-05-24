package BTS_Automation.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(5000);
//Tagname with ID
        driver.findElement(By.cssSelector("input#name")).sendKeys("Sivakumar");
        //Tagname class name &attributes
        driver.findElement(By.cssSelector("input.form-control[placeholder=\"Enter Phone\"]")).sendKeys("siva");

        //Tagname with class

        driver.findElement(By.cssSelector("input.wikipedia-search-button")).click();
        //tagname & attribute
        driver.findElement(By.cssSelector("input[maxlength=\"25\"]")).sendKeys("dsfdsf@gmail.com");
    }
}
