package CssLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkCybertekPassword {
    public static void main(String[] args) {

      //  PracticeCybertek.com_ForgotPassword WebElement verification
        WebDriverManager.chromedriver().setup();

      //  1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
     //   2. Go to
        driver.manage().window().maximize();
     //   http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
      //  3.Locate all the WebElements on the page using XPATH locator only (total of 6)

      //  a. “Home” link

     if(driver.findElement(By.xpath("//li[@class ='nav-item']")).isDisplayed()){
         System.out.println("Home page is displayed!");
     }else {
         System.out.println("Home page is not diplayed");
     }

      //  b.“Forgot password” header
//        String actualTitle = driver.findElement(By.xpath("//div[@class = 'example']")).getText();
//     String expectedTitle = "Forgot Password";
     if(driver.findElement(By.xpath("//div[@class = 'example']")).isDisplayed()){
         System.out.println("Forgot password text verification PASSED!");
     }else{
         System.out.println("Forgot password text verification FAILED!");
     }

        //  c. “E-mail” text
        if(driver.findElement(By.xpath("//label[@for='email']")).isDisplayed()){
            System.out.println("E-mail text displayed");
        }else {
            System.out.println("E-mail text not displayed");
        }

       // d. E-mail input box
        if(driver.findElement(By.xpath("//input[@name='email']")).isDisplayed()){
            System.out.println("E-mail box displayed");
        }else{
            System.out.println("E-mail box not displayed");
        }

       // e.“Retrieve password” button
        if(driver.findElement(By.xpath("//button[@id='form_submit']")).isDisplayed()){
            System.out.println("Retrieve password button displayed");
        }else{
            System.out.println("Retrieve password button not displayed");
        }

       // f.“Powered by Cybertek School” text
        if (driver.findElement(By.xpath("//div[@style='text-align: center;']")).isDisplayed()){
            System.out.println("Powered by Cybertek School text is Displayed!");
        }else{
            System.out.println("Powered by Cybertek School text is not Displayed!");
        }

       // 4. Verify all WebElements are displayed

    // driver.close();


    }
}
