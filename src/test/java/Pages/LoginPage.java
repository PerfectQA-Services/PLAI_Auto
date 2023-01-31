package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;

import java.io.IOException;

public class LoginPage extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public LoginPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Verify_Login_Screen_Elements(){
        common.isElementPresent(EnterEmailTextField);
        common.log("Email Text field is displayed");
        common.isElementPresent(PasswordTextField);
        common.log("Password Text field is displayed");
        common.isElementPresent(ShowPasswordIcon);
        common.log("Show Password Icon is displayed");
        common.isElementPresent(ForgotPasswordLink);
        common.log("Forgot Password Link is displayed");
        common.isElementPresent(LoginButton);
        common.log("Login Button is displayed");
        common.isElementPresent(signup_button);
        common.log("SignUp Button is displayed");
    }

    public void Click_On_Login_Button(){
        driver.findElement(By.xpath(LoginButton)).click();
        common.log("Clicked On Login Button");
    }

    public void Login_with_valid_Credentials() throws IOException, ParseException, InterruptedException {
        String Email = common.readJson("LoginEmail");
        String Password = common.readJson("LoginPassword");
        driver.findElement(By.xpath(EnterEmailTextField)).sendKeys(Email);
        common.log("Entered Email :- " + Email);
        driver.findElement(By.xpath(PasswordTextField)).sendKeys(Password);
        common.log("Entered Password :- " + Password);
        this.Click_On_Login_Button();
        Thread.sleep(5000);
    }

    public void Login_with_Random_valid_Credentials(String Email, String Password) throws IOException, ParseException, InterruptedException {
        driver.findElement(By.xpath(EnterEmailTextField)).sendKeys(Email);
        common.log("Entered Email :- " + Email);
        driver.findElement(By.xpath(PasswordTextField)).sendKeys(Password);
        common.log("Entered Password :- " + Password);
        this.Click_On_Login_Button();
        Thread.sleep(5000);
    }

    public void Verify_Splash_Welcome_Screen_Elements_After_Login() throws InterruptedException {
        Thread.sleep(8000);
        common.isElementPresent(Plai_Logo_On_Login_Splash_Screen);
        common.log("App name is verified on login splash screen");
        common.isElementPresent(Day_Greeting_On_Login_Splash_Screen);
        common.log("Day Greeting is verified on login splash screen");
        common.isElementPresent(Username_On_Login_Splash_Screen);
        common.log("Username with Profile Picture is verified on login splash screen");
        common.isElementPresent(WelcomeScreenAfterLogin);
        common.log("Welcome Greeting is verified on login splash screen");
    }

    public void Get_Toast_Alert(String msg){
        String Alert = driver.findElement(By.xpath(ToastAlerts)).getText();
        common.log(msg);
        common.log("Alert :- " + Alert);
    }

    public void Verify_Toast_Alert_Message_For_Login_Without_Credentials(){
        String Alert = driver.findElement(By.xpath(ToastAlerts)).getText();
        common.log("Verified Toast Alert for Login without entering credentials");
        common.log("Alert :- " +Alert);
    }

    public void Verify_Toast_Alert_Message_For_Login_Without_Password(){
        driver.findElement(By.xpath(EnterEmailTextField)).sendKeys("saregama@mailinator.com");
        common.log("Entered Email");
        this.Click_On_Login_Button();
        this.Get_Toast_Alert("Verify Toast Alert Message For Login Without Entering Password");
    }

    public void Verify_Toast_Alert_Message_For_Login_Without_Email(){
        driver.findElement(By.xpath(PasswordTextField)).sendKeys("Test@123");
        common.log("Directly Entered Password");
        this.Click_On_Login_Button();
        this.Get_Toast_Alert("Verify Toast Alert Message For Login Without Entering Email");
    }

    public void Verify_Toast_Alert_Message_For_Invalid_Email_Address(){
        driver.findElement(By.xpath(EnterEmailTextField)).sendKeys("AutoM8.com@");
        common.log("Email Text field is displayed");
        this.Click_On_Login_Button();
        this.Get_Toast_Alert("Verify Toast Alert Message For Invalid Email Address");
    }

    public void Verify_Toast_Alert_Message_For_Valid_Email_Address_And_Invalid_Password(){
        driver.findElement(By.xpath(EnterEmailTextField)).sendKeys("saregama@mailinator.com");
        common.log("Entered Email");
        driver.findElement(By.xpath(PasswordTextField)).sendKeys("Test@123");
        common.log("Entered Invalid Password");
        this.Click_On_Login_Button();
        this.Get_Toast_Alert("Verify Toast Alert Message For Valid Email but Invalid Password");
    }

    public void Verify_Forgot_Password_Link(){
        common.isElementPresent(ForgotPasswordLink);
        driver.findElement(By.xpath(ForgotPasswordLink)).click();
        common.log("Clicked On Forgot Password Link");
        common.isElementPresent(Forgot_Password_Page);
        common.log("Forgot Password page is Opened");
    }

    public void Verify_Toast_Alert_For_Forgot_Password_Without_Entering_Email() throws InterruptedException {
       driver.findElement(By.xpath(Submit_Button_Forgot_Password)).click();
       String str = driver.findElement(By.xpath(ToastAlerts)).getText();
       common.log("toast:"+str);
       common.log("Toast msg to enter email address verified");
    }

    public void Verify_Toast_Alert_For_Forgot_Password_With_Entering_non_registered_Email(){
        driver.findElement(By.xpath(EnterEmailTextField)).sendKeys("nonregisteredemailid@reddit.com");
        common.log("Entered non registered Email");
        driver.findElement(By.xpath(Submit_Button_Forgot_Password)).click();
        this.Get_Toast_Alert("Verify Toast Alert Message For Forgot Password Submission with non registered Email ID");
    }

    public void Reset_Password_With_Entering_registered_Email(){
        driver.findElement(By.xpath(EnterEmailTextField)).sendKeys("saregama@mailinator.com");
        common.log("Entered registered Email");
        driver.findElement(By.xpath(Submit_Button_Forgot_Password)).click();
        common.log("Clicked On Submit Button");
        common.isElementPresent(Code_Verification_Sent_Message);
        common.log("Reset Password Screen Is Visible");
    }

    public void Verify_Reset_password_Screen_After_Entering_Email(){
        common.isElementPresent(Code_Verification_Sent_Message);
        common.log("Verified Code Sent Message");
        common.isElementPresent(OTP_Field_Reset_Password);
        common.log("OTP Field is Visible");
        common.isElementPresent(New_Password_Field);
        common.log("New Password Field is Visible");
        common.isElementPresent(New_Password_Field_Show_Password_Icon);
        common.log("New Password Eye Icon is Visible");
        common.isElementPresent(Confirm_Password_Field);
        common.log("Confirm Password Field is Visible");
        common.isElementPresent(Confirm_Password_Field_Show_Password_Icon);
        common.log("Confirm Password Eye Icon is Visible");
        common.isElementPresent(Resend_OTP_Link);
        common.log("Resend OTP Link is Visible");
    }

