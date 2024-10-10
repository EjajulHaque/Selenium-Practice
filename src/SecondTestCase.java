import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
    @Test(priority = 2)
    void openFacebook(){
        System.out.println("open facebook account");
    }
    @Test(priority = 3)
    void addCustomer(){
        System.out.println("add new customer");
    }
    @Test(priority = 4)
    void deleteCustomer(){
        System.out.println("delete customer successful");
    }
}
