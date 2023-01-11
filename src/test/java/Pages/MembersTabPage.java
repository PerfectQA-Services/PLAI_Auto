package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MembersTabPage extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public MembersTabPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Open_Members_Tab() throws InterruptedException {
        driver.findElement(By.xpath(MEMBERS_Tab)).click();
        common.log("Clicked On Members Tabb");
    }

    public void Verify_Members_Tab(){
        common.isElementPresent(Members_Banner);
        common.log("Members banner is present");
        common.isElementPresent(Member_Delete_Button);
        common.log("Member delete button is present");
        common.isElementPresent(Invite_Member_Button);
        common.log("Invite Member button is present");
    }

    public void Search_Member(){
        driver.findElement(By.xpath(Search_Bar)).sendKeys("Sagar");
        common.log("Searched Member");
        common.isElementPresent(Members_Banner);
        common.log("Searched Member banner is present");
    }

    public void Verify_Edit_Button_In_Member_Banner() throws InterruptedException {
        common.isElementPresent(Member_Edit_Button);
        common.log("Member Edit Button In Banner is present");
        driver.findElement(By.xpath(Member_Edit_Button)).click();
        common.log("Member Edit Button Clicked");
        Thread.sleep(3000);
    }

    public void Verify_Delete_Button_In_Member_Banner(){
        common.isElementPresent(Member_Delete_Button);
        common.log("Member Delete Button In Banner is present");
        driver.findElement(By.xpath(Member_Delete_Button)).click();
        common.log("Member Delete Button Clicked");
    }

    public void Click_Save_Button() throws InterruptedException {
        driver.findElement(By.xpath(Save_Edit_Button)).click();
        common.log("Save Button Clicked");
        Thread.sleep(3000);
    }

    public void Verify_Make_This_Member_Admin_Functionality() throws InterruptedException {
        if(common.isElementPresent(Member_Tag_On_Banner)){
            this.Verify_Edit_Button_In_Member_Banner();
            driver.findElement(By.xpath(Make_Admin_Checkbox)).click();
            this.Click_Save_Button();
            common.log("Member Saved as Admin");
        }
        else if(!common.isElementPresent(Admin_Tag_On_Banner)){
            this.Verify_Edit_Button_In_Member_Banner();
            driver.findElement(By.xpath(Make_Admin_Checkbox)).click();
            this.Click_Save_Button();
            common.log("Member Removed as Admin");
            this.Verify_Edit_Button_In_Member_Banner();
            driver.findElement(By.xpath(Make_Admin_Checkbox)).click();
            this.Click_Save_Button();
            common.log("Member Saved as Admin");
        }
    }

    public void Click_Groups_Dropdown_In_Edit(){
        driver.findElement(By.xpath(Groups_Dropdown_Edit_Member)).click();
        common.log("CLicked On Group Dropdown");
    }

    public void Add_New_Custom_Field(){
        driver.findElement(By.xpath(Custom_Name_Field)).sendKeys("Custom Field");
        common.log("Entered Custom Field Name");
        driver.findElement(By.xpath(Custom_Value_Field)).sendKeys("Custom Value");
        common.log("Entered Custom Field Value");
    }

    public void Click_Add_Button(){
        driver.findElement(By.xpath(Add_Button)).click();
        common.log("Clicked ON Add button");
    }

    public void Verify_Custom_Field_Delete_Button(){
        common.isElementPresent(Delete_Button_Custom_Field);
        common.log("Delete Button of custom created field is displayed");
    }

    public void Click_Custom_Field_Delete_Button(){
        driver.findElement(By.xpath(Delete_Button_Custom_Field)).click();
        common.log("Clicked Delete Button of custom created field");
    }

    public void Click_Invite_Member_Button() throws InterruptedException {
        driver.findElement(By.xpath(Invite_Member_Button)).click();
        common.log("Clicked Invite Member Button");
        Thread.sleep(3000);
    }

    public void Verify_Invite_Member_Screen(){
        common.isElementPresent(Invite_Member_Header);
        common.log("Invite Member Screen is Displayed");
        common.isElementPresent(First_Name_Field_Invite_Member);
        common.log("First Name Field is Displayed");
        common.isElementPresent(Last_Name_Field_Invite_Member);
        common.log("Last Name Field is Displayed");
        common.isElementPresent(Email_Field_Invite_Member);
        common.log("Email Field is Displayed");
        common.isElementPresent(Mobile_Number_Field_Invite_Member);
        common.log("Mobile Number Field is Displayed");
        common.isElementPresent(Groups_Dropdown_Invite_Member);
        common.log("Groups Dropdown is Displayed");
    }

    public void Verify_Country_Code_List(){
        driver.findElement(By.xpath(Country_Code_Dropdown_Invite_Member)).click();
        common.log("Clicked Country Code Dropdown");
        common.isElementPresent(Country_Selected);
        common.log("Country Codes are Displayed");
    }

    public void Click_Back_Button() {
        driver.findElement(By.xpath(back_icon)).click();
        common.log("Clicked Back Button");
    }

    public void Click_Back_Button_From_Country_Code() {
        driver.findElement(By.xpath("//android.view.View[1]/android.widget.Button")).click();
        common.log("Clicked Back Button from country code list");
    }

    public void Verify_Search_Icon() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(By.xpath(Search_Icon)).click();
        common.log("Clicked Search Icon");
        driver.findElement(By.xpath(Search_Field_Country_Code)).sendKeys("France");
        common.log("Searched France");
        common.isElementPresent("//android.widget.TextView[@text=\"+33\"]");
        common.log("Selected Country Code is displayed");
    }

    public void Click_Mobile_Number_Field() {
        driver.findElement(By.xpath(Mobile_Number_Field_Invite_Member)).click();
        common.log("Clicked Mobile Number Field");
    }

    public void Click_Group_Dropdown_Field() {
        driver.findElement(By.xpath(Groups_Dropdown_Invite_Member)).click();
        common.log("Clicked Group_Dropdown");
        common.isElementPresent(done_link);
        common.log("Groups_Dropdown Opened");
    }

    public void Click_Make_Admin_Checkbox(){
        driver.findElement(By.xpath(Make_Admin_Checkbox)).click();
        common.log("Clicked On Make Admin Checkbox");
    }

    public void Click_Submit_Button(){
        driver.findElement(By.xpath(Submit_Button_Invite_Member)).click();
        common.log("Clicked On Subbmit Button");
    }

    public void Invite_Member(){
        driver.findElement(By.xpath(First_Name_Field_Invite_Member)).sendKeys("Test");
        common.log("Entered First Name : Test");
        driver.findElement(By.xpath(Last_Name_Field_Invite_Member)).sendKeys("Auto");
        common.log("Entered Last Name : Auto");
        driver.findElement(By.xpath(Email_Field_Invite_Member)).sendKeys("sagarnandha11+1@gmail.com");
        common.log("Entered Email : sagarnandha11+1@gmail.com");
        driver.findElement(By.xpath(Mobile_Number_Field_Invite_Member)).sendKeys("1234567890");
        common.log("Entered Mobile Number : 1234567890");
        driver.findElement(By.xpath(Groups_Dropdown_Invite_Member)).click();
        driver.findElement(By.xpath(SelectAll_Button)).click();
        common.log("Selected All Groups");
        driver.findElement(By.xpath(done_link)).click();
        driver.findElement(By.xpath(Make_Admin_Checkbox)).click();
        common.log("Checked Admin checkbox");
        driver.findElement(By.xpath(Submit_Button_Invite_Member)).click();
        common.log("Clicked On Submit button");
    }



}