import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class examples {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement click=driver.findElement(By.xpath("//*[@id=\"male\"]"));
        WebElement text=driver.findElement(By.xpath("//*[@id=\"name\"]"));

        WebElement button=driver.findElement(By.xpath("//*[@id=\"btn3\"]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",click);
        js.executeScript("arguments[0].setAttribute('value','Siva')",text);
        js.executeScript("window.scrollBy(0,3000)"," ");
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,-2000)"," ");
        Thread.sleep(5000);
        js.executeScript("arguments[0].scrollIntoView();",button);
        Thread.sleep(5000);
        js.executeScript("document.body.style.zoom='50%'");
        Thread.sleep(5000);
        js.executeScript("document.body.style.zoom='80%'");
    }
}
