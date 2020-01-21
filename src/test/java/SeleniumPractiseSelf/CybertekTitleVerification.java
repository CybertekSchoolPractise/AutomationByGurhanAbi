package SeleniumPractiseSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //v1.Cybertek	verifications
        driver.get("https://www.cybertekschool.com");
        // 2. Open	Chrome	browser

       // 3. Go	to https://www.cybertekschool.com
        //  Verify	URL  contains
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "cybertekschool";
        // Expected:	cybertekschool
        if(actualURL.contains(expectedURL)){
            System.out.println("Cybertek school URL verification PASSED!");
        }else{
            System.out.println("Cybertek school URL verifiaction FAILED!");
        }
        // 4. Verify	title:
        //Expected:	Cybertek
        String actualTitle = driver.getTitle();
        String expectedTitle = "Cybertek";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Cybertek title verification PASSED!");
        }else{
            System.out.println("Cybertek title verification FAILED!");
        }

    }
}
