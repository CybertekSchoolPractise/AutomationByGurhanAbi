package SeleniumPractiseSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SmartBearOrderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        TC#3: Smartbear software order verification
//        1.Open browser and login to Smartbear software
        SmartBearMain.loginToSmartBear(driver);

//    2.Click on View all orders
        WebElement viewAllOrderButton = driver.findElement(By.linkText("View all orders"));
        viewAllOrderButton.click();

//    3.Verify Susan McLaren has order on date “01/05/2010”
        String actaulDate = driver.findElement(By.xpath("(//table//tbody//tr//td)[59]")).getText();
        String expectedDate = "01/05/2010";
        if(actaulDate.equals(expectedDate)){
            System.out.println("Date verification PASSED!");
        }else{
            System.out.println("Date verification FAILED!");
        }
    }
}
