package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.BrowserDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FileUploadPage extends BasePage{



    public void clickChooseFileButton() {

        WebDriver driver;
        driver = BrowserDriver.getDriver();

        WebElement fileBtn = driver.findElement(By.xpath("//input[@id='uploadFile']"));
        Actions act =new Actions(driver);
        act.moveToElement(fileBtn).click().perform();
    }

    public void uploadFile() throws AWTException {
        BrowserDriver.getDriver();

        Robot rb =new Robot();
        rb.delay(3000);
        StringSelection ss =new StringSelection("C:\\Users\\AqdasManzoor\\FileUploadDemoFile.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }
     public void verifyFileUploaded() {
         WebDriver driver;
         driver = BrowserDriver.getDriver();

        String expectedText = "C:\\fakepath\\FileUploadDemoFile.txt";
        WebElement uploadedFileInfo = driver.findElement(By.xpath("//p[@id='uploadedFilePath']"));
        String actualFileName = uploadedFileInfo.getText();
         System.out.println(actualFileName);

        if (actualFileName.equals(expectedText)) {
            System.out.println("File uploaded successfully. Verification passed!");
        } else {
            System.out.println("File upload verification failed. Expected: " + expectedText
                    + ", Actual: " + actualFileName);
        }
        }
    public void getScreenShot() throws AWTException, IOException {
        BrowserDriver.getDriver();
      //screenshot of specific part

        Robot robot =new Robot();
        robot.delay(5000);
        Rectangle rectangle=new Rectangle(25,50,1000,300);
         BufferedImage srcImage =robot.createScreenCapture(rectangle);
        ImageIO.write(srcImage,"PNG",new File("./ScreenShots/robot.png"));
     //screenshot of full screen

        Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangles=new Rectangle(d);
        BufferedImage srcImages =robot.createScreenCapture(rectangles);
        ImageIO.write(srcImages,"PNG",new File("./ScreenShots/robot2.png"));

    }
    public void getPageScrolling() throws AWTException {
        BrowserDriver.getDriver();

        Robot robot =new Robot();
        robot.mouseWheel(15);
        robot.delay(3000);
        robot.mouseWheel(-8);

    }
    public void getRightClick(){
        WebDriver driver;
        driver = BrowserDriver.getDriver();

        Actions act=new Actions(driver);
        WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
        act.contextClick(button).build().perform();
    }
    public void getOptions(){
        WebDriver driver;
        driver = BrowserDriver.getDriver();

        WebElement button=driver.findElement(By.xpath("//span[text()='Edit']/parent::li"));
        button.click();
    }
    public void verifyOptionIsSelected(){
        WebDriver driver;
        driver = BrowserDriver.getDriver();

        driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
    }
    public void getDragAndDropBox(){
        WebDriver driver;
        driver = BrowserDriver.getDriver();

        WebElement source=driver.findElement(By.xpath("//div[@id='box1']"));
        WebElement source1=driver.findElement(By.xpath("//div[@id='box2']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='box103']"));
        WebElement target1=driver.findElement(By.xpath("//div[@id='box102']"));
        Actions act=new Actions(driver);
        act.clickAndHold(source).moveToElement(target).release().build().perform();

        act.dragAndDrop(source1,target1).build().perform();

    }

}
