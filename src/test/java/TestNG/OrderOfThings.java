package TestNG;

import org.testng.annotations.Test;

public class OrderOfThings {
    @Test (priority = 3)
    public void firstTest(){
        System.out.println("Test one is running");
    }

    @Test (priority = 2)
    public void secondTest(){
        System.out.println("Test two is running");
    }

    @Test (priority = 1)
    public void thirdTest(){
        System.out.println("Test three is running");
    }

}
