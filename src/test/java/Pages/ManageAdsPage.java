package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.apache.poi.ss.formula.functions.Na;
import org.openqa.selenium.By;

public class ManageAdsPage extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public ManageAdsPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Click_On_Manage_Ads_Tab() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.view.View[8]")).click();
        for (int i = 0; i < 6; i++) {
            driver.findElement(By.xpath("//android.view.View[9]")).click();
        }
        driver.findElement(By.xpath(Manage_Ads_Tab)).click();
        common.log("Mange Ads tab is opened.");
        Thread.sleep(3000);

    }

    public void Verify_Manage_Ads_Tab_Elements() throws InterruptedException {

        Thread.sleep(2000);
        common.isDisplayed(Search_Bar);
        common.log("Search bar is verified.");
        common.isDisplayed(Add_New_Ads_Button);
        common.log("Add new ads button is verified.");

    }

    public void Click_On_Add_New_Ads_Button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Add_New_Ads_Button)).click();
        common.log("Clicked on add new ads button.");
        common.isDisplayed(Add_Ads_Header);
        common.log("Add ads header is verified.");

    }

    public void Verify_Add_Ads_Page_Elements() throws InterruptedException {

        Thread.sleep(2000);
        common.isDisplayed(Name_Label);
        common.log("Name label is verified.");
        common.isDisplayed(Gender);
        common.log("Gender label is verified.");
        common.isDisplayed(Age_Label);
        common.log("Age label is verified.");
        common.isDisplayed(App_Ads_Image_Label);
        common.log("App ads image label is verified.");
        common.isDisplayed(Web_Ads_Image);
        common.log("Web ads image label is verified.");
        common.scrollDownMobile(driver);
        common.isDisplayed(Redirect_Url_Label);
        common.log("Redirect url label label is verified.");
        common.isDisplayed(Confirm_Button);
        common.log("Confirm button is verified.");

    }
    public void Click_On_Name_Label_And_Enter_data() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Name_Label)).click();
        common.log("Clicked on name label.");
        String Name=common.generateRandomChars(6);
        common.sendkeywords(driver,Name);
        common.log("Entered name is:-"+Name);

    }
    public void Click_On_Gender_Label_And_Verify_Elements() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Gender_Label)).click();
        common.log("Clicked on gender label.");
        common.isDisplayed(Search_Bar);
        common.log("Search bar is verified.");
        common.isDisplayed(Done_Button);
        common.log("Done link is verified.");
        common.isDisplayed(DeselectAll_Button);
        common.log("Deselect all button is verified.");

    }
    public void Verify_Scrollbar_Of_Age() throws InterruptedException {

        Thread.sleep(2000);
        common.Click_And_Slide(driver,632,933,"Tap on slider");
        String Age=driver.findElement(By.xpath(Range_Of_Age)).getText();
        common.log("Age after slide is:-"+Age);

    }

    public void Click_On_App_Ads_Image() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(App_Ads_Image_Label)).click();
        common.log("Clicked on app ads image field.");

    }
    public void Click_On_Web_Ads_Image() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Web_Ads_Image)).click();
        common.log("Clicked on app ads image field.");

    }
    public void Click_On_Back_Icon_of_Gallery() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Gallery_Back_Icon)).click();
        common.log("Clicked on back icon.");

    }
    public void Enter_Invalid_Redirect_Url() throws InterruptedException {

        Thread.sleep(2000);
        common.scrollDownMobile(driver);
        driver.findElement(By.xpath(Redirect_Url_Label)).click();
        common.log("Clicked on redirect url label.");
        common.sendkeywords(driver,"https://gooe.co.in/");
        common.log("Invalid url entered.");

    }
    public void Enter_Valid_Redirect_Url() throws InterruptedException {

        Thread.sleep(2000);
        common.scrollDownMobile(driver);
        driver.findElement(By.xpath(Redirect_Url_Label)).click();
        common.log("Clicked on redirect url label.");
        common.sendkeywords(driver,"https://www.google.co.in/");
        common.log("Valid url entered.");

    }
    public void Click_On_Back_Confirm_Button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Confirm_Button)).click();
        common.log("Clicked on confirm button.");

    }

}
