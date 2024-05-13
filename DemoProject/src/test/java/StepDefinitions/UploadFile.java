package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.FileUploadPage;
import utility.BrowserDriver;

import java.awt.*;
import java.io.IOException;

public class UploadFile {
    FileUploadPage fileUploadPage = new FileUploadPage();

    @Given("User open Demo QA Home page")
    public void userOpenDemoQAHomePage() {

        WebDriver driver;
        driver = BrowserDriver.getDriver();
        driver.get("https://demoqa.com/upload-download");
    }
    @When("User clicks on Choose File Button")
    public void userClicksOnChooseFileButton() {
         fileUploadPage.clickChooseFileButton();
       }
    @And("User upload file by clicking on choose file Button")
    public void userUploadFileByClickingOnChooseFileBtn() throws AWTException {
          fileUploadPage.uploadFile();

    }
    @Then("User verify the file is successfully upload")
    public void userVerifyTheFileIsUpload() {
        fileUploadPage.waitForElementIsInvisible(fileUploadPage.getLoader(),30,400);
        fileUploadPage.verifyFileUploaded();

    }
    @Given("User open Demo QA Tutorial site")
    public void userOpenDemoQATutorialSite() {

        WebDriver driver;
        driver = BrowserDriver.getDriver();
        driver.get("https://tutorialsninja.com/demo/");
    }
    @When("User can take screenShot of website")
    public void userCanTakeScreenShot() throws AWTException, IOException {
        fileUploadPage.waitForElementIsInvisible(fileUploadPage.getLoader(),50,400);
         fileUploadPage.getScreenShot();

    }
    @When("User can Scroll website")
    public void userCanScrollWebsite() throws AWTException {
         fileUploadPage.getPageScrolling();

    }
    @Given("User open Demo Context Menu Website")
    public void userOpenDemoContextMenuWebSite() {

        WebDriver driver;
        driver = BrowserDriver.getDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
    }
    @When("User can right click on button")
    public void userCanRightClickOnButton(){
        fileUploadPage.getRightClick();

    }
    @When("User select dropdown list option")
    public void userSelectDropDownListOption(){
        fileUploadPage.getOptions();

    }
    @When("User verify that the option is selected")
    public void userVerifyTheOption(){
        fileUploadPage.verifyOptionIsSelected();

    }
    @Given("User open Drag And Drop Website")
    public void userOpenDragAndDropWebSite() {

        WebDriver driver;
        driver = BrowserDriver.getDriver();
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
    }
    @When("User can drag and drop")
    public void userCanDragAndDrop(){
        fileUploadPage.getDragAndDropBox();

    }
}
