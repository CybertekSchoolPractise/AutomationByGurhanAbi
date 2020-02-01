package Dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.WebStorage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearSoftware {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        TC	#1:	Smartbear	software	link	verification
//        1.Open	browser
//        2.Go	to	website:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        loginToSmartBear(driver);


        // 6.Print out count of all the links on landing page
        List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        System.out.println("Count of all the links on the page " + links.size());

        // 7.Print out each link text on this page
        for (WebElement link: links){
            System.out.println("reference of the object "  + link);
            System.out.println("Text of the link " + link.getText());
        }
        // driver.quit();

        // Mini-Task:
        // •Create a method called loginToSmartBear

        // •This method simply logs in to SmartBear when you callit.
    }
    public static void loginToSmartBear(WebDriver driver){
        WebElement usernameFrame = driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        usernameFrame.sendKeys("Tester");

        // Enter password: “test”
        WebElement passwordFrame = driver.findElement(By.cssSelector("input[name='ctl00$MainContent$password']"));
        passwordFrame.sendKeys("test");

        // Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();


    }
    public static void verifyOrder(WebDriver driver, String givenName){
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for(WebElement name : allNames){
            if(name.getText().equals(givenName)){
                System.out.println(givenName + " exists in the list. Verification PASSED!");
                return;
            }
        }
        System.out.println(givenName + "does NOT exist in the list. Verification FAILED!!!");
    }


}
