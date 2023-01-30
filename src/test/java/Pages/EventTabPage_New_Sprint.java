package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class EventTabPage_New_Sprint extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public EventTabPage_New_Sprint(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Click_On_Event_Tab() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(EVENT_Tab)).click();
        common.log("Event Tab Opened");

    }

    public void Click_On_Calender_Sync_Icon() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(Calendar_Sync_Icon)).click();
        common.log("Clicked on calender sync icon.");

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

        Thread.sleep(2000);
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
    public void Select_Event_Repeats(){
        driver.findElement(By.xpath(Event_Repeat_Dropdown)).click();
        common.log("Clicked On Repeats Dropdown");
        driver.findElement(By.xpath(Repeat_Daily_Option)).click();
        common.log("Selected Daily option");
        common.isElementPresent(How_Many_Times_Field);
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

    public void Select_Start_And_End_Date() throws InterruptedException {
        driver.findElement(By.xpath(Start_Date_Create_Event)).click();
        common.log("Clicked On Start Date");
        this.Select_Date();
    }

    public void Click_Start_Time(){
        driver.findElement(By.xpath(Start_Time_Create_Event)).click();
        common.log("Clicked On Start Time");
    }

    public void Enter_Valid_Data_In_Second_Page_Create_Event_And_Click_On_Preview_Reminder_Notification_Yes() throws InterruptedException {
        this.Select_Event_Repeats();
        this.Enter_How_Many_Times_Event_Repeats();
        this.Select_Coaches();
        this.Select_To_Whom_Event_Is_Visible();
        common.scrollDownMobile(driver);
        driver.findElement(By.xpath(Reminder_Notification_Yes_Button)).click();
        common.log("Clicked on yes button of reminder notification.");
        this.Select_Start_And_End_Date();
        this.Click_Start_Time();
        driver.findElement(By.xpath(OK_Button)).click();
        common.log("Clicked on ok button.");
        this.Click_Preview_Button();
        Thread.sleep(2000);
    }
    public void Enter_Valid_Data_In_Second_Page_Create_Event_And_Click_On_Preview_Reminder_Notification_No() throws InterruptedException {
        this.Select_Event_Repeats();
        this.Enter_How_Many_Times_Event_Repeats();
        this.Select_Coaches();
        this.Select_To_Whom_Event_Is_Visible();
        common.scrollDownMobile(driver);
        this.Click_Preview_Button();
        Thread.sleep(2000);
    }
    public void Select_Availability_More_Time_Needed() throws InterruptedException {
        driver.findElement(By.xpath(Availability_Dropdown)).click();
        common.log("Availability Dropdown Opened");
        Thread.sleep(1000);
        driver.findElement(By.xpath(MoreTimeNeeded_Option)).click();
        common.log("Unavailable option selected");
    }

    public void Enter_Valid_Data_In_Second_Page_Create_Event_And_Upload_Documents() throws InterruptedException {
        this.Select_Event_Repeats();
        this.Enter_How_Many_Times_Event_Repeats();
        this.Select_Coaches();
        this.Select_To_Whom_Event_Is_Visible();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        driver.findElement(By.xpath(Documents_Upload)).click();
        common.log("Clicked on Documents upload");
        driver.findElement(By.xpath(My_File_Option)).isDisplayed();
        common.log("File manager is opened");

    }
}
