package Tests;

import Config.Configuration;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class SignUpTests_Club_Banner extends Configuration {

    //TC-01
    @Test
    public void Verify_the_UI_of_Sign_Up_screen() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.logo_verification();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.verify_back_icon();
        signup.verify_first_name();
        signup.verify_last_name();
        signup.verify_email_address();
        signup.verify_password();
        signup.verify_eye_icon();
        signup.verify_confirm_password();
        signup.verify_eye_icon();
        signup.verify_terms_and_condition();
        signup.verify_next_button();
        signup.verify_login_link();
    }
    //TC-02
    @Test
    public void Verify_the_navigation_by_clicking_on_Back_icon() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.logo_verification();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.verify_back_icon();
        signup.click_on_back_button();
        signup.verify_login_text();

    }
    //TC-03
    @Test
    public void Verify_the_Next_button_without_entering_data_in_mandatory_fields() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.click_on_next_button();
        signup.verify_validation_message();

    }
    //TC_04
    @Test
    public void Verify_the_Next_button_after_entering_data_in_First_Name_and_Last_Name() throws InterruptedException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.click_on_next_button();
        signup.verify_email_validation_message();

    }
    //TC-05
    @Test
    public void Verify_the_Enter_your_email_field_with_invalid_email_id() throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_invalid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        launchApp.logo_verification();
    }
    //TC-06
    @Test
    public void Verify_the_Enter_your_email_field_with_valid_email_id() throws InterruptedException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.click_on_next_button();
        signup.verify_password_validation_message();

    }
    //TC-07
    @Test
    public void Verify_the_Password_field_by_entering_7_characters() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_7char_password();
        signup.click_on_next_button();
        signup.verify_password_validation_message();

    }
    //TC-08
    @Test
    public void Verify_the_Password_field_by_entering_8_characters() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_8char_password();
        signup.click_on_next_button();
        signup.verify_password_validation_message();
        signup.verify_text_below_password_in_colour();

    }
    //TC-09
    @Test
    public void Verify_the_Password_field_by_entering_password_which_contain_8_character_including_1_uppercase_and_1_number() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_8char_password_1uppercase_1number();
        signup.verify_text_below_password_in_colour();

    }
    //TC-10
    @Test
    public void Verify_the_Password_field_by_entering_password_which_contain_8_character_including_1_uppercase_and_1_number_special_symbol() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_8char_password_1uppercase_1number_1specialchar();
        signup.verify_text_below_password_in_colour();

    }
    //TC-11
    @Test
    public void Verify_the_Password_field_by_entering_9_characters_including_uppercase_and_number() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_9char_password_1uppercase_1number();
        signup.click_on_next_button();
        signup.verify_text_below_password_in_colour();

    }
    //TC-12
    @Test
    public void Verify_the_Eye_icon_functionality_for_Password_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.verify_functionality_of_eye_icon();

    }
    //TC-13
    @Test
    public void Verify_the_Confirm_Password_field_by_entering_different_password_then_Password_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_invalid_confirm_password();
        signup.click_on_next_button();
        signup.verify_password_validation_message();

    }
    //TC-04
    @Test
    public void Verify_the_Confirm_Password_field_by_entering_same_password_as_Password_field() throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        launchApp.logo_verification();
    }
    //TC-17
    @Test
    public void Verify_Terms_of_use_link() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.click_on_terms_and_condition_link();

    }
    //TC-18
    @Test
    public void Verify_navigation_by_click_on_Back_icon_of_Terms_of_use_screen() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.click_on_terms_and_condition_link();
        signup.click_on_back_button();

    }
    //TC-19
    @Test
    public void Verify_Next_button_after_entering_valid_data_in_all_mandatory_fields() throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();

    }
    //TC-20
    @Test
    public void Verify_the_functionality_of_Upload_Photo_button () throws InterruptedException, IOException, AWTException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
    }
    //TC-21
    @Test
    public void Verify_the_Camera_Option() throws InterruptedException, IOException, AWTException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("Camera");
        signup.Verify_Camera_App_Opened();
    }
    //TC-22
    @Test
    public void Verify_the_Gallery_option () throws InterruptedException, IOException, AWTException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
    }
    //TC-23
    @Test
    public void Verify_the_screen_after_photo_select_from_Gallery()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Verify_Modify_Image_Screen();
    }
    //24
    @Test
    public void Verify_the_navigation_by_clicking_on_Back_icon_Gallery()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        ManageAdsPage manageAdsPage=new ManageAdsPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        manageAdsPage.Click_On_Back_Icon_of_Gallery();

    }
    //TC-25
    @Test
    public void Verify_the_functionality_of_Rotation_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
        Thread.sleep(5000);
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Rotate_Image();
    }
    //TC-26
    @Test
    public void Verify_the_functionality_of_Flip_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
        Thread.sleep(5000);
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Flip_Image();
    }
    //TC-27
    @Test
    public void Verify_the_functionality_of_Crop_link()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
        Thread.sleep(5000);
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Flip_Image();
        signup.Verify_Image_Uploaded();
    }
    //TC-28
    @Test
    public void Verify_the_Next_button_without_entering_data_in_mandatory_fields_Team_Information_Page()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.click_on_next_button();
        loginPage.Get_Toast_Alert("Message on click on next button without entering mandatory data.");

    }
    //TC-29
    @Test
    public void Verify_the_Team_Name_field() throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();

    }
    //TC-30
    @Test
    public void Verify_the_Agent_Code_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Verify_Agent_Code_Field_Element();

    }
    //TC-31
    @Test
    public void Verify_the_Search_bar_with_Done_link_Agent_Code() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_Agent_Code_Name_In_Searchbar_Verify_Done_Link();

    }
    //TC-32
    @Test
    public void Verify_the_Done_link() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_Agent_Code_In_Create_Team_Page();

    }
    //TC-33
    @Test
    public void Verify_the_Sport_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Verify_sport_field_Element_In_Create_Team_Page();

    }
    //TC-34
    @Test
    public void Verify_the_Search_bar_with_Done_link() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();

    }
    //TC-35
    @Test
    public void Verify_the_Next_button_without_entering_data_in_Team_Bio_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup.click_on_next_button();
        loginPage.Get_Toast_Alert("Message on click on next button without entering team bio.");

    }
    //TC-37
    @Test
    public void verify_the_Next_button_of_second_screen_after_entering_data_in_mandatory_fields() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        launchapp.logo_verification();


    }
    //TC-38
    @Test
    public void Verify_the_fields_display_on_the_third_screen_of_sign_up() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Verify_Club_Banner_Signup_Third_page_Element();

    }
    //TC-39
    @Test
    public void Verify_the_Country_field () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        createteampage.Verify_Country_Field_Element();

    }
    //TC-41
    @Test
    public void Verify_the_functionality_of_Search_bar () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Enter_Country_Name_In_Searchbar();

    }
    //TC-42
    @Test
    public void Verify_the_functionality_of_Search_bar_by_selecting_country () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Verify_Club_Banner_Signup_Third_page_Element();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();

    }
    //TC-43
    @Test
    public void Verify_the_Next_button_after_selecting_county () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Verify_Club_Banner_Signup_Third_page_Element();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        signup.click_on_next_button();
        loginPage.Get_Toast_Alert("Message on click on next button after enter data in country field.");

    }
    //TC-45
    @Test
    public void Verify_the_Location_field () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Verify_Club_Banner_Signup_Third_page_Element();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Click_on_Location_Field_And_Verify_Result();

    }
    //TC-46
    @Test
    public void Verify_the_Back_icon () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Verify_Club_Banner_Signup_Third_page_Element();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Click_on_Location_Field_And_Verify_Result();
        signup_club_banner.Click_On_Back_Icon();
