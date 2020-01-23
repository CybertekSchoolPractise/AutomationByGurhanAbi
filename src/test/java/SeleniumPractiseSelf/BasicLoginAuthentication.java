package SeleniumPractiseSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLoginAuthentication {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        //  Basic	login	authentication
        // 1 Open	a	chrome	browser
        // 2 Go	to:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // 3 Verify	title equals:
        // Expected:	Web	Orders	Login
        String actualLandPageTitle = driver.getTitle();
        String expectedLandPageTitle = "Web Orders Login";
        if(actualLandPageTitle.equals(expectedLandPageTitle)){
            System.out.println("Land page title verification PASSED!");
        }else{
            System.out.println("Land page title verification FAILED!");
        }

        // 4 Enter	username:	Tester
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
Thread.sleep(2000);
       // 5 Enter	password:	test
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
Thread.sleep(2000);
        // 6 Click “Sign	In”	button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
Thread.sleep(2000);
driver.navigate().back();
       // 7 Verify	title  equals:
        //Expected: Web	Orders
        String actualtitleOfLamdPage = driver.getTitle();
        String expectedTitleOfLandPage = "Web Orders";
        if (actualtitleOfLamdPage.equals(expectedTitleOfLandPage)){
            System.out.println("Land page title verification PASSED! Again!");
        }else{
            System.out.println("Land page title verification FAILED! Again!");
        }
        driver.close();

    }
}
