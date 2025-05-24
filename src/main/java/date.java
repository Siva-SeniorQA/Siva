import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class date {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        //driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("02/29/2025");
        driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();

        String Expyear = "2029";
        String Expdate = "24";
        String Expmonth = "February";
        while (true) {
            String actyear = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
            String actmonth = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();

            if (Expmonth.equals(actmonth) && Expyear.equals(actyear)) {
                break;
            }
            driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();

        }

       List<WebElement> alldates= driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a"));

        for(WebElement date:alldates)
        {
            String dt=date.getText();

            if(Expdate.equals(dt))
            {
                date.click();

            }
        }
    }
}
