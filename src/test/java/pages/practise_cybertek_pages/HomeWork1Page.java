package pages.practise_cybertek_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomeWork1Page {
    public HomeWork1Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy (xpath = "//div/h4[.='Hello World!']")
    public WebElement textDisplayed;

    @FindBy(css = "#username")
    public WebElement usernameBox;

    @FindBy(css = "#pwd")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(css = "h4[class='subheader']")
    public WebElement finalTextDisplayed;
}
