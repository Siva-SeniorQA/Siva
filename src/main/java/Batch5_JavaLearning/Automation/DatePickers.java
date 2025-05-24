package Batch5_JavaLearning.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DatePickers {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);

        driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
        String expect_date = "23";
        String expected_month = "May";
        String expected_year = "2027";
        while(true) {


            //int ex_year=Integer.parseInt(expected_year);

            String actual_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            String actual_month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
            //int ac_year=Integer.parseInt(actual_year);
            if (expected_year.equals(actual_year) && expected_month.equals(actual_month)) {
                break;
            }

            driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();

            //driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();

        }
            List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a"));

            for(WebElement date:alldates)
            {
                String act_date=date.getText();
                if(expect_date.equals(act_date))
                {
                    date.click();
                }
            }
        }


    }

