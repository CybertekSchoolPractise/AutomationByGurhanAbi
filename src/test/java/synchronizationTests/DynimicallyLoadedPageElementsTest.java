package synchronizationTests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practise_cybertek_pages.HomeWork1Page;
import utilities.Driver;

public class DynimicallyLoadedPageElementsTest {
    @Test
    public void dynimicallyLoadPractise(){
        //.Go to http://practice.cybertekschool.com/dynamic_loading/1
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        HomeWork1Page homeWork1Page = new HomeWork1Page();

        // 2.Click to start
        homeWork1Page.startButton.click();

        // 3.Wait Until Form is Displayed
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(homeWork1Page.textDisplayed));

        // 4.Assert “Hello World” text is Displayed
        Assert.assertTrue(homeWork1Page.textDisplayed.isDisplayed(), "Hello world text is NOT displayed");
        // 5.Enter username: tomsmith
        homeWork1Page.usernameBox.sendKeys("tomsmith");

        // 6.Enter password: SuperSecretPassword
        homeWork1Page.passwordBox.sendKeys("SuperSecretPassword");

        // 7.Click to Submit button
        homeWork1Page.submitButton.click();

        // 8.Assert “Welcome to the Secure Area” text is displayed.
        Assert.assertTrue(homeWork1Page.finalTextDisplayed.isDisplayed(), "Welcome to the Secure Area is NOT displayed");
    }
}
