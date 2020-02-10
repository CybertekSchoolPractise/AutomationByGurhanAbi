package reviewOfUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class Dog {
    public static void main(String[] args) throws Exception {
        WebDriver driver = Driver.getDriver();
        driver.get("http://google.com");
        GoogleHomePage gh = new GoogleHomePage();
        gh.searchBox.sendKeys("apple" + Keys.ENTER);
    }
}
