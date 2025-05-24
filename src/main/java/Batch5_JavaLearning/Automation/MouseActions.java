package Batch5_JavaLearning.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseActions {

    public static void main(String[] args) {

//Right Click
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//        WebElement right=driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
//        WebElement paste=driver.findElement(By.xpath("/html/body/ul/li[4]/span"));
//        Actions act=new Actions(driver);
//        act.contextClick(right).click(paste).perform();
//        driver.switchTo().alert().accept();
//
         //Double Click

//        WebDriver driver = new ChromeDriver();
//        driver.get("https://testautomationpractice.blogspot.com/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//       WebElement button= driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
//       WebElement input1=driver.findElement(By.xpath("//*[@id=\"field1\"]"));
//       input1.clear();
//       input1.sendKeys("Siva");
//
//        Actions act1=new Actions(driver);
//        act1.doubleClick(button).perform();

//MouseHover
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.nopcommerce.com/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//        WebElement desktop=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
//        WebElement soft=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[3]/a"));
//
//        Actions act1=new Actions(driver);
//
//        act1.moveToElement(desktop).moveToElement(soft).click().perform();



        WebDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement rome=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
        WebElement itly=driver.findElement(By.xpath("//*[@id=\"box106\"]"));

        Actions act4=new Actions(driver);
        act4.dragAndDrop(rome,itly).perform();
    }
}

