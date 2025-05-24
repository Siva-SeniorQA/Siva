package Batch5_JavaLearning.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class windowsHandling {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       WebElement linkedIn=driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']//*[name()='g' and contains(@fill,'currentCol')]//*[name()='path' and contains(@class,'st0')]"));
        WebElement facebook=driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']//*[name()='g' and contains(@fill,'currentCol')]//*[name()='path' and contains(@class,'st0')]"));
       WebElement twitter= driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']//*[name()='svg']//*[name()='g' and contains(@fill,'currentCol')]//*[name()='path' and contains(@class,'st0')]"));
       WebElement youtube= driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']//*[name()='svg']"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
      wait.until(ExpectedConditions.elementToBeClickable(twitter)).click();
        wait.until(ExpectedConditions.elementToBeClickable(youtube)).click();

        Set<String> allwindows=driver.getWindowHandles();

        System.out.println(allwindows);

        for(String windows:allwindows)
        {
            String title=driver.switchTo().window(windows).getTitle();
            System.out.println(title);//

            if(title.equals("OrangeHRM Inc - YouTube"))
            {
                driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/div[1]/form/input")).sendKeys("Automation Testing");

            }


        }
Thread.sleep(5000);
driver.quit();
    }
}
