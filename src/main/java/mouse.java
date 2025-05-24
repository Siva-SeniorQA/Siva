import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class mouse {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        TakesScreenshot ts=(TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        File target=new File("Screenshot//siva.jpg");
        source.renameTo(target);
       WebElement partial= driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[4]"));
       File source1=partial.getScreenshotAs(OutputType.FILE);
        File target1=new File("Screenshot//siva1.jpg");
        source1.renameTo(target1);

        WebElement element=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
        File source2=element.getScreenshotAs(OutputType.FILE);
        File target2=new File("Screenshot//logo1.jpg");
        source2.renameTo(target2);






    }
}
