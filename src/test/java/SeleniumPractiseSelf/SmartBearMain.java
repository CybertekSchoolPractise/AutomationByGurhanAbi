package SeleniumPractiseSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearMain {
   // WebDriver driver;

    public static void main(String[] args) {

//        TC	#1:	Smartbear	software	link	verification
//        1.Open	browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
loginToSmartBear(driver);
//
////        2.Go	to	website:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//
//        // 3.Enter username: “Tester”
//        WebElement userNameBox = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_username']"));
//        userNameBox.sendKeys("Tester");
//        // 4.Enter password: “test”
//        WebElement passwordBox = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_password']"));
//        passwordBox.sendKeys("test");
//
//        // 5.Click to Login button
//        WebElement submitButton = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_login_button']"));
//        submitButton.click();

        // 6.Print out count of all the links on landing page
        // We need to locate All OF THE LINKS ON THE CURRENT PAGE
        List<WebElement> allLinksOfThePage = driver.findElements(By.xpath("//body//a"));
        System.out.println("Number of the Links of the page is " + allLinksOfThePage.size());
        System.out.println();

        // 7.Print out each link text on this page
        for (WebElement link: allLinksOfThePage){
           // System.out.println("Reference of the link " + link );
            System.out.println("Text of the links: " + link.getText());
        }

    }
    public static void loginToSmartBear(WebDriver driver){
       // 2.Go	to	website:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // 3.Enter username: “Tester”
        WebElement userNameBox = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_username']"));
        userNameBox.sendKeys("Tester");
        // 4.Enter password: “test”
        WebElement passwordBox = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_password']"));
        passwordBox.sendKeys("test");

        // 5.Click to Login button
        WebElement submitButton = driver.findElement(By.cssSelector("input[id='ctl00_MainContent_login_button']"));
        submitButton.click();
    }
}
