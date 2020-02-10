package TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGClass {
//    public static void main(String[] args) {
//
//    }

    @BeforeClass
    public void setUp(){
        System.out.println("BeforeClass is running...");
    }

    @Test
    public void bfirstTest() {
        //        if("q".equals("q")){
//            System.out.println("Pass!");
//        }else{
//            System.out.println("Fail!");
//        }
        Assert.assertEquals("actualValue","actualValue", "Second test is failed");
        Assert.assertEquals(1,1, "Second test is failed");

        System.out.println("1st test is running...");
    }

   @Test
    public void asecondTest() {
        String letter = "e";
        Assert.assertTrue("sentence".contains(letter), "Sentence does not contain " + letter );
        System.out.println("2nd test is running...");


   }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod is running ...");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod is running...");
    }
    @AfterClass
    public void tearDown(){
        System.out.println("AfterClass is running...");
    }

}
