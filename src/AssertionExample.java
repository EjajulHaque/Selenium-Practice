import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionExample {

    WebDriver driver;

    @BeforeClass
    void setup(){
        System.setProperty("webdriver.chrome.driver","C:/Users/EJAJUL HAQUE" + "/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe/");
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
    @Test
    void logoTest(){
       WebElement logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-slot-wrapper']"));
        Assert.assertTrue(logo.isDisplayed(),"logo not displayed on the page");
    }
    @Test
    void homePageTitle(){
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,"OrangeHRM");
    }
    @Test
    void userName(){
        WebElement user=driver.findElement(By.xpath("//input[@placeholder='Username']"));
        user.sendKeys("Admin");
    }
    @Test
    void password(){
       WebElement pass=driver.findElement(By.xpath("//input[@placeholder='Password']"));
       pass.sendKeys("admin123");
    }
    @Test
    void loginButton(){
       WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
       login.click();
    }
    @AfterClass
    void closeBrowser(){
        driver.quit();
    }
}
