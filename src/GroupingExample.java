import org.testng.annotations.Test;

public class GroupingExample {
    @Test(groups = {"regression"})
    void test1(){
        System.out.println("this is test one");
    }
    @Test(groups = {"sanity"})
    void test2(){
        System.out.println("this is test two");
    }
    @Test(groups = {"regression"})
    void test3(){
        System.out.println("this is test three");
    }
    @Test(groups = {"end to end"})
    void test4(){
        System.out.println("this is test four");
    }
    @Test(groups = {"functional"})
    void test5(){
        System.out.println("this is test five");
    }
}
