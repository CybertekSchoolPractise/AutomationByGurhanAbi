package Dropdowns;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SmartbearSoftwareOderPlacing {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        TC#2: Smartbear software order placing
//        1.Open	browser
//        2.Go	to	website:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

//        3.Enter username: “Tester”
        // 4.Enter password: “test”
        // 5.Click on Login button
        SmartBearSoftware.loginToSmartBear(driver);

        // 6.Click on Order
        WebElement orderButton = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        orderButton.click();

        // 7.Select familyAlbum from product, set quantity to 2
        WebElement productSelect = driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select selectFamily = new Select(productSelect);
        selectFamily.selectByVisibleText("FamilyAlbum");
        WebElement quantityFrame = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
        //quantityFrame.clear();
        quantityFrame.sendKeys(Keys.BACK_SPACE , "2");
Thread.sleep(2000);
        // 8.Click to “Calculate”button
        WebElement calculateButton = driver.findElement(By.cssSelector("input[type='submit']"));
        calculateButton.click();

        // 9.Fill address Info with JavaFaker
        //         •Generate: name, street, city, state, zip code

        WebElement CustomerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement CustomerStreet = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement CustomerCity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement CustomerState = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement CustomerZipCode = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        Faker faker = new Faker();
        CustomerName.sendKeys(faker.name().fullName());
        CustomerStreet.sendKeys(faker.address().streetName());
        CustomerCity.sendKeys(faker.address().city());
        CustomerState.sendKeys(faker.address().state());
        CustomerZipCode.sendKeys(faker.address().zipCode().replaceAll("-", ""));



        // 10.Click on “visa” radio button
        // 11.Generate card number using JavaFaker
        // 12.Click on “Process”
        // 13.Verify success message “New order has been successfully added.”
    }
}
