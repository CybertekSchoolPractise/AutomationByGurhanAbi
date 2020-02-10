package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertions {
SoftAssert softAssert = new SoftAssert();
    @Test
    public void test1(){
        System.out.println("Test1 is starting...");
        Assert.assertEquals(4,5);

        System.out.println("Test1 middle...");
        Assert.assertTrue(false);

        System.out.println("Test1 is ending...");
    }
    @Test
    public void test2(){
        System.out.println("Test 2 is starting...");

    }
    @Test
    public void test3(){
       // SoftAssert softAssert = new SoftAssert();

        System.out.println("Test3 is starting...");
        softAssert.assertEquals(4,5);

        Assert.assertTrue(false);
        System.out.println("Test3 middle...");
        softAssert.assertTrue(false);

        System.out.println("Test3 is ending...");
       // softAssert.assertAll();
    }
    @AfterMethod
    public void tearDown(){
        softAssert.assertAll();
    }

}
