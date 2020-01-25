package SeleniumPractiseSelf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  Practice:	Cybertek	Checkboxes
         // 1. Go	to	http://practice.cybertekschool.com/checkboxes
        driver.get("http://practice.cybertekschool.com/checkboxes");

        // 2. Confirm	checkbox	#1	is	NOT	selected	by	default
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        if(!checkbox1.isSelected()){
            System.out.println("Default Checkbox1 value verification Passed!");
        }else {
            System.out.println("Default Checkbox1 value verification Failed!");
        }

        // 3. Confirm	checkbox	#2	is	SELECTED	by	default.
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if(checkbox1.isSelected()){
            System.out.println("CHeckbox2 is selected Passed!");
        }else{
            System.out.println("Checkbox2 is selected Failed!");
        }

        // 4. Click	checkbox #1	to	select	it.
        checkbox1.click();

        // 5. Click	checkbox #2	to	deselect	it.
        checkbox2.click();

        // 6. Confirm	checkbox	#1	is	SELECTED.
        if(checkbox1.isSelected()){
            System.out.println("After clicking CheckBox1 is selected Passed!");
        }else{
            System.out.println("After clicking Checkbox1 is selected Failed!");
        }

        // 7. Confirm	checkbox	#2	is	NOT	selected.
        if(!checkbox2.isSelected()){
            System.out.println("After clicking checkbox2 is not selected Passed!");
        }else{
            System.out.println("After clicking checkbox2 is not selected Failed!");
        }

    }
}
