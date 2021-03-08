import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseImp implements Base {

    @Override
    public Properties loadLoginProperties() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(
                System.getProperty("user.dir") + "/src/test/resources/properties/login.properties");
        properties.load(fileInputStream);
        return properties;
    }

    @Override
    public WebDriver getDriver(String webDriver) {
        if (webDriver.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        else if (webDriver.equals("edge")){
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }
        else {
            System.out.println("Select driver");
            return null;
        }
    }
}
