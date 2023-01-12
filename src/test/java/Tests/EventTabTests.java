package Tests;

import Config.Configuration;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class EventTabTests extends Configuration {


    //TC-159
    @Test
    public void Verify_the_EVENT_tab_for_Admin_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
    }

    //TC-160
    @Test
    public void Verify_the_Search_bar_for_EVENT_tab()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Search_Event();
    }

    //TC-161
    @Test
    public void Verify_the_Sort_by_filter_of_event_tab()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_Sort_Button_Event();
        eventTab.Verify_Sort_Event();
    }

    //TC-162
    @Test
    public void Verify_the_Past_option() throws InterruptedException, IOException, AWTException, ParseException, java.text.ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_Sort_Button_Event();
        eventTab.Select_Past_Type_Event_Sort();
        eventTab.Click_Apply_Sort_Button_Event();
        eventTab.Verify_Past_Type_Event_Sort();
    }

    //TC-163
    @Test
    public void Verify_the_option_of_Filter_list()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_Sort_Button_Event();
        eventTab.Select_Filter_As_Social_Event();
        eventTab.Click_Apply_Sort_Button_Event();
    }

    //TC-164
    @Test
    public void Verify_the_RESET_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_Sort_Button_Event();
        eventTab.Select_Filter_As_Social_Event();
        eventTab.Click_Reset_Sort_Button_Event();
    }

    //TC-165
    @Test
    public void Verify_the_ADD_NEW_EVENT_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
    }

    //TC-166
    @Test
    public void Verify_the_first_screen_of_CREATE_EVENT()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Verify_Create_Event_Screen();
    }

    //TC-167
    @Test
    public void Verify_the_Location_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Verify_Location_Field_Functionality();
    }

    //TC-168
    @Test
    public void Verify_the_Search_bar()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Verify_Location_Field_Functionality();
    }

    //TC-169
    @Test
    public void Verify_Start_Time_and_End_Time_field_before_entering_Date()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Verify_Start_And_End_Time_Is_Disabled_Before_Entering_Date();
    }

    //TC-170
    @Test
    public void Verify_Start_Date_and_End_Date_fields()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Verify_Start_And_End_Date_Fields();
    }

    //TC-171
    @Test
    public void Verify_the_Close_button_of_calendar_Create_Event()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Verify_Start_And_End_Date_Fields();
    }

    //TC-172
    @Test
    public void Verify_the_OK_button_of_calendar_Create_Event()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Select_Start_And_End_Date();
    }

    //TC-173
    @Test
    public void Verify_the_calendar_for_End_Date()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Verify_Start_And_End_Date_Fields();
    }

    //TC-174
    @Test
    public void Verify_Start_Time_and_End_Time_field_after_entering_Date()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Select_Start_And_End_Date();
        eventTab.Verify_Time_Fields();
    }

    //TC-175
    @Test
    public void Verify_Keyboard_icon_time_picker()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Select_Start_And_End_Date();
        eventTab.Click_Start_Tme();
        eventTab.Click_Keyboard_Icon_Time_Picker();
    }

    //TC-176
    @Test
    public void Verify_fields_of_Set_Time_popup()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Select_Start_And_End_Date();
        eventTab.Click_Start_Tme();
        eventTab.Verify_Keyboard_Input_popup_Time();
    }

    //TC-177
    @Test
    public void Verify_Clock_icon_of_Set_Time_popup()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Select_Start_And_End_Date();
        eventTab.Click_Start_Tme();
        eventTab.Verify_Keyboard_Input_popup_Time();
    }

    //TC-178
    @Test
    public void Verify_the_Cancel_button_of_Time_picker()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Select_Start_And_End_Date();
        eventTab.Click_Start_Tme();
        eventTab.Verify_Keyboard_Input_popup_Time();
        eventTab.Click_Cancel_Button_Date_Calender();
    }

    //TC-179
    @Test
    public void Verify_the_OK_button_of_Time_picker()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Select_Start_And_End_Date();
        eventTab.Click_Start_Tme();
        eventTab.Select_Time();
    }

    //TC-180
    @Test
    public void Verify_the_Unlimited_Capacity_field_by_selecting_No_option()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Select_Unlimited_Capacity_As_No();
    }

    //TC-181
    @Test
    public void Verify_the_Capacity_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Select_Unlimited_Capacity_As_No();
    }

    //TC-182
    @Test
    public void Verify_the_NEXT_button_of_CREATE_EVENT()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
    }

    //TC-183
    @Test
    public void Verify_the_fields_for_second_screen_of_CREATE_EVENT()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
    }

    //TC-184
    @Test
    public void Verify_the_Repeats_field_by_selecting_menu_option()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTab.Select_Event_Repeats();
    }

    //TC-185
    @Test
    public void Verify_the_How_many_times_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTab.Select_Event_Repeats();
    }

    //TC-186
    @Test
    public void Verify_Send_an_email_field_by_clicking_on_NO_button_Create_Event()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTab.Select_Event_Repeats();
        eventTab.Click_No_For_Sent_Email();
    }

    //TC-187
    @Test
    public void Verify_Send_an_notification_field_by_clicking_on_NO_button_Create_Event()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTab.Select_Event_Repeats();
        eventTab.Click_No_For_Sent_Notifications();
    }

    //TC-188
    @Test
    public void Verify_Allow_Comments_field_by_clicking_on_NO_button_Create_Event()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTab.Select_Event_Repeats();
        eventTab.Click_No_For_Allow_Comments();
    }

    //TC-189
    @Test
    public void Verify_the_PREVIEW_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTab.Enter_Valid_Data_In_Second_Page_Create_Event_And_Click_On_Preview();
    }

    //TC-190
    @Test
    public void Verify_the_CONFIRM_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTab.Enter_Valid_Data_In_Second_Page_Create_Event_And_Click_On_Preview();
        homePage.Click_Confirm_Button();
        eventTab.Verify_Event_Created();
    }

    //TC-191
    @Test
    public void Verify_the_Close_button_Create_Event()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTab.Enter_Valid_Data_In_Second_Page_Create_Event_And_Click_On_Preview();
        homePage.Click_Confirm_Button();
        eventTab.Verify_Event_Created();
        signUp.click_on_user_information_page_button("CLOSE");
    }

    //TC-192
    @Test
    public void Verify_the_banner_for_event_display_in_EVENT_tab()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_On_Add_New_Event();
        eventTab.Enter_Valid_Data_In_First_Page_Create_Event_And_Click_On_Next();
        eventTab.Enter_Valid_Data_In_Second_Page_Create_Event_And_Click_On_Preview();
        homePage.Click_Confirm_Button();
        eventTab.Verify_Event_Created();
        signUp.click_on_user_information_page_button("CLOSE");
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Verify_New_Event_Banner();
    }

    //TC-193
    @Test
    public void Verify_the_ADD_TO_CALENDAR_button_for_past_event()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_Sort_Button_Event();
        eventTab.Select_Past_Type_Event_Sort();
        signUp.click_on_user_information_page_button("APPLY");
        eventTab.Click_On_Old_Event();
        eventTab.Verify_Add_To_Calender_In_Past_Event();
        loginPage.Get_Toast_Alert("Add Event To Calender : ");
    }

    //TC-194
    @Test
    public void Verify_the_functionality_of_RESPOND_button ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Open_An_Event();
        eventTab.Click_Respond_Button();
    }

    //TC-195
    @Test
    public void Verify_the_fields_of_SUBMIT_A_RESPONSE_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Open_An_Event();
        eventTab.Click_Respond_Button();
        eventTab.Verify_Respond_Screen();
    }

    //TC-196
    @Test
    public void Verify_the_Select_Attendees_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Open_An_Event();
        eventTab.Click_Respond_Button();
        eventTab.Click_Select_Attendees_Dropdown();
    }

    //TC-197
    @Test
    public void Verify_the_functionality_of_Select_all_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Open_An_Event();
        eventTab.Click_Respond_Button();
        eventTab.Click_Select_Attendees_Dropdown();
        homePage.Click_Select_All_Button();
    }

    //TC-198
    @Test
    public void Verify_the_functionality_of_DeSelect_all_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Open_An_Event();
        eventTab.Click_Respond_Button();
        eventTab.Click_Select_Attendees_Dropdown();
        homePage.Click_Select_All_Button();
        homePage.Click_DeSelect_All_Button();
    }

    //TC-199
    @Test
    public void Verify_the_Search_bar_and_Done_link()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Open_An_Event();
        eventTab.Click_Respond_Button();
        eventTab.Click_Select_Attendees_Dropdown();
        eventTab.Select_Attendees();
    }

    //TC-200
    @Test
    public void Verify_Availability_field_by_selecting_option_from_list()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Open_An_Event();
        eventTab.Click_Respond_Button();
        eventTab.Click_Select_Attendees_Dropdown();
        eventTab.Select_Attendees();
        eventTab.Select_Availability();
    }

    //TC-201
    @Test
    public void Verify_the_Add_a_note_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Open_An_Event();
        eventTab.Click_Respond_Button();
        eventTab.Click_Select_Attendees_Dropdown();
        eventTab.Select_Attendees();
        eventTab.Select_Availability();
        eventTab.Add_Note_In_Response();
    }

    //TC-202
    @Test
    public void Verify_the_CONFIRM_button_of_SUBMIT_A_RESPONSE_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Open_An_Event();
        eventTab.Click_Respond_Button();
        eventTab.Click_Select_Attendees_Dropdown();
        eventTab.Select_Attendees();
        eventTab.Select_Availability();
        eventTab.Add_Note_In_Response();
        homePage.Click_Confirm_Button();
    }

    //TC-203
    @Test
    public void Verify_the_Overview_tab_of_EVENT_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Open_An_Event();
        eventTab.Click_Overview_Button();
    }


    //TC-222
    @Test
    public void Verify_the_navigation_of_Back_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Click_On_Event_Tab_And_Verify();
        eventTab.Click_Back_Button_From_Events();
    }

    //TC-223
    @Test
    public void Verify_the_Angle_right_icon_placed_below_the_Edit_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Verify_Navigation_To_Next_Tab();
    }

    //TC-224
    @Test
    public void Verify_the_Angle_left_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Verify_Navigation_To_Previous_Tab();
    }

    //TC-225
    @Test
    public void Verify_the_fields_of_the_SHOP_tab()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        EventTabPage eventTab = new EventTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        eventTab.Verify_Navigation_To_Previous_Tab();
    }

}