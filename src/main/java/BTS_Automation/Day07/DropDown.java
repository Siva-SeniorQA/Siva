package BTS_Automation.Day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"country\"]"));
        Select select=new Select(dropdown);


        //select.selectByIndex(1);
        //select.selectByVisibleText("Australia");
        //select.selectByContainsVisibleText("Aus");


        List<WebElement> alloption=select.getOptions();
        // for (int i=0;i<alloption.size();i++)
        for(WebElement option:alloption) {

            String county = option.getText();
            System.out.println(county);

            if (county.equals("France")) {
                option.click();
            }
            /*String coutry=alloption.get(i).getText();
            System.out.println(coutry);

            if(coutry.equals("India"))
            {
                alloption.get(i).click();
            }

             */
        }
    }
}
