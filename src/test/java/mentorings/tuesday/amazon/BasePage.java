package mentorings.tuesday.amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

        WebDriver driver;

        @Before
        public void setUp(){
            System.out.println("Instatiating the driver");
            WebDriverManager.chromedriver().setup();
            driver  = new ChromeDriver();
        }
        @After
        public void tearDown(){
            System.out.println("Quitting the browser");
          //  driver.quit();
        }
}
