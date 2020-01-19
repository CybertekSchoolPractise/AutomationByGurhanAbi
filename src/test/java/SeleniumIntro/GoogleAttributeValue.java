package SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAttributeValue {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.google.com");

       String imagesLink =  driver.findElement(By.linkText("Images")).getAttribute("href");
       String dataPid = driver.findElement(By.linkText("Images")).getAttribute("data-pid");
        System.out.println(imagesLink);
        System.out.println(dataPid);
    }
}
