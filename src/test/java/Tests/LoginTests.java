package Tests;

import Config.Configuration;
import Pages.LaunchAppPage;
import Pages.LoginPage;
import Pages.SignUpPage;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class LoginTests extends Configuration {

    //TC-55
    @Test
    public void Verify_the_fields_display_on_Login_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Login_Screen_Elements();
    }

    //TC-56
    @Test
    public void Verify_the_navigation_by_clicking_on_Back_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        SignUpPage signupPage = new SignUpPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        signupPage.verify_back_icon();
    }

    //TC-57
    @Test
    public void Verify_login_without_any_credential()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Click_On_Login_Button();
        loginPage.Verify_Toast_Alert_Message_For_Login_Without_Credentials();
    }

    //TC-58
    @Test
    public void Verify_Enter_your_email_field_by_entering_invalid_email_id()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Toast_Alert_Message_For_Invalid_Email_Address();
    }

    //TC-59
    @Test
    public void Verify_Enter_your_email_field_by_entering_valid_email_id()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Toast_Alert_Message_For_Login_Without_Password();
    }

    //TC-60
    @Test
    public void Verify_login_by_only_entering_password()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Toast_Alert_Message_For_Login_Without_Email();
    }

    //TC-61
    @Test
    public void Verify_login_with_valid_email_Id_and_invalid_password()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Toast_Alert_Message_For_Valid_Email_Address_And_Invalid_Password();
    }

    //TC-62
    @Test
    public void Verify_login_with_valid_credentials()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Toast_Alert_Message_For_Valid_Email_Address_And_Invalid_Password();
    }

    //TC-63
    @Test
    public void Verify_Forgot_Password_link()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Forgot_Password_Link();
    }

    //TC-64
    @Test
    public void Verify_submit_button_without_entering_email_id()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Forgot_Password_Link();
        loginPage.Verify_Toast_Alert_For_Forgot_Password_Without_Entering_Email();
    }

    //TC-65
    @Test
    public void Verify_Enter_your_email_field_by_entering_non_registered_email_id()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Forgot_Password_Link();
        loginPage.Verify_Toast_Alert_For_Forgot_Password_With_Entering_non_registered_Email();
    }

    //TC-66
    @Test
    public void Verify_Enter_your_email_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Forgot_Password_Link();
        loginPage.Reset_Password_With_Entering_registered_Email();
    }

    //TC-67
    @Test
    public void Verify_the_fields_display_on_reset_password_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Forgot_Password_Link();
        loginPage.Reset_Password_With_Entering_registered_Email();
        loginPage.Verify_Reset_password_Screen_After_Entering_Email();
    }

    //TC-70
    @Test
    public void Verify_the_Eye_icon_functionality_for_New_Password_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Forgot_Password_Link();
        loginPage.Reset_Password_With_Entering_registered_Email();
        loginPage.Verify_Reset_password_Screen_After_Entering_Email();
        loginPage.Verify_the_Functionality_Of_NewPassword_Eye_Functionality();
    }

    //TC-71
    @Test
    public void Verify_the_Confirm_Password_field_by_entering_different_password_than_New_Password_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Forgot_Password_Link();
        loginPage.Reset_Password_With_Entering_registered_Email();
        loginPage.Verify_Reset_password_Screen_After_Entering_Email();
        loginPage.Verify_NewPassword_And_ConfirmPassword_Functionality();
    }

    //TC-73
    @Test
    public void Verify_the_Resend_OTP_link()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Forgot_Password_Link();
        loginPage.Reset_Password_With_Entering_registered_Email();
        loginPage.Verify_Reset_password_Screen_After_Entering_Email();
        loginPage.Verify_Resend_OTP();
    }

    //TC-74
    @Test
    public void Verify_the_6_digit_code_field_by_entering_wrong_code()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Verify_Forgot_Password_Link();
        loginPage.Reset_Password_With_Entering_registered_Email();
        loginPage.Verify_Reset_password_Screen_After_Entering_Email();
        loginPage.Verify_Reset_Password_With_Wrong_OTP();
    }

    //TC-75
    @Test
    public void Verify_the_UI_of_Splash_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
    }



}