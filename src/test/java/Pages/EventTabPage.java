package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.text.ParseException;

public class EventTabPage extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public EventTabPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Click_On_Event_Tab_And_Verify(){
        driver.findElement(By.xpath(EVENT_Tab)).click();
        common.log("Event Tab Opened");
        common.isElementPresent(Add_New_Event);
        common.log("Add New Event is Displayed");
    }

    public void Search_Event() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Search_Bar)).sendKeys("Training");
        common.log("Searched Event");
    }

    public void Click_Sort_Button_Event(){
        driver.findElement(By.xpath(Sort_Event)).click();
        common.log("Sort Button in Event Clicked");
    }

    public void Click_Apply_Sort_Button_Event() throws InterruptedException {
        driver.findElement(By.xpath(Apply_Sort_And_Filter)).click();
        common.log("Apply Button is Clicked");
        Thread.sleep(3000);
    }

    public void Click_Reset_Sort_Button_Event() throws InterruptedException {
        driver.findElement(By.xpath(Reset_Sort_And_Filter)).click();
        common.log("Reset Button is Clicked");
        Thread.sleep(3000);
    }

    public void Verify_Sort_Event() throws InterruptedException {
        common.isElementPresent(Sort_Event_Type);
        common.log("Sort By Event Type is Displayed");
        common.isElementPresent(Apply_Sort_And_Filter);
        common.log("Apply Button is Displayed");
        common.isElementPresent(Reset_Sort_And_Filter);
        common.log("Reset button is Displayed");
    }

    public void Select_Past_Type_Event_Sort(){
        driver.findElement(By.xpath(Sort_By_Past_Event)).click();
        common.log("Sort Type Past is Selected");
    }

    public void Verify_Past_Type_Event_Sort() throws InterruptedException, ParseException {
        Thread.sleep(4000);
        String date = driver.findElement(By.xpath(Verify_Past_Date)).getText();
        common.Verify_Past_Date(date);
        common.log("Sort Type Past is Selected");
    }

    public void Select_Filter_As_Social_Event(){
        driver.findElement(By.xpath(Sort_Event_Filter_Dropdown)).click();
        common.log("CLicked On Filter Dropdown");
        driver.findElement(By.xpath(Filter_By_Social_Event)).click();
        common.log("Selected Social Event");
    }

    public void Click_On_Add_New_Event() throws InterruptedException {
        driver.findElement(By.xpath(Add_New_Event)).click();
        common.log("CLicked On Add New Event");
        Thread.sleep(3000);
        common.isElementPresent(Create_Event_Header);
        common.log("Create Event is Displayed");
    }

    public void Verify_Create_Event_Screen(){
        common.isElementPresent(Name_Field_Create_Event);
        common.log("Name Field Create Event is Displayed");
        common.isElementPresent(Location_Field_Create_Event);
        common.log("Location Field Create Event is Displayed");
        common.isElementPresent(Start_Date_Create_Event);
        common.log("Start Date Create Event is Displayed");
        common.isElementPresent(Start_Time_Create_Event);
        common.log("Start Time Create Event is Displayed");
    }

    public void Verify_Location_Field_Functionality() throws InterruptedException {
        driver.findElement(By.xpath(Location_Field_Create_Event)).click();
        common.log("CLicked On Location Field");
        Thread.sleep(3000);
        driver.findElement(By.id(Search_Location)).sendKeys("LasVegas");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Las Vegas Monorail\"]")).click();
        Thread.sleep(2000);
        common.isElementPresent("//android.widget.TextView[contains(@text,\"Las Vegas\")]");
        common.log("Selected Location is Displayed");
    }

    public void Verify_Start_And_End_Time_Is_Disabled_Before_Entering_Date() throws InterruptedException {
        common.scrollDownMobile(driver);
        driver.findElement(By.xpath(Start_Time_Create_Event)).click();
        driver.findElement(By.xpath(End_Time_Create_Event)).click();
        common.waitForElementIsNotDisplayed(Time_Picker);
        common.log("TIme Fields are not enabled");
    }

    public void Click_Cancel_Button_Date_Calender() throws InterruptedException {
        driver.findElement(By.xpath(Cancel_Button)).click();
        common.log("Clicked On Cancel Button of Calender");
        Thread.sleep(2000);
    }

    public void Select_Date() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id(Next_Arrow_Calender)).click();
        common.log("Clicked On Next Month Button of Calender");
        String Selected_Date = driver.findElement(By.xpath(Feb_Twenty_Eight)).getText();
        driver.findElement(By.xpath(Feb_Twenty_Eight)).click();
        common.log("Selected Date 28th Feb");
        driver.findElement(By.xpath(OK_Button)).click();
        common.log("Clicked On Ok");
        Thread.sleep(2000);
        common.isElementPresent("//android.widget.EditText[contains(@text,\"" + Selected_Date +"\")]");
        common.log("Date updated to New Selected Date");
    }

    public void Verify_Start_And_End_Date_Fields() throws InterruptedException {
        driver.findElement(By.xpath(Start_Date_Create_Event)).click();
        common.log("Clicked On Start Date");
        this.Click_Cancel_Button_Date_Calender();
        common.log("Calender Is opened");
        driver.findElement(By.xpath(End_Date_Create_Event)).click();
        common.log("Clicked On End Date");
        common.waitForElementIsNotDisplayed(Cancel_Button);
        common.log("End Date Field not enabled without selecting Start Date");
    }

    public void Select_Start_And_End_Date() throws InterruptedException {
        driver.findElement(By.xpath(Start_Date_Create_Event)).click();
        common.log("Clicked On Start Date");
        this.Select_Date();
        driver.findElement(By.xpath(End_Date_Create_Event)).click();
        common.log("Clicked On End Date");
        this.Select_Date();
    }

    public void Click_Start_Tme(){
        driver.findElement(By.xpath(Start_Time_Create_Event)).click();
        common.log("Clicked On Start Time");
    }

    public void Verify_Time_Fields() throws InterruptedException {
        this.Click_Start_Tme();
        common.isElementPresent(Time_Picker);
        common.log("Time Picker is displayed");
        common.isElementPresent(OK_Button);
        common.log("Ok Button is displayed");
        common.isElementPresent(Cancel_Button);
        common.log("Cancel Button is displayed");
        common.isElementPresent(Toggle_Between_Clock_And_Keyboard);
        common.log("Switch Keyboard is displayed");
    }

    public void Click_Keyboard_Icon_Time_Picker() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id(Toggle_Between_Clock_And_Keyboard)).click();
        common.log("Clicked On Switch Keyboard Icon");
    }

    public void Verify_Keyboard_Input_popup_Time() throws InterruptedException {
        this.Click_Keyboard_Icon_Time_Picker();
        common.isElementPresent(Input_Hour);
        common.log("Input Hour Field is displayed");
        common.isElementPresent(Input_Minute);
        common.log("Input Minute Field  is displayed");
        common.isElementPresent(Toggle_Between_Clock_And_Keyboard);
        common.log("Switch to Clock is displayed");
    }

    public void Select_Time() throws InterruptedException {
        driver.findElement(By.xpath(Select_Hour_As_3)).click();
        common.log("Selected hour as 3");
        driver.findElement(By.xpath(Select_Minute_As_15)).click();
        common.log("Selected minute as 15");
        driver.findElement(By.xpath(OK_Button)).click();
        common.log("Clicked On Ok");
    }

    public void Select_Unlimited_Capacity_As_No(){
        driver.findElement(By.xpath(Capacity_Dropdown_Create_Event)).click();
        common.log("Clicked on unlimited capacity dropdown");
        driver.findElement(By.xpath(Publish_Now_No_Option)).click();
        common.log("Selected No option");
        common.isElementPresent(Capacity_Field);
        common.log("Capacity field is displayed");
    }

    public void Select_Event_Types_As_Game(){
        driver.findElement(By.xpath(Type_Dropdown_Create_Event)).click();
        common.log("Clicked On Type Dropdown");
        driver.findElement(By.xpath(Event_Type_Game_Option)).click();
        common.log("Selected Game option");
    }

    public void Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next() throws InterruptedException {
        driver.findElement(By.xpath(Name_Field_Create_Event)).sendKeys("New Sports Event");
        common.log("Entered New Event Name");
        this.Verify_Location_Field_Functionality();
        this.Select_Event_Types_As_Game();
        this.Select_Start_And_End_Date();
        this.Click_On_Next_Button();
        Thread.sleep(5000);
    }

    public void Select_Event_Repeats(){
        driver.findElement(By.xpath(Event_Repeat_Dropdown)).click();
        common.log("Clicked On Repeats Dropdown");
        driver.findElement(By.xpath(Repeat_Daily_Option)).click();
        common.log("Selected Daily option");
        common.isElementPresent(How_Many_Times_Field);
    }

    public void Enter_How_Many_Times_Event_Repeats(){
        driver.findElement(By.xpath(How_Many_Times_Field)).sendKeys("5");
        common.log("Entered How many times event should be repeated that is 5");
    }

    public void Click_No_For_Sent_Email() throws InterruptedException {
        driver.findElement(By.xpath(Send_Email_No)).click();
        common.log("Clicked On No Button to Send Email");
    }

    public void Click_No_For_Sent_Notifications() throws InterruptedException {
        driver.findElement(By.xpath(Send_Notification_No)).click();
        common.log("Clicked On No Button to Send Notification");
    }

    public void Click_No_For_Allow_Comments() throws InterruptedException {
        common.scrollDownMobile(driver);
        driver.findElement(By.xpath(Send_Notification_No)).click();
        common.log("Clicked On No Button to Allow Comments");
    }

    public void Select_Coaches(){
        driver.findElement(By.xpath(Event_Coaches_Dropdown)).click();
        common.log("Clicked On Repeats Dropdown");
        driver.findElement(By.xpath(SelectAll_Button)).click();
        common.log("Selected All");
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked On Dome Button");
    }

    public void Select_To_Whom_Event_Is_Visible(){
        driver.findElement(By.xpath(Event_Visible_To_Dropdown)).click();
        common.log("Clicked On Visible Dropdown");
        driver.findElement(By.xpath(SelectAll_Button)).click();
        common.log("Selected All");
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked On Dome Button");
    }

    public void Click_Preview_Button() throws InterruptedException {
        common.scrollDownMobile(driver);
        driver.findElement(By.xpath(Preview_Button)).click();
        common.log("Clicked On Preview Button");
    }

    public void Click_On_Next_Button() throws InterruptedException {
        driver.findElement(By.xpath(Next_Button)).click();
        common.log("Clicked On Next Button");
    }

    public void Enter_Valid_Data_In_Second_Page_Create_Event_And_Click_On_Preview() throws InterruptedException {
        this.Select_Event_Repeats();
        this.Enter_How_Many_Times_Event_Repeats();
        this.Select_Coaches();
        this.Select_To_Whom_Event_Is_Visible();
        this.Click_Preview_Button();
        Thread.sleep(2000);
    }

    public void Verify_Event_Created(){
        common.isElementPresent(Event_Successfully_Creates_Message);
        common.log("Event Successfully Created");
    }

    public void Verify_New_Event_Banner() throws InterruptedException {
        Thread.sleep(4000);
        common.isElementPresent(New_Event_Banner);
        common.log("New Event Banner Displayed");
    }

    public void Click_On_Old_Event() throws InterruptedException {
        driver.findElement(By.xpath(Old_Event)).click();
        common.log("Clicked On Old Event");
        Thread.sleep(4000);
    }

    public void Verify_Add_To_Calender_In_Past_Event(){
        driver.findElement(By.xpath(Add_TO_Calender_Button)).click();
        common.log("Clicked On Old Event");
    }

    public void Click_Respond_Button(){
        driver.findElement(By.xpath(Respond_Button)).click();
        common.log("Clicked On Respond Button");
        common.isElementPresent(Respond_Screen_Header);
        common.log("Submit a respond screen is displayed");
    }

    public void Verify_Respond_Screen(){
        common.isElementPresent(Select_Attendees_Dropdown);
        common.log("SSelect Attendees dropdown is displayed");
        common.isElementPresent(Availability_Dropdown);
        common.log("Submit a respond screen is displayed");
        common.isElementPresent(Add_Note_TextField);
        common.log("Submit a respond screen is displayed");
    }

    public void Open_An_Event() throws InterruptedException {
        driver.findElement(By.xpath("//android.view.View[10]/android.view.View[2]/android.widget.Button")).click();
        common.log("Event Opened");
        Thread.sleep(4000);
    }

    public void Click_Select_Attendees_Dropdown() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(Select_Attendees_Dropdown)). click();
        common.log("Select Attendees Dropdown Opened");
        Thread.sleep(1000);
    }

    public void Select_Attendees() throws InterruptedException {
        driver.findElement(By.xpath(Search_Bar)).sendKeys("Sagar");
        common.log("Searched Attendee");
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,\"Sagar\")]")).click();
        common.log("Attendee Selected");
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked On Done Button");
    }

    public void Select_Availability() throws InterruptedException {
        driver.findElement(By.xpath(Availability_Dropdown)).click();
        common.log("Availability Dropdown Opened");
        Thread.sleep(1000);
        driver.findElement(By.xpath(Unavailable_Option)).click();
        common.log("Unavailable option selected");
    }

    public void Add_Note_In_Response(){
        driver.findElement(By.xpath(Add_Note_TextField)).sendKeys("My Response");
        common.log("Response Note");
    }

    public void Click_Overview_Button(){
        driver.findElement(By.xpath(Overview_Button)).click();
        common.log("Clicked On Overview Button");
    }

    public void Click_Back_Button_From_Events(){
        driver.findElement(By.xpath(Back_Button_Event)).click();
        common.log("Clicked On Back Button");
    }

    public void Verify_Navigation_To_Next_Tab(){
        driver.findElement(By.xpath(Navigation_Right_Arrow)).click();
        common.log("Clicked On Next Arrow Button for next tab");
    }

    public void Verify_Navigation_To_Previous_Tab() throws InterruptedException {
        driver.findElement(By.xpath(Navigation_Right_Arrow)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(Navigation_Right_Arrow)).click();
        common.log("Clicked On Next Arrow Button for next tab");
    }



}