package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SettingPage extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public SettingPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Click_On_Setting_Icon() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(Settings_Icon_Button)).click();
        common.log("Clicked On setting icon.");

    }

    public void Verify_Setting_Header() throws InterruptedException {

        Thread.sleep(2000);
        common.isElementPresent(Setting_Header);
        common.log("Setting page is opened.");

    }

    public void Verify_Setting_Page_Element() throws InterruptedException {

        Thread.sleep(2000);
        common.isElementPresent(Logout_Button);
        common.log("Logout button is Verified.");
        common.isElementPresent(My_Orders_Label);
        common.log("My Orders text is verified");
        common.isElementPresent(Report_An_Issue_Label);
        common.log("Report an issue text is verified.");
        common.isElementPresent(Submit_A_Feature_Request);
        common.log("Submit a feature request text is verified.");
        common.isElementPresent(Legal_Label);
        common.log("Legal text is verified.");
        common.isElementPresent(Change_Password_Label);
        common.log("Change password text is verified.");
        common.isElementPresent(Support_Label);
        common.log("Support text is verified.");
        common.isElementPresent(Facebook_Icon);
        common.log("Facebook icon is verified.");
        common.isElementPresent(Twitter_Icon);
        common.log("Twitter icon is verified.");
        common.isElementPresent(Instagram_Icon);
        common.log("Instagram icon is verified.");
        common.isElementPresent(Youtube_Icon);
        common.log("You tube icon is verified.");


    }

    public void Click_On_Report_An_Issue_Label() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(Report_An_Issue_Label)).click();
        common.log("Clicked On report an issue.");
        common.isElementPresent(FeedBack_Form_Header);
        common.log("FeedBack form header is verified.");

    }


}
