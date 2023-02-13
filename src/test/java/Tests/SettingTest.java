package Tests;

import Config.Common;
import Config.Configuration;
import Pages.*;
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
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        supportTab.Click_Support_Tab();
        settingpage.Click_On_Report_An_Issue_Label();

    }
    //341
    @Test
    public void Verify_the_fields_display_on_PLAI_PUBLIC_FEEDBACK_FORUM_screen() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        supportTab.Click_Support_Tab();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Verify_Public_FeedBack_Forum_Page_Element();


    }
    //342
    @Test
    public void Verify_the_Submission_Type_field() throws InterruptedException, IOException, ParseException {
        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        supportTab.Click_Support_Tab();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Verify_Submission_Type_Field_Element();
    }
    //343
    @Test
    public void Verify_the_Select_Device_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        supportTab.Click_Support_Tab();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Click_On_Ios_Button();

    }
    //344
    @Test
    public void Verify_the_Full_name_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        supportTab.Click_Support_Tab();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Verify_Full_Name_Field();

    }
    //345
    @Test
    public void Verify_the_Email_field_by_entering_invalid_email_id() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        Common common = new Common();
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        supportTab.Click_Support_Tab();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Verify_Full_Name_Field();
        settingpage.Enter_Invalid_Email_And_Verify_Result();
        settingpage.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        settingpage.Enter_Team_Description();
        settingpage.Enter_Description();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        settingpage.Click_On_Continue_Button();
        loginPage.Get_Toast_Alert("Message on invalid email id.");

    }
    //346
    @Test
    public void Verify_the_Email_field_by_entering_valid_email_id() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        Common common = new Common();
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        supportTab.Click_Support_Tab();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Verify_Full_Name_Field();
        settingpage.Enter_valid_Email_And_Verify_Result();
        settingpage.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        settingpage.Enter_Team_Description();
        settingpage.Enter_Description();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        settingpage.Click_On_Continue_Button();
        loginPage.Get_Toast_Alert("Message on valid email id.");

    }
    //347
    @Test
    public void Verify_the_Location_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        supportTab.Click_Support_Tab();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Verify_Location_Field_Element();

    }
    //348
    @Test
    public void Verify_the_Location_field_without_selecting_location() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        Common common = new Common();
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        supportTab.Click_Support_Tab();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Verify_Full_Name_Field();
        settingpage.Enter_valid_Email_And_Verify_Result();
        settingpage.Enter_Team_Description();
        settingpage.Enter_Description();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        settingpage.Click_On_Continue_Button();
        loginPage.Get_Toast_Alert("Error Without location.");

    }
    //349
    @Test
    public void Verify_the_Search_bar_with_Done_link() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        Common common = new Common();
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        supportTab.Click_Support_Tab();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Enter_Country_Name_In_Searchbar_Verify_Done_Link();

    }
    //350
    @Test
    public void Verify_the_Are_you_currently_a_member_of_a_Team_or_Club_on_PLAI_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        supportTab.Click_Support_Tab();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Click_On_No_Button();

    }
    //350
    @Test
    public void Verify_the_Are_you_currently_a_member_of_a_Team_or_Club_on_PLAI_field_by_selecting_YES_button() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SupportTabPage supportTab=new SupportTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        supportTab.Click_Support_Tab();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Click_On_Yes_Button();

    }
    //352
    @Test
    public void Verify_the_Description_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        Common common = new Common();
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Enter_Description();

    }
    //353
    @Test
    public void Verify_the_Attach_a_screenshot_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        Common common = new Common();
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        settingpage.Click_On_Attach_Screen_Shot_Field();
        settingpage.Verify_Displayed_Field_After_Click_On_Attach_Screen_Shot_Field();

    }
    //354
    @Test
    public void Verify_the_Capture_an_Image_option() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        Common common = new Common();
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        settingpage.Click_On_Attach_Screen_Shot_Field();
        settingpage.Click_On_Capture_An_Image_Option_And_Verify_Result();

    }
    //355
    @Test
    public void Verify_the_Select_a_Image_option() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        Common common = new Common();
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        settingpage.Click_On_Attach_Screen_Shot_Field();
        settingpage.Click_On_Pick_An_Image_Option_And_Verify_Result();

    }
    //358
    @Test
    public void Verify_the_functionality_of_CONFIRM_button() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        Common common = new Common();
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Verify_Full_Name_Field();
        settingpage.Enter_valid_Email_And_Verify_Result();
        settingpage.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        settingpage.Enter_Team_Description();
        settingpage.Enter_Description();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        settingpage.Click_On_Continue_Button();
        loginPage.Get_Toast_Alert("Message on valid email id.");

    }
    //359
    @Test
    public void Verify_the_Back_icon_of_PLAI_PUBLIC_FEEDBACK_FORUM_screen() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        signup.verify_back_icon();
        settingpage.Verify_Setting_Header();

    }
    //360
    @Test
    public void Verify_the_Submit_a_feature_request_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();

    }
    //361
    @Test
    public void Verify_the_fields_display_on_PLAI_PUBLIC_FEEDBACK_FORUM_screen_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        settingpage.Verify_Public_FeedBack_Forum_Page_Element();

    }
    //362
    @Test
    public void Verify_the_Submission_Type_field_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        settingpage.Verify_Submission_Type_Field_Element();

    }
    //363
    @Test
    public void Verify_the_Select_Device_field_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        settingpage.Click_On_Ios_Button();

    }
    //364
    @Test
    public void Verify_the_Full_name_field_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        settingpage.Verify_Full_Name_Field();

    }
    //365
    @Test
    public void Verify_the_Email_field_by_entering_invalid_email_id_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        Common common = new Common();
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        settingpage.Verify_Full_Name_Field();
        settingpage.Enter_Invalid_Email_And_Verify_Result();
        settingpage.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        settingpage.Enter_Team_Description();
        settingpage.Enter_Description();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        settingpage.Click_On_Continue_Button();
        loginPage.Get_Toast_Alert("Message on invalid email id.");

    }
    //366
    @Test
    public void Verify_the_Email_field_by_entering_valid_email_id_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        Common common = new Common();
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        settingpage.Verify_Full_Name_Field();
        settingpage.Enter_valid_Email_And_Verify_Result();
        settingpage.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        settingpage.Enter_Team_Description();
        settingpage.Enter_Description();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        settingpage.Click_On_Continue_Button();
        loginPage.Get_Toast_Alert("Message on valid email id.");

    }
    //367
    @Test
    public void Verify_the_Location_field_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        settingpage.Verify_Location_Field_Element();

    }
    //368
    @Test
    public void Verify_the_Location_field_without_selecting_location_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        Common common = new Common();
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Verify_Full_Name_Field();
        settingpage.Enter_valid_Email_And_Verify_Result();
        settingpage.Enter_Team_Description();
        settingpage.Enter_Description();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        settingpage.Click_On_Continue_Button();
        loginPage.Get_Toast_Alert("Error Without location.");

    }
    //369
    @Test
    public void Verify_the_Search_bar_with_Done_link_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        settingpage.Enter_Country_Name_In_Searchbar_Verify_Done_Link();

    }
    //370
    @Test
    public void Verify_the_Are_you_currently_a_member_of_a_Team_or_Club_on_PLAI_field_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        settingpage.Click_On_No_Button();

    }
    //371
    @Test
    public void Verify_the_Are_you_currently_a_member_of_a_Team_or_Club_on_PLAI_field_by_selecting_YES_button_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        settingpage.Click_On_Yes_Button();

    }
    //372
    @Test
    public void Verify_the_Description_field_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        settingpage.Enter_Description();

    }
    //373
    @Test
    public void Verify_the_Attach_a_screenshot_field_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        Common common = new Common();
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        settingpage.Click_On_Attach_Screen_Shot_Field();
        settingpage.Verify_Displayed_Field_After_Click_On_Attach_Screen_Shot_Field();

    }
    //354
    @Test
    public void Verify_the_Capture_an_Image_option_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        Common common = new Common();
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        settingpage.Click_On_Attach_Screen_Shot_Field();
        settingpage.Click_On_Capture_An_Image_Option_And_Verify_Result();

    }
    //355
    @Test
    public void Verify_the_Select_a_Image_option_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        Common common = new Common();
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        settingpage.Click_On_Attach_Screen_Shot_Field();
        settingpage.Click_On_Pick_An_Image_Option_And_Verify_Result();

    }
    //378
    @Test
    public void Verify_the_functionality_of_CONFIRM_button_Request_A_Feature() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        Common common = new Common();
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Submit_A_Feature_Request_Label();
        settingpage.Verify_Full_Name_Field();
        settingpage.Enter_valid_Email_And_Verify_Result();
        settingpage.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        settingpage.Enter_Team_Description();
        settingpage.Enter_Description();
        common.scrollDownMobile(driver);
        common.scrollDownMobile(driver);
        settingpage.Click_On_Continue_Button();
        loginPage.Get_Toast_Alert("Message on valid email id.");

    }
    //379
    @Test
    public void Verify_the_Legal_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Legal_Label();
        settingpage.Verify_Legal_page_Header();

    }
    //380
    @Test
    public void Verify_the_field_display_on_LEGAL_screen() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Legal_Label();
        settingpage.Verify_Legal_Page_Element();

    }
    //381
    @Test
    public void Verify_the_Terms_of_usefield() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Legal_Label();
        settingpage.Verify_Terms_Of_Use_Page_Element();

    }
    //382
    @Test
    public void Verify_the_Back_icon_of_TERMS_OF_USE_screen() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Legal_Label();
        settingpage.Verify_Terms_Of_Use_Page_Element();
        signup.click_on_back_button();
        settingpage.Verify_Legal_page_Header();

    }
    //383
    @Test
    public void Verify_the_Privacy_Policy_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Legal_Label();
        settingpage.Verify_Privacy_Policy_Page_Element();

    }
    //384
    @Test
    public void Verify_the_Back_icon_of_PRIVACY_POLICY_screen() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Legal_Label();
        settingpage.Verify_Privacy_Policy_Page_Element();
        signup.click_on_back_button();
        settingpage.Verify_Legal_page_Header();

    }
    //385
    @Test
    public void Verify_the_Buyer_And_Seller_Terms_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Legal_Label();
        settingpage.Verify_Buyer_And_Seller_Page_Element();

    }
    //386
    @Test
    public void Verify_the_Back_icon_of_BUYER_And_SELLER_TERMS_screen() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Legal_Label();
        settingpage.Verify_Buyer_And_Seller_Page_Element();
        signup.click_on_back_button();
        settingpage.Verify_Legal_page_Header();

    }
    //387
    @Test
    public void Verify_the_Delete_Account_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Legal_Label();
        settingpage.Verify_Delete_Account_Page_Element();

    }
    //388
    @Test
    public void Verify_the_Dismiss_button_of_confirmation_popup() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Legal_Label();
        settingpage.Click_On_Dismiss_Button_And_Verify_Result();

    }
    //389
    @Test
    public void Verify_the_Confirm_button_of_confirmation_popup() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Legal_Label();
