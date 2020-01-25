package mentorings.tuesday.amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class IbraimsMentoring {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // We use Webdriver on reference side to be able to run our tests with multiple browsers

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        String url = "https://play.typeracer.com/";

        //driver.navigate().to(url); navigate to url will send the request to the url
        driver.get(url); // get method will send the request and wait for response

        WebElement enterRaceLink = driver.findElement(By.xpath("//a[.='Enter a typing race']"));
        enterRaceLink.click();

        WebElement timerCountdown = driver.findElement(By.cssSelector("div.popupContent span.time"));

        while(timerCountdown.getText().equals("")){
            Thread.sleep(300);
            timerCountdown = driver.findElement(By.cssSelector("div.popupContent span.time"));
            System.out.println("Waiting for coundown to be displayed" + timerCountdown.getText());
        }
        String timerStr = timerCountdown.getText();
        int timerInt = Integer.parseInt(timerStr.replace(":", "")) + 1;
        System.out.println(timerInt + " " + timerStr);
        Thread.sleep(timerInt * 1000);
        List<WebElement> textList = driver.findElements(By.xpath("//span[@unselectable='on']"));
        String textToType = "";
        for(WebElement e : textList){
            textToType += e.getAttribute("textContent");
        }

        System.out.println(textToType);


        WebElement inputField = driver.findElement(By.className("txtInput"));

        for(char c : textToType.toCharArray()){
            inputField.sendKeys(String.valueOf(c));
            Thread.sleep(15);
        }
    }

}