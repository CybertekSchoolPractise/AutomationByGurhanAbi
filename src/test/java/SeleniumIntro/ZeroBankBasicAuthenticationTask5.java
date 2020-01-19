package SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankBasicAuthenticationTask5 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();


        // Basic authentication Zero Bank
        // 1. Open Chrome browser
        // 2. Go to
        // http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3. Enter username: username
        driver.findElement(By.id("user_login")).sendKeys("username");
        // 4. Enter password: password
        driver.findElement(By.id("user_password")).sendKeys("password");
        // 5. Click sign in button
        driver.findElement(By.name("submit")).click();
        // 6. Verify username is displayed on the page
        if(driver.findElement(By.className("icon-user")).isDisplayed()){
            System.out.println("Username verification is PASSED!");
        }else{
            System.out.println("Username verification FAILED!");
        }
        // 7. Verify the title Zero – Account Summary
        String actualTitle = driver.getTitle();
        String expectedTitle = "Zero - Account Summary";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title zero is PASSED!");
        }else{
            System.out.println("Title zero is FAILED!");
        }
        // 8. Verify the link Account Summary’s href value contains: “account-summary”
        String AccountSummaryLink =  driver.findElement(By.linkText("Account Summary")).getAttribute("href");
        String expectecLink = "account-summary";
        if(AccountSummaryLink.contains(expectecLink)){
            System.out.println("Account Summary link verification PASSED!");
        }else{
            System.out.println("Account Summary link verification FAILED!");
        }
        // Print out results in validation formats
    }
}
