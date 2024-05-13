package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utility.BrowserDriver;


//import static utility.BrowserDriver.driver;

public class FirstPage extends BasePage{
    private final By leaveStatus = By.xpath("//div[text()='Select']");



    public By getLeaveStatus() {
        return leaveStatus;
    }
    public void createLeaveStatus() {

        WebDriver driver;
        driver = BrowserDriver.getDriver();
        WebElement enterStatus = driver.findElement(By.xpath("//div[text()='Select']"));
        enterStatus.click();

        enterStatus.sendKeys(Keys.DOWN);
        enterStatus.sendKeys(Keys.ENTER);
    }
    public void createLeaveType() {

        WebDriver driver;
        driver = BrowserDriver.getDriver();
        WebElement enterType = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
        enterType.click();

        enterType.sendKeys(Keys.DOWN);
        enterType.sendKeys(Keys.ENTER);
    }
    public void createEmployeeName() {
        WebDriver driver;
        driver = BrowserDriver.getDriver();

        WebElement usernameField = driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])"));

        usernameField.sendKeys("Aqdas Manzoor");


    }
}
