package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;


public class NewsTabPage extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public NewsTabPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Verify_News_Tab() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(NEWS_Tab)).click();
        common.isElementPresent(Sort_News_Tab);
        common.log("Sort Button is visible");
        common.isElementPresent(Add_New_Article_News_Tab);
        common.log("Add New Article Button Is visible");
    }

    public void Search_News() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Search_Bar)).sendKeys("article");
        common.log("Searched Article");
    }

    public void Verify_Sort_Filter_News_Tab() throws InterruptedException {
        common.isElementPresent(Sort_News_Tab);
        common.log("Sort Button is visible");
        common.isElementPresent(Sort_Panel);
        common.log("Sort Panel Opened");
    }

    public void Bookmark_News_Article(){
        common.isElementPresent(Bookmark_News_Article);
        common.log("Bookmark Icon is visible");
    }

    public void Verify_Share_News_Article(){
        common.isElementPresent(Share_News_Article);
        common.log("Share Icon is visible");
        driver.findElement(By.xpath(Share_News_Article)).click();
        common.log("Clicked On Share Icon");
        common.isElementPresent(Share_Panel);
        common.log("Share Panel is visible");
    }

    public void Open_News_Article() throws InterruptedException {
        driver.findElement(By.xpath(News_Article)).click();
        common.log("Clicked On News Article");
        Thread.sleep(5000);
    }

    public void Edit_Article(){
        driver.findElement(By.xpath(Edit_Button_News_Article)).click();
        common.log("Clicked On Edit Article");
        common.isElementPresent(Update_Article);
        common.log("Update Article Screen is visible");
        common.isElementPresent(Update_Article_Title_Field);
        common.log("Title Field is visible");
    }

    public void Verify_Preview_Of_Update_In_Article(){
        common.isElementPresent(Preview_Button);
        common.log("Preview is Displayed");
    }

    public void Verify_Article_Updated_Popup(){
        common.isElementPresent(Article_Updated);
        common.log("Update Popup is Displayed");
    }

    public void Click_Delete_Article(){
        driver.findElement(By.xpath(Article_Delete_Icon)).click();
        common.log("Clicked On Delete Icon");
    }

    public void Click_Dismiss_Button(){
        driver.findElement(By.xpath(Dismiss_Button)).click();
        common.log("Clicked ON Dismiss Icon");
    }

    public void Click_Confirm_Delete_Button(){
        driver.findElement(By.xpath(Confirm_Delete)).click();
        common.log("Clicked On Confirm Button");
    }

    public void Click_Add_New_Article_Button() throws InterruptedException {
        driver.findElement(By.xpath(Add_New_Article_News_Tab)).click();
        common.log("Clicked On Add New Article Button");
        Thread.sleep(4000);
        common.isElementPresent(New_Article_Screen);
        common.log("New Article Page is Displayed");
    }

    public void Verify_New_Article_Screen(){
        common.isElementPresent(Title_Text_Field);
        common.log("Title Text Field is Displayed");
        common.isElementPresent(Article_Description_TF);
        common.log("Article Description Field is Displayed");
        common.isElementPresent(Publish_Now_Dropdown);
        common.log("Publish Now Dropdown is Displayed");
        common.isElementPresent(Send_Email_No);
        common.log("Send Email is Displayed");
        common.isElementPresent(Send_Notification_No);
        common.log("Send Notification is Displayed");
        common.isElementPresent(Groups_Dropdown);
        common.log("Groups Dropdown is Displayed");
    }

    public void Click_Preview_Button() throws InterruptedException {
        common.scrollDownMobile(driver);
        driver.findElement(By.xpath(Preview_Button)).click();
        common.log("Clicked On Preview Button");
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

    public void Select_No_For_Publish_Now() throws InterruptedException {
        driver.findElement(By.xpath(Publish_Now_Dropdown)).click();
        common.log("Clicked On Publish Now Button");
        Thread.sleep(3000);
        driver.findElement(By.xpath(Publish_Now_No_Option)).click();
        common.log("Clicked On No Option to Publish");
        common.isElementPresent(Publish_Date_Field);
        common.log("Publish Date is Displayed");
        common.isElementPresent(Publish_Time);
        common.log("Publish Time is Displayed");
    }

    public void Verify_Select_Date_To_Publish() throws InterruptedException {
        common.isElementPresent("//android.widget.EditText[contains(@text,\"" + common.Verify_Current_Date() +"\")]");
        common.log("Current Date Verified");
        driver.findElement(By.xpath(Publish_Date_Field)).click();
        common.log("Clicked On Publish Date Field");
        Thread.sleep(2000);
        common.isElementPresent(Next_Arrow_Calender);
        common.log("Date Calender Opened");
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

    public void Verify_Select_Time_To_Publish() throws InterruptedException {
        driver.findElement(By.xpath(Publish_Time)).click();
        common.log("Clicked On Publish Date Field");
        Thread.sleep(2000);
        driver.findElement(By.xpath(Time_Eight)).click();
        common.log("Selected Times as 8 ");
        Thread.sleep(2000);
        common.isElementPresent("//android.widget.EditText[@text=\"8\"]");
        common.log("Selected Times is updated ");
    }

    public void Create_New_Article() throws InterruptedException {
        driver.findElement(By.xpath(Title_Text_Field)).sendKeys("Test Article 2");
        common.log("Entered Article Title");
        driver.findElement(By.xpath(Article_Description_TF)).sendKeys("Test Article 2 Description");
        common.log("Entered Article Description");
        driver.findElement(By.xpath(Send_Email_No)).click();
        common.log("Selected No for Send Email");
        driver.findElement(By.xpath(Send_Notification_No)).click();
        common.log("Selected No for Send Notification");
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        Thread.sleep(2000);
        driver.findElement(By.xpath(Groups_Dropdown)).click();
        common.log("Groups Dropdown is Clicked");
        driver.findElement(By.xpath(SelectAll_Button)).click();
        common.log("Selected All Groups");
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked On Done Button");
        Thread.sleep(2000);
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        driver.findElement(By.xpath(Allow_Comments_No)).click();
        common.log("Selected No to Allow Notifications");
    }

    public void Verify_Preview_Screen(){
        common.isElementPresent(Confirm_Button);
        common.log("Preview Screen is Displayed");
    }

    public String Create_New_Article_With_Sms() throws InterruptedException {
        Thread.sleep(2000);
        String Article_Name=common.generateRandomChars(7);
        driver.findElement(By.xpath(Title_Text_Field)).sendKeys(Article_Name);
        common.log("Entered Article Title");
        driver.findElement(By.xpath(Article_Description_TF)).sendKeys("Test Article 2 Description");
        common.log("Entered Article Description");
        driver.findElement(By.xpath(Send_Email_No)).click();
        common.log("Selected No for Send Email");
        driver.findElement(By.xpath(Send_Notification_No)).click();
        common.log("Selected No for Send Notification");
        driver.findElement(By.xpath(Send_A_SMS_Yes)).click();
        common.log("Selected Yes for Send a SMS");
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        Thread.sleep(2000);
        driver.findElement(By.xpath(Groups_Dropdown)).click();
        common.log("Groups Dropdown is Clicked");
        driver.findElement(By.xpath(SelectAll_Button)).click();
        common.log("Selected All Groups");
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked On Done Button");
        Thread.sleep(2000);
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        Thread.sleep(2000);
        driver.findElement(By.xpath(Allow_Comments_No)).click();
        common.log("Selected No to Allow Notifications");
        return Article_Name;
    }

    public void Verify_Payment_Page_Header() throws InterruptedException {

        Thread.sleep(2000);
        common.isDisplayed(Payment_page_Header);
        common.log("Payment page is verified.");

    }
    public void Verify_Payment_Page_Elements() throws InterruptedException {

        Thread.sleep(2000);
        common.isDisplayed(Back_Button);
        common.log("Back button is verified.");
        common.isDisplayed(User_Information_Text_Payment);
        common.log("User information text is verified.");
        common.isDisplayed(Change_Card_Button);
        common.log("Change card button is verified.");
        common.isDisplayed(Confirm_Button);
        common.log("Confirm button is verified.");

    }
    public void Click_Change_Card_Button_Verify_Result() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Change_Card_Button)).click();
        common.log("Clicked On change card Button.");
        common.isDisplayed(Saved_Card_Text);
        common.log("Saved card screen is verified.");
    }

    public void Click_Confirm_Button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Confirm_Button)).click();
        common.log("Clicked On continue Button of Payment page");

    }

    public void Verify_Ads_at_3rd_Position() throws InterruptedException {

        Thread.sleep(2000);
        common.isDisplayed(Ads_Position);
        common.log("Ads position after 3rd news articles is verified.");
    }
    public void Click_On_Pin_Icon_New_Sprint() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Pin_Icon)).click();
        common.log("Clicked on pin icon.");

    }
    public void Click_On_Pin_Icon_Of_Second_Banner_New_Sprint() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Pin_Icon_1)).click();
        common.log("Clicked on pin icon of second banner.");

    }

    public void Verify_Upload_Documents_New_Sprint() throws InterruptedException {
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        driver.findElement(By.xpath(Documents_Upload)).click();
        common.log("Clicked on Documents upload");
        driver.findElement(By.xpath(My_File_Option)).isDisplayed();
        common.log("File manager is opened");

    }
    public void Upload_Documents_Verify_Result() throws InterruptedException {

        driver.findElement(By.xpath(My_File_Option)).click();
        common.log("Clicked on My files option");
        driver.findElement(By.xpath(Document_CheckBox)).click();
        common.log("Document is selected.");
        driver.findElement(By.xpath(Done_Button)).click();
        common.log("Clicked on done button.");
        driver.findElement(By.xpath(Upload_Documents_Plus_Icon)).isDisplayed();
        common.log("Plus icon is verified");
        driver.findElement(By.xpath(Upload_Documents_Delete_Icon)).isDisplayed();
        common.log("Delete icon is verified");

    }

    public void Click_On_Back_Button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Back_Button)).click();
        common.log("Clicked on Back Icon.");

    }

}