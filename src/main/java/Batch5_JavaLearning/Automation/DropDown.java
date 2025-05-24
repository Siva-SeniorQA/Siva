package Batch5_JavaLearning.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement countrylist=driver.findElement(By.xpath("//*[@id=\"country\"]"));

        Select select=new Select(countrylist);

       // select.selectByIndex(9);
       // select.selectByValue("canada");
        //select.selectByVisibleText("France");
        //select.selectByContainsVisibleText("United");

        List<WebElement> countryname=select.getOptions();

        for(WebElement name:countryname)
        {
            String countryname1=name.getText();
            System.out.println(countryname1);

            if(countryname1.equals("India"))
            {
                name.click();
            }
        }


    }
}
