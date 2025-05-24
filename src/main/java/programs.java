import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.security.Key;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class programs {
    public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(5000);
driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("siva");


    }
}
