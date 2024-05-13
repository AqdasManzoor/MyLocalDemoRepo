package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver = null;

    private final String loaderElement = "//p[contains(text(),'Loading...')]";


    public WebDriver getDriver() {
        return BrowserDriver.getDriver();
    }
    public void waitForElementIsInvisible(By elementLocator, int time, int interval) {
        WebDriver driver = getDriver();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, time, interval);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elementLocator));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void waitForPageToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, 20, 250);
        wait.until((ExpectedCondition<Boolean>) wdriver -> ((JavascriptExecutor) driver).executeScript(
                "return document.readyState"
        ).equals("complete"));
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        public By getLoader() {
        return By.xpath(loaderElement);
    }
}
