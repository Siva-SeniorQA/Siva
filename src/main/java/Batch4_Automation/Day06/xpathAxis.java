package Batch4_Automation.Day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class xpathAxis {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/gropa");
        driver.manage().window().maximize();
    /*    //self node
        String self=driver.findElement(By.xpath("//a[contains(text(),\"Benares Hotels\")]//self::a")).getText();
        System.out.println(self);
        //parent node
        String parent=driver.findElement(By.xpath("//a[contains(text(),\"Benares Hotels\")]//parent::td")).getText();
        System.out.println(parent);
        //ancestor
        String ancestor=driver.findElement(By.xpath("//a[contains(text(),\"Benares Hotels\")]//ancestor::tr")).getText();
        System.out.println(ancestor);
        */
        //Child
        System.out.println(driver.findElements(By.xpath("//a[contains(text(),\"DIC India\")]//ancestor::tr//child::td")).size());

        //Descendant

        driver.findElement(By.xpath("//a[contains(text(),\"DIC India\")]//ancestor::tr/descendant::td[3]"));

        //following
        driver.findElement(By.xpath("//a[contains(text(),\"Shree Marutinandan\")]//following::tr[1]/td[3]"));
        //prceding
        driver.findElement(By.xpath("//a[contains(text(),\"Shree Marutinandan\")]/preceding::tr[2]/td[3]"));

        //following-sibling
        driver.findElement(By.xpath("//a[contains(text(),\"Shree Marutinandan\")]//following::tr[1]/td[3]"));

        List<WebElement> company_name=driver.findElements(By.xpath("//a[contains(text(),\"Ami Organics\")]//ancestor::tr//following::tr"));
        System.out.println(company_name.size());
        for(int i=0;i<company_name.size();i++)
        {
            System.out.println(company_name.get(i).getText());
        }


    }
}
