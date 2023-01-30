package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class NewsTabPage_New_Sprint extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public NewsTabPage_New_Sprint(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Click_On_Pin_Icon() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Pin_Icon)).click();
        common.log("Clicked on pin icon.");

    }
    public void Click_On_Pin_Icon_Of_Second_Banner() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Pin_Icon_1)).click();
        common.log("Clicked on pin icon of second banner.");

    }

    public void Verify_Upload_Documents() throws InterruptedException {
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        driver.findElement(By.xpath(Documents_Upload)).click();
        common.log("Clicked on Documents upload");
        driver.findElement(By.xpath(My_File_Option)).isDisplayed();
        common.log("File manager is opened");

    }

}
