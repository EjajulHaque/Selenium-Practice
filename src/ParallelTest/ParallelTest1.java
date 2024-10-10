package ParallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest1 {
    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/EJAJUL HAQUE" + "/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe/");
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-slot-wrapper']"));
        Assert.assertTrue(logo.isDisplayed(),"logo not displayed on the page");
        Thread.sleep(3000);
    }
    @Test
    void homePageTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/EJAJUL HAQUE" + "/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe/");
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,"OrangeHRM");
        Thread.sleep(3000);

    }
    @AfterTest
    void closeBrowser(){
        driver.quit();
    }
}
