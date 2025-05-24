package BTS_Automation.Day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Checkbox {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//Single Element
        driver.findElement(By.xpath("//*[@id=\"sunday\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"sunday\"]")).click();

        List<WebElement> element=driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));

        for(int i=3;i<element.size();i++)
        {
            element.get(i).click();
        }
        for(int i=3;i<element.size();i++)
        {
            element.get(i).click();
        }


    }
}
