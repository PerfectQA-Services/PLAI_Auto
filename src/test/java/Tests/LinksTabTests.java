package Tests;

import Config.Configuration;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class LinksTabTests extends Configuration {


    //TC-274
    @Test
    public void Verify_the_fields_display_on_LINKS_tab()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Verify_Links_Tab();
    }

    //TC-275
    @Test
    public void Verify_the_functionality_of_Search_bar()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Search_Link();
    }

    //TC-276
    @Test
    public void Verify_the_functionality_of_Link_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Click_Link_Banner_And_Verify();
    }

    //TC-277
    @Test
    public void Verify_the_Angle_Up_and_Angle_Down_icon_display_on_Link_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Verify_Up_And_Down_Arrows_Functionality();
    }
    //TC-278
    @Test
    public void Verify_the_Angle_Up_icon_of_the_link_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Click_On_Angel_Up_icon();
    }
    //TC-279
    @Test
    public void Verify_the_Angle_down_icon_of_the_link_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Click_On_Angel_down_icon();
    }

    //TC-288
    @Test
    public void Verify_the_ADD_NEW_LINK_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Click_Add_New_Link_Button();
    }

    //TC-289
    @Test
    public void Verify_the_fields_display_on_CREATE_LINK_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Click_Add_New_Link_Button();
        linksTab.Verify_Create_Link_Screen();
    }

    //TC-291
    @Test
    public void Verify_the_field_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Click_Add_New_Link_Button();
        linksTab.Click_Icon_Dropdown();
    }

    //TC-292
    @Test
    public void Select_Icon_Style()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Click_Add_New_Link_Button();
        linksTab.Click_Icon_Dropdown();
        linksTab.Select_Icon_And_Verify();
    }

    //TC-293
    @Test
    public void Verify_the_Groups_field_of_CREATE_LINK_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Click_Add_New_Link_Button();
        linksTab.Click_Groups_Dropdown();
    }

    //TC-294
    @Test
    public void Verify_the_Select_All_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Click_Add_New_Link_Button();
        linksTab.Click_Groups_Dropdown();
        homePage.Click_Select_All_Button();
    }

    //TC-295
    @Test
    public void Verify_the_DeSelect_All_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Click_Add_New_Link_Button();
        linksTab.Click_Groups_Dropdown();
        homePage.Click_Select_All_Button();
        homePage.Click_DeSelect_All_Button();
    }

    //TC-296
    @Test
    public void Verify_the_Done_link_with_Search_bar()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        MembersTabPage memberPage = new MembersTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Click_Add_New_Link_Button();
        linksTab.Click_Groups_Dropdown();
        linksTab.Select_Group_And_Verify();
    }

    //TC-297
    @Test
    public void Verify_the_Show_URL_field_by_click_on_YES_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        SettingPage settingsPage = new SettingPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Click_Add_New_Link_Button();
        linksTab.Verify_URL_Displayed_if_Selected_Yes_In_Banner();
        settingsPage.Click_On_Confirm_Button_And_Verify_Result_Logout();
    }

    //TC-298
    @Test
    public void Verify_the_Show_URL_field_by_click_on_No_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        SettingPage settingsPage = new SettingPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Click_Add_New_Link_Button();
        linksTab.Verify_URL_Not_Displayed_if_Selected_No_In_Banner();
        settingsPage.Click_On_Confirm_Button_And_Verify_Result_Logout();
    }

    //TC-299
    @Test
    public void Verify_the_SUBMIT_button_of_CREATE_LINK_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        LinksTabPage linksTab = new LinksTabPage(driver);
        SettingPage settingsPage = new SettingPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        linksTab.Open_Links_Tab();
        linksTab.Click_Add_New_Link_Button();
        linksTab.Verify_URL_Displayed_if_Selected_Yes_In_Banner();
        settingsPage.Click_On_Confirm_Button_And_Verify_Result_Logout();
    }



}