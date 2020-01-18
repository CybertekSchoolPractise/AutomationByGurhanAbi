package SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekSchoolVerification {
    public static void main(String[] args) throws InterruptedException {
        // 1- open the browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();
        // 2- go to cybertek website
        driver.get("https://www.cybertekschool.com");
        Thread.sleep(6000);

        // 3- verify title: Expected: Cybertek
        String expectedTitle = "Cybertek";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Cybertek title verification PASSED!");
        }else{
            System.out.println("Cybertek title verification FAILED!");
        }

        // 4- Verify url: Expected contains: cybertekschool

       String expectedURL = "cybertekschool";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("Cybertek URL verifiaction PASSED!");
        }else{

            System.out.println("Cybertek URL verification FAILED!");
        }
    }
}