//    public void Verify_New_Password_Shows_Error_When_Not_Meeting_Criteria(){
//        driver.findElement(By.xpath(New_Password_Field)).sendKeys("asdfghj");
//        String NewPasswordFieldAlert = driver.findElement(By.xpath(Verify_Wrong_New_Password_Message)).getText();
//        common.log("Wrong New Password Field Validation :- "+ NewPasswordFieldAlert);
//    }

    public void Verify_the_Functionality_Of_NewPassword_Eye_Functionality(){
        driver.findElement(By.xpath(New_Password_Field)).sendKeys("Test123.");
        driver.findElement(By.xpath(New_Password_Field_Show_Password_Icon)).click();
        common.log("Clicked On Eye Icon to Show Password of New Password Field");
        driver.findElement(By.xpath(Hide_Password_Icon)).click();
        common.log("Clicked On Eye Icon to Hide Password of New Password Field");
    }

    public void Verify_NewPassword_And_ConfirmPassword_Functionality(){
        driver.findElement(By.xpath(OTP_Field_Reset_Password)).sendKeys("123456");
        common.log("Entered OTP");
        driver.findElement(By.xpath(New_Password_Field)).sendKeys("Test123.");
        common.log("Entered New Password");
        driver.hideKeyboard();
        driver.findElement(By.xpath(Confirm_Password_Field)).sendKeys("Test12344.");
        common.log("Entered wrong Confirm Password");
        driver.hideKeyboard();
        driver.findElement(By.xpath(Submit_Button_Forgot_Password)).click();
        common.log("Clicked Submit button to reset password");
        this.Get_Toast_Alert("Verify Validation message for mismatched password");
    }

    public void Verify_Resend_OTP(){
        driver.findElement(By.xpath(Resend_OTP_Link)).click();
        common.log("Clicked button to resend OTP");
        this.Get_Toast_Alert("Verify Toast Alert Message for OTP Resend :-");
    }

    public void Verify_Reset_Password_With_Wrong_OTP(){
        driver.findElement(By.xpath(OTP_Field_Reset_Password)).sendKeys("123456");
        common.log("Entered OTP");
        driver.findElement(By.xpath(New_Password_Field)).sendKeys("Test123.");
        common.log("Entered New Password");
        driver.hideKeyboard();
        driver.findElement(By.xpath(Confirm_Password_Field)).sendKeys("Test123.");
        common.log("Entered Confirm Password");
        driver.hideKeyboard();
        driver.findElement(By.xpath(Submit_Button_Forgot_Password)).click();
        common.log("Clicked Submit button to reset password");
        this.Get_Toast_Alert("Verify Toast Alert Message for wrong OTP :-");
    }

}