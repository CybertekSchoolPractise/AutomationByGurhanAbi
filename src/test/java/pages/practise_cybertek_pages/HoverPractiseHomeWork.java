package pages.practise_cybertek_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HoverPractiseHomeWork {
    public HoverPractiseHomeWork() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(xpath = "//div[.='Drag the small circle here.']")
        public WebElement bigDragBox;

    @FindBy(xpath = "//div[@id='draggable']")
    public WebElement smallDragBox;

    @FindBy(xpath = "//div[.='You did great!']")
    public WebElement resultText;

}
