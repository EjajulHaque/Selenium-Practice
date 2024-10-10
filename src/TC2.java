import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TC2 {


    @BeforeClass
    void beforeClass(){
        System.out.println("this will execute before class");
    }
    @AfterClass
    void afterClass(){
        System.out.println("this will execute after class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("this will execute before every method");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("this will execute after every method");
    }
    @Test
    void test3(){
        System.out.println("this is a test1.....");
    }
    @Test
    void test4(){
        System.out.println("this is a test2.....");
    }
    @BeforeSuite
    void beforeSuit(){
        System.out.println("this will execute before suit");
    }
    @AfterSuite
    void afterSuit(){
        System.out.println("this will execute after suit");
    }
}
