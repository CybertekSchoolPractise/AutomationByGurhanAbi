package SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        // name of Task: 	#3:	Back	and	forth	navigation
        //       1- Open	a	chrome	browser
        WebDriver driver = new ChromeDriver();
driver.manage().window().fullscreen();
        //     2- Go	to:	https://google.com
        driver.get("https://www.google.com");
        Thread.sleep(3000);

        // 3- Click	to	Gmail	from	top	right.
driver.findElement(By.linkText("Gmail")).click();
Thread.sleep(3000);
        // 4- Verify	title	contains:
        // Expected:	Gmail
        String actualResult = driver.getTitle();
        String Expectedresult = "Gmail";
        if(actualResult.contains(Expectedresult)){
            System.out.println("Gmail verification PASSED!");
        }else{
            System.out.println("Gmail verifavation FAILED!");
        }
        // 5- Go	back	to	Google	by	using	the	.back();
        driver.navigate().back();
        Thread.sleep(3000);
        // 6- Verify	title	contains:
        // Expected:	Google
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Google back verification Passed!");
        }else{
            System.out.println("Google back verification Failed!");
        }
        // 7- Go	back	to	Gmail	using	the	Forward	button
        driver.navigate().forward();
        // 8-Verify	title	contains:
        // Expected:	Gmail
        Thread.sleep(3000);
        String actualResult2 = driver.getTitle();
        String Expectedresult2 = "Gmail";
        if(actualResult2.contains(Expectedresult2)){
            System.out.println("Gmail verification PASSED!");
        }else{
            System.out.println("Gmail verifavation FAILED!");
        }

    }
}
