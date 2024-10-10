import org.testng.annotations.*;

public class TC1 {

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
    void test1(){
        System.out.println("this is a test1.....");
    }
    @Test
    void test2(){
        System.out.println("this is a test2.....");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("this will execute before test ");
    }
    @AfterTest
    void afterTest(){
        System.out.println("this will execute after test");
    }
}
