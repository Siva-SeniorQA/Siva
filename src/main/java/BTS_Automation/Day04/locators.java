package BTS_Automation.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locators {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
/*
        //using ID
       // driver.findElement(By.id("email")).sendKeys("sivakumariiy@gmail.com");

        //Using name

        driver.findElement(By.name("email")).sendKeys("welome@gmail.com");

        //Using Classname
        driver.findElement(By.className("_9npi")).sendKeys("Admin");
        driver.findElement(By.className("_42ft")).click();
*/
        //Using LinkedText

        //driver.findElement(By.linkText("Forgotten password?")).click();

        //Using LinkedText

        //driver.findElement(By.partialLinkText("Forgotten")).click();

        //Using Tagname

        List<WebElement> heading=driver.findElements(By.tagName("a"));
        String expectlink="Create a Page";
        for(WebElement head:heading)
        {
            String str=head.getText();
            System.out.println(str);
            if(expectlink.equals(str))
            {
                head.click();

            }
        }



    }
}
