package BTS_Automation.Day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DatePicker {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        //driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("02/29/2025");
        driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();

        String expected_year = "2024";
        String expected_date = "24";
        String expected_month = "December";
        while (true) {
            String actyear = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
            String actmonth = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();

            if (expected_month.equals(actmonth) && expected_year.equals(actyear)) {
                break;
            }
            //driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
            driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();

        }

        List<WebElement> days = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td//a"));
        for (WebElement alldates : days) {
            String alldate = alldates.getText();

            if (alldate.equals(expected_date)) {
                alldates.click();
                break;
            }
        }
    }


    }





