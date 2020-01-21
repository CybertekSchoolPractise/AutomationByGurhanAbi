package SeleniumPractiseSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchingAppleFromGoogle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        //Google	search
        // 1- Open	a	chrome	browser
        // 2- Go	to:	https://google.com
        driver.get("https://google.com");

        // 3- Write	“apple”	in	search	box
        driver.findElement(By.name("q")).sendKeys("apple");

        // 4- Click	google	search	button
        driver.findElement(By.className("gNO89b")).submit();

        // 5- Verify	title:	Expected:
        // Title	should	start	with	“apple”	word
        String actualTitle = driver.getTitle();
        String expectedTitle = "apple";
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Land page verification PASSED!");
        }else{
            System.out.println("Land page verification FAILED!");
        }

    }
}
