package SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLoginAuthentication {
    public static void main(String[] args)  throws InterruptedException{
        // Basic	login	authentication
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
         // 1- Open	a	chrome	browser
         // 2- Go	to:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
       Thread.sleep(1000);
        // 3- Verify	title	equals:	Expected:	Web	Orders	Login
        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders Login";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }

        // 4- Enter	username:	Tester
         driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        Thread.sleep(2000);

        // 5- Enter	password:	test
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        Thread.sleep(2000);

        // 6- Click	“Sign	In”	button
        driver.findElement(By.name("ctl00$MainContent$login_button" )).click();

        Thread.sleep(2000);


        // 7- Verify	title	equals:
        String actualLoginTitle = driver.getTitle();
        String expectedLoginTitle = "Web Orders";
        if(actualLoginTitle.equals(expectedLoginTitle)){
            System.out.println("Login functionality verification PASSED!");
        }else{
            System.out.println("Login functionality verification FAILED!");
        }
        // Expected:	Web	Orders
    }
}
