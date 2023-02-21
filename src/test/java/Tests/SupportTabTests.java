package Tests;

import Config.Configuration;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class SupportTabTests extends Configuration {

    //400
    @Test
    public void Verify_the_Support_field() throws InterruptedException, IOException, ParseException {
        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Verify_Setting_Header();
        supportTab.Click_Support_Tab();
    }

    //401
    @Test
    public void Verify_the_field_display_on_SUPPORT_field() throws InterruptedException, IOException, ParseException {
        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Verify_Setting_Header();
        supportTab.Click_Support_Tab();
        supportTab.Click_Support_Tab();
        supportTab.Verify_Support_Tab();
    }

    //402
    @Test
    public void Verify_the_General_User_Support_and_Team_Admin_Support_button() throws InterruptedException, IOException, ParseException {
        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Verify_Setting_Header();
        supportTab.Click_Support_Tab();
        supportTab.Click_Support_Tab();
        supportTab.Select_Support_Type_And_Verify_Them();
    }

    //403
    @Test
    public void Verify_the_First_Name_field() throws InterruptedException, IOException, ParseException {
        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Verify_Setting_Header();
        supportTab.Click_Support_Tab();
        supportTab.Click_Support_Tab();
        supportTab.Enter_First_Name();
    }

    //404
    @Test
    public void Verify_the_Last_Name_field() throws InterruptedException, IOException, ParseException {
        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Verify_Setting_Header();
        supportTab.Click_Support_Tab();
        supportTab.Click_Support_Tab();
        supportTab.Enter_Last_Name();
    }

    //405
    @Test
    public void Verify_the_Select_Team_field() throws InterruptedException, IOException, ParseException {
        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Verify_Setting_Header();
        supportTab.Click_Support_Tab();
        supportTab.Click_Support_Tab();
        supportTab.Select_Team();
    }

    //407
    @Test
    public void Verify_the_Description_field() throws InterruptedException, IOException, ParseException {
        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Verify_Setting_Header();
        supportTab.Click_Support_Tab();
        supportTab.Click_Support_Tab();
        supportTab.Enter_Support_Description();
    }

    //407
    @Test
    public void Verify_the_CONFIRM_button_after_entering_data_in_mandatory_field() throws InterruptedException, IOException, ParseException {
        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        HomePage homePage = new HomePage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Verify_Setting_Header();
        supportTab.Click_Support_Tab();
        supportTab.Click_Support_Tab();
        supportTab.Select_Support_Type_And_Verify_Them();
        supportTab.Enter_First_Name();
        supportTab.Enter_Last_Name();
        supportTab.Enter_Support_Description();
        homePage.Click_Confirm_Button();
        loginPage.Get_Toast_Alert("Toast Alert for Support Request Submission :- ");
    }


}
