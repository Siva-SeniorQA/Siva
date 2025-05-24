package Batch4_Automation.Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       //WebElement source_rome= driver.findElement(By.xpath("//*[@id=\"box6\"]"));
       WebElement target_italy=driver.findElement(By.xpath("//*[@id=\"box106\"]"));

       WebElement source_washing=driver.findElement(By.xpath("//*[@id=\"box3\"]"));
        //WebElement target_italy=driver.findElement(By.xpath("//*[@id=\"box106\"]"));

        Actions act=new Actions(driver);
        Action drop=act.dragAndDrop(source_washing,target_italy).build();
        drop.perform();



    }
}
