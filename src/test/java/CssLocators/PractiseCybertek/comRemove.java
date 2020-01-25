package CssLocators.PractiseCybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class comRemove {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.xpath("//a[@href='/add_remove_elements/']")).click();
Thread.sleep(3000);
//        3. Click to “Add Element” button

        WebElement addButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addButton.click();
        Thread.sleep(1000);

//        4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()' and @class='added-manually']"));
        if(deleteButton.isDisplayed()){
            System.out.println("Delete button is Displayed!");
        }else{
            System.out.println("Delete button is not Displayed!");
        }

//        5. Click to “Delete” button.
        deleteButton.click();
        Thread.sleep(1000);

//        6. Verify “Delete” button is NOT displayed after clicking.
        try {
             WebElement deleteButton2 = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
            if(deleteButton2.isDisplayed()){
                System.out.println("False");
                System.out.println("Delete button is Displayed!");
            }else{
                System.out.println("True");
                System.out.println("Delete button is not Displayed!");
            }
        }catch (NoSuchElementException e){
            System.out.println("Delete button is not Displayed!");
        }

//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS


driver.close();



    }
}
