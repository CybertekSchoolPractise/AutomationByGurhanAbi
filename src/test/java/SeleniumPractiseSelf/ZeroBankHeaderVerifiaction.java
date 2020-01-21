package SeleniumPractiseSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerifiaction {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().fullscreen();

        // Zero Bank header verification
        // 1.Open Chrome browser
        // 2.Go to
        // http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3.Verify header text
        // Expected: “Log in to ZeroBank”
        String actualHeaderText = driver.findElement(By.className("page-header")).getText();
        String expectedText = "Log in to ZeroBank";
        if(actualHeaderText.equals(expectedText)){
            System.out.println("Header text verification PASSED!");
        }else{
            System.out.println("Header text verification FAILED!");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
