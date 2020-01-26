package TechlisticTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Assignment2 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        1. Open this link  https://www.techlistic.com/
            driver.get("https://www.techlistic.com/");

//        2. Launch Firefox browser. (You can choose browser of your choice).
//
//        3. Maximize or set size of browser window.
            driver.manage().window().fullscreen();

//        4. Click on 'Java Tutorial' link and validate page title.

//        5. Navigate back to Home Page.
//
//        6. Click on 'Selenium Tutorial' link and validate page title.
//
//        7. Navigate back to Home Page.
//
//        8. Click on 'Selenium Blogs' link and validate page title.
//
//        9. Navigate back to Home Page.
//
//        10. Click on 'TestNG Blogs' link and validate page title.
//
//        11. Close the browser.
        //  driver.close();
    }
}
