package vyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilitiesSelf.SeleniumUtils;

import java.util.concurrent.TimeUnit;

public class LogCallTest {
    public static void main(String[] args) {
        WebDriver driver;
        String userNameLocator = "prependedInput";
        String passwordLocator = "prependedInput2";
        String loginButton = "_submit";
        String TabLocatorActivities = "//span[contains(text(), 'Activities') and @class ='title title-level-1']";
        String ModuleLocatorCallsFromActivitiesXpath = "//span[.= 'Calls' and @class='title title-level-2']";
        String logCallButtonDisplayed = "//a[contains(text(), 'Log call')]";
        // for css = a[title= 'Log call']


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.id(userNameLocator)).sendKeys("storemanager85");
        driver.findElement(By.id(passwordLocator)).sendKeys("UserUser123" + Keys.ENTER);
        SeleniumUtils.pause(2);

      driver.findElement(By.xpath(TabLocatorActivities)).click();
      //SeleniumUtils.pause(2);
      driver.findElement(By.xpath(ModuleLocatorCallsFromActivitiesXpath)).click();
      SeleniumUtils.pause(3);
        if(driver.findElement(By.xpath(logCallButtonDisplayed)).isDisplayed()){
            System.out.println("Log Call button is Displayed PASSED!");
        }else{
            System.out.println("Log Call button is Displayed FAILED!");
        }
    }
}
