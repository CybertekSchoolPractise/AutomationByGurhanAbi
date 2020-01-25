package CssLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchCssPrcatise {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        TC#1 Search Amazon
//        1. Open browser
//        2. Go to https://amazon.com
      //  driver.manage().window().fullscreen();
        driver.get("https://amazon.com");

//        3. Enter any search term
      WebElement amazonSearchBox =  driver.findElement(By.cssSelector("input[tabIndex ='19']"));
      amazonSearchBox.sendKeys("kuran book");
       /// 4. Click search button
        driver.findElement(By.cssSelector("input[type = 'submit']")).submit();
        //5. Verify title contains the search term
        String actualTitle  = driver.getTitle();
        String expectedtitl = "kuran book";
        if(actualTitle.contains(expectedtitl)){
            System.out.println("Amazon landing page title verification PASSED!");
        }else{
            System.out.println("Amazon landing page title verification FAILED!");
        }
        //driver.close();

//        USE CSS SELECTOR TO LOCATE WEBELEMENTS
    }
}
