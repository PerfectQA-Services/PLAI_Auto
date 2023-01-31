package Tests;

import Config.Configuration;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class MembersTabTest extends Configuration {

    
    //TC-242
    @Test
    public void Verify_the_Members_tab_for_Admin_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Members_Tab();
    }

    //TC-243
    @Test
    public void Verify_the_Search_bar_of_MEMBER_tab()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Search_Member();
    }

    //TC-244
    @Test
    public void Verify_the_Edit_icon_placed_on_each_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Edit_Button_In_Member_Banner();
    }

    //TC-245
    @Test
    public void Verify_the_Delete_icon_placed_on_each_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Delete_Button_In_Member_Banner();
    }

    //TC-246
    @Test
    public void Verify_the_Dismiss_button_of_confirmation_popup()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Delete_Button_In_Member_Banner();
        newsTab.Click_Dismiss_Button();
    }

    //TC-247
    @Test
    public void Verify_the_Confirm_button_of_confirmation_popup()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Delete_Button_In_Member_Banner();
//        newsTab.Click_Confirm_Delete_Button();
    }

    //TC-248
    @Test
    public void Verify_the_checkbox_of_Make_This_Member_a_Team_Admin()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Make_This_Member_Admin_Functionality();
    }

    //TC-249
    @Test
    public void Verify_the_Groups_field_of_EDIT_MEMBER_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Edit_Button_In_Member_Banner();
        memberPage.Click_Groups_Dropdown_In_Edit();
    }

    //TC-250
    @Test
    public void Verify_the_Deselect_All_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Edit_Button_In_Member_Banner();
        memberPage.Click_Groups_Dropdown_In_Edit();
        homePage.Click_Select_All_Button();
        homePage.Click_DeSelect_All_Button();
    }

    //TC-251
    @Test
    public void Verify_the_Select_All_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Edit_Button_In_Member_Banner();
        memberPage.Click_Groups_Dropdown_In_Edit();
        homePage.Click_Select_All_Button();
    }

    //TC-252
    @Test
    public void Verify_the_Done_link_with_Search_bar()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Edit_Button_In_Member_Banner();
        memberPage.Click_Groups_Dropdown_In_Edit();
        homePage.Click_Select_All_Button();
        homePage.Click_On_Done_Button_To_Select_Location();
    }

    //TC-253
    @Test
    public void Verify_the_ADD_button_without_entering_data_in_Field_Name_and_Field_Value()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Edit_Button_In_Member_Banner();
        memberPage.Click_Add_Button();
        loginPage.Get_Toast_Alert("Alert without entering data :- ");
    }

    //TC-254
    @Test
    public void Verify_the_ADD_button_with_entering_data_in_Field_Name_and_Field_Value()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Edit_Button_In_Member_Banner();
        memberPage.Add_New_Custom_Field();
        memberPage.Click_Add_Button();
    }

    //TC-255
    @Test
    public void Verify_ADD_button_after_enter_data_in_Field_Name_and_Field_Value()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Edit_Button_In_Member_Banner();
        memberPage.Add_New_Custom_Field();
        memberPage.Click_Add_Button();
    }

    //TC-257
    @Test
    public void Verify_the_Delete_icon_of_added_custom_fields()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Edit_Button_In_Member_Banner();
        memberPage.Add_New_Custom_Field();
        memberPage.Click_Add_Button();
        memberPage.Verify_Custom_Field_Delete_Button();
        memberPage.Click_Custom_Field_Delete_Button();
    }

    //TC-258
    @Test
    public void Verify_the_functionality_of_Save_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Verify_Edit_Button_In_Member_Banner();
        memberPage.Add_New_Custom_Field();
        memberPage.Click_Save_Button();
    }

    //TC-259
    @Test
    public void Verify_the_INVITE_MEMBER_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Verify_Invite_Member_Screen();
    }

    //TC-260
    @Test
    public void Verify_the_fields_display_on_INVITE_MEMBER_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Verify_Invite_Member_Screen();
    }

    //TC-261
    @Test
    public void Verify_the_Country_Code_list_of_Mobile_Number_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Verify_Invite_Member_Screen();
        memberPage.Verify_Country_Code_List();
    }

    //TC-262
    @Test
    public void Verify_the_navigation_by_clicking_on_Back_icon_of_Search_Country_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Verify_Invite_Member_Screen();
        memberPage.Verify_Country_Code_List();
        memberPage.Click_Back_Button_From_Country_Code();
    }

    //TC-263
    @Test
    public void Verify_the_Search_icon_of_Select_Country_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Verify_Invite_Member_Screen();
        memberPage.Verify_Country_Code_List();
        memberPage.Verify_Search_Icon();
    }

    //TC-264
    @Test
    public void Verify_the_functionality_of_Search_bar()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Verify_Invite_Member_Screen();
        memberPage.Verify_Country_Code_List();
        memberPage.Verify_Search_Icon();
    }

    //TC-265
    @Test
    public void Verify_the_list_of_country_by_selecting_any_country()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Verify_Invite_Member_Screen();
        memberPage.Verify_Country_Code_List();
        memberPage.Verify_Search_Icon();
    }

    //TC-266
    @Test
    public void Verify_the_Mobile_Number_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Click_Mobile_Number_Field();
    }

    //TC-267
    @Test
    public void Verify_the_Groups_field_of_INVITE_MEMBER_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Click_Group_Dropdown_Field();
    }

    //TC-268
    @Test
    public void Verify_the_Select_All_button_Groups_Invite_Member()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Click_Group_Dropdown_Field();
        homePage.Click_Select_All_Button();
    }

    //TC-269
    @Test
    public void Verify_the_Deselect_All_button_Group_Invites_Member()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Click_Group_Dropdown_Field();
        homePage.Click_Select_All_Button();
        homePage.Click_DeSelect_All_Button();
    }

    //TC-270
    @Test
    public void Verify_the_Done_link_with_Search_bar_Groups_Invite_Member()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Click_Group_Dropdown_Field();
        homePage.Click_On_Done_Button_To_Select_Location();
    }

    //TC-271
    @Test
    public void Verify_the_functionality_of_Make_This_Member_a_Taem_Admin_checkbox()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Click_Make_Admin_Checkbox();
    }

    //TC-272
    @Test
    public void Verify_the_functionality_of_SUBMIT_button_without_entering_data_in_mandatory_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Click_Submit_Button();
        loginPage.Get_Toast_Alert("Submitting Without Entering Data Alert :- ");
    }

    //TC-273
    @Test
    public void Verify_the_functionality_of_SUBMIT_button_after_entering_data_in_mandatory_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        memberPage.Open_Members_Tab();
        memberPage.Click_Invite_Member_Button();
        memberPage.Invite_Member();
        loginPage.Get_Toast_Alert("Invited Member Toast : ");
    }

}