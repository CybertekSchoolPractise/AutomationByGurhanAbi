package SeleniumPractiseSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerification {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().fullscreen();

        // Zero Bank header verification
        // 1.Open Chrome browser
        // 2.Go to
        // http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3.Get attribute value of href from the “forgot your password” link
        String actualAttribute = driver.findElement(By.linkText("Forgot your password ?")).getAttribute("href");

        // 4.Verify attribute value contains
        String expectedAttribute = "/forgot-password.html";

        // Expected: “/forgot-password.html”
        if(actualAttribute.contains(expectedAttribute)){
            System.out.println("Link verification PASSED!");
        }else{
            System.out.println("Link verification FAILED!");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
