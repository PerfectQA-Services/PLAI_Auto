package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class GroupTabPage extends Abstract {

    public AppiumDriver driver;
    Common common = new Common();

    public GroupTabPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Open_Group_Tab() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.view.View[6]")).click();
        for(int i=0;i<5;i++){
            driver.findElement(By.xpath("//android.view.View[7]")).click();
        }
        driver.findElement(By.xpath(Groups_Tab)).click();
        common.log("Clicked On Group Tab");

    }

    public void Verify_Element_of_Group_Tab() throws InterruptedException {

        Thread.sleep(2000);
        common.isElementDisplayed(Search_Bar);
        common.log("Search bar is verified.");
        common.isElementDisplayed(Edit_Icon);
        common.log("Edit icon is verified.");
        common.isElementDisplayed(Delete_Icon);
        common.log("Delete icon is verified.");
        common.isElementDisplayed(Add_New_Group_Button);
        common.log("Add new group button is verified.");

    }

    public void Verify_UP_And_Down_Arrow_of_Group_Tab() throws InterruptedException {

        Thread.sleep(2000);
        common.isElementDisplayed(Up_Arrow);
        common.log("Up arrow is verified.");
        common.isElementDisplayed(Down_Arrow);
        common.log("Down Arrow is verified.");

    }

    public void Enter_Group_Name_In_Serachbar_Verify_Result() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Search_Bar)).click();
        common.log("Clicked On search bar.");
        common.sendkeywords(driver,"Group 2");
        driver.hideKeyboard();
        common.log("Group name entered.");
        common.isElementDisplayed(Group_Banner);
        common.log("Group is verified.");

    }

    public void Click_On_Group_And_Verify_Group_Information() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Group_Banner)).click();
        common.log("Clicked On group");
        common.isElementDisplayed(Group_Information);
        common.log("Group information is verified.");

    }

    public void Click_On_Delete_Icon() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Delete_Icon)).click();
        common.log("Clicked On Delete icon.");

    }

    public void Verify_Dismiss_And_Confirm_Button() throws InterruptedException {

        Thread.sleep(2000);
        common.isElementDisplayed(Dismiss_Button);
        common.log("Dismiss button is verified");
        common.isElementDisplayed(Confirm_Button);
        common.log("Confirm button is verified");

    }

    public void Click_On_Dismiss_Button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Dismiss_Button)).click();
        common.log("Clicked On Dismiss button.");

    }

    public void Click_On_Confirm_Button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Confirm_Button)).click();
        common.log("Clicked On confirm button.");

    }

    public void Click_On_Edit_Icon_Verify_Result() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Edit_Icon)).click();
        common.log("Clicked On Edit icon.");
        common.isElementDisplayed(Edit_Group_Popup);
        common.log("Edit Group popup is verified.");

    }

    public void Verify_Edit_Group_Popup_Element() throws InterruptedException {

        Thread.sleep(2000);
        common.isElementDisplayed(Group_Name_Field);
        common.log("Group name field is verified");
        common.isElementDisplayed(Group_Description);
        common.log("Group description field is verified");
        common.isElementDisplayed(Confirm_Button);
        common.log("Confirm button is verified");

    }

    public void Enter_Data_In_Edit_Group_Popup_Element() throws InterruptedException {

        Thread.sleep(2000);
        String Description=common.generateRandomChars(6);
        driver.findElement(By.xpath(Group_Name_Field)).clear();
        driver.findElement(By.xpath(Group_Name_Field)).click();
        common.log("Clicked On Group name field.");
        common.sendkeywords(driver,"Group Test"+Description);
        driver.hideKeyboard();
        common.log("Group name entered.");
        driver.findElement(By.xpath(Group_Description)).clear();
        driver.findElement(By.xpath(Group_Description)).click();
        common.log("Clicked On Group description field.");
        common.sendkeywords(driver,Description);
        driver.hideKeyboard();
        common.log("Entered description is:-"+Description);
        driver.findElement(By.xpath(Confirm_Button)).click();
        common.log("Clicked On confirm button.");

    }

    public void Enter_20_Letter_In_Edit_Group_Description() throws InterruptedException {

        Thread.sleep(2000);
        int num=common.GenerateRandomNumber(2);
        String Description=common.generateRandomChars(21);
        driver.findElement(By.xpath(Group_Name_Field)).clear();
        driver.findElement(By.xpath(Group_Name_Field)).click();
        common.log("Clicked On Group name field.");
        common.sendkeywords(driver,"Group Test"+num);
        driver.hideKeyboard();
        common.log("Group name entered.");
        driver.findElement(By.xpath(Group_Description)).clear();
        driver.findElement(By.xpath(Group_Description)).click();
        common.log("Clicked On Group description field.");
        common.sendkeywords(driver,Description);
        driver.hideKeyboard();
        common.log("Entered description is:-"+Description);
        driver.findElement(By.xpath(Confirm_Button)).click();
        common.log("Clicked On confirm button.");

    }

    public void Enter_More_Than_70_Letter_In_Edit_Group_Description() throws InterruptedException {

        Thread.sleep(2000);
        String Description=common.generateRandomChars(73);
        int num=common.GenerateRandomNumber(2);
        driver.findElement(By.xpath(Group_Name_Field)).clear();
        driver.findElement(By.xpath(Group_Name_Field)).click();
        common.log("Clicked On Group name field.");
        common.sendkeywords(driver,"Group Test"+num);
        driver.hideKeyboard();
        common.log("Group name entered.");
        driver.findElement(By.xpath(Group_Description)).clear();
        driver.findElement(By.xpath(Group_Description)).click();
        common.log("Clicked On Group description field.");
        common.sendkeywords(driver,Description);
        driver.hideKeyboard();
        common.log("Entered description is:-"+Description);
        driver.findElement(By.xpath(Confirm_Button)).click();
        common.log("Clicked On confirm button.");

    }

    public void Verify_Close_Button() throws InterruptedException {

        Thread.sleep(2000);
        common.isElementDisplayed(Close_Button);
        common.log("Close button is verified.");

    }
    public void Click_On_Close_Button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Close_Button)).click();
        common.log("Clicked On Close button.");

    }

    public void Click_On_Add_New_Group_Button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Add_New_Group_Button)).click();
        common.log("Clicked On add new group button.");
        common.isElementDisplayed(Edit_Group_Popup);
        common.log("Add new group popup is verified.");

    }

    public void Verify_Social_Media_Icon() throws InterruptedException {

        Thread.sleep(2000);
        common.isElementPresent(Social_Media_Icon_Facebook);
        common.log("Facebook icon is Displayed");
        common.isElementPresent(Social_Media_Icon_Twitter);
        common.log("Twitter icon is Displayed");
        common.isElementPresent(Social_Media_Icon_Instagram);
        common.log("Instagram icon is Displayed");
        common.isElementPresent(Social_Media_Icon_YouTube);
        common.log("Youtube icon is Displayed");

    }




}
