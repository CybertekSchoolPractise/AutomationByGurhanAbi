package synchronizationTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practise_cybertek_pages.DynamicLoading2Page;
import utilities.Driver;

public class ThreadSleepTests {

    @Test
    public void threadTest() throws Exception{
        // 1- getting the page
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/2");

        // 2- Creating object to be able reach Page class' WEbelements
        DynamicLoading2Page dynamicLoading2Page = new DynamicLoading2Page();

        // 3- clicking to the start button
        dynamicLoading2Page.startButton.click();
        Thread.sleep(6000);
        // 4- Assert the webElelemt is displayed on the page
        Assert.assertTrue(dynamicLoading2Page.helloWorldText.isDisplayed(),
                "Hello world text is NOT displayed!");

    }





}
