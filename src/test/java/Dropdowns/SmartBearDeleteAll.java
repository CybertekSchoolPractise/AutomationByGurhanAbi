package Dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearDeleteAll {

    WebDriver driver;

    //        TC #6: Smartbear delete all1.Open browser
//        2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx

      @BeforeMethod
      public void setUp(){
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
      }

    @Test
            public void deleteAll(){
          SmartBearSoftware.loginToSmartBear(driver);
        WebElement checkAllButton = driver.findElement(By.id("ctl00_MainContent_btnCheckAll"));
        checkAllButton.click();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//table[@id=‘ctl00_MainContent_orderGrid’]/tbody/tr/td[1]"));
    for (WebElement checkbox: checkBoxes){
        Assert.assertTrue(checkbox.isSelected());
    }


//        // 3.Enter username: “Tester”
//        // 4.Enter password: “test”
//        // 5.Click to Login button


//        // 6.Click to CheckAll

//        // 7.Run a loop to make sure all the checkboxes are checked
//        // 8.Click “Delete Selected”
//        // 9.Assert “List of orders is empty. In order to add new order usethis link.“ text is displayed.
    }
}
