package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowHandlePrcatise {
WebDriver driver;

@BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }

//    TC	#	:	Window	Handlepractice1.Create	a	new	class	called:	WindowHandlePractice
//    2.Create	new	test	and	make	set	ups
//    3.Go	to	:	http://practice.cybertekschool.com/windows

    @Test (priority = 1)
    public void windowPractise(){

    }

    // 4.Assert:	Title	is	“Practice”
    // 5.Click	to:	“Click	Here”text
    // 6.Switch	to	new	Window.
    // 7.Assert:	Title	is	“New	Window”
}
