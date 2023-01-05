package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SupportTabPage extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public SupportTabPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Click_Support_Tab() throws InterruptedException {
        driver.findElement(By.xpath(Support_Label)).click();
        common.log("Clicked On Support Tab");
        Thread.sleep(3000);
    }

    public void Verify_Support_Tab(){
        common.isElementPresent(Support_Header);
        common.log("Support Header is Displayed");
        common.isElementPresent(User_Support_Button);
        common.log("User Support Button is Displayed");
        common.isElementPresent(Admin_Support_Button);
        common.log("Admin Support Button is Displayed");
        common.isElementPresent(First_Name_Field_Support);
        common.log("First Name Field is Displayed");
        common.isElementPresent(Last_Name_Field_Support);
        common.log("Last Name Field is Displayed");
        common.isElementPresent(Select_Team_Dropdown);
        common.log("Select Team Dropdown is Displayed");
        common.isElementPresent(Support_Description_Field);
        common.log("Description Field is Displayed");
    }

    public void Select_Support_Type_And_Verify_Them(){
        driver.findElement(By.xpath(User_Support_Button)).click();
        common.log("Selected General User Support");
        driver.findElement(By.xpath(User_Support_Button)).click();
        common.log("Now Selected Team Admin Support");
    }

    public void Enter_First_Name(){
        driver.findElement(By.xpath(First_Name_Field_Support)).clear();
        common.log("Cleared First Name Field");
        driver.findElement(By.xpath(First_Name_Field_Support)).sendKeys("Sagar");
        common.log("Entered First Name");
    }

    public void Enter_Last_Name(){
        driver.findElement(By.xpath(Last_Name_Field_Support)).clear();
        common.log("Cleared Last Name Field");
        driver.findElement(By.xpath(Last_Name_Field_Support)).sendKeys("Nandha");
        common.log("Entered Last Name");
    }

    public void Select_Team(){
        driver.findElement(By.xpath(Select_Team_Dropdown)).click();
        common.log("Clicked On Select Team Dropdown");
    }

    public void Enter_Support_Description(){
        driver.findElement(By.xpath(Support_Description_Field)).sendKeys("I need Support");
        common.log("Entered Support Description");
    }


}
