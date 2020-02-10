package reviewOfUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;


public class Reviewfile {
    public static void main(String[] args)  throws Exception{

       Properties properties = new Properties();
        FileInputStream file = new FileInputStream("review.properties");
        properties.load(file);
        String s = properties.getProperty("day");
        System.out.println(s);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       driver.get(properties.getProperty("url"));
        WebElement searchButton = driver.findElement(By.name("q"));
        searchButton.sendKeys(properties.getProperty("item")+ Keys.ENTER);



    }
}
