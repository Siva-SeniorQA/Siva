package Vignesh_Automation.Day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseEvents {

    public static void main(String[] args) {
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testautomationpractice.blogspot.com/");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        WebElement button=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
//
//        Actions act=new Actions(driver);
//        act.doubleClick(button).perform();

//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.nopcommerce.com/");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//       WebElement computer= driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
//       WebElement software=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[3]/a"));
//
//       Actions act=new Actions(driver);
//       act.moveToElement(computer).moveToElement(software).click().perform();

//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        WebElement right=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
//        WebElement copy=driver.findElement(By.xpath("/html/body/ul/li[3]/span"));
//
//        Actions act=new Actions(driver);
//        act.contextClick(right).click(copy).perform();
//
//        driver.switchTo().alert().accept();


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement source =driver.findElement(By.xpath("//*[@id=\"box6\"]"));
        WebElement target=driver.findElement(By.xpath("//*[@id=\"box106\"]"));

        Actions act=new Actions(driver);
        act.dragAndDrop(source,target).perform();



    }
}
