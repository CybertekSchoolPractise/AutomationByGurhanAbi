package Checkboxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumEasyCheckbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //  TC# 2: SeleniumEasy	Checkbox Verification–Section	1
        // 1. Open	Chrome	browser
        // 2. Go	to
        // https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

       // 3. Verify	“Success–Check	box	is	checked”	message is	NOT displayed.
        WebElement succesCheckText = driver.findElement(By.xpath("//div[@id='txtAge']"));
        if(!succesCheckText.isDisplayed()){
            System.out.println("Success text NOT verification PASSED!");
        }else{
            System.out.println("Success text verification FAILED!");
        }

       // 4.Click	to	checkbox	under	“Single	Checkbox Demo”	section
    WebElement clickButton = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        clickButton.click();

       // 5. Verify	“Success–Check	box	is	checked”	message is displayed.
        if(succesCheckText.isDisplayed()){
            System.out.println("Success text verification PASSED!");
        }else{
            System.out.println("Success text verification FAILED!");
        }

    }
}
