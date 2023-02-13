package Pages;

import Config.Common;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;

public class HomePage extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public HomePage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Verify_Home_Page_Elements(){
        common.isElementPresent(Search_Icon);
        common.log("Search Icon On Home Page is displayed");
        common.isElementPresent(Profile_Icon);
        common.log("Profile Icon On Home Page is displayed");
        common.isElementPresent(Pending_Request_Button);
        common.log("Pending Button On Home Page is displayed");
        common.isElementPresent(Sliding_Banners);
        common.log("Sliding Banners On Home Page is displayed");
        common.isElementPresent(Sort_By_Button);
        common.log("Sort by Button On Home Page is displayed");
        common.isElementPresent(Location_Icon);
        common.log("Location Icon On Home Page is displayed");
        common.isElementPresent(Create_Team_Plus_Button);
        common.log("Create Team Plus Button On Home Page is displayed");
        common.isElementPresent(Settings_Icon_Button);
        common.log("Settings Button On Home Page is displayed");
    }

    public void Click_On_Search_Icon() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath(Search_Icon)).click();
        common.log("Clicked On Search Icon");
        Thread.sleep(7000);
        common.log("Search Page is displayed");
    }

    public void Verify_Search_Page_Elements(){
        common.isElementPresent(Search_Field);
        common.log("Search Field is displayed");
        common.isElementPresent(Map_In_Search);
        common.log("Map is displayed");
        common.isElementPresent(Sliding_Banner_In_Search);
        common.log("Sliding Banners are displayed");
    }

    public void Click_back_Button_Of_Search(){
        driver.findElement(By.xpath(Back_Button_Search)).click();
        common.log("Clicked On back button of search");
        common.isElementPresent(Search_Field);
        common.log("Back to Home Page");
    }

    public void Verify_Search_Functionality() throws InterruptedException {
        driver.findElement(By.xpath(Search_Field)).click();
        driver.findElement(By.xpath(Search_Field)).sendKeys("Sporty Tots");
        driver.hideKeyboard();
        common.log("Searched Sporty Tots");
        Thread.sleep(2000);
        common.isElementPresent(SportyTots_Location);
        common.log("Map navigated to Sporty Tots Location");
        common.isElementPresent(Sporty_Tots_Banner);
        common.log("Sporty Tots banner is displayed");
    }

    public void Verify_Join_Team_Button(){
        common.waitUntillElementPresent(Sporty_Tots_Banner,driver);
        driver.findElement(By.xpath(Sporty_Tots_Banner)).click();
        common.log("Clicked on Sporty Tots banner");
        common.waitUntillElementPresent(Join_Team_Button,driver);
        driver.findElement(By.xpath(Join_Team_Button)).click();
        common.log("Clicked on Join Team Button");
    }

    public void Join_Searched_Team() throws InterruptedException {
        String Team_Name = driver.findElement(By.xpath(Sporty_Tots_Banner)).getText();
        driver.findElement(By.xpath(Sporty_Tots_Banner)).click();
        common.log("Clicked on Sporty Tots banner");
        driver.findElement(By.xpath(Join_Team_Button)).click();
        common.log("Clicked on Join Team Button");
        Thread.sleep(1000);
        driver.findElement(By.xpath(Back_Button_Search)).click();
        common.log("Clicked on Back button");
        common.log("Verifying Pending Request button For the Team Joining");
        Thread.sleep(1000);
        driver.findElement(By.xpath(Pending_Request_Button)).click();
        common.log("Clicked on Pending Request button");
        driver.findElement(By.xpath("//android.widget.TextView[@text=\""+Team_Name +"\"]")).isDisplayed();
        common.log("Pending Request for join team of Searched Team is displayed in Pending Requests");
    }

    public void Navigate_To_Profile_Screen() throws InterruptedException {
        driver.findElement(By.xpath(Profile_Icon)).click();
        common.log("Clicked on Profile Icon");
        Thread.sleep(1000);
    }

    public void Verify_Profile_Screen() throws InterruptedException {
        Thread.sleep(2000);
        common.isElementPresent(Edit_Profile_Button);
        common.log("Edit Button is displayed");
        common.isElementPresent(Back_Button_Profile);
        common.log("back Button is displayed");
        common.isElementPresent(UserName);
        common.log("UserName is displayed");
        common.isElementPresent(Country);
        common.log("Location is displayed");
        common.isElementPresent(Mobile_Number);
        common.log("Mobile Number is displayed");
        common.isElementPresent(Gender);
        common.log("Gender is displayed");
        common.isElementPresent(Date_Of_Birth);
        common.log("Date Of Birth is displayed");
        common.isElementPresent(Email_ID);
        common.log("USer Email ID is displayed");
        common.isElementPresent(Profile_Picture);
        common.log("Profile Picture is displayed");
        common.isElementPresent(MyClub_Section_Header);
        common.log("My Club is displayed");
    }

    public void Navigate_To_Edit_Profile_Screen() throws InterruptedException {
        driver.findElement(By.xpath(Edit_Profile_Button)).click();
        common.log("Clicked on Edit Profile Button");
        Thread.sleep(2000);
    }


    public void Verify_Edit_Profile_Screen() throws InterruptedException {
        common.isElementPresent(Back_Button_Edit_Profile);
        common.log("Back button is Displayed");
        common.isElementPresent(Done_Button_Edit_Profile);
        common.log("Done Button is Displayed");
        common.isElementPresent(First_Name_Label);
        common.log("First Name is Displayed");
        common.isElementPresent(Last_Name_Label);
        common.log("Last Name is Displayed");
        common.isElementPresent(Email_Label);
        common.log("Email is displayed");
        common.isElementPresent(DOB_Label);
        common.log("Date Of birth is displayed");
        common.isElementPresent(Location_Label);
        common.log("Location is displayed");
        common.isElementPresent(Mobile_Number_Label);
        common.log("Mobile Number is displayed");
        common.isElementPresent(Select_Gender_Label);
        common.log("Select Gender is displayed");
        common.isElementPresent(Gender_Checkbox);
        common.log("Prefer Not to Say Gender Checkbox is displayed");
        common.isElementPresent(Add_Bio_Label);
        common.log("Add Bio is displayed");
        common.scrollDownMobile(driver);
        common.isElementPresent(Add_Children_Label);
        common.log("Add Children is displayed");
    }

    public void Click_On_Done_Button_To_Save_Edited_Profile() throws InterruptedException {
        driver.findElement(By.xpath(Done_Button_Edit_Profile)).click();
        common.log("Clicked on Done Button");
        Thread.sleep(5000);
    }

    public void Verify_Edit_Location_In_Edit_Profile(){
        driver.findElement(By.xpath(Location_Field)).click();
        common.log("Clicked on Location Dropdown Button");
        common.isElementPresent(done_link);
        common.isElementPresent(searchbar);
        common.log("Location Dropdown Opened with list of countries");
    }



    public void Click_On_Done_Button_To_Select_Location() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked on Done Button");
    }


    public void Update_Location(){
        driver.findElement(By.xpath(searchbar)).sendKeys("Brazil");
        String Country = driver.findElement(By.xpath(searchbar)).getText();
        common.log("Searched Location :- "+Country);
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Brazil\"]")).click();
        common.log("Clicked On Searched Location :- "+Country);
        driver.hideKeyboard();
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked on Done Button");
    }
    public void Edit_Location_With_Search_Bar() throws InterruptedException {
        driver.findElement(By.xpath(Location_Field)).click();
        common.log("Clicked on Location Dropdown Button");
        this.Update_Location();
        Thread.sleep(4000);
        String Location_Field_Value = driver.findElement(By.xpath(Location_Field)).getText();
        Assert.assertEquals("Brazil",Location_Field_Value);
        common.log("Location Updated");
    }

    public void Edit_Phone_Number_With_More_Than_10_Number() throws InterruptedException {
        driver.findElement(By.xpath(Phone_Number_Field)).clear();
        driver.findElement(By.xpath(Phone_Number_Field)).sendKeys("123456789012");
        common.log("Entered Phone Number More than 10 digits");
        driver.hideKeyboard();
        Thread.sleep(2000);
    }

    public void Edit_Phone_Number() throws InterruptedException {
        driver.findElement(By.xpath(Phone_Number_Field)).clear();
        driver.findElement(By.xpath(Phone_Number_Field)).sendKeys("1234567890");
        common.log("Entered Phone Number More than 10 digits");
        driver.hideKeyboard();
        Thread.sleep(2000);
    }

    public void CLick_Back_Button_From_Profile(){
        driver.findElement(By.xpath(Back_Button_Profile)).click();
        common.log("Back Button Clicked");
        common.isElementPresent(Pending_Request_Button);
        common.log("Back To Home Page");
    }

    public void Click_On_Pending_Requests(){
        driver.findElement(By.xpath(Pending_Request_Button)).click();
        common.log("Pending Requests Button Clicked");
        common.isElementPresent(Pending_Request_Header);
        common.log("Pending request page opened");
    }

    public void Verify_Pending_Requests_Elements(){
        driver.findElement(By.xpath(Pending_Request_Header)).click();
        common.log("Pending request page opened");
        common.isElementPresent(Search_Bar_Pending_Requests);
        common.log("Search Bar is Displayed");
        common.isElementPresent(Back_Button_Pending_Requests);
        common.log("Back Button is Displayed");
        common.isElementPresent(Request_Message_Under_Team);
        common.log("Request To Join Team is Displayed");
    }

    public void Verify_Search_Bar_Functionality_Of_Pending_Request(){
        String Team = "Sporty Tots";
        common.isElementPresent(Search_Bar_Pending_Requests);
        common.log("Searched Team");
        common.isElementPresent("//android.widget.TextView[@text=\""+ Team +"\"]");
        common.log("Searched Team is Displayed");
    }

    public void Click_Sort_Button() throws InterruptedException {
        driver.findElement(By.xpath(Sort_By_Button)).click();
        common.log("Clicked On Sort by Button");
        Thread.sleep(1000);
    }

    public void Verify_Sort_Panel() {
        common.isElementPresent(Sort_Panel);
        common.log("Sort Panel Opened");
        common.isElementPresent(All_Sort_Options);
        common.log("All Option is Displayed");
        common.isElementPresent(Bookmark_Sort_Options);
        common.log("Bookmark option is Displayed");
        common.isElementPresent(Cancel_Sort);
        common.log("Cancel Sort is Displayed");
    }

    public void Verify_Bookmark_Sort_Option(){
        driver.findElement(By.xpath(Bookmark_Sort_Options)).click();
        common.log("Clicked On Bookmark Option");
        common.isElementPresent(Add_Bookmark);
        common.log("Please Add Bookmark is Displayed");
    }

    public void Select_All_Option_In_Sort() throws InterruptedException {
        driver.findElement(By.xpath(All_Sort_Options)).click();
        common.log("Clicked On All Option");
        Thread.sleep(2000);
    }

    public void Open_Article(){
        common.isElementPresent(Article_Banner);
        common.log("Article Banner is displayed");
        driver.findElement(By.xpath(Read_Article_Button)).click();
        common.log("Clicked On Read Article Button");
        common.isElementPresent(Article_Creator_Text_Verification);
        common.log("Article Creator is Displayed");
    }

    public void Verify_Share_Article() throws InterruptedException {
        common.isElementPresent(Share_Article_Button);
        common.log("Share Article Button is displayed");
        Thread.sleep(2000);
        driver.findElement(By.xpath(Share_Article_Button)).click();
        common.log("Clicked On Share Button");
        common.isElementPresent(Share_Panel);
        common.log("Share Panel is Displayed");
    }

    public void Bookmark_Article(){
        common.isElementPresent(Bookmark_Icon_Article_Banner);
        common.log("Bookmark Article Button is displayed");
        driver.findElement(By.xpath(Bookmark_Icon_Article_Banner)).click();
        common.log("Clicked On Bookmark Button");
    }

    public void Verify_Article_Bookmarked(){
        driver.findElement(By.xpath(Bookmark_Sort_Options)).click();
        common.log("Clicked On Bookmark Option");
        common.isElementPresent(Article_Banner);
        common.log("Article is Bookmarked");
    }

    public void Click_Location_Icon() throws InterruptedException {
        driver.findElement(By.xpath(Location_Icon)).click();
        common.log("Clicked On Location Icon");
        Thread.sleep(4000);
    }

    public void Click_Member_Club_Banner() throws InterruptedException {
        common.isElementPresent(Member_Tag_On_Banner);
        driver.findElement(By.xpath(Club_Member_Banner)).click();
        common.log("Clicked On Club Banner in which user is member");
        Thread.sleep(2000);
    }

    public void Verify_Member_Club_Screen() throws InterruptedException {
        String Club_Name = driver.findElement(By.xpath(Member_Club_Name)).getText();
        common.log("Club Name Verified = " + Club_Name);
        common.isElementPresent(Social_Media_Icon_Facebook);
        common.log("Facebook icon is Displayed");
        common.isElementPresent(Social_Media_Icon_Twitter);
        common.log("Twitter icon is Displayed");
        common.isElementPresent(Social_Media_Icon_Instagram);
        common.log("Instagram icon is Displayed");
        common.isElementPresent(Social_Media_Icon_YouTube);
        common.log("Youtube icon is Displayed");
        common.isElementPresent(NEWS_Tab);
        common.log("News Tab is Displayed");
        common.isElementPresent(EVENT_Tab);
        common.log("Event Tab is Displayed");
        common.isElementPresent(SHOP_Tab);
        common.log("Shop Tab is Displayed");
        common.isElementPresent(MEMBERS_Tab);
        common.log("Members Tab is Displayed");
        Thread.sleep(2000);
        driver.findElement(By.xpath(Navigation_Previous_Arrow)).click();
        for(int i=0;i<=4;i++) {
            driver.findElement(By.xpath(Navigation_Right_Arrow)).click();
            common.log("Clicked On Navigation Right Arrow");
        }
        common.isElementPresent(LINK_Tab);
        common.log("Links Tab is Displayed");
        common.isElementPresent(GROUPS_Tab);
        common.log("Groups Tab is Displayed");
    }

    public void Click_Admin_Club_Banner() throws InterruptedException {
        common.scrollMyClubsBannersUntilClubFound(driver,Vzhx_Club_Banner);
        driver.findElement(By.xpath(Vzhx_Club_Banner)).click();
        common.log("Clicked On Club Banner in which user is Admin");
        Thread.sleep(2000);
    }

    public void Click_Test27_Admin_Club_Banner() throws InterruptedException {
        common.scrollMyClubsBannersUntilClubFound(driver,Test27_Club_Banner);
        driver.findElement(By.xpath(Test27_Club_Banner)).click();
        common.log("Clicked On Test27 Club Banner in which user is Admin");
        Thread.sleep(3000);
    }

    public void Click_Vzhx_Admin_Club_Banner() throws InterruptedException {
        common.scrollMyClubsBannersUntilClubFound(driver,Vzhx_Club_Banner);
        driver.findElement(By.xpath(Vzhx_Club_Banner)).click();
        common.log("Clicked On Club Banner in which user is Admin");
        Thread.sleep(3000);
    }

    public void Verify_Admin_Club_Screen() throws InterruptedException {
        common.isElementPresent(Social_Media_Icon_Facebook);
        common.log("Facebook icon is Displayed");
        common.isElementPresent(Social_Media_Icon_Twitter);
        common.log("Twitter icon is Displayed");
        common.isElementPresent(Social_Media_Icon_Instagram);
        common.log("Instagram icon is Displayed");
        common.isElementPresent(Social_Media_Icon_YouTube);
        common.log("Youtube icon is Displayed");
        common.isElementPresent(Edit_Button);
        common.log("Edit Button is Displayed");
        common.isElementPresent(REQUEST_Tab);
        common.log("Request Tab is Displayed");
        common.isElementPresent(NEWS_Tab);
        common.log("News Tab is Displayed");
        common.isElementPresent(EVENT_Tab);
        common.log("Event Tab is Displayed");
        common.isElementPresent(SHOP_Tab);
        common.log("Shop Tab is Displayed");
        for(int i=0;i<=4;i++) {
            driver.findElement(By.xpath(Navigation_Right_Arrow)).click();
            common.log("Clicked On Navigation Right Arrow");
        }
        common.isElementPresent(MEMBERS_Tab);
        common.log("Members Tab is Displayed");
        common.isElementPresent(LINK_Tab);
        common.log("Links Tab is Displayed");
        common.isElementPresent(GROUPS_Tab);
        common.log("Groups Tab is Displayed");
        common.isElementPresent(Add_New_Article);
        common.log("Add New Article Button is Displayed");
    }

    public void Click_Edit_Button_In_Club_Admin_Page() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(Edit_Button)).click();
        common.log("Clicked On Edit Button");
        Thread.sleep(3000);
        common.isElementPresent(Update_Team);
        common.log("Update Team Page is Displayed");
    }

    public void Click_On_Next_Button() throws InterruptedException {
        driver.findElement(By.xpath(Next_Button)).click();
        common.log("Clicked On Next Button");
    }

    public void Verify_Admin_Club_First_Edit_Screen() throws InterruptedException {
        common.isElementPresent(Team_Name_TextField);
        common.log("Team Name Text field is Displayed");
        common.isElementPresent(Agent_Code_Dropdown);
        common.log("Agent Code Dropdown is Displayed");
        common.isElementPresent(Primary_Email_TextField);
        common.log("Primary Email Text field is Displayed");
        common.isElementPresent(Sport_Dropdown);
        common.log("Team Name is Displayed");
        common.isElementPresent(Team_Bio_TextArea);
        common.log("Team Name is Displayed");
    }

    public void Verify_Admin_Club_Second_Edit_Screen() throws InterruptedException {
        common.isElementPresent(Country_Dropdown);
        common.log("Country Dropdown is Displayed");
        common.isElementPresent(Location_Text_Field);
        common.log("Location TextField is Displayed");
        common.isElementPresent(Team_Logo);
        common.log("Team Logo is Displayed");
    }

    public void Clear_Data_In_Edit_Form(){
        driver.findElement(By.xpath(Team_Name_TextField)).clear();
        common.log("Team Name Text field is Displayed");
    }

    public void Verify_Country_Dropdown() throws InterruptedException {
        driver.findElement(By.xpath(Country_Dropdown)).click();
        common.log("Clicked On Country Dropdown");
        common.isElementPresent(Search_Bar);
        common.log("Search bar is Displayed");
    }

    public void Click_On_Update_Team() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(Update_Team)).click();
        common.log("Clicked On Update Team");

    }

    public void Verify_Team_Update_popUp(){
        common.isElementPresent(Team_Updated_Message);
        common.log("Team updated Successfully Popup is displayed");
    }

    public void Search_Requested_Users(){
        driver.findElement(By.xpath(Search_Bar)).sendKeys("Riya Test");
        common.log("Clicked On Update Team");
        common.isElementPresent(User_Request);
        common.log("Searched user request is displayed");
    }

    public void Accept_User_Request(){
        driver.findElement(By.xpath(Accept_Request_Button)).click();
        common.log("Clicked On Accept Button");
    }

    public void Verify_Assign_Groups_Popup() throws InterruptedException {
        Thread.sleep(5000);
        common.isElementPresent(Assign_Group_Popup);
        common.log("Assign Groups popup is displayed");
    }

    public void Click_Assign_Groups_Dropdown(){
        driver.findElement(By.xpath(Assign_Group_Dropdown)).click();
        common.log("Clicked On Assign Groups Dropdown");
    }

    public void Select_Group() throws InterruptedException {
        Thread.sleep(1000);
        String group = driver.findElement(By.xpath(Group)).getText();
        driver.findElement(By.xpath(Group)).click();
        common.log("Selected Group : "+group);
    }

    public void Click_Select_All_Button(){
        driver.findElement(By.xpath(SelectAll_Button)).click();
        common.log("Clicked On Select All Button");
    }

    public void Click_DeSelect_All_Button(){
        driver.findElement(By.xpath(DeselectAll_Button)).click();
        common.log("Clicked On DeSelect All Button");
    }

    public void Search_And_Select_Group() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Search_Bar)).sendKeys("Fhchb");
        common.log("Clicked On DeSelect All Button");
        Thread.sleep(2000);
        String group = driver.findElement(By.xpath(Group)).getText();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Group)).click();
        common.log("Selected Group : "+group);
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked On Done Button");

    }

    public void Click_Confirm_Button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Confirm_Button)).click();
        common.log("Clicked on confirm button");
    }

    public void Delete_Member_And_Send_Request_Again_1() throws InterruptedException, IOException, ParseException {
        for(int i=0;i<=5;i++) {
            driver.findElement(By.xpath(Navigation_Right_Arrow)).click();
            common.log("Clicked On Navigation Right Arrow");
            Thread.sleep(1000);
        }
        common.isElementPresent(MEMBERS_Tab);
        common.log("Members Tab is Displayed");
        driver.findElement(By.xpath(MEMBERS_Tab)).click();
        common.log(" Member button Clicked");
        driver.findElement(By.xpath(Delete_Member_Button)).click();
        common.log("Delete Member button Clicked");
        driver.findElement(By.xpath(Confirm_Delete)).click();
        common.log("Confirm Delete button clicked");
        driver.findElement(By.xpath(Back_Button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(Settings_Icon_Button)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LogOut_Button)).click();
        driver.findElement(By.xpath(Confirm_Delete)).click();
        common.log("Logged Out");
        Thread.sleep(4000);
        driver.findElement(By.xpath(next_button_1)).click();
    }

    public void Delete_Member_And_Send_Request_Again_2() throws InterruptedException, IOException, ParseException {
        driver.findElement(By.xpath(Search_Field)).click();
        driver.findElement(By.xpath(Search_Field)).sendKeys("Vzhx");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        Thread.sleep(2000);
        common.isElementPresent(Vzhx_Banner);
        driver.findElement(By.xpath(Vzhx_Banner)).click();
        driver.findElement(By.xpath(Join_Team_Button)).click();
        common.log("Clicked on Join Team Button");
        Thread.sleep(2000);
    }

    public void Unselect_Location_In_Edit_Profile() throws InterruptedException {

        Thread.sleep(2000);
        for(int i=0;i<16;i++){
            common.scrollDownMobile(driver);
        }
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"India\"]//..//android.widget.CheckBox")).click();
        driver.findElement(By.xpath(done_link)).click();
        driver.findElement(By.xpath("//android.widget.ImageView[3]")).click();
    }

    public void Verify_Calender_Icon_Functionality(){
        driver.findElement(By.xpath(Calender_Icon)).click();
        common.log("Clicked On Calender Icon Home Page");
        driver.findElement(By.xpath(Calendar_Page)).isDisplayed();
    }

    public void Verify_Calender_Month_Navigation(){
        driver.findElement(By.xpath(Calendar_Previous_Month_Arrow)).click();
        common.log("Clicked On Calender Previous_Month_Arrow");
        driver.findElement(By.xpath(Calendar_Next_Month_Arrow)).click();
        common.log("Clicked On Calender Next_Month_Arrow");
    }

    public void Verify_Events_List_By_Clicking_On_Date() throws InterruptedException {
        driver.findElement(By.xpath(Calendar_Next_Month_Arrow)).click();
        common.log("Clicked On Calender Next_Month_Arrow");
        Thread.sleep(4000);
        driver.findElement(By.xpath(EventDate)).click();
        common.log("Clicked On Date which is having events");
        driver.findElement(By.xpath(SportsEventListBanner)).isDisplayed();
        common.log("List Of Events are displayed");
    }
    public void Click_On_Login_Button(){
        driver.findElement(By.xpath(LoginButton)).click();
        common.log("Clicked On Login Button");
    }

    public void Login_with_valid_Credentials() throws IOException, ParseException, InterruptedException {

        driver.findElement(By.xpath(EnterEmailTextField)).sendKeys("riyakagda@gmail.com");
        common.log("Entered Email :- riyakagda@gmail.com");
        driver.findElement(By.xpath(PasswordTextField)).sendKeys("Test@123");
        common.log("Entered Password :- Test@123");
        this.Click_On_Login_Button();
        Thread.sleep(5000);
    }

    public void Verify_Homepage_Articles(){

        common.isElementPresent(Admin_Page_Article_1);
        common.log("1st article is verified.");
        common.isElementPresent(Admin_Page_Article_2);
        common.log("2nd article is verified.");
        common.isElementPresent(Admin_Page_Article_3);
        common.log("3rd article is verified.");

    }

    public void Verify_Home_Page_Article_When_Add_New_News_Article(String Article_Name) throws InterruptedException {

        Thread.sleep(3000);
        common.isDisplayed("//android.widget.TextView[@text=\""+Article_Name+"\"]");
        common.log("First Article is verified.");
        common.isDisplayed(Ads_Position);
        common.log("Adds position after 3rd article verified.");

    }



}