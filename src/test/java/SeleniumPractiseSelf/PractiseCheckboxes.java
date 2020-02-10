package SeleniumPractiseSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PractiseCheckboxes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        Practice:	Cybertek	Checkboxes
//    1.Go	to	http://practice.cybertekschool.com/checkboxes
        driver.get("http://practice.cybertekschool.com/checkboxes");

        // 2.Confirm	checkbox	#1	is	NOT	selected	by	default
        // 3.Confirm	checkbox	#2	is	SELECTED	by	default.
        // 4.Click	checkbox	#1	to	select	it.
        // 5.Click	checkbox	#
        // 2	to	deselect	it.
        // 6.Confirm	checkbox	#1	is	SELECTED.
        // 7.Confirm	checkbox	#2	is	NOT
    }
}
