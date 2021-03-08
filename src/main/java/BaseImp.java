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
        return null;
    }

    @Override
    public WebDriver getDriver(String webDriver) {
        return null;
    }
}
