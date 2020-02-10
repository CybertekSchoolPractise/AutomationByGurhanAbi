package pages.practise_cybertek_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomeWork2Page {
    public HomeWork2Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div/h4")
    public WebElement afterLoadingOverlayText;

    @FindBy(css = "#username")
    public WebElement userNameBox;

    @FindBy(css = "#pwd")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//h4[@class='subheader']")
    public WebElement loggedInSuccessfullyText;

}
