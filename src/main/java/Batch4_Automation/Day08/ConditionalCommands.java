package Batch4_Automation.Day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

        //isDisplayed
        System.out.println(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[1]/h1")).isDisplayed());

        //Enabled:-

        System.out.println(driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).isSelected());
        driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).isSelected());

        //IsEnabled()

        driver.get("https://accounts.lambdatest.com/login");
        driver.manage().window().maximize();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isEnabled());
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isEnabled());






    }
}
