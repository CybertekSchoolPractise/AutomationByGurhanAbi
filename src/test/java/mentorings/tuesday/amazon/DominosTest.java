package mentorings.tuesday.amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to "https://www.dominos.com/en/";
        driver.get("https://www.dominos.com/en/");

        // close first window coming to offer new deals automatically
        WebElement xButton = driver.findElement(By.xpath("//button[@class='card--overlay__" +
                "close js-closeButton card--overlay__close--circular']"));
        Thread.sleep(10000);
        xButton.submit();



    }
}
