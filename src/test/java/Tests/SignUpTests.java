package Tests;

import org.testng.annotations.Test;
import Config.Common;
import Config.Configuration;
import Pages.LaunchAppPage;
import Pages.SignUpPage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class SignUpTests extends Configuration {

    @Test
    public void Verify_the_UI_of_Sign_Up_screen() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.logo_verification();
        launchApp.click_on_skip_button();
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

    @Test
    public void Verify_the_navigation_by_clicking_on_Back_icon() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.logo_verification();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.verify_back_icon();
        signup.click_on_back_button();
        signup.verify_login_text();

    }

    @Test
    public void Verify_the_Next_button_without_entering_data_in_mandatory_fields() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.click_on_next_button();
        signup.verify_validation_message();

    }
    @Test
    public void Verify_the_Next_button_after_entering_data_in_First_Name_and_Last_Name() throws InterruptedException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.click_on_next_button();
        signup.verify_email_validation_message();

    }
    @Test
    public void Verify_the_Enter_your_email_field_with_invalid_email_id() throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
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
    @Test
    public void Verify_the_Enter_your_email_field_with_valid_email_id() throws InterruptedException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.click_on_next_button();
        signup.verify_password_validation_message();

    }
    @Test
    public void Verify_the_Password_field_by_entering_7_characters() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_7char_password();
        signup.click_on_next_button();
        signup.verify_password_validation_message();

    }
    @Test
    public void Verify_the_Password_field_by_entering_8_characters() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
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
    @Test
    public void Verify_the_Password_field_by_entering_password_which_contain_8_character_including_1_uppercase_and_1_number() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_8char_password_1uppercase_1number();
        signup.verify_text_below_password_in_colour();

    }
    @Test
    public void Verify_the_Password_field_by_entering_password_which_contain_8_character_including_1_uppercase_and_1_number_special_symbol() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_8char_password_1uppercase_1number_1specialchar();
        signup.verify_text_below_password_in_colour();

    }
    @Test
    public void Verify_the_Password_field_by_entering_9_characters_including_uppercase_and_number() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_9char_password_1uppercase_1number();
        signup.click_on_next_button();
        signup.verify_text_below_password_in_colour();

    }
    @Test
    public void Verify_the_Eye_icon_functionality_for_Password_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.verify_functionality_of_eye_icon();

    }
    @Test
    public void Verify_the_Confirm_Password_field_by_entering_different_password_then_Password_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
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
    @Test
    public void Verify_the_Confirm_Password_field_by_entering_same_password_as_Password_field() throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
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
    @Test
    public void Verify_Terms_of_use_link() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.click_on_terms_and_condition_link();

    }
    @Test
    public void Verify_navigation_by_click_on_Back_icon_of_Terms_of_use_screen() throws InterruptedException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.click_on_terms_and_condition_link();
        signup.click_on_back_button();

    }
    @Test
    public void Verify_Next_button_after_entering_valid_data_in_all_mandatory_fields() throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        launchApp.logo_verification();
        signup.verify_country_field();
        signup.verify_mobile_number_field();
        signup.verify_date_of_birth_field();

    }
    @Test
    public void Verify_the_Country_field() throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        launchApp.logo_verification();
        signup.verify_country_field();
        signup.verify_country_field_with_dropdown();

    }
    @Test
    public void Verify_the_Country_field_by_tap_on_Dropdown_icon () throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        launchApp.logo_verification();
        signup.verify_dropdown_icon();

    }
    @Test
    public void Verify_Done_link_without_selecting_country () throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        launchApp.logo_verification();
        signup.verify_functionality_of_done_link_without_country();

    }
    @Test
    public void Verify_Done_link_after_selecting_country () throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        launchApp.logo_verification();
        signup.verify_country_field();
        signup.verify_functionality_of_done_link_with_country();

    }
    @Test
    public void Verify_the_functionality_of_Search_bar () throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.click_on_country_field();
        signup.click_on_searchbar();
        signup.enter_country_name_in_searchbar();

    }
    @Test
    public void Verify_the_Country_Code_dropdown_list_of_Mobile_Number_field () throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.click_on_country_code_drop_down();
        signup.verify_country_code_navigation_bar();
        signup.verify_country_with_flag();

    }
    @Test
    public void Verify_the_navigation_by_clicking_on_Back_icon_of_Search_Country_screen () throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.click_on_country_code_drop_down();
        signup.click_on_back_button();
        launchApp.logo_verification();

    }
    @Test
    public void Verify_the_Search_icon_of_Select_Country () throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.click_on_country_code_drop_down();
        signup.click_on_search_icon();
        signup.verify_searchbar();

    }
    @Test
    public void Verify_the_functionality_of_Search_bar_country_code () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.click_on_country_code_drop_down();
        signup.click_on_search_icon();
        signup.enter_country_name_in_searchbar();

    }
    @Test
    public void Verify_the_list_of_country_by_selecting_any_country () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.click_on_country_code_drop_down();
        signup.click_on_search_icon();
        signup.enter_country_name_in_searchbar();
        signup.select_country_and_verify_code_In_mobile_number();

    }
    @Test
    public void Verify_the_Mobile_Number_field() throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        launchApp.logo_verification();
        signup.click_on_mobile_number_field();
        signup.verify_keyboard();

    }
    @Test
    public void Verify_the_Mobile_Number_field_by_entering_more_than_10_digit_number () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.enter_mobile_number_more_than_10_number();

    }
    @Test
    public void Verify_the_Mobile_Number_field_by_entering_10_digit_number () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_next_button();
        signup.verify_validation_message();

    }
    @Test
    public void Verify_the_Date_of_Birth_field () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.click_on_date_of_birth_field();
        signup.verify_calender();


    }
    @Test
    public void Verify_the_Year_by_click_on_it () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.click_on_date_of_birth_field();
        signup.verify_year();

    }
    @Test
    public void Verify_the_cancel_button_of_Calendar () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.click_on_date_of_birth_field();
        signup.click_on_cancel_button();

    }
    @Test
    public void Verify_the_ok_button_of_Calendar () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.verify_dob();

    }
    @Test
    public void Verify_the_Next_button_before_entering_data_in_fields () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.click_on_next_button();
        signup.verify_validation_message();

    }
    @Test
    public void Verify_the_Next_button_after_entering_data_in_all_mandatory_fields () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.verify_text_sport_that_you_play();

    }
    @Test
    public void Verify_the_fields_display_on_SPORT_THAT_YOU_PLAY_screen () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.verify_text_sport_that_you_play();
        signup.verify_back_icon();
        signup.verify_searchbar();
        signup.verify_sport_name("Cricket");
        signup.verify_sport_name("Airsoft");

    }
    @Test
    public void Verify_navigation_by_click_on_Back_icon() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.verify_text_sport_that_you_play();
        signup.verify_back_icon();
        signup.click_on_back_button();
        launchApp.logo_verification();

    }
    @Test
    public void Verify_the_functionality_of_Search_bar_sport_page () throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.click_on_searchbar();
        signup.enter_sport_name_in_searchbar();

    }
    @Test
    public void Verify_the_list_of_sports_by_selecting_one_or_more_sports () throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.verify_sport_name("Baseball");
        signup.click_on_sport_name("Baseball");

    }
    @Test
    public void Verify_the_functionality_of_Next_button_of_sport_page() throws InterruptedException, IOException, ParseException, AWTException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.click_on_sport_name("Baseball");
        signup.click_on_next_button_of_sport_page();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.verify_user_information_page_button("Male");
        signup.verify_user_information_page_button("Female");
        signup.verify_user_information_page_button("Prefer not to say");
        signup.verify_user_information_page_button("SIGN UP");

    }

    //TC-44
    @Test
    public void Verify_the_Upload_Photo_button () throws InterruptedException, IOException, AWTException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.click_on_sport_name("Baseball");
        signup.click_on_next_button_of_sport_page();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
    }

    //TC-45
    @Test
    public void Verify_the_Camera_Option() throws InterruptedException, IOException, AWTException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.click_on_sport_name("Baseball");
        signup.click_on_next_button_of_sport_page();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("Camera");
        signup.Verify_Camera_App_Opened();
    }

    //TC-46
    @Test
    public void Verify_the_Gallery_option () throws InterruptedException, IOException, AWTException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.click_on_sport_name("Baseball");
        signup.click_on_next_button_of_sport_page();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
    }

    //TC-47
    @Test
    public void Verify_the_screen_after_photo_select_from_Gallery()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.click_on_sport_name("Baseball");
        signup.click_on_next_button_of_sport_page();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Verify_Modify_Image_Screen();
    }

    //TC-48
    @Test
    public void Verify_the_functionality_of_Rotation_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.click_on_sport_name("Baseball");
        signup.click_on_next_button_of_sport_page();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
        Thread.sleep(5000);
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Rotate_Image();
    }

    //TC-49
    @Test
    public void Verify_the_functionality_of_Flip_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.click_on_sport_name("Baseball");
        signup.click_on_next_button_of_sport_page();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
        Thread.sleep(5000);
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Flip_Image();
    }

    //TC-50
    @Test
    public void Verify_the_functionality_of_Crop_link()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.click_on_sport_name("Baseball");
        signup.click_on_next_button_of_sport_page();
        signup.verify_user_information_page_button("UPLOAD PHOTO");
        signup.click_on_user_information_page_button("UPLOAD PHOTO");
        Thread.sleep(5000);
        signup.click_on_user_information_page_button("Gallery");
        signup.Verify_Gallery_App_Opened();
        signup.Select_Photo_To_Upload();
        signup.Flip_Image();
        signup.Verify_Image_Uploaded();
    }

    //TC-51
    @Test
    public void Verify_the_Select_Gender_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.click_on_sport_name("Baseball");
        signup.click_on_next_button_of_sport_page();
        signup.Verify_Selected_Gender_Highlighted();
    }

    //TC-52
    @Test
    public void Verify_Prefer_not_to_say_checkbox()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.click_on_sport_name("Baseball");
        signup.click_on_next_button_of_sport_page();
        signup.Verify_Prefer_not_to_say_checkbox_Selected();
    }

    //TC-53
    @Test
    public void Verify_the_functionality_of_Sign_Up_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.click_on_sport_name("Baseball");
        signup.click_on_next_button_of_sport_page();
        signup.Verify_Prefer_not_to_say_checkbox_Selected();
        signup.Verify_SignUp_Complete_And_Mail_Verification_PopUp();
    }

    //TC-54
    @Test
    public void Verify_the_Close_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signup.click_on_sign_up_button();
        signup.enter_first_name();
        signup.enter_last_name();
        signup.enter_valid_email_address();
        signup.enter_password();
        signup.enter_confirm_password();
        signup.click_on_next_button();
        signup.verify_country_field_with_dropdown();
        signup.enter_mobile_number_with_10_number();
        signup.click_on_date_of_birth_field();
        signup.click_on_ok_button();
        signup.click_on_next_button();
        signup.click_on_sport_name("Baseball");
        signup.click_on_next_button_of_sport_page();
        signup.Verify_Prefer_not_to_say_checkbox_Selected();
        signup.Verify_SignUp_Complete_And_Mail_Verification_PopUp();
        signup.Click_Close_Button();
    }

}