import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData(){
        Object[][] data={{"gulab@gmail.com","gulab"},{"xyz@gmail.com","xyz"},{"kahkashan@gmail.com","kahkashan"}};
        return data;
    }
}