;
    }
    //TC-47
    @Test
    public void Verify_the_functionality_of_Search_bar_Location_Field  () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Verify_Club_Banner_Signup_Third_page_Element();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Click_on_Location_Field_And_Verify_Result();
        signup_club_banner.Enter_Location_Name_In_Searchbar_Verify_Result();

    }
    //TC-48
    @Test
    public void Verify_the_links_display_in_the_Facebook_Twitter_Instagram_and_Youtube_field  () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Verify_Social_Media_Link();

    }
    //TC-49
    @Test
    public void Verify_the_Next_button_after_entering_data_in_all_mandatory_field () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Click_on_Location_Field_And_Verify_Result();
        signup_club_banner.Enter_Location_Name_In_Searchbar_Verify_Result();
        signup.click_on_next_button();
        launchapp.logo_verification();

    }
    //TC-50
    @Test
    public void Verify_the_field_display_on_fourth_screen_of_the_sign_up () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Click_on_Location_Field_And_Verify_Result();
        signup_club_banner.Enter_Location_Name_In_Searchbar_Verify_Result();
        signup.click_on_next_button();
        signup_club_banner.Verify_Forth_Screen_Of_Club_Banner_Signup();

    }
    //TC-51
    @Test
    public void Verify_the_Textbox_by_entering_question_in_it () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Click_on_Location_Field_And_Verify_Result();
        signup_club_banner.Enter_Location_Name_In_Searchbar_Verify_Result();
        signup.click_on_next_button();
        signup_club_banner.Enter_Member_Question();

    }
    //TC-52
    @Test
    public void Verify_the_Plus_icon () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Click_on_Location_Field_And_Verify_Result();
        signup_club_banner.Enter_Location_Name_In_Searchbar_Verify_Result();
        signup.click_on_next_button();
        signup_club_banner.Click_On_Plus_Icon_Verify_Result();

    }
    //TC-53
    @Test
    public void Verify_the_Minus_icon_of_Member_Question_1 () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Click_on_Location_Field_And_Verify_Result();
        signup_club_banner.Enter_Location_Name_In_Searchbar_Verify_Result();
        signup.click_on_next_button();
        signup_club_banner.Click_On_Minus_Icon_Verify_Result();

    }
    //TC-54
    @Test
    public void Verify_the_Plus_icon_of_new_added_question () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Click_on_Location_Field_And_Verify_Result();
        signup_club_banner.Enter_Location_Name_In_Searchbar_Verify_Result();
        signup.click_on_next_button();
        signup_club_banner.Click_On_Plus_Icon_Of_Second_Question_And_Verify_Result();

    }
    //TC-55
    @Test
    public void Verify_the_Minus_icon_of_new_added_question () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Click_on_Location_Field_And_Verify_Result();
        signup_club_banner.Enter_Location_Name_In_Searchbar_Verify_Result();
        signup.click_on_next_button();
        signup_club_banner.Click_On_Minus_Icon_Of_Second_Question_And_Verify_Result();

    }
    //TC-56
    @Test
    public void Verify_the_checkbox_for_Optional () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Click_on_Location_Field_And_Verify_Result();
        signup_club_banner.Enter_Location_Name_In_Searchbar_Verify_Result();
        signup.click_on_next_button();
        signup_club_banner.Click_Checkbox_Optional_Of_Second_Question_And_Verify_Result();

    }
    //TC-57
    @Test
    public void Verify_the_CONFIRM_button () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Click_on_Location_Field_And_Verify_Result();
        signup_club_banner.Enter_Location_Name_In_Searchbar_Verify_Result();
        signup.click_on_next_button();
        signup_club_banner.Click_On_Confirm_Button_And_Verify_Result();

    }
    //TC-57
    @Test
    public void Verify_the_Ok_button_display_with_confirmation_message () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        signup_club_banner.Click_on_Club_Banner();
        launchapp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup_club_banner.Enter_Data_in_Team_Name();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Enter_Team_Bio_In_Create_Team_Page();
        signup.click_on_next_button();
        signup_club_banner.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        signup_club_banner.Click_on_Location_Field_And_Verify_Result();
        signup_club_banner.Enter_Location_Name_In_Searchbar_Verify_Result();
        signup.click_on_next_button();
        signup_club_banner.Click_On_Confirm_Button_And_Verify_Result();
        signup_club_banner.Click_On_Close_Button();
        launchapp.logo_verification();

    }
}
