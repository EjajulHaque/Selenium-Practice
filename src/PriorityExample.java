import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 0)
    void TestOne(){
        System.out.println("test 1");
    }
    @Test(priority = 1)
    void TestTwo(){
        System.out.println("test 2");
    }
    @Test(priority = 2,enabled = false)
    void TestThree(){
        System.out.println("test 3");
    }
    @Test(priority = 3)
    void TestFour(){
        System.out.println("test 4");
    }

}
