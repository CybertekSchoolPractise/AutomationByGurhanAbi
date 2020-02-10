package pages.practise_cybertek_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hovers {
    public Hovers(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//div[@class='figure'])[1]")
    public WebElement userOne;

    @FindBy(xpath = "(//div[@class='figure'])[2]")
    public WebElement userTwo;

    @FindBy(xpath = "(//div[@class='figure'])[3]")
    public WebElement userThree;

    @FindBy(xpath = "//h5[.='name: user1']")
    public WebElement user1Text;

    @FindBy(xpath = "//h5[.='name: user2']")
    public WebElement user2Text;

    @FindBy(xpath = "//h5[.='name: user3']")
    public WebElement user3Text;
}
