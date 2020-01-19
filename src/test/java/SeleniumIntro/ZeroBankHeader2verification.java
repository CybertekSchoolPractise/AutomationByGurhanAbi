package SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeader2verification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

       //  Zero Bank header verification
        // 1. Open Chrome browser
        // 2. Go to
        // http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3. Get attribute value of href from the “forgot your password” link

       //  4. Verify attribute value contains
        String actualURL = driver.findElement(By.partialLinkText("Forgot")).getAttribute("href");
        String expectedURL = "/forgot-password.html";
        if(actualURL.contains(expectedURL)){
            System.out.println("Link verifiaction PASSED!");
        }else{
            System.out.println("Link verification FAILED!");
        }
       // Expected: “/forgot-password.html”
    }
}
