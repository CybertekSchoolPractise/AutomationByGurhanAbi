package synchronizationTests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.practise_cybertek_pages.HoverPractiseHomeWork;
import utilities.Driver;

public class HoversPractiseHomeWorkTest {
    @Test
    public void hoverTest(){
//        TC	#16:	Hover	Test1.
//        Go	to	https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        HoverPractiseHomeWork hoverPractiseHomeWork = new HoverPractiseHomeWork();

//        // 2.Drag	and	drop	the	small	circle	to	bigger	circle.
        Actions actions = new Actions(Driver.getDriver());
        actions.clickAndHold(hoverPractiseHomeWork.smallDragBox).moveToElement(hoverPractiseHomeWork.bigDragBox)
                .perform();
//        // 3.Assert:	-Text	in	big	circle	changedto:	“You	did	great
    }

}
