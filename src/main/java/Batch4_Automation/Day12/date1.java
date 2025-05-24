package Batch4_Automation.Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class date1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement frame1=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame1);

        //driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("03/22/2020");

        driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();

        String expected_date="25";
        String expected_month="March";
        String expected_year="2026";


        while(true)
        {
            String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            String current_month= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

            if( expected_month.equals(current_month) && expected_year.equals(current_year))
            {
                break;
            }
            //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            //driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
            driver.findElement(By.xpath("//a[@title='Next']")).click();

        }

        List<WebElement> alldate=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a"));

        for(WebElement date:alldate)
        {
            String dt=date.getText();

            if(expected_date.equals(dt))
            {
                date.click();

            }
        }
    }
}
