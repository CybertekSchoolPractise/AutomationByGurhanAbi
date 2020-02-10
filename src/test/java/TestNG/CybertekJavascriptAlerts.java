package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CybertekJavascriptAlerts {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void ClickForJSAlert(){
        String JSAlertButton = "(//button[@class='btn btn-primary'])[1]";
        WebElement JSalertBtn = driver.findElement(By.xpath(JSAlertButton));
        JSalertBtn.click();
        String successMessage = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedMessage = "You successfuly clicked an alert";
        if (successMessage.equals(expectedMessage)){
            System.out.println("message verification Passed!");
        }else{
            System.out.println("message verification Failed!");
        }
    }
    @Test
    public void ClickForJSConfirm(){
        String JSAlertButton = "(//button[@class='btn btn-primary'])[2]";
        WebElement JSalertBtn = driver.findElement(By.xpath(JSAlertButton));
        JSalertBtn.click();
        String successMessage = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedMessage = "You clicked: Ok";
        if (successMessage.equals(expectedMessage)){
            System.out.println("message verification Passed!");
        }else{
            System.out.println("message verification Failed!");
        }
    }
    @Test
    public void ClickForJSPrompt(){
        String JSAlertButton = "(//button[@class='btn btn-primary'])[3]";
        WebElement JSalertBtn = driver.findElement(By.xpath(JSAlertButton));
        JSalertBtn.click();
        String successMessage = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedMessage = "You clicked: Ok";
        if (successMessage.equals(expectedMessage)){
            System.out.println("message verification Passed!");
        }else{
            System.out.println("message verification Failed!");
        }
    }


}