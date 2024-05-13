package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {

            ChromeOptions chromeOptions = new ChromeOptions();
//            chromeOptions.addArguments("--remote-allow-origins=*");
            chromeOptions.addArguments("--start-maximized");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
