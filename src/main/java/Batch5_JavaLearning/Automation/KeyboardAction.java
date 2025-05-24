package Batch5_JavaLearning.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class KeyboardAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Actions act=new Actions(driver);
        driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("Automation Testing");

        //Ctr+A

        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //Ctr+C
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //TAB
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        //Ctr+V
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

        //SHIFT + ALT + V

        act.keyDown(Keys.SHIFT).keyDown(Keys.ALT).sendKeys("V").keyUp(Keys.ALT).keyUp(Keys.SHIFT);
    }
}
