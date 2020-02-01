package vyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogCallTest {
    public static void main(String[] args) {
        WebDriver driver;
        String usernameLocatorID = "prependedInput";
        String passwordLocatorID  = "prependedInput2";
        String tableLocatorXpath = "//span[contains]";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");

        // enter the username now
            driver.findElement(By.id(usernameLocatorID)).sendKeys("storemanager85");
            driver.findElement(By.id(passwordLocatorID)).sendKeys("UserUser123" + Keys.ENTER);

    }
}