//        settingpage.Click_On_Confirm_Button_And_Verify_Result();

    }
    //390
    @Test
    public void Verify_the_Back_icon_of_LEGAL_screen() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Legal_Label();
        signup.click_on_back_button();
        settingpage.Verify_Setting_Header();

    }
    //391
    @Test
    public void Verify_the_Change_Password_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Change_Password_Label();
        settingpage.Verify_Change_Password_page_Header();

    }
    //392
    @Test
    public void Verify_the_field_display_on_CHANGE_PASSWORD_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Change_Password_Label();
        settingpage.Verify_Change_Password_Page_Element();

    }
    //393
    @Test
    public void Verify_the_UPDATE_PASSWORD_button_without_entering_data_in_mandatory_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Change_Password_Label();
        settingpage.Click_On_Update_Password_Button();
        loginPage.Get_Toast_Alert("Error message while click on update password button without entering data.");

    }
    //394
    @Test
    public void Verify_the_Eye_icon_of_Current_Password_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Change_Password_Label();
        settingpage.Enter_Current_password_And_Verify_Functionality_Of_Eye_Icon();

    }
    //395
    @Test
    public void Verify_the_New_Password_field_by_entering_7_characters() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Change_Password_Label();
        settingpage.Enter_New_7_char_password_And_Verify_text_In_Red_Colour();

    }
    //396
    @Test
    public void Verify_the_New_Password_field_by_entering_password_which_contain_8_character_including_uppercase_letter_and_special_symbol() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Change_Password_Label();
        settingpage.Enter_New_8_char_Valid_password_And_Verify_text_In_Green_Colour();

    }
    //397
    @Test
    public void Verify_the_Eye_icon_functionality_for_New_Password_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Change_Password_Label();
        settingpage.Enter_New_password_And_Verify_Functionality_Of_Eye_Icon();

    }
    //398
    @Test
    public void Verify_the_Confirm_Password_field_by_entering_different_password_than_New_Password_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Change_Password_Label();
        settingpage.Enter_Current_password_And_Verify_Functionality_Of_Eye_Icon();
        settingpage.Enter_New_8_char_Valid_password_And_Verify_text_In_Green_Colour();
        settingpage.Enter_wrong_Confirm_password();
        settingpage.Click_On_Update_Password_Button();
        loginPage.Get_Toast_Alert("Error message while enter wrong confirm password.");

    }
    //399
    @Test
    public void Verify_the_Confirm_Password_field_by_entering_same_password_than_New_Password_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Change_Password_Label();
        settingpage.Enter_Current_password_And_Verify_Functionality_Of_Eye_Icon();
        settingpage.Enter_New_8_char_Valid_password_And_Verify_text_In_Green_Colour();
