package AmazonLoads;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RefreshPage {
  public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://relay.amazon.com/tours/loadboard?");
        WebElement signIn = driver.findElement(By.xpath("//input[@id='ap_email']"));

        signIn.sendKeys("kevinupdown@gmail.com");
        Thread.sleep(5000);

        WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
        password.sendKeys("Pandaatlanda777");
        Thread.sleep(5000);

        WebElement signButton = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
        signButton.click();
        Thread.sleep(5000);
//          WebElement secondPassword = driver.findElement(By.xpath("//input[@id='ap_password']"));
//           secondPassword.sendKeys("Pandaatlanda777");

        for(;;){
        WebElement refreshButton = driver.findElement(By.xpath("//div[@class='loadboard-reload']//i"));

            refreshButton.click();
            Thread.sleep(100);
        }
    }
}
