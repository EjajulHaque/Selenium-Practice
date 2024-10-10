import org.testng.annotations.Test;

public class FirstTestCase {
    @Test
    void browserOpen(){
        System.out.println("browser opening");
    }
    @Test
    void login(){
        System.out.println("login successful");
    }
    @Test
    void logout(){
        System.out.println("logout successful");
    }
}
