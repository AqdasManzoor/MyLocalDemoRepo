package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import pages.FirstPage;
import utility.BrowserDriver;

import java.util.Collections;
import java.util.Map;



public class FirstStep {

    FirstPage firstPage = new FirstPage();

      @Given("User open Orange HRM Home page")
    public void userOpenOrangeHRMPage() {

          WebDriver driver;
          driver = BrowserDriver.getDriver();
          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      }



    @When("User Login to the Orange HRM Home page")
    public void userLoginToTheOrangeHRMHomePage() {
        WebDriver driver;
        driver = BrowserDriver.getDriver();


        firstPage.waitForElementIsInvisible(firstPage.getLoader(), 50, 500);
        WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement loginField = driver.findElement(By.xpath("//button[starts-with(@class,'oxd-button')]"));
        usernameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");
        loginField.click();
    }
    @And("User Click on Leave Left Menu Button")
    public void userClicksOnLeaveLeftMenuButton() {
        WebDriver driver;
        driver = BrowserDriver.getDriver();

        firstPage.waitForElementIsInvisible(firstPage.getLoader(),30,400);
        WebElement buttonLeave = driver.findElement(By.xpath("//span[text()='Leave']"));
        buttonLeave.click();

    }
    @And("User Enter Status on Leave Page")
    public void userEnterStatusOnLeavePage() {

        firstPage.waitForElementIsInvisible(firstPage.getLoader(),30,400);
        firstPage.createLeaveStatus();

    }
    @And("User Select Leave Type on Leave Page")
    public void userSelectLeaveTypeOnLeavePage() {

        firstPage.waitForElementIsInvisible(firstPage.getLoader(),30,400);
        firstPage.createLeaveType();

    }
    @And("User Enter their name on Leave Page")
    public void userEnterTheirNameOnLeavePage() {

        firstPage.waitForElementIsInvisible(firstPage.getLoader(),30,400);
        firstPage.createEmployeeName();

    }

    @Then("Close Browser")
    public void closeBrowser() {

        BrowserDriver.quitDriver();
    }

}
