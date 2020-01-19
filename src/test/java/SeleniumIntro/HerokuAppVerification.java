package SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuAppVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      //  driver.manage().window().fullscreen();

       // HerokuApp URL verification

        // 1.Open Chrome browser
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        // 2. Go to https://the-internet.herokuapp.com/forgot_password
        // 3. Enter any email into input box
        driver.findElement(By.id("email")).sendKeys("jurabekjk2005@mail.ru");
        driver.findElement(By.id("form_submit")).click();
        // 4. Click on Retrieve password
        // 5. Verify URL contains:
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "email_sent";
        if(actualURL.contains(expectedURL)){
            System.out.println("Url verification PASSED!");
        }else{
            System.out.println("Url verification FAILED!");
        }
        // Expected: “email_sent”

        // 6. verify that text box displayed has the text as expected
        // expected: "Your e-mail's been sent!"
        String actualTextBoxValue = driver.findElement(By.id("content")).getText();
        String expectedTextBoxValue = "Your e-mail's been sent!";
        if(actualTextBoxValue.equals(expectedTextBoxValue)){
            System.out.println("Text box verification PASSED!");
        }else{
            System.out.println("Text box verification FAILED!");
        }


    }
}
