package Tests;

import Config.Configuration;
import Pages.HomePage;
import Pages.LaunchAppPage;
import Pages.LoginPage;
import Pages.SignUpPage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.IOException;

public class HomePageTests extends Configuration {

    //TC-76
    @Test
    public void Verify_fields_of_Home_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        homePage.Verify_Home_Page_Elements();
    }

    //TC-77
    @Test
    public void Verify_the_functionality_of_Search_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_On_Search_Icon();
        homePage.Verify_Search_Page_Elements();
    }

    //TC-78
    @Test
    public void Verify_the_navigation_by_clicking_on_Back_icon_of_Search_Team_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_On_Search_Icon();
        homePage.Click_back_Button_Of_Search();
    }

    //TC-79
    @Test
    public void Verify_the_functionality_of_Search_bar()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_On_Search_Icon();
        homePage.Verify_Search_Functionality();
    }

    //TC-80
    @Test
    public void Verify_the_banner_for_searched_club()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_On_Search_Icon();
        homePage.Verify_Search_Functionality();
    }

    //TC-81
    @Test
    public void Verify_the_banner_for_searched_club_2_Verify_Pending_Request()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_On_Search_Icon();
        homePage.Verify_Search_Functionality();
        homePage.Join_Searched_Team();
    }

    //TC-82
    @Test
    public void Verify_the_Profile_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Navigate_To_Profile_Screen();
    }

    //TC-83
    @Test
    public void Verify_the_fields_of_Profile_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Navigate_To_Profile_Screen();
        homePage.Verify_Profile_Screen();
    }

    //TC-84
    @Test
    public void Verify_the_functionality_of_Edit_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Navigate_To_Profile_Screen();
        homePage.Navigate_To_Edit_Profile_Screen();
    }

    //TC-85
    @Test
    public void Verify_the_fields_display_on_Edit_Profile_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Navigate_To_Profile_Screen();
        homePage.Navigate_To_Edit_Profile_Screen();
        homePage.Verify_Edit_Profile_Screen();
    }

    //TC-86
    @Test
    public void Verify_Done_icon_of_Edit_Profile_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Navigate_To_Profile_Screen();
        homePage.Navigate_To_Edit_Profile_Screen();
        homePage.Click_On_Done_Button_To_Save_Edited_Profile();
        loginPage.Get_Toast_Alert("Verify Profile Edited Toast Alert");
    }

    //TC-87
    @Test
    public void Verify_the_Location_field_of_EDIT_PROFILE_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Navigate_To_Profile_Screen();
        homePage.Navigate_To_Edit_Profile_Screen();
        homePage.Verify_Edit_Location_In_Edit_Profile();
    }

    //TC-88
    @Test
    public void Verify_the_Location_field_by_tap_on_Dropdown_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Navigate_To_Profile_Screen();
        homePage.Navigate_To_Edit_Profile_Screen();
        homePage.Verify_Edit_Location_In_Edit_Profile();
    }

    //TC-89
    @Test
    public void Verify_the_Done_link_without_selecting_any_option()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Navigate_To_Profile_Screen();
        homePage.Navigate_To_Edit_Profile_Screen();
        homePage.Verify_Edit_Location_In_Edit_Profile();
        homePage.Unselect_Location_In_Edit_Profile();
        loginPage.Get_Toast_Alert("Verify Toast Message Please selected minimum 1 item");
    }

    //TC-90
    @Test
    public void Verify_the_Done_link_with_Search_bar()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Navigate_To_Profile_Screen();
        homePage.Navigate_To_Edit_Profile_Screen();
        homePage.Edit_Location_With_Search_Bar();
    }

    //TC-91
    @Test
    public void Verify_the_Mobile_Number_field_by_entering_more_than_10_digit_number_More_Than_10_Digits()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Navigate_To_Profile_Screen();
        homePage.Navigate_To_Edit_Profile_Screen();
        homePage.Edit_Phone_Number_With_More_Than_10_Number();
        homePage.Click_On_Done_Button_To_Save_Edited_Profile();
        loginPage.Get_Toast_Alert("Number Not allowed more than 10 digits");
    }

    //TC-92
    @Test
    public void Verify_the_Mobile_Number_field_by_entering_more_than_10_digit_number()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Navigate_To_Profile_Screen();
        homePage.Navigate_To_Edit_Profile_Screen();
        homePage.Edit_Phone_Number();
        homePage.Click_On_Done_Button_To_Save_Edited_Profile();
        loginPage.Get_Toast_Alert("Profile Updated Toast Message");
    }

    //TC-93
    @Test
    public void Verify_the_navigation_of_Back_icon_display_on_Profile_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Navigate_To_Profile_Screen();
        homePage.CLick_Back_Button_From_Profile();
    }

    //TC-94
    @Test
    public void Verify_the_functionality_of_Pending_Request_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_On_Pending_Requests();
    }

    //TC-95
    @Test
    public void Verify_the_fields_display_on_Pending_Request_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_On_Pending_Requests();
        homePage.Verify_Pending_Requests_Elements();
    }

    //TC-96
    @Test
    public void Verify_the_functionality_of_Search_bar_Pending_Requests()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_On_Pending_Requests();
        homePage.Verify_Search_Bar_Functionality_Of_Pending_Request();
    }

    //TC-97
    @Test
    public void Verify_the_functionality_of_Sort_by_filter()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Sort_Button();
        homePage.Verify_Sort_Panel();
    }

    //TC-98
    @Test
    public void Verify_the_Bookmark_option_of_Please_Select_popup()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Sort_Button();
        homePage.Verify_Bookmark_Sort_Option();
    }

    //TC-99
    @Test
    public void Verify_the_functionality_of_Article_banners()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Open_Article();
    }

    //TC-100
    @Test
    public void Verify_the_Share_icon_of_Article_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Verify_Share_Article();
    }

    //TC-101
    @Test
    public void Verify_the_Bookmark_icon_of_Article_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Sort_Button();
        homePage.Verify_Bookmark_Sort_Option();
        homePage.Click_Sort_Button();
        homePage.Select_All_Option_In_Sort();
        homePage.Bookmark_Article();
        homePage.Click_Sort_Button();
        homePage.Verify_Article_Bookmarked();
    }

    //TC-102
    @Test
    public void Verify_the_Location_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Location_Icon();
        homePage.Verify_Search_Page_Elements();
    }

    //TC-103
    @Test
    public void Verify_the_navigation_by_clicking_on_Back_icon_of_Search_Team_screen_From_Location_Icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Location_Icon();
        homePage.Verify_Search_Page_Elements();
        homePage.Click_back_Button_Of_Search();
    }

    //TC-104
    @Test
    public void Verify_the_functionality_of_Search_bar_From_Location_Icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Location_Icon();
        homePage.Verify_Search_Functionality();
    }

    //TC-105
    @Test
    public void Verify_the_banner_for_searched_club_From_Location_Icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Location_Icon();
        homePage.Verify_Search_Functionality();
        homePage.Verify_Join_Team_Button();
    }

    //TC-106
    @Test
    public void Verify_Sliding_banner_for_member()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Member_Club_Banner();
        homePage.Verify_Member_Club_Screen();
    }

    //TC-107
    @Test
    public void Verify_Sliding_banner_for_Admin()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Verify_Admin_Club_Screen();
    }

    //TC-108
    @Test
    public void Verify_the_Edit_button_for_admin_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Click_Edit_Button_In_Club_Admin_Page();
    }

    //TC-109
    @Test
    public void Verify_the_fields_display_on_first_screen_of_Update_Team()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Click_Edit_Button_In_Club_Admin_Page();
        homePage.Verify_Admin_Club_First_Edit_Screen();
    }

    //TC-110
    @Test
    public void Verify_the_NEXT_button_of_UPDATE_TEAM_screen_without_entering_data_in_mandatory_fields()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Click_Edit_Button_In_Club_Admin_Page();
        homePage.Clear_Data_In_Edit_Form();
        homePage.Click_On_Next_Button();
        loginPage.Get_Toast_Alert("Validation for Mandatory Field :- ");
    }

    //TC-111
    @Test
    public void Verify_the_NEXT_button_of_UPDATE_TEAM_screen_by_entering_data_in_mandatory_fields()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Click_Edit_Button_In_Club_Admin_Page();
        homePage.Click_On_Next_Button();
        homePage.Verify_Admin_Club_Second_Edit_Screen();
    }

    //TC-112
    @Test
    public void Verify_the_fields_display_on_second_screen_of_Update_Team()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Click_Edit_Button_In_Club_Admin_Page();
        homePage.Click_On_Next_Button();
        homePage.Verify_Admin_Club_Second_Edit_Screen();
    }

    //TC-113
    @Test
    public void Verify_dropdown_list_for_Country_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Click_Edit_Button_In_Club_Admin_Page();
        homePage.Click_On_Next_Button();
        homePage.Verify_Admin_Club_Second_Edit_Screen();
        homePage.Verify_Country_Dropdown();
    }

    //TC-114
    @Test
    public void Verify_Done_link_by_selecting_country_from_the_list()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Click_Edit_Button_In_Club_Admin_Page();
        homePage.Click_On_Next_Button();
        homePage.Verify_Admin_Club_Second_Edit_Screen();
        homePage.Verify_Country_Dropdown();
        homePage.Update_Location();
    }

    //TC-115
    @Test
    public void Verify_Search_bar_of_dropdown_list_for_Country()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Click_Edit_Button_In_Club_Admin_Page();
        homePage.Click_On_Next_Button();
        homePage.Verify_Admin_Club_Second_Edit_Screen();
        homePage.Verify_Country_Dropdown();
        homePage.Update_Location();
    }

    //TC-116
    @Test
    public void Verify_UPDATE_TEAM_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Click_Edit_Button_In_Club_Admin_Page();
        homePage.Click_On_Next_Button();
        homePage.Verify_Admin_Club_Second_Edit_Screen();
        homePage.Verify_Country_Dropdown();
        homePage.Update_Location();
        homePage.Click_On_Next_Button();
        homePage.Click_On_Update_Team();
        homePage.Verify_Team_Update_popUp();
    }

    //TC-117
    @Test
    public void Verify_the_functionality_of_CLOSE_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Click_Edit_Button_In_Club_Admin_Page();
        homePage.Click_On_Next_Button();
        homePage.Verify_Admin_Club_Second_Edit_Screen();
        homePage.Click_On_Next_Button();
        homePage.Click_On_Update_Team();
        homePage.Verify_Team_Update_popUp();
        signUp.click_on_user_information_page_button("CLOSE");
        homePage.Verify_Admin_Club_Screen();
    }

    //TC-118
    @Test
    public void Verify_the_REQUEST_tab_for_admin_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Verify_Admin_Club_Screen();
    }

    //TC-119
    @Test
    public void Verify_the_functionality_of_Search_bar_Request_Tab_Admin()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Search_Requested_Users();
    }

    //TC-120
    @Test
    public void Verify_the_Accept_button_on_request_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Accept_User_Request();
        homePage.Verify_Assign_Groups_Popup();
    }

    //TC-121
    @Test
    public void Verify_the_Assign_Groups_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Accept_User_Request();
        homePage.Verify_Assign_Groups_Popup();
        homePage.Click_Assign_Groups_Dropdown();
        homePage.Select_Group();
    }

    //TC-122
    @Test
    public void Verify_the_Select_All_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Accept_User_Request();
        homePage.Verify_Assign_Groups_Popup();
        homePage.Click_Assign_Groups_Dropdown();
        homePage.Click_Select_All_Button();
    }

    //TC-123
    @Test
    public void Verify_the_Deselect_All_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Accept_User_Request();
        homePage.Verify_Assign_Groups_Popup();
        homePage.Click_Assign_Groups_Dropdown();
        homePage.Click_Select_All_Button();
        homePage.Click_DeSelect_All_Button();
    }

    //TC-124
    @Test
    public void Verify_the_Done_link_with_Search_bar_In_Assign_Groups()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Accept_User_Request();
        homePage.Verify_Assign_Groups_Popup();
        homePage.Click_Assign_Groups_Dropdown();
        homePage.Search_And_Select_Group();
    }

    //TC-125
    @Test
    public void Verify_the_Confirm_button_without_entering_data_in_Assign_Groups()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Accept_User_Request();
        homePage.Verify_Assign_Groups_Popup();
        homePage.Click_Confirm_Button();
        loginPage.Get_Toast_Alert("Alert to select Group");
    }

    //TC-126
    @Test
    public void Verify_the_Confirm_button_after_entering_data_in_Assign_Groups()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Admin_Club_Banner();
        homePage.Accept_User_Request();
        homePage.Verify_Assign_Groups_Popup();
        homePage.Click_Assign_Groups_Dropdown();
        homePage.Click_Select_All_Button();
        homePage.Click_On_Done_Button_To_Select_Location();
        homePage.Click_Confirm_Button();
        loginPage.Get_Toast_Alert("Success Alert :- ");
        homePage.Delete_Member_And_Send_Request_Again_1();
        loginPage.Login_with_Random_valid_Credentials("saregama@mailinator.com","Test123.");
        homePage.Click_On_Search_Icon();
        homePage.Delete_Member_And_Send_Request_Again_2();
    }

    //TC-153 - Nov-Dec-Sprint
    @Test
    public void Verify_the_Calendar_icon_display_on_the_home_page()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Verify_Calender_Icon_Functionality();
    }

    //TC-154 - Nov-Dec-Sprint
    @Test
    public void Verify_the_functionality_to_show_next_previous_month_calendar()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Verify_Calender_Icon_Functionality();
        homePage.Verify_Calender_Month_Navigation();
    }

    //TC-157 - Nov-Dec-Sprint
    @Test
    public void Verify_the_functionality_of_date_on_which_one_event_is_booked()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage signUp = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Verify_Calender_Icon_Functionality();
        homePage.Verify_Calender_Month_Navigation();
        homePage.Verify_Events_List_By_Clicking_On_Date();
    }

}