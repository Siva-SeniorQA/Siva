package BTS_Automation.Day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseActions {

    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.nopcommerce.com/");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////MouseOver
//        WebElement computer=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
//        WebElement desktop=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a"));
//
//        Actions act=new Actions(driver);
//        act.moveToElement(computer).moveToElement(desktop).click().build().perform();
//RightClick
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        WebElement right=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
//
//        WebElement quite=driver.findElement(By.xpath("/html/body/ul/li[7]/span"));
//
//        Actions act1=new Actions(driver);
//        act1.contextClick(right).click(quite).perform();
//        driver.switchTo().alert().accept();

//        //Drog and Drop
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        WebElement rome=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
//        WebElement denmark=driver.findElement(By.xpath("//*[@id=\"box104\"]"));
//        WebElement captital=driver.findElement(By.xpath("//*[@id=\"capitals\"]"));
//
//        Actions act2=new Actions(driver);
//        act2.dragAndDrop(rome,denmark).perform();
//        Thread.sleep(5000);
//        act2.dragAndDrop(denmark,captital).perform();
//
         //DoubleClick
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement Double=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));

        Actions act4=new Actions(driver);

        act4.doubleClick(Double).perform();

    }
}
