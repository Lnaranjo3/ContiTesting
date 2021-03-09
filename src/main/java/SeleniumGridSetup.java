import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridSetup {

    ThreadLocal <WebDriver> threadLocal = new ThreadLocal<>();

    public WebDriver gridSetUp(WebDriver webDriver, String proxyVal,
                               String browser, Platform platform,
                               String hubUrl) throws MalformedURLException {

        ChromeOptions chromeOptions = new ChromeOptions();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        Proxy proxy = new Proxy();
        proxy.setHttpProxy(proxyVal);
        proxy.setSslProxy(proxyVal);
        chromeOptions.setCapability(CapabilityType.PROXY, proxy);

        desiredCapabilities.setBrowserName(browser);
        desiredCapabilities.setPlatform(platform);

        chromeOptions.merge(desiredCapabilities);

        webDriver = new RemoteWebDriver(new URL(hubUrl), chromeOptions);

        return webDriver;
    }
}
