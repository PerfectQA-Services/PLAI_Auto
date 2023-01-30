package Tests;

import Config.Configuration;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class EventTabTests_New_Sprint extends Configuration {

    //TC-77
    @Test
    public void Verify_the_CALENDAR_SYNC_icon_of_EVENTS_tab()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        EventTabPage_New_Sprint eventTabPage_newSprint =new EventTabPage_New_Sprint(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTabPage_newSprint.Click_On_Event_Tab();
        eventTabPage_newSprint.Click_On_Calender_Sync_Icon();
        loginPage.Get_Toast_Alert("Alert after click  calendar sync icon :- ");
    }
    //TC-78
    @Test
    public void Verify_the_ADD_TO_CALENDAR_button_of_OVERVIEW_tab_of_EVENT_screen ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Open_An_Event();
        eventTab.Click_ON_Add_To_Calender();
        loginPage.Get_Toast_Alert("Alert after click on add to calendar button :- ");
    }
    //TC-79
    @Test
    public void Verify_the_functionality_of_Event_Reminder ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        EventTabPage_New_Sprint eventTabPage_newSprint =new EventTabPage_New_Sprint(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTabPage_newSprint.Enter_Valid_Data_In_Second_Page_Create_Event_And_Click_On_Preview_Reminder_Notification_Yes();
        homePage.Click_Confirm_Button();
        eventTab.Click_On_Close_Button();
        eventTab.Open_An_Event();
        eventTab.Click_ON_Add_To_Calender();
        loginPage.Get_Toast_Alert("Alert after click on add to calendar button :- ");
    }
    //TC-80
    @Test
    public void Verify_the_functionality_of_Event_Reminder_for_approved_users()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        EventTabPage_New_Sprint eventTabPage_newSprint =new EventTabPage_New_Sprint(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTabPage_newSprint.Enter_Valid_Data_In_Second_Page_Create_Event_And_Click_On_Preview_Reminder_Notification_Yes();
        homePage.Click_Confirm_Button();
        eventTab.Click_On_Close_Button();
        eventTab.Verify_Event_Created();
        eventTab.Click_Respond_Button();
        eventTab.Click_Select_Attendees_Dropdown();
        eventTab.Select_Attendees();
        eventTab.Select_Availability();
        eventTab.Add_Note_In_Response();
        homePage.Click_Confirm_Button();
    }
    //TC-81
    @Test
    public void Verify_the_functionality_of_Event_Reminder_for_approved_users_but_Reminder_notification_selected_NO()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        EventTabPage_New_Sprint eventTabPage_newSprint =new EventTabPage_New_Sprint(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTabPage_newSprint.Enter_Valid_Data_In_Second_Page_Create_Event_And_Click_On_Preview_Reminder_Notification_No();
        homePage.Click_Confirm_Button();
        eventTab.Click_On_Close_Button();
        eventTab.Verify_Event_Created();
        eventTab.Click_Respond_Button();
        eventTab.Click_Select_Attendees_Dropdown();
        eventTab.Select_Attendees();
        eventTab.Select_Availability();
        eventTab.Add_Note_In_Response();
        homePage.Click_Confirm_Button();
    }
    //TC-82
    @Test
    public void Verify_the_functionality_of_Event_Reminder_for_Unavailable_option_of_RESPOND()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        EventTabPage_New_Sprint eventTabPage_newSprint =new EventTabPage_New_Sprint(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTabPage_newSprint.Enter_Valid_Data_In_Second_Page_Create_Event_And_Click_On_Preview_Reminder_Notification_Yes();
        homePage.Click_Confirm_Button();
        eventTab.Click_On_Close_Button();
        eventTab.Verify_Event_Created();
        eventTab.Click_Respond_Button();
        eventTab.Click_Select_Attendees_Dropdown();
        eventTab.Select_Attendees();
        eventTab.Select_Availability();
        eventTab.Add_Note_In_Response();
        homePage.Click_Confirm_Button();
    }
    //TC-83
    @Test
    public void Verify_the_functionality_of_Event_Reminder_for_More_time_needed_option_of_RESPOND()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        EventTabPage_New_Sprint eventTabPage_newSprint =new EventTabPage_New_Sprint(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTabPage_newSprint.Enter_Valid_Data_In_Second_Page_Create_Event_And_Click_On_Preview_Reminder_Notification_Yes();
        homePage.Click_Confirm_Button();
        eventTab.Click_On_Close_Button();
        eventTab.Verify_Event_Created();
        eventTab.Click_Respond_Button();
        eventTab.Click_Select_Attendees_Dropdown();
        eventTabPage_newSprint.Select_Availability_More_Time_Needed();
        eventTab.Select_Availability();
        eventTab.Add_Note_In_Response();
        homePage.Click_Confirm_Button();
    }
    //TC-79
    @Test
    public void Verify_the_functionality_of_Document_in_EVENTS_tab ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        EventTabPage_New_Sprint eventTabPage_newSprint =new EventTabPage_New_Sprint(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTabPage_newSprint.Enter_Valid_Data_In_Second_Page_Create_Event_And_Upload_Documents();

    }

}
