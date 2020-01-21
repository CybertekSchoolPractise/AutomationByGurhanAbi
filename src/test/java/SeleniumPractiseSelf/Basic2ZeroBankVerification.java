package SeleniumPractiseSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic2ZeroBankVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().fullscreen();

        // Basic authentication Zero Bank
        // 1.Open Chrome browser
        // 2.Go to
        // http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3.Enter username: username
        driver.findElement(By.id("user_login")).sendKeys("username");

        // 4.Enter password: password
        driver.findElement(By.id("user_password")).sendKeys("password");

        // 5.Click sign in button
        driver.findElement(By.name("submit")).submit();

        // 6.Verify username is displayed on the page
        if(driver.findElement(By.className("icon-user")).isDisplayed()){
            System.out.println("Username diplayed verification PASSED!");
        }else{
            System.out.println("Username dipalyed verification FAILED!");
        }

        // 7.Verify the title Zero – Account Summary
        String actualAccountSummary = driver.getTitle();
            String expectedAccountSummary = "Zero - Account Summary";
            if(actualAccountSummary.equals(expectedAccountSummary)){
                System.out.println("Land page text verification PASSED!");
            }else{
                System.out.println("Land Page text verification FAILED!");
            }

        // 8.Verify the link Account Summary’s href value contains: “account-summary”
        String actualUrlText = driver.findElement(By.linkText("Account Summary")).getAttribute("href");
            String expectedUrlText = "account-summary";
            if(actualUrlText.contains(expectedUrlText)){
                System.out.println("Link verification PASSED!");
            }else{
                System.out.println("Link verification FAILED!");
            }
        // Print out results in validation formats

    }
}
