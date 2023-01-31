package Tests;

import Config.Configuration;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class ManageAdsTests extends Configuration {

    //113
    @Test
    public void Verify_the_Fields_display_on_the_MANAGE_ADS_tab ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Verify_Manage_Ads_Tab_Elements();

    }
    //114
    @Test
    public void Verify_the_ADD_NEW_ADS_button ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();

    }
    //115
    @Test
    public void Verify_the_fields_display_on_the_ADD_NEW_ADS_screen ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Verify_Add_Ads_Page_Elements();

    }
    //116
    @Test
    public void Verify_the_Name_field ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Click_On_Name_Label_And_Enter_data();

    }
    //117
    @Test
    public void Verify_the_Gender_field ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Click_On_Gender_Label_And_Verify_Elements();

    }
    //120
    @Test
    public void Verify_the_functionality_of_Age_field ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Verify_Scrollbar_Of_Age();

    }
    //121
    @Test
    public void Verify_the_App_Ads_Image_field ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Click_On_App_Ads_Image();
        signup.verify_user_information_page_button("Camera");
        signup.verify_user_information_page_button("Gallery");

    }
    //122
    @Test
    public void Verify_the_Web_Ads_Image_field ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Click_On_Web_Ads_Image();
        signup.verify_user_information_page_button("Camera");
        signup.verify_user_information_page_button("Gallery");

    }
    //123
    @Test
    public void Verify_the_Camera_option ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Click_On_Web_Ads_Image();
        signup.click_on_user_information_page_button("Camera");
        signup.Verify_Camera_App_Opened();

    }
    //124
    @Test
    public void Verify_the_Gallery_option ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Click_On_Web_Ads_Image();
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();

    }
    //125
    @Test
    public void Verify_the_screen_after_photo_select_from_Gallery ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Click_On_Web_Ads_Image();
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Verify_Modify_Image_Screen();

    }
    //126
    @Test
    public void Verify_the_navigation_by_clicking_on_Back_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Click_On_Web_Ads_Image();
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        manageAdsPage.Click_On_Back_Icon_of_Gallery();

    }
    //127
    @Test
    public void Verify_the_functionality_of_Rotation_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Click_On_Web_Ads_Image();
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Rotate_Image();

    }
    //128
    @Test
    public void Verify_the_functionality_of_Flip_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Click_On_Web_Ads_Image();
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Flip_Image();

    }
    //129
    @Test
    public void Verify_the_functionality_of_Crop_link()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Click_On_Web_Ads_Image();
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Flip_Image();
        signup.Verify_Image_Uploaded();

    }
    //130
    @Test
    public void Verify_the_Gallery_option_for_App_Ads_Image_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Click_On_App_Ads_Image();
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Flip_Image();
        signup.Verify_Image_Uploaded();

    }
    //131
    @Test
    public void Verify_the_functionality_of_Redirect_URL_field_by_entering_invalid_format_of_url ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Click_On_Name_Label_And_Enter_data();
        manageAdsPage.Verify_Scrollbar_Of_Age();
        manageAdsPage.Click_On_App_Ads_Image();
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Flip_Image();
        signup.Verify_Image_Uploaded();
        manageAdsPage.Click_On_Web_Ads_Image();
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Flip_Image();
        signup.Verify_Image_Uploaded();
        manageAdsPage.Enter_Invalid_Redirect_Url();
        manageAdsPage.Click_On_Back_Confirm_Button();
        loginPage.Get_Toast_Alert("Getting this error when tap on continue.a");

    }
    //132
    @Test
    public void Verify_the_functionality_of_Redirect_URL_field_by_entering_valid_format_of_url ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageAdsPage.Click_On_Manage_Ads_Tab();
        manageAdsPage.Click_On_Add_New_Ads_Button();
        manageAdsPage.Click_On_Name_Label_And_Enter_data();
        manageAdsPage.Verify_Scrollbar_Of_Age();
        manageAdsPage.Click_On_App_Ads_Image();
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Flip_Image();
        signup.Verify_Image_Uploaded();
        manageAdsPage.Click_On_Web_Ads_Image();
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Flip_Image();
        signup.Verify_Image_Uploaded();
        manageAdsPage.Enter_Valid_Redirect_Url();
        manageAdsPage.Click_On_Back_Confirm_Button();
        loginPage.Get_Toast_Alert("Getting this error when tap on continue.a");

    }

}
