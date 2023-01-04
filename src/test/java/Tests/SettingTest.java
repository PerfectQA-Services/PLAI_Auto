package Tests;

import Config.Configuration;
import Pages.CreateTeamPage;
import Pages.LaunchAppPage;
import Pages.LoginPage;
import Pages.SettingPage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class SettingTest extends Configuration {

    //338
    @Test
    public void Verify_the_Setting_icon_placed_at_bottom_right_of_the_Home_screen() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Verify_Setting_Header();
        settingpage.Verify_Setting_Page_Element();

    }
    //339
    @Test
    public void Verify_the_fields_display_on_SETTINGS() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Verify_Setting_Header();
        settingpage.Verify_Setting_Page_Element();

    }
   //340
    @Test
    public void Verify_Report_an_issue_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();


    }

}
