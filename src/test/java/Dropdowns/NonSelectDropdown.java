package Dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NonSelectDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // TC #3: Selecting value from non-select dropdown
        //    1.Open Chrome browser
        //    2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 3.Click to non-select dropdown
        Thread.sleep(1000);
        WebElement dropdownButton = driver.findElement(By.id("dropdownMenuLink"));
        dropdownButton.click();

        // 4.Select Facebook from dropdown
        WebElement facebookOption = driver.findElement(By.xpath("(//a[@class='dropdown-item'])[4]"));
        //        //a[.='Facebook']
        facebookOption.click();

        // 5.Verify title is “Facebook - Log In or Sign Up”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Facebook page verification PASSED!");
        }else{
            System.out.println("Facebook page verification FAILED!");
        }
    }
}
