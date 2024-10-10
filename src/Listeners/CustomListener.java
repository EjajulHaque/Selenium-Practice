package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class CustomListener implements ITestListener {

    //This  belongs to ITestListener and will execute before starting of the test set/batch
    public void onStart(ITestContext arg){
        System.out.println("start test execution"+arg.getName());
    }

    //This  belongs to ITestListener and will execute after starting of the test set/batch
    public void onFinish(ITestContext arg){
        System.out.println("start test execution"+arg.getName());
    }

    //This  belongs to ITestListener and will execute before the main test start i.e @Test
    public void onTestStart(ITestContext arg){
        System.out.println("start test.."+arg.getName());
    }

    //This  belongs to ITestListener and will execute when a test is skipped
    public void onTestSkipped(ITestContext arg){
        System.out.println("skipped test..."+arg.getName());
    }

    //This  belongs to ITestListener and will execute when a test is passed
    public void onTestPassed(ITestContext arg){
        System.out.println("passed test.."+arg.getName());
    }

    //This  belongs to ITestListener and will execute when a test is failure
    public void onTestFailure(ITestContext arg){
        System.out.println("failed test..."+arg.getName());
    }
}
