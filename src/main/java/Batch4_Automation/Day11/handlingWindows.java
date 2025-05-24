package Batch4_Automation.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class handlingWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
        Thread.sleep(5000);
        Set<String> windowid=driver.getWindowHandles();
        System.out.println(windowid);

        for(String windid:windowid)
        {
            String title=driver.switchTo().window(windid).getTitle();
            System.out.println(title);

            Thread.sleep(5000);
            if(title.equals("Human Resources Management Software | OrangeHRM"))
            {
                driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[1]/a/button")).click();
                Thread.sleep(5000);
                driver.close();
            }
        }

    }
}
