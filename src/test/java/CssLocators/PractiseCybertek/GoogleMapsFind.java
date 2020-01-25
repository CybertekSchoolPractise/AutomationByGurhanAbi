package CssLocators.PractiseCybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapsFind {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // go to "https://google.com";
        driver.get("https://google.com");

        // go to google apps which all google apps collected here!
        WebElement apps = driver.findElement(By.xpath("//a[@title='Google apps']"));
        apps.click();
        // go to "Google Maps"
        WebElement googleMaps = driver.findElement(By.xpath("//a[@data-pid='8']"));
        googleMaps.click();


        WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchboxinput']"));
        searchBox.click();
    }
}
