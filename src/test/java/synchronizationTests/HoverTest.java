package synchronizationTests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practise_cybertek_pages.Hovers;
import utilities.Driver;

public class HoverTest {
    @Test
    // 1- get the page
    public void hoverOverCheck(){
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
    // 2- create the object of Hovers class to use WebElements
        Hovers hovers = new Hovers();

    // 3- Create the object of the Actions to move the mouse to users
    Actions actions = new Actions(Driver.getDriver());

    actions.moveToElement(hovers.userOne).perform();
    // 4- Assert the text is displayed
        Assert.assertTrue(hovers.user1Text.isDisplayed(), "User1 text is NOT displayed!");

        // 5- Move to second user and assert it
    actions.moveToElement(hovers.userTwo).perform();
        Assert.assertTrue(hovers.user2Text.isDisplayed(), "User2 text is NOT displayed!");

    // 6- Move to third user and Assert the text
    actions.moveToElement(hovers.userThree).perform();
        Assert.assertTrue(hovers.user3Text.isDisplayed(), "User3 text is NOT displayed!");

    }

}
