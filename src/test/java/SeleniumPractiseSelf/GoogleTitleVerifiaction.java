package SeleniumPractiseSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleVerifiaction {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
      //  driver.manage().window().fullscreen();

        // 1.Google	Title	Verification
        // 2.Open	Chrome	browser
        //  Go	to https://www.google.com
        driver.get("https://www.google.com");

        // 3. Verify	title:
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Google title verification PASSED!");
        }else{
            System.out.println("Google title verification FAILED!");
        }
        // Expected:	Google
    }
}
