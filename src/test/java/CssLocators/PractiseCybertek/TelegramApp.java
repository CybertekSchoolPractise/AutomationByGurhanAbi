package CssLocators.PractiseCybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TelegramApp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.telegram.org/#/login");
        try {
            WebElement phoneNumberEnter =  driver.findElement(By.xpath("(//input[@name='phone_number'])"));
            phoneNumberEnter.sendKeys("7722070707");
            WebElement nextButton = driver.findElement(By.xpath("//i[@class='icon icon-next-submit']"));
            nextButton.click();
            WebElement okButton = driver.findElement(By.xpath("(//span[@my-i18n='modal_ok'])[2]"));
            okButton.click();
        }catch (Exception e){
            System.out.println("haha");
        }

    }
}
