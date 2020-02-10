package actions_tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Amazon_pages.AmazonLandingPage;
import utilities.Driver;

public class AmazonTests {
    @Test
    public void signInLinkHoverTest(){
        // 1- get the page first
        Driver.getDriver().get("https://amazon.com");

        // 2- create the object of Pages class to reach web elemnent
        AmazonLandingPage amazonLandingPage = new AmazonLandingPage();

        // 3- create the object of Actions class, ansd pass driver instance
        // into the constructor
        Actions actions = new Actions(Driver.getDriver());

        // 4- we will move to the link using actions instance and method
        actions.moveToElement(amazonLandingPage.signInLink).perform();
    }
}
