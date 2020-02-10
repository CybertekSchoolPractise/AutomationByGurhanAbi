package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Driver;

public class VyTrackLogin {
    @Test
    public void loginTest(){
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys("storemanager85");
        Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        Driver.getDriver().findElement(By.id("_submit")).click();
    }
}
