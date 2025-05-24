package BTS_Automation.Day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Windowhandle {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();

        Set<String> windowid=driver.getWindowHandles();
        System.out.println(windowid);

        for(String win:windowid)
        {
           String title= driver.switchTo().window(win).getTitle();
            System.out.println(title);
            if(title.equals("Human Resources Management Software | OrangeHRM"))
            {
                Thread.sleep(5000);
                driver.close();
            }
        }



    }
}
