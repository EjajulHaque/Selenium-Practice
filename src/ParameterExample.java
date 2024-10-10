import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser,String app) {

        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "C:/Users/EJAJUL HAQUE" + "/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe/");
            driver = new ChromeDriver();
            // we can create multiple browser like firefox inside else-if condition and we can also run testng xml file with multiple browser
        }
        driver.get(app);
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