//        settingpage.Enter_Same_New_and_Confirm_password();
        settingpage.Click_On_Update_Password_Button();
        settingpage.Verify_Setting_Header();

    }
    //411
    @Test
    public void Verify_the_social_media_icon_display_on_the_SETTINGS_screen() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Verify_Setting_Header();
        settingpage.Verify_Social_Media_Icons();

    }
    //412
    @Test
    public void Verify_the_Logout_icon() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Log_Out_Icon();
        settingpage.Verify_Logout_Icon_Element();

    }
    //413
    @Test
    public void Verify_the_Dismiss_button_of_confirmation_popup_Logout_Icon() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Log_Out_Icon();
        settingpage.Click_On_Dismiss_Button_And_Verify_Result_Logout();

    }
    //414
    @Test
    public void Verify_the_Confirm_button_of_confirmation_popup_Logout_Icon() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Log_Out_Icon();
        settingpage.Click_On_Confirm_Button_And_Verify_Result_Logout();

    }
    //Nov-dec Sprint
    //90
    @Test
    public void Verify_the_My_Documents_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_My_Documents_Label_Verify_Header();

    }
    //91
    @Test
    public void Verify_the_fields_display_on_the_MY_DOCUMENTS_screen() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_My_Documents_Label_Verify_Header();
        settingpage.Verify_My_Documents_Page_Elements();

    }
    //92
    @Test
    public void Verify_the_ADD_DOCUMENTS_button() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_My_Documents_Label_Verify_Header();
        settingpage.Click_On_Add_Documents_Button();
        settingpage.Verify_Add_Documents_Page_Element();

    }
    //93
    @Test
    public void Verify_the_Teams_field () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_My_Documents_Label_Verify_Header();
        settingpage.Click_On_Add_Documents_Button();
        settingpage.Click_On_Teams_Field();
        settingpage.Verify_Teams_Page_Element();

    }
    //94
    @Test
    public void Verify_the_Select_All_and_Deselect_All_button () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_My_Documents_Label_Verify_Header();
        settingpage.Click_On_Add_Documents_Button();
        settingpage.Click_On_Teams_Field();
        settingpage.Verify_Teams_Page_Element();
        settingpage.Verify_The_Functionality_Of_SelectAll_And_DeselectAll_Button();

    }
    //86
    @Test
    public void Verify_the_Documents_field () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_My_Documents_Label_Verify_Header();
        settingpage.Click_On_Add_Documents_Button();
        settingpage.Click_On_Teams_Field();
        settingpage.Verify_Teams_Page_Element();
        settingpage.Verify_Upload_Documents();

    }
    //87
    @Test
    public void Verify_the_functionality_of_Document_field_by_attaching_document () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_My_Documents_Label_Verify_Header();
        settingpage.Click_On_Add_Documents_Button();
        settingpage.Click_On_Teams_Field();
        settingpage.Verify_Teams_Page_Element();
        settingpage.Verify_Upload_Documents();
        newsTab.Upload_Documents_Verify_Result();

    }
    //88
    @Test
    public void Verify_the_Plus_icon () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_My_Documents_Label_Verify_Header();
        settingpage.Click_On_Add_Documents_Button();
        settingpage.Click_On_Teams_Field();
        settingpage.Verify_Teams_Page_Element();
        settingpage.Verify_Upload_Documents();
        newsTab.Upload_Documents_Verify_Result();
        settingpage.Click_On_Plus_Icon_Verify_Result();

    }
    //89
    @Test
    public void Verify_the_Delete_icon_display_on_the_added_document () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_My_Documents_Label_Verify_Header();
        settingpage.Click_On_Add_Documents_Button();
        settingpage.Click_On_Teams_Field();
        settingpage.Verify_Teams_Page_Element();
        settingpage.Verify_Upload_Documents();
        newsTab.Upload_Documents_Verify_Result();
        settingpage.Click_On_Delete_Icon_Verify_Result();

    }
    //90
    @Test
    public void Verify_the_ADD_button_after_uploading_documents () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_My_Documents_Label_Verify_Header();
        settingpage.Click_On_Add_Documents_Button();
        settingpage.Click_On_Teams_Field();
        settingpage.Verify_Teams_Page_Element();
        settingpage.Verify_Upload_Documents();
        newsTab.Upload_Documents_Verify_Result();
        settingpage.Click_On_Add_Button();

    }
    //92
    @Test
    public void Verify_the_CARD_NUMBER_field_by_entering_8_digit_number () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Saved_Cards_Label();
        settingpage.Add_New_Card_With_8_Card_Number();
        loginPage.Get_Toast_Alert("Alert after click on save button :- ");

    }
    //93
    @Test
    public void Verify_the_CARD_HOLDER_NAME_field_by_not_added_data_in_field () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Saved_Cards_Label();
        settingpage.Add_New_Card_Without_Card_Holder_Name();
        loginPage.Get_Toast_Alert("Alert after click on save button :- ");

    }
    //94
    @Test
    public void Verify_the_EXPIRY_DATE_field_by_not_added_data_in_field () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Saved_Cards_Label();
        settingpage.Add_New_Card_Without_Expiry_Date();
        loginPage.Get_Toast_Alert("Alert after click on save button :- ");

    }
    //95
    @Test
    public void Verify_the_CVV_field_by_adding_2_digit_cvv () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Saved_Cards_Label();
        settingpage.Add_New_Card_With_2_Cvv_Number();
        loginPage.Get_Toast_Alert("Alert after click on save button :- ");

    }
    //96
    @Test
    public void Verify_the_Country_field_by_not_selecting_country () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Saved_Cards_Label();
        settingpage.Add_New_Card_Without_Country_Name();
        loginPage.Get_Toast_Alert("Alert after click on save button :- ");

    }
}
