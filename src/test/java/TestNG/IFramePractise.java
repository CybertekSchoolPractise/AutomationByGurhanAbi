package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IFramePractise {

WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

//    TC	#	:	Iframe	practice
//        1.Create	a	new	class	called:	IframePractice
//    2.Create	new	test	and	make	set	ups
//    3.Go	to	:http://practice.cybertekschool.com/iframe
        @Test
        public void iframePra(){
            driver.get("http://practice.cybertekschool.com/iframe");
            driver.switchTo().frame(0);
            WebElement iframe = driver.findElement(By.xpath("//body[@id='tinymce']"));
            Assert.assertTrue(iframe.isDisplayed(),"Message is not displyed");
            driver.switchTo().parentFrame();
            WebElement header = driver.findElement(By.xpath("//h3"));
            Assert.assertTrue(header.isDisplayed(), "Header is not displayed");
        }

    // 4.Assert:“Your	content	goes	here.”Text	is	displayed.

    // 5.Assert:“An	iFrame	containingthe	TinyMCE	WYSIWYG	Ed
}
