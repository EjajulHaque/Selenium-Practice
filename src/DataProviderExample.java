import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @Test(dataProvider = "LoginDataProvider",dataProviderClass = CustomDataProvider.class)
    public void loginTest(String gmail,String pass){
        System.out.println(gmail+"    "+pass);
    }

}
