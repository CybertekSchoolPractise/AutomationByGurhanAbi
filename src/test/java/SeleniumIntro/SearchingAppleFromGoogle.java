package SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchingAppleFromGoogle {
    public static void main(String[] args) throws InterruptedException {
       // 	#4:	Google	search
       // 1- Open	a	chrome	browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver  =new ChromeDriver();

        //  2- Go	to:	https://google.com
        driver.get("https://www.google.com");
        driver.manage().window().fullscreen();

        // 3- Write	“apple”	in	search	box
      //  driver.findElement(By.name("q"));
        //driver.findElement(By.name("q")).sendKeys("apple");
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);
        Thread.sleep(3000);

        // 4- Click	google	search	button
       // driver.findElement(By.name("btnK")).click();

        // 5- Verify	title:	Expected:
        String actualTitle = driver.getTitle();
        String expectedTitle = "apple";
        if(actualTitle.startsWith("apple")){
            System.out.println("Apple title verification PASSED!");
        }else{
            System.out.println("Apple title verification FAILED!");
        }
        driver.findElement(By.linkText("Maps")).click();


        // Title	should	start	with “apple”	word
    }
}
