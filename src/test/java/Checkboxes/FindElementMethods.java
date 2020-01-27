package Checkboxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //  TC	#1:	Checking	the	number	of	links	on	the	page
      //  1.Open	Chrome	browser
        //  2.Go	to	https://www.openxcell.com
        driver.get("https://www.openxcell.com");

        // 3.Count	the	number	of	the	links	on	the	page	and	verify
        // Expected:	188
        int expected = 188;
        List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        if(links.size()==expected){
            System.out.println("Counting all links of the website is PASSED!");
        }else{
            System.out.println("Counting all links of the website is FAILED!");
        }

       // 1.Open	Chrome	browser
         // 2.Go	to	https://www.openxcell.com
        // 3.Print	out	all	of	the	texts	of	the	links on the page


        for (WebElement link: links){
            System.out.println(link.getText());
        }

//        1.Open	Chrome	browser
//        2.Go	to	https://www.openxcell.com
        // 3.Count	the	number	of	links	that	does	not	have	text	and	verify
        // Expected:	109;
        int counter =0;
        for (WebElement link: links){
           if(link.getText().equals("")){
               counter++;
           }
        }
        int expectedNumofLinksWithNoText = 109;
        int actualNumOfLinksWithNoText = counter;
        if(actualNumOfLinksWithNoText==expectedNumofLinksWithNoText){
            System.out.println("Links without text verification PASSED!");
        }else{
            System.out.println("Links without text verification FAILED!");
        }

    }
}
