package ParallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest2 {
    WebDriver driver;

    @AfterTest
    void userName() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/EJAJUL HAQUE" + "/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe/");
        driver=new ChromeDriver();
        driver.get("\"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"");
        WebElement user=driver.findElement(By.xpath("//input[@placeholder='Username']"));
        user.sendKeys("Admin");
        Thread.sleep(3000);
    }
    @Test
    void password() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/EJAJUL HAQUE" + "/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe/");
        driver=new ChromeDriver();
        driver.get("\"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"");
        WebElement pass=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        pass.sendKeys("admin123");
        Thread.sleep(3000);
    }
    @Test
    void closeBrowser(){
        driver.quit();
    }
}
