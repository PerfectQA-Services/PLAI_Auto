package Tests;

import Config.Configuration;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.IOException;

public class NewsTabTests extends Configuration {

    
    //TC-127
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

    //TC-128
    @Test
    public void Verify_the_Search_bar_for_NEWS_tab()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Search_News();
    }

    //TC-129
    @Test
    public void Verify_the_Sort_by_filter_of_NEWS_tab()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        newsTab.Verify_News_Tab();
        newsTab.Verify_Sort_Filter_News_Tab();
    }

    //TC-131
    @Test
    public void Verify_the_Bookmark_icon_of_Article_banner_of_NEWS_tab()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        newsTab.Verify_News_Tab();
        newsTab.Bookmark_News_Article();
    }

    //TC-132
    @Test
    public void Verify_the_Share_icon_of_Article_banner_of_NEWS_tab()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        newsTab.Verify_News_Tab();
        newsTab.Verify_Share_News_Article();
    }

    //TC-133
    @Test
    public void Verify_the_functionality_of_Article_banners_News_Tab()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        newsTab.Verify_News_Tab();
        newsTab.Verify_Sort_Filter_News_Tab();
        newsTab.Open_News_Article();
    }

    //TC-134
    @Test
    public void Verify_the_functionality_of_Edit_icon_News_Article()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        newsTab.Verify_News_Tab();
        newsTab.Verify_Sort_Filter_News_Tab();
        newsTab.Open_News_Article();
    }

    //TC-135
    @Test
    public void Verify_the_fields_display_in_NEW_ARTICLE_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
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
    }

    //TC-136
    @Test
    public void Verify_the_PREVIEW_button_after_entering_data_in_mandatory_field_Edit_Article()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
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
        newsTab.Verify_Preview_Of_Update_In_Article();
    }

    //TC-136
    @Test
    public void Verify_the_functionality_of_CONFIRM_button_Edit_Article()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Verify_Sort_Filter_News_Tab();
        newsTab.Open_News_Article();
        newsTab.Edit_Article();
        newsTab.Click_Preview_Button();
        homePage.Click_Confirm_Button();
        newsTab.Verify_Article_Updated_Popup();
        signUp.Click_Close_Button();
    }

    //TC-138
    @Test
    public void Verify_the_functionality_of_Delete_icon()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Verify_Sort_Filter_News_Tab();
        newsTab.Open_News_Article();
        newsTab.Click_Delete_Article();
    }

    //TC-139
    @Test
    public void Verify_the_functionality_of_Dismiss_button_of_confirmation_popup()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Open_News_Article();
        newsTab.Click_Delete_Article();
        newsTab.Click_Dismiss_Button();
    }

    //TC-140
    @Test
    public void Verify_the_functionality_of_Confirm_button_of_confirmation_popup()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Verify_Sort_Filter_News_Tab();
        newsTab.Open_News_Article();
        newsTab.Click_Delete_Article();
//        homePage.Click_Confirm_Button();
    }

    //TC-145
    @Test
    public void Verify_the_navigation_of_Add_New_Article_button()throws InterruptedException, IOException, AWTException, ParseException {
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
    }

    //TC-146
    @Test
    public void Verify_the_fields_display_on_NEW_ARTICLE_screen()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Verify_New_Article_Screen();
    }

    //TC-147
    @Test
    public void Verify_the_PREVIEW_button_without_entering_data_in_mandatory_field()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Click_Preview_Button();
        loginPage.Get_Toast_Alert("Preview without entering data alert : ");
    }

    //TC-148
    @Test
    public void Verify_Send_an_email_field_by_clicking_on_NO_button()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Click_No_For_Sent_Email();
    }

    //TC-149
    @Test
    public void Verify_Send_an_Notification_field_by_clicking_on_NO_button()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Click_No_For_Sent_Notifications();
    }

    //TC-150
    @Test
    public void Verify_Allow_Comments_field_by_clicking_on_NO_button()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Click_No_For_Allow_Comments();
    }

    //TC-151
    @Test
    public void Verify_the_Publish_Now_field_by_clicking_on_NO_menu_option()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Select_No_For_Publish_Now();
    }

    //TC-152
    @Test
    public void Verify_the_functionality_of_Publish_Date_field()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Select_No_For_Publish_Now();
        newsTab.Verify_Select_Date_To_Publish();
    }

    //TC-153
    @Test
    public void Verify_the_Close_button_of_calendar()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Select_No_For_Publish_Now();
        newsTab.Verify_Select_Date_To_Publish();
        newsTab.Click_Cancel_Button_Date_Calender();
    }

    //TC-154
    @Test
    public void Verify_the_Ok_button_of_Calendar()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Select_No_For_Publish_Now();
        newsTab.Verify_Select_Date_To_Publish();
        newsTab.Select_Date();
    }

    //TC-155
    @Test
    public void Verify_the_functionality_of_Time_field()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Select_No_For_Publish_Now();
        newsTab.Verify_Select_Time_To_Publish();
    }

    //TC-156
    @Test
    public void Verify_the_PREVIEW_button_after_entering_data_in_mandatory_field__Add_New_Article()throws InterruptedException, IOException, AWTException, ParseException {
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
    }

    //TC-157
    @Test
    public void Verify_the_functionality_of_CONFIRM_button_Add_New_Article()throws InterruptedException, IOException, AWTException, ParseException {
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
    }

    //TC-158
    @Test
    public void Verify_Close_button_Add_New_Article()throws InterruptedException, IOException, AWTException, ParseException {
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
    //Nov-Dec Sprint
    //TC-118
    @Test
    public void Verify_the_SMS_functionality_for_NEWS()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Create_New_Article_With_Sms();
        newsTab.Click_Preview_Button();
        newsTab.Verify_Payment_Page_Header();

    }
    //TC-119
    @Test
    public void Verify_the_fields_display_on_the_PAYMENT_screen()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Create_New_Article_With_Sms();
        newsTab.Click_Preview_Button();
        newsTab.Verify_Payment_Page_Elements();

    }
    //TC-120
    @Test
    public void Verify_the_CHANGE_CARD_button ()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Create_New_Article_With_Sms();
        newsTab.Click_Preview_Button();
        newsTab.Click_Change_Card_Button_Verify_Result();

    }
    //TC-121
    @Test
    public void Verify_the_CONFIRM_button_display_on_PAYMENT_screen ()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Create_New_Article_With_Sms();
        newsTab.Click_Preview_Button();
        newsTab.Click_Confirm_Button();

    }
    //Nov-Dec Sprint
    //TC-114
    @Test
    public void Verify_the_cards_display_on_the_CHECKOUT_screen ()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Create_New_Article_With_Sms();
        newsTab.Click_Preview_Button();
        newsTab.Click_Confirm_Button();

    }
    //TC-135
    @Test
    public void Verify_the_functionality_of_Ads_display_to_the_team_member_of_groups_in_NEWS_tab ()throws InterruptedException, IOException, AWTException, ParseException {
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
        homePage.Click_Vzhx_Admin_Club_Banner();
        newsTab.Verify_Ads_at_3rd_Position();

    }
    //TC-137
    @Test
    public void Verify_the_functionality_of_Ads_not_display_to_the_subscribed_team_member_of_groups_in_NEWS_tab ()throws InterruptedException, IOException, AWTException, ParseException {
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
        newsTab.Verify_Ads_at_3rd_Position();

    }
}