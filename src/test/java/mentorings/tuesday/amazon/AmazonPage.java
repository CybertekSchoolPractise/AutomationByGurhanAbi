package mentorings.tuesday.amazon;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPage {
    WebDriver driver;
    @Before
    public void setUp(){
        System.out.println("Instatiating the driver");
        WebDriverManager.chromedriver().setup();
        driver  = new ChromeDriver();
    }
    @After
    public void tearDown(){
        System.out.println("Quitting the browser");
        driver.quit();
    }
    @Test
    public void navigateTo(){
        String url = "https://www.amazon.com/";
        driver.get(url);

        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        url = "https://www.amazon.com/";
        Assert.assertEquals(url,actualURL);
//        if(actualURL.equals(url)){
//            System.out.println("PASSED!");
//        }else{
//            System.out.println("FAILED!");
//        }
    }
}
