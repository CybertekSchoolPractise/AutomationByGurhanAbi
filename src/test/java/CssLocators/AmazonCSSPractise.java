package CssLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCSSPractise {
    public static void main(String[] args) {


       // Search Amazon
       // 1. Open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //   driver.manage().window().maximize();

       // 2. Go to https://amazon.com
        driver.get("https://amazon.com");

       // 3. Enter any search term
        // locate the search box using CSS selector
       WebElement amazonSearchBox =  driver.findElement(By.cssSelector("input[name='field-keywords']"));
       amazonSearchBox.sendKeys("wooden - spoon");

       // 4. Click search button
        WebElement amazonSearchButton = driver.findElement(By.cssSelector("input[tabindex='20']"));
        amazonSearchButton.click();

       // 5. Verify title contains the search term
        String actualTitle = driver.getTitle();
        String expectedTitle = "wooden - spoon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }
       // USE CSS SELECTOR TO LOCATE WEBELEMENTS

    }
}
