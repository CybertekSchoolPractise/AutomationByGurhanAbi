package Checkboxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumEasyCheckBox2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // SeleniumEasy	Checkbox	Verification – Section	2
       // 1. Open	Chrome	browser
       // 2. Go	to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

       // 3. Verify	“Check	All”	button	text	is	“Check	All”
        WebElement CheckAllButton = driver.findElement(By.xpath("//input[@value='Check All']"));
        String expectedText = "Check All";
        String actualText = CheckAllButton.getAttribute("value");
        if(actualText.equals(expectedText)){
            System.out.println("Check all button text verification PASSED!");
        }else{
            System.out.println("Check all button text verification FAILED!");
        }

       // 4. Click	to	“Check	All”	button
        CheckAllButton.click();

       // 5. Verify	all	check	boxes	are	checked
        WebElement Option1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        WebElement Option2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
        WebElement Option3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
        WebElement Option4 = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
        if(Option1.isSelected()){
            System.out.println("Option 1 button verification PASSED!");
        }else{
            System.out.println("Option 1 button verification FAILED!");
        }

        if(Option2.isSelected()){
            System.out.println("Option 2 button verification PASSED!");
        }else{
            System.out.println("Option 2 button verification FAILED!");
        }

        if(Option3.isSelected()){
            System.out.println("Option 3 button verification PASSED!");
        }else{
            System.out.println("Option 3 button verification FAILED!");
        }
        if(Option4.isSelected()){
            System.out.println("Option 4 button verification PASSED!");
        }else{
            System.out.println("Option 4 button verification FAILED!");
        }

        // 6. Verify	button	text	changed	to	“Uncheck	All”
        WebElement uncheckAllButton = driver.findElement(By.xpath("//input[@id='check1']"));
        if(uncheckAllButton.getAttribute("value").equals("Uncheck All")){
            System.out.println("Uncheck all button verification PASSED!");
        }else{
            System.out.println("Uncheck all button verification FAILED!");
        }

    }
}
