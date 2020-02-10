package vyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilitiesSelf.SeleniumUtils;
import utilitiesSelf.vyTrackUtils;

import java.util.concurrent.TimeUnit;

public class CreateCalendarBtnTest {
    public static void main(String[] args) {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");

        vyTrackUtils.login(driver,"storemanager85", "UserUser123");

        vyTrackUtils.navigateToModule(driver,"Activities","Calendar Events");

        String eventCalendarBtn = "a[title='Create Calendar event']";
        WebElement createCalendarButton = driver.findElement(By.cssSelector(eventCalendarBtn));
        SeleniumUtils.pause(5);

        if(createCalendarButton.isDisplayed()){
            System.out.println("Create Calendar button isDisplayed is PASSED!");
        }else{
            System.err.println("Create Calendar button isDisplayed is FAILED!!!");
        }
    }
}
