package synchronizationTests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practise_cybertek_pages.HomeWork2Page;
import utilities.Driver;
import utilities.SeleniumUtils;

public class LoadingOverlayHomeW2Test {
    @Test
    public void loadingOverlay(){
        // create object from object class
        HomeWork2Page homeWork2Page = new HomeWork2Page();

        // 1.Go to http://practice.cybertekschool.com/dynamic_loading/5
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/5");
        SeleniumUtils.pause(5);
        // 2.Wait Until loading overlay is not displayed
//        String linkPage = Driver.getDriver().getTitle();
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
//        wait.until(ExpectedConditions.titleIs(linkPage));

        // 3.Enter username: tomsmith
        homeWork2Page.userNameBox.sendKeys("tomsmith");

        // 4.Enter password: SuperSecretPassword
        homeWork2Page.passwordBox.sendKeys("SuperSecretPassword");

        // 5.Click to Submit button
        homeWork2Page.submitButton.click();

        // 6.Assert “Welcome to the Secure Area” text is displayed.
        Assert.assertTrue(homeWork2Page.loggedInSuccessfullyText.isDisplayed(), "Logged in text is NOT displayed!");
    }
}
