package SeleniumPractiseSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigator {
    public static void main(String[] args)  throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // 	Back	and	forth	navigation
        // 1-Open	a	chrome	browser

        // 2-Go	to:	https://google.com
        driver.get("https://www.google.com");
        // 3-Click	to	Gmail	from	top	right.
        driver.findElement(By.className("gb_g")).click();
Thread.sleep(2000);
        // 4 Verify	title	contains:
                // Expected:	Gmail

        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Gmail title verification PASSED!");
        }else {
            System.out.println("Gmail title verification FAILED!");
        }

        // 5 Go	back	to	Google	by	using
        // the	.back();
        driver.navigate().back();
Thread.sleep(2000);
        // 6 Verify	title	contains:
        // Expected:	Google
        String actualGoogleTitle = driver.getTitle();
        String expectedGoogleTitle = "Google";
        if(actualGoogleTitle.contains(expectedGoogleTitle)){
            System.out.println("Google back title verification PASSED!");
        }else{
            System.out.println("Google back title verification FAILED!");
        }

        // 7 Go	back	to	Gmail	using	the	Forward	button
        driver.navigate().forward();
Thread.sleep(2000);
        // 8 Verify	title	contains:
        // Expected:	Gmail
        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Gmail";
        if(actualTitle2.contains(expectedTitle2)){
            System.out.println("Gmail title verification PASSED! AGAIN!!!");
        }else {
            System.out.println("Gmail title verification FAILED! AGAIN!!!");
        }
    }
}
