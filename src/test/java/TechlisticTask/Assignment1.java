package TechlisticTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Assignment1 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        1. Open this link - https://www.techlistic.com/
             driver.get("https://www.techlistic.com/");

//        2. Launch Firefox browser. (You can choose browser of your choice).

//        3. Maximize or set size of browser window.
            driver.manage().window().maximize();

//        4. Get Title of page and validate it with expected value.
        String actualTitle = driver.getTitle();
        String expectedTitle = "Techlistic";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Techlistic title verification PASSED!");
        }else{
            System.out.println("Techlistic title verification FAILED!");
        }

//        5. Get URL of current page and validate it with expected value.
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "teclistic.com";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!");
        }

//        6. Get Page source of web page.
      String WebPage = driver.getPageSource();

//        7. And Validate that page title is present in page source.
        if(WebPage.contains(expectedTitle)){
            System.out.println("WEb page verification PASSED!");
        }else{
            System.out.println("Web page verification FAILED!");
        }

//        8. Close browser.
driver.close();

    }
}
