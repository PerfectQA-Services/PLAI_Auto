package Tests;

import org.testng.annotations.Test;
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
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();

    }
    //341
    @Test
    public void Verify_the_fields_display_on_PLAI_PUBLIC_FEEDBACK_FORUM_screen() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Verify_Public_FeedBack_Forum_Page_Element();


    }
    //342
    @Test
    public void Verify_the_Submission_Type_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Verify_Submission_Type_Field_Element();

    }
    //343
    @Test
    public void Verify_the_Select_Device_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Click_On_Ios_Button();

    }
    //344
    @Test
    public void Verify_the_Full_name_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
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
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
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
    //347
    @Test
    public void Verify_the_Location_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Verify_Location_Field_Element();

    }
    //348
    @Test
    public void Verify_the_Location_field_without_selecting_location() throws InterruptedException, IOException, ParseException {

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
    //349
    @Test
    public void Verify_the_Search_bar_with_Done_link() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Enter_Country_Name_In_Searchbar_Verify_Done_Link();

    }
    //350
    @Test
    public void Verify_the_Are_you_currently_a_member_of_a_Team_or_Club_on_PLAI_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Click_On_No_Button();

    }
    //350
    @Test
    public void Verify_the_Are_you_currently_a_member_of_a_Team_or_Club_on_PLAI_field_by_selecting_YES_button() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Click_On_Yes_Button();

    }
    //352
    @Test
    public void Verify_the_Description_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SettingPage settingpage=new SettingPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        settingpage.Click_On_Setting_Icon();
        settingpage.Click_On_Report_An_Issue_Label();
        settingpage.Enter_Description();

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
}
