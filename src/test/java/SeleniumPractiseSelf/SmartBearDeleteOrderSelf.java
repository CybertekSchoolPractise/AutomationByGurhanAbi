//package SeleniumPractiseSelf;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//public class SmartBearDeleteOrderSelf {
//    WebDriver driver;
//    @BeforeClass
//            public void setUp(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//    @Test
//    public void deleteOrderTest(){
//driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
//driver.findElement(By.id("ctl00_MainContent_login_button")).click();
//driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl03_OrderSelector")).click();
//driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
//        List<WebElement> names = driver.findElements(By.cssSelector("#ctl00_MainContent_orderGrid")).
//
//    }
//}
