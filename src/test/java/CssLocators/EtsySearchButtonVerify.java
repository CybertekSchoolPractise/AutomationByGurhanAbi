package CssLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsySearchButtonVerify {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        TC#2 Search ETSY

//        1. Open browser
//        2. Go to https://etsy.com
        driver.get("https://etsy.com");
//        3. Enter any search term
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchBox.sendKeys("wooden-spoon");
//        4. Click search button
        WebElement searchButton  = driver.findElement(By.xpath("//button[@aria-label ='Search']"));
        searchButton.click();
//        5. Verify title contains the search term
        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden-spoon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }
//        USE XPATH TO LOCATORS TO LOCATE WEBELEMENTS
    }
}
