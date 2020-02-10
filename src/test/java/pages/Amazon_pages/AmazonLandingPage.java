package pages.Amazon_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonLandingPage {

    public AmazonLandingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="nav-link-accountList")
    public WebElement signInLink;



}
