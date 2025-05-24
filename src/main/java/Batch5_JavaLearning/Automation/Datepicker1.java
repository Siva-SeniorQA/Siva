package Batch5_JavaLearning.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Datepicker1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Datepicker.html");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();

        String expected_date="26";
        String expected_month="June";
        String expected_year="2030";


        WebElement year=driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/select[2]"));
        WebElement month= driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/select[1]"));



        Select select_year=new Select(year);
        select_year.selectByValue("4/2030");

        Select select_month=new Select(month);
        select_month.selectByIndex(5);







    }

}
