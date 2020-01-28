package mentorings.tuesday.amazon;

import org.junit.*;


public class AmazonPage extends BasePage {
    @Test
    public void navigateTo(){
        String url = "https://www.amazon.com/";
        driver.get(url);

        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
      //  url = "https://www.amazon.com/";
        Assert.assertEquals(url,actualURL);

    }
}
