package SeleniumPractiseSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuAppVerification {
    public static void main(String[] args)  throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      // driver.manage().window().fullscreen();

        // HerokuApp URL verification
        // 1. Open Chrome browser
        // 2.Go to https://the-internet.herokuapp.com/forgot_password
        driver.get("https://the-internet.herokuapp.com/forgot_password");

        // 3.Enter any email into input box
        driver.findElement(By.id("email")).sendKeys("jurabekjk2005@mail.ru");
Thread.sleep(2000);

        // 4.Click on Retrieve password
        driver.findElement(By.id("form_submit")).click();
Thread.sleep(3000);
        // 5.Verify URL contains:
        // Expected: “email_sent”
        String actualLandPageURL = driver.getCurrentUrl();
        String expedtedLandPageURL = "email_sent";
        if(actualLandPageURL.contains(expedtedLandPageURL)){
            System.out.println("Land Page Url verification PASSED!");
        }else{
            System.out.println("Land page Url verification FAILED!");
        }
        Thread.sleep(3000);
        driver.close();
    }
}