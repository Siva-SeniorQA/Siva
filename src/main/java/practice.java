import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class practice {

    public static void main(String[] args) throws InterruptedException {

        int i,number=5;
        for(i=2;i<=number;i++) {
            if (number % i == 0) {
                break;
            }
        }
            if(i==number)
            {
                System.out.println("prime number");
            }
            else
            {
                System.out.println("not prime number");
            }
        }
    }

