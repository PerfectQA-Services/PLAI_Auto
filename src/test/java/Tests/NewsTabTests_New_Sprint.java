package Tests;

import Config.Configuration;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class NewsTabTests_New_Sprint extends Configuration {

    //TC-69
    @Test
    public void Verify_the_NEWS_tab_for_Admin_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        newsTab.Verify_News_Tab();
    }
    //TC-70
    @Test
    public void Verify_the_Pin_icon_display_on_the_article_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        NewsTabPage_New_Sprint newstab_club_banner=new NewsTabPage_New_Sprint(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        newstab_club_banner.Click_On_Pin_Icon();
    }
    //TC-71
    @Test
    public void Verify_the_position_of_pinned_article_by_adding_new_article()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        newsTab.Click_Add_New_Article_Button();
        newsTab.Create_New_Article();
        newsTab.Click_Preview_Button();
        newsTab.Verify_Preview_Screen();
        homePage.Click_Confirm_Button();
        signUp.click_on_user_information_page_button("CLOSE");
    }
    //TC-70
    @Test
    public void Verify_the_position_of_article_after_unpinned_it()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        NewsTabPage_New_Sprint newstab_club_banner=new NewsTabPage_New_Sprint(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        newstab_club_banner.Click_On_Pin_Icon();
        newstab_club_banner.Click_On_Pin_Icon();
    }
    //TC-73
    @Test
    public void Verify_the_functionality_of_Pin_icon_by_tapping_on_Pin_icon_of_two_article_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        NewsTabPage_New_Sprint newstab_club_banner=new NewsTabPage_New_Sprint(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        newstab_club_banner.Click_On_Pin_Icon_Of_Second_Banner();
    }
    //TC-84
    @Test
    public void Verify_the_fields_display_in_NEW_ARTICLE_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        NewsTabPage_New_Sprint newstab_club_banner=new NewsTabPage_New_Sprint(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        newsTab.Verify_News_Tab();
        newsTab.Verify_Sort_Filter_News_Tab();
        newsTab.Open_News_Article();
        newsTab.Edit_Article();
        newstab_club_banner.Verify_Upload_Documents();
    }

}
