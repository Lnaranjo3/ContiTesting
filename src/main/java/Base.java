import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public interface Base {

    Properties loadLoginProperties() throws IOException;

    WebDriver getDriver(String webDriver);
}
