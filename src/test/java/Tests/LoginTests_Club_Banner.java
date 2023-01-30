package Tests;

import Config.Configuration;
import Pages.LaunchAppPage;
import Pages.LoginPage;
import Pages.LoginPage_Club_Banner;
import Pages.SignUpPage_Club_Banner;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class LoginTests_Club_Banner extends Configuration {

    //TC-59
    @Test
    public void Verify_the_fields_display_on_Login_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        loginPage.Verify_Login_Screen_Elements();
    }
    //TC-60
    @Test
    public void Verify_the_functionality_of_Login_with_Google ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        LoginPage_Club_Banner login_club_banner=new LoginPage_Club_Banner(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        login_club_banner.Click_On_Google_Icon();
    }
    //TC-63
    @Test
    public void Verify_the_functionality_of_Login_with_Facebook ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        LoginPage_Club_Banner login_club_banner=new LoginPage_Club_Banner(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        login_club_banner.Click_On_Facebook_Icon();
    }
}
