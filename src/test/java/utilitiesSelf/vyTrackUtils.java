package utilitiesSelf;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class vyTrackUtils {
  // WebDriver driver;
   private static String userNameLocator = "prependedInput";
   private static String passwordLocator = "prependedInput2";

    public static void login(WebDriver driver, String userName, String password){

        driver.findElement(By.id(userNameLocator)).sendKeys(userName);
        driver.findElement(By.id(passwordLocator)).sendKeys(password + Keys.ENTER);
        SeleniumUtils.pause(5);
    }

    public static void navigateToModule(WebDriver driver, String tab, String module){
        String TabLocatorActivities = "//span[contains(text(),'" + tab + "') and @class ='title title-level-1']";
        String ModuleLocatorXpath = "//span[.= '" + module + "']";
        driver.findElement(By.xpath(TabLocatorActivities)).click();
        SeleniumUtils.pause(10);
        driver.findElement(By.xpath(ModuleLocatorXpath)).click();
        SeleniumUtils.pause(5);
    }
}
