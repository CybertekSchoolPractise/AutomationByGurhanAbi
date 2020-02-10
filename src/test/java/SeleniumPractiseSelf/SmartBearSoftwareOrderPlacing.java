package SeleniumPractiseSelf;

import Dropdowns.SmartBearSoftware;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class SmartBearSoftwareOrderPlacing {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        TC#2: Smartbear software order placing1.Open	browser
//        2.Go	to	website:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        // 3.Enter username: “Tester”
        // 4.Enter password: “test”
        // 5.Click on Login button
        SmartBearMain.loginToSmartBear(driver);

        // 6.Click on Order
        WebElement orderButton = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        orderButton.click();

        // 7.Select familyAlbum from product, set quantity to 2
        WebElement familySelect = driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select select = new Select(familySelect);
        select.selectByVisibleText("FamilyAlbum");
        WebElement quantityBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
        quantityBox.sendKeys(Keys.BACK_SPACE, "2");

        // 8.Click to “Calculate”button
        WebElement calculateButton = driver.findElement(By.xpath("//input[@type='submit']"));
        calculateButton.click();

        // 9.Fill address Info with JavaFaker
        // •Generate: name, street, city, state, zip code

        Faker faker = new Faker();
        WebElement customerNameBox = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        customerNameBox.sendKeys(faker.name().fullName());
        WebElement streetBox = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        streetBox.sendKeys(faker.address().streetName());
        WebElement cityBox = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        cityBox.sendKeys(faker.address().city());
        WebElement stateBox = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        stateBox.sendKeys(faker.address().state());
     WebElement zipcodeBox = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
    zipcodeBox.sendKeys(faker.address().zipCode().substring(0,5));

        // 10.Click on “visa” radio button
        WebElement vizaButtonClick = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        vizaButtonClick.click();

            // 11.Generate card number using JavaFaker
        WebElement cardNumberBox = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumberBox.sendKeys(faker.finance().creditCard().replaceAll("-",""));
        WebElement cardExpireBox = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        cardExpireBox.sendKeys("12/22");

        // 12.Click on “Process”
        WebElement processButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processButton.click();

        // 13.Verify success message “New order has been successfully added.”
        WebElement successMessage = driver.findElement(By.xpath("//div//strong"));
        if(successMessage.isDisplayed()){
            System.out.println("Success message verificication PASSED!");
        }else{
            System.out.println("SUccess message verification FAILED!");
        }

    }
}
