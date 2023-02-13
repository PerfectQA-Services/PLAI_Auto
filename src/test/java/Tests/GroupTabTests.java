package Tests;

import Config.Configuration;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class GroupTabTests extends Configuration {

    //TC-300
    @Test
    public void Verify_the_fields_display_on_GROUPS_tab() throws InterruptedException, IOException, ParseException {

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
        grouptab.Open_Group_Tab();
        grouptab.Verify_Element_of_Group_Tab();

    }
    //TC-301
    @Test
    public void Verify_the_Angle_Up_and_Angle_Down_icon_display_on_Link_banner() throws InterruptedException, IOException, ParseException {

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
        grouptab.Open_Group_Tab();
        grouptab.Verify_UP_And_Down_Arrow_of_Group_Tab();

    }
    //TC-302
    @Test
    public void Verify_the_Angle_Up_icon_of_the_link_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        linksTab.Click_On_Angel_Up_icon();
    }
    //TC-303
    @Test
    public void Verify_the_Angle_down_icon_of_the_link_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        linksTab.Click_On_Angel_down_icon();
    }
    //TC-304
    @Test
    public void Verify_the_functionality_of_Search_bar()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Enter_Group_Name_In_Serachbar_Verify_Result();

    }
    //TC-305
    @Test
    public void Verify_the_functionality_of_GROUPS_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Group_And_Verify_Group_Information();

    }
    //TC-306
    @Test
    public void Verify_the_Delete_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Delete_Icon();
        grouptab.Verify_Dismiss_And_Confirm_Button();

    }
    //TC-307
    @Test
    public void Verify_the_Dismiss_button_of_confirmation_popup()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Delete_Icon();
        grouptab.Verify_Dismiss_And_Confirm_Button();
        grouptab.Click_On_Dismiss_Button();

    }
    //TC-308
    @Test
    public void Verify_the_Confirm_button_of_confirmation_popup()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Delete_Icon();
        grouptab.Verify_Dismiss_And_Confirm_Button();
//        grouptab.Click_On_Confirm_Button();

    }
    //TC-309
    @Test
    public void Verify_the_Edit_icon_of_group_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Edit_Icon_Verify_Result();

    }
    //TC-310
    @Test
    public void Verify_the_fields_of_EDIT_GROUP_popup()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Edit_Icon_Verify_Result();
        grouptab.Verify_Edit_Group_Popup_Element();

    }
    //TC-311
    @Test
    public void Verify_the_CONFIRM_button_after_editing_the_data()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Edit_Icon_Verify_Result();
        grouptab.Enter_Data_In_Edit_Group_Popup_Element();

    }
    //TC-312
    @Test
    public void Verify_the_Team_Name_field_by_entering_more_than_20_character()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Edit_Icon_Verify_Result();
        grouptab.Enter_20_Letter_In_Edit_Group_Description();

    }
    //TC-313
    @Test
    public void Verify_the_Team_Bio_field_by_entering_more_than_70_character()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Edit_Icon_Verify_Result();
        grouptab.Enter_More_Than_70_Letter_In_Edit_Group_Description();

    }
    //TC-314
    @Test
    public void Verify_the_CONFIRM_button_after_editing_the_data_Close_Button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Edit_Icon_Verify_Result();
        grouptab.Enter_Data_In_Edit_Group_Popup_Element();
        grouptab.Verify_Close_Button();

    }
    //TC-315
    @Test
    public void Verify_the_CLOSE_button ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Edit_Icon_Verify_Result();
        grouptab.Enter_Data_In_Edit_Group_Popup_Element();
        grouptab.Click_On_Close_Button();

    }
    //TC-316
    @Test
    public void Verify_the_functionality_of_ADD_NEW_GROUP_button ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Add_New_Group_Button();

    }
    //TC-317
    @Test
    public void Verify_the_CONFIRM_button_without_entering_data_in_mandatory_field ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Add_New_Group_Button();
        grouptab.Click_On_Confirm_Button();
        loginPage.Get_Toast_Alert("Displayed message is");

    }
    //TC-318
    @Test
    public void Verify_the_Team_Name_field_by_entering_more_than_20_character_Add_New_Group()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Add_New_Group_Button();
        grouptab.Enter_20_Letter_In_Edit_Group_Description();

    }
    //TC-319
    @Test
    public void Verify_the_Team_Bio_field_by_entering_more_than_70_character_Add_New_Group()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Add_New_Group_Button();
        grouptab.Enter_More_Than_70_Letter_In_Edit_Group_Description();

    }
    //TC-320
    @Test
    public void Verify_the_CLOSE_button_Add_New_Group ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Click_On_Add_New_Group_Button();
        grouptab.Enter_Data_In_Edit_Group_Popup_Element();
        grouptab.Click_On_Close_Button();

    }
    //TC-321
    @Test
    public void Verify_the_social_media_icon  ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Verify_Social_Media_Icon();

    }
    //TC-321
    @Test
    public void Verify_the_navigation_by_tap_on_Back_icon  ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        GroupTabPage grouptab=new GroupTabPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        grouptab.Open_Group_Tab();
        grouptab.Verify_Social_Media_Icon();
        signup.click_on_back_button();

    }

}
