import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestExample {
    @Test
    void startCar(){
        System.out.println("car started");
    }
    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("car driving");
    }
    @Test(dependsOnMethods = {"driveCar"},alwaysRun = true)
    void stopCar(){
        System.out.println("car stoped");
    }
    @Test(dependsOnMethods = {"stopCar","driveCar"},alwaysRun = true)
    void parkCar(){
        System.out.println("car parked");
    }
}
