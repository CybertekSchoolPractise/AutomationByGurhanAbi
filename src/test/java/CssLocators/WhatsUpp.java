package CssLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatsUpp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.whatsapp.com/");
       WebElement whatsuppSearchButton =  driver.findElement(By.cssSelector("input[type='text']"));
       whatsuppSearchButton.sendKeys("App monsters");
       whatsuppSearchButton.submit();


    }
}
