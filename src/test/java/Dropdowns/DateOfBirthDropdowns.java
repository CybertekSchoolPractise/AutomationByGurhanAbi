package Dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DateOfBirthDropdowns {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        TC #1: Selecting date on dropdown and verifying
//        1.Open Chrome browser
//        2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 3.Verify “Select your date of birth” dropdowns are selected todays date
        // by default.
        WebElement YearofBirth = driver.findElement(By.id("year"));
        Select selectYear = new Select(YearofBirth);
        WebElement MonthOfBirth  = driver.findElement(By.id("month"));
        Select selectMonth = new Select(MonthOfBirth);
        WebElement DayOfBirth = driver.findElement(By.id("day"));
        Select selectDay = new Select(DayOfBirth);
        String expectedBirthYear = "2020";
        String expectedBirthMonth = "January";
        String expectedBirthDay = "26";
       String actualDay = selectDay.getFirstSelectedOption().getText();
       String actaulMonth = selectMonth.getFirstSelectedOption().getText();
       String actualYear = selectYear.getFirstSelectedOption().getText();
       if(actualYear.equals(expectedBirthYear) && actaulMonth.equals(expectedBirthMonth) &&
       actualDay.equals(expectedBirthDay)){
           System.out.println("Default selected options verification PASSED!");
       }else{
           System.out.println("Default selected options verification FAILED!");
       }

        // 4.Select “December 31st, 1921” and verify it is selected.
        // Use all Select options
        selectYear.selectByValue("1921");
        selectMonth.selectByIndex(11);
        selectDay.selectByVisibleText("31");

        String expectedSelectedDay = "31";
        String expectedSelectedMonth = "December";
        String expectedSelectedYear = "1921";

        String actualSelectedDay = selectDay.getFirstSelectedOption().getText();
        String actualSelectedMonth = selectMonth.getFirstSelectedOption().getText();
        String actualSelectedYear = selectYear.getFirstSelectedOption().getText();

        if(actualSelectedYear.equals(expectedBirthYear) && actualSelectedMonth.equals(expectedSelectedMonth)
        && actualSelectedDay.equals(expectedSelectedDay)){
            System.out.println("Date is correct. Selected values verification PASSED!");
        }else{
            System.out.println("Date is incorrect. Selected values verifications FAILED!");
        }

    }
}
