package Pages;

import Config.Common;
import io.appium.java_client.*;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.io.IOException;
import java.util.Locale;

public class SignUpPage extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public SignUpPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void click_on_sign_up_button(){

        driver.findElement(By.xpath(signup_button)).click();
        common.log("Clicked on signup button.");

    }

    public void verify_back_icon() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(back_icon));
        common.log("Back icon is verified.");

    }

    public void verify_first_name() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(first_name_field));
        common.log("First name field is verified.");

    }

    public void enter_first_name() throws InterruptedException{

        String firstname=common.generateRandomChars(5);
        Thread.sleep(2000);
        driver.findElement(By.xpath(first_name_field)).click();
        Thread.sleep(2000);
        common.log("Clicked on first name field.");
        common.sendkeywords(driver,firstname);
        common.log("Entered first name:-"+firstname+".");

    }

    public void verify_last_name() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(last_name_field));
        common.log("Last name field is verified.");

    }

    public void enter_last_name() throws InterruptedException {

        String lastname=common.generateRandomChars(5);
        Thread.sleep(2000);
        driver.findElement(By.xpath(last_name_field)).click();
        Thread.sleep(2000);
        common.log("Clicked on last name field.");
        common.sendkeywords(driver,lastname);
        common.log("Entered last name:-"+lastname+".");
        driver.hideKeyboard();

    }

    public void verify_email_address() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(email_field));
        common.log("Email field is verified.");

    }

    public void enter_invalid_email_address() throws InterruptedException {

        String email=common.generateRandomChars(5);
        Thread.sleep(2000);
        driver.findElement(By.xpath(email_field)).click();
        common.sendkeywords(driver,email+"@gmail."+email);
        common.log("Entered invalid email:-."+email+"@gmail."+email);

    }

    public void enter_valid_email_address() throws InterruptedException {

        String email=common.generateRandomChars(4);
        Thread.sleep(2000);
        driver.findElement(By.xpath(email_field)).click();
        common.sendkeywords(driver,email+"@gmail.com");
        common.log("Entered valid email:-."+email+"@gmail.com");
        driver.hideKeyboard();

    }

    public void verify_password() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(password_field));
        common.log("Password field is verified.");

    }
    public void enter_password() throws InterruptedException, IOException, ParseException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(password_field)).click();
        common.sendkeywords(driver,common.readJson("Password"));
        common.log("Entered password:-"+common.readJson("Password"));

    }

    public void enter_7char_password() throws InterruptedException, IOException, ParseException {

        String invalid_password=common.generateRandomChars(7);
        Thread.sleep(2000);
        driver.findElement(By.xpath(password_field)).click();
        common.sendkeywords(driver,invalid_password);
        common.log("Entered 7char password:-"+invalid_password);
        driver.hideKeyboard();

    }

    public void enter_8char_password() throws InterruptedException{

        String invalid_password=common.generateRandomChars(8);
        Thread.sleep(2000);
        driver.findElement(By.xpath(password_field)).click();
        common.sendkeywords(driver,invalid_password);
        common.log("Entered 8char password:-"+invalid_password);
        driver.hideKeyboard();

    }

    public void enter_8char_password_1uppercase_1number() throws InterruptedException{

        String invalid_password=common.generateRandomChars(6);
        Thread.sleep(2000);
        driver.findElement(By.xpath(password_field)).click();
        common.sendkeywords(driver,"A"+invalid_password+"1");
        common.log("Entered 8char password with 1uppercase and 1number:-A"+invalid_password+"1");
        driver.hideKeyboard();

    }

    public void enter_8char_password_1uppercase_1number_1specialchar() throws InterruptedException{

        String invalid_password=common.generateRandomChars(5);
        Thread.sleep(2000);
        driver.findElement(By.xpath(password_field)).click();
        common.sendkeywords(driver,"A"+invalid_password+"@1");
        common.log("Entered 8char password with 1uppercase and 1number:-A"+invalid_password+"@1");
        driver.hideKeyboard();

    }

    public void enter_9char_password_1uppercase_1number() throws InterruptedException{

        String invalid_password=common.generateRandomChars(7);
        Thread.sleep(2000);
        driver.findElement(By.xpath(password_field)).click();
        common.sendkeywords(driver,"A"+invalid_password+"1");
        common.log("Entered 8char password with 1uppercase and 1number:-A"+invalid_password+"1");
        driver.hideKeyboard();

    }

    public void verify_confirm_password() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_password_field));
        common.log("Confirm password field is verified.");

    }

    public void enter_confirm_password() throws InterruptedException, IOException, ParseException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_password_field)).click();
        common.sendkeywords(driver,common.readJson("Password"));
        common.log("Entered confirm password."+common.readJson("Password"));
        driver.hideKeyboard();

    }

    public void enter_invalid_confirm_password() throws InterruptedException, IOException, ParseException {

        String invalid_confirm_password=common.generateRandomChars(8);
        Thread.sleep(2000);
        driver.findElement(By.xpath(confirm_password_field)).click();
        common.sendkeywords(driver,invalid_confirm_password);
        common.log("Entered confirm password."+invalid_confirm_password);
        driver.hideKeyboard();

    }


    public void verify_terms_and_condition() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(terms_and_condition_text));
        common.log("Terms and condition text is verified.");

    }

    public void click_on_terms_and_condition_link() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(terms_and_condition_text)).click();
        common.log("Clicked onTerms and condition link.");
        Thread.sleep(2000);
        driver.findElement(By.xpath(terms_of_use));
        common.log("Terms and condition page is verified with back icon");

    }

    public void verify_eye_icon() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(eye_icon));
        common.log("Eye icon is verified.");

    }

    public void verify_functionality_of_eye_icon() throws InterruptedException, IOException, ParseException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(eye_icon_2)).click();
        String get_text=driver.findElement(By.xpath(get_pass)).getText();
        Assert.assertEquals(get_text,common.readJson("Password"));
        common.log("Password is verified when 1st click on eye icon.");
        Thread.sleep(1000);
        driver.findElement(By.xpath(eye_icon_2)).click();
        String get_encrypt_pass=driver.findElement(By.xpath(get_pass)).getText();
        Assert.assertEquals("••••••••",get_encrypt_pass);
        common.log("Password is verified when 2st click on eye icon.");
        common.log("Eye icon functionality is verified.");

    }


    public void verify_next_button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(signup_page_next_button));
        common.log("Next button is verified.");

    }

    public void click_on_next_button() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(signup_page_next_button)).click();
        common.log("Next button is clicked.");

    }

    public void verify_login_link() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(login_link));
        common.log("Login link is verified.");

    }

    public void click_on_back_button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(back_icon)).click();
        common.log("Back icon is clicked.");

    }

    public void verify_login_text() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(login_text));
        common.log("Login text is verified");

    }

    public void verify_validation_message() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(validation_message));
        common.log("validation message is verified");

    }

    public void verify_email_validation_message() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(email_validation_message));
        common.log("Email validation message is verified");

    }

    public void verify_password_validation_message() throws InterruptedException {

        Thread.sleep(500);
        driver.findElement(By.xpath(password_validation_message));
        common.log("Password validation message is verified");

    }

    public void verify_text_below_password_in_colour() throws InterruptedException {

        Thread.sleep(500);
        driver.findElement(By.xpath(text_red_colour));
        common.log("Text in red/green colour is verified");

    }

    public void verify_country_field() throws InterruptedException {

        Thread.sleep(500);
        driver.findElement(By.xpath(country_field));
        common.log("Country is verified.");

    }

    public void click_on_country_field() throws InterruptedException {

        Thread.sleep(500);
        driver.findElement(By.xpath(country_field)).click();
        common.log("Clicked on country field.");

    }

    public void verify_searchbar() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(searchbar));
        common.log("Verified search bar.");

    }

    public void click_on_searchbar() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(searchbar)).click();
        common.log("Clicked on search bar.");

    }

    public void enter_country_name_in_searchbar() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(searchbar)).click();
        common.log("Clicked on search bar.");
        common.sendkeywords(driver,"UAE");
        driver.findElement(By.xpath(get_country_name));
        common.log("Country name is displayed.");

    }

    public void select_country_and_verify_code_In_mobile_number() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(get_country_name)).click();
        driver.findElement(By.xpath(country_code_dropdown));
        common.log("Country code is verified");

    }



    public void verify_country_field_with_dropdown() throws InterruptedException {

        Thread.sleep(500);
        driver.findElement(By.xpath(country_field)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(done_link));
        common.log("Done link is verified.");
        driver.findElement(By.xpath(searchbar));
        common.log("Search bar is verified.");
        driver.findElement(By.xpath(done_link)).click();
        String country_name=driver.findElement(By.xpath(get_country_name)).getText();
        Assert.assertEquals("Andorra",country_name);
        common.log("Default country is:-"+country_name);
        common.log("Country is verified with dropdown.");

    }

    public void verify_functionality_of_done_link_without_country() throws InterruptedException {

        Thread.sleep(500);
        driver.findElement(By.xpath(country_field)).click();
        common.log("Clicked on country field.");
        Thread.sleep(2000);
        driver.findElement(By.xpath(country_checkbox)).click();
        common.log("Unchecked selected country.");
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked on done link.");
        if(common.isElementPresent(password_validation_message)){
            common.log("Validation message 'Please selected minimum 1 item' is displayed. ");
        }else {
            common.log("Go to latest build.");
        }

    }

    public void verify_functionality_of_done_link_with_country() throws InterruptedException {

        Thread.sleep(500);
        driver.findElement(By.xpath(country_field)).click();
        common.log("Clicked on country field.");
        Thread.sleep(2000);
        driver.findElement(By.xpath(country_checkbox_1)).click();
        common.log("checked selected country.");
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked on done link.");
        String country_name=driver.findElement(By.xpath(get_country_name)).getText();
        Assert.assertEquals("United Arab Emirates (UAE)",country_name);
        common.log("Default country is:-"+country_name);
        common.log("Country is verified with dropdown.");


    }

    public void verify_dropdown_icon() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(dropdown_icon)).click();
        common.log("Country is verified.");
        if(common.isElementPresent(done_link)){
            common.log("Drop down icon is working");
        }else{
            common.log("List for the country doesn't open by tapping on 'Dropdown' icon");
        }

    }

    public void verify_mobile_number_field() throws InterruptedException {

        Thread.sleep(500);
        driver.findElement(By.xpath(mobile_number_field));
        common.log("Mobile number field is verified.");

    }

    public void click_on_mobile_number_field() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(mobile_number_field)).click();
        common.log("Clicked on Mobile number field.");

    }

    public void enter_mobile_number_more_than_10_number() throws InterruptedException {

        long mob_number=common.GenerateRandomNumber(13);
        Thread.sleep(2000);
        driver.findElement(By.xpath(mobile_number_field)).click();
        common.log("Clicked on Mobile number field.");
        common.sendkeywords(driver,""+mob_number+"");
        driver.hideKeyboard();
        common.log("Entered mobile number is:-"+mob_number);

    }

    public void enter_mobile_number_with_10_number() throws InterruptedException, IOException, ParseException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(mobile_number_field)).click();
        common.log("Clicked on Mobile number field.");
        common.sendkeywords(driver,common.readJson("MobileNumber"));
        driver.hideKeyboard();
        common.log("Entered mobile number is:-"+common.readJson("MobileNumber"));

    }

    public void verify_keyboard() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath(keybord));
        common.log("Keyboard is verified.");

    }

    public void click_on_country_code_drop_down() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath(country_code_dropdown)).click();
        common.log("Clicked on company code drop down.");

    }

    public void verify_country_code_navigation_bar() throws InterruptedException {

        Thread.sleep(500);
        driver.findElement(By.xpath(back_icon));
        common.log("Back icon is verified.");
        driver.findElement(By.xpath(search_icon));
        common.log("Search icon is verified.");

    }

    public void click_on_search_icon() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath(search_icon)).click();
        common.log("Clicked on Search icon.");

    }



    public void verify_country_with_flag() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath(country_name_with_flag));
        common.log("Country_name_with_flag is verified.");

    }

    public void verify_date_of_birth_field() throws InterruptedException {

        Thread.sleep(500);
        driver.findElement(By.xpath(date_of_birth_field));
        common.log("DOB field is verified.");

    }

    public void click_on_date_of_birth_field() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(date_of_birth_field)).click();
        common.log("Clicked on DOB field.");

    }

    public void verify_calender() throws InterruptedException {

        Thread.sleep(500);
        driver.findElement(By.id(default_year));
        common.log("By default year is verified.");
        driver.findElement(By.id(default_date_month));
        common.log("By default day and month is verified.");

    }

    public void verify_year() throws InterruptedException {

        Thread.sleep(500);
        driver.findElement(By.id(default_year)).click();
        common.log("Clicked on by default year.");
        String year1=driver.findElement(By.xpath("(//android.widget.TextView[@index=\"0\"])[2]")).getText();
        common.log("_______________________years are displayed in year page_______________________________");
        common.log(year1);
        String year2=driver.findElement(By.xpath("(//android.widget.TextView[@index=\"1\"])[2]")).getText();
        common.log(year2);
        for (int i=2;i<=6;i++){
            String year=driver.findElement(By.xpath("//android.widget.TextView[@index=\""+i+"\"]")).getText();
            common.log(year);
        }

    }

    public void click_on_cancel_button() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.id(cancel_button)).click();
        common.log("Clicked on cancel button.");
        Thread.sleep(1000);
        if(common.isElementPresent(calender_frame)){
            common.log("cancel button is not working fine.");
        }else{
            common.log("Calender is closed.");
        }

    }

    public void click_on_ok_button() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.id(ok_button)).click();
        common.log("Clicked on cancel button.");
        Thread.sleep(1000);
        if (common.isElementPresent(calender_frame)) {
            common.log("cancel button is not working fine.");
        } else {
            common.log("Calender is closed.");
        }

    }

    public void verify_dob() throws InterruptedException {

        Thread.sleep(1000);
        String dob=driver.findElement(By.xpath(date_of_birth_field)).getText();
        common.log("Dob is:-"+dob);

    }

    public void verify_text_sport_that_you_play() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(sport_that_you_play_text));
        common.log("Sport that you play text is verified.");

    }

    public void verify_sport_name(String sport) throws InterruptedException {

        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='"+sport+"']"));
        common.log(" "+sport+" is verified");
//        common.scroll_down(driver);
//        common.scroll_down(driver);
//        common.log("Screen is scrolled.");
//        Thread.sleep(10000);
//        driver.findElement(By.xpath("//android.widget.TextView[@text=\""+sport+"\"]"));
//        common.log("Verify "+sport+" sport from dropdown.");
//        for(int i=0;i<6;i++)
//        {
//            Thread.sleep(6000);
//            if(driver.findElement(By.xpath("//android.widget.TextView[@text=\""+sport+"\"]")).isDisplayed()){
//
//                common.log("Sport is found");
//                break;
//
//            }else {
//
//                common.scroll_down(driver);
//                Thread.sleep(6000);
//
//            }
//        }

//    }
//        do {
           // Boolean bool = false;
         //   bool = !common.isElementPresent("//android.widget.TextView[contains(@text, "+sport+")]");
            //Boolean bol = driver.findElements(By.xpath("\"//android.widget.TextView[contains(@text, \"+sport+\")]\""));
           // common.log("Element Present Status ::: "+bool);

//             if(bool == true){
//
//                common.log("Sport is found");
//                break;
//
//            }else {
//
//                 common.scrollUpMobile(driver);
//                Thread.sleep(2000);
//
//            }
//        }while (!common.isElementPresent("//android.widget.TextView[@text=\""+sport+"\"]"));


//        driver.findElement(By.xpath("//android.widget.TextView[@text=\""+sport+"\"]"));

//        while(common.isElementPresent("//android.widget.TextView[@index=\"0\"]"))
//        {
//            String sport_name=driver.findElement(By.xpath("//android.widget.TextView[@index=\"0\"]")).getText();
//            common.log("Sport name is:-"+sport_name);
//        }

//        if(!common.isElementPresent("//android.widget.TextView[@text='Football']")){
//            common.scrollDownMobile(driver);
//            common.scrollDownMobile(driver);
//            common.scrollDownMobile(driver);
//        }
//        else{
//            common.log("Football Sport is verified");
//        }

//        while(!common.isElementPresent("//android.widget.TextView[@text='Golf']"))
//        {
//            for(int i=0;i<=6;i++){
//                common.scrollDownMobile(driver);
//        }
//            if(common.isElementPresent("//android.widget.TextView[@text='Golf']")) {
//                break;
//            }
//            else{
//                continue;
//            }
//        }

//        String sp ="Golf";
//        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+sp+"\").instance(0))"));
//        common.log("element verified" +sp);
//
    }

    public String click_on_sport_name(String sport) throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.TextView[@text=\""+sport+"\"]")).click();
        common.log("Verify one sport from dropdown.");
        return sport;

    }

    public void enter_sport_name_in_searchbar() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(searchbar)).click();
        common.log("Clicked on search bar.");
        common.sendkeywords(driver,"Cricket");
        String sport_name=driver.findElement(By.xpath(get_sport_name)).getText();
        Assert.assertEquals("Cricket",sport_name);
        common.log("Sport name is:-"+sport_name);
        common.log("Search box is verified.");

    }

    public void verify_sport_in_yellow_colour(){




    }

    public void verify_user_information_page_button (String button_name) throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.TextView[@text=\""+button_name+"\"]"));
        common.log(""+button_name+" button is verified.");

    }

    public void click_on_user_information_page_button (String button_name) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.TextView[@text=\""+button_name+"\"]")).click();
        common.log("Clicked on "+button_name.toLowerCase(Locale.ROOT)+" button.");

    }

    public void click_on_next_button_of_sport_page() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(next_button_1)).click();
        common.log("Next button is clicked.");

    }

    public void Verify_Camera_App_Opened(){
        driver.findElement(By.xpath(Camera_Take_Picture)).isDisplayed();
        common.log("Camera Application Opened");
    }

    public void Verify_Gallery_App_Opened(){
        driver.findElement(By.xpath(Jpg_To_Upload)).isDisplayed();
        common.log("Gallery Opened");
    }

    public void Select_Photo_To_Upload(){
       driver.findElement(By.xpath(Jpg_To_Upload)).click();
       common.log("Selected Photo To Upload");
    }

    public void Verify_Modify_Image_Screen(){
        driver.findElement(By.id(Crop_Button)).isDisplayed();
        common.log("Crop button Verified");
        driver.findElement(By.id(Crop_Overlay)).isDisplayed();
        common.log("Crop Overlay Verified");
        driver.findElement(By.id(Flip_Option)).isDisplayed();
        common.log("Flip button Verified");
        driver.findElement(By.id(Rotate_Button)).isDisplayed();
        common.log("Rotate button Verified");
    }

    public void Rotate_Image(){
        driver.findElement(By.id(Rotate_Button)).click();
        common.log("Image Rotated 45 Degree");
        driver.findElement(By.id(Rotate_Button)).click();
        common.log("Image Rotated 90 Degree");
        driver.findElement(By.id(Rotate_Button)).click();
        common.log("Image Rotated 180 Degree");
        driver.findElement(By.id(Rotate_Button)).click();
        common.log("Back to it's original position");
    }

    public void Flip_Image(){
        driver.findElement(By.id(Flip_Option)).click();
        driver.findElement(By.xpath(Flip_Option_Horizontal)).click();
        common.log("Image Flipped Horizontally");
        driver.findElement(By.id(Flip_Option)).click();
        driver.findElement(By.xpath(Flip_Option_Vertical)).click();
        common.log("Image Flipped Vertically");
    }

    public void Verify_Image_Uploaded() {
        driver.findElement(By.id(Crop_Button)).click();
        common.log("Clicked On Crop Button");
        if (common.isElementPresent(Upload_Photo_Optional_Text)) {
            common.log("Photo Not Uploaded");
        } else {
            common.log("Photo Uploaded");
        }
    }

    public void Verify_Selected_Gender_Highlighted(){
        driver.findElement(By.xpath(Gender_Option_Male)).click();
        if (driver.findElement(By.xpath(Gender_Option_Male)).isSelected() == true) {
            common.log("Selected Gender 'Male' Highlighted");
        } else {
            common.log("Selected Gender 'Male' not Highlighted");
        }
    }

    public void Verify_Prefer_not_to_say_checkbox_Selected() throws InterruptedException {
        driver.findElement(By.xpath(Prefer_Not_To_Say_Checkbox)).click();
        common.log("Clicked On Prefer Not to Say Checkbox");
    }

    public void Verify_SignUp_Complete_And_Mail_Verification_PopUp() throws InterruptedException {
        this.click_on_user_information_page_button("SIGN UP");
        common.log("Clicked On Sign Up Button");
        Thread.sleep(3000);
        String Mail_Verification_Msg = driver.findElement(By.xpath(Mail_Conformation_PopUp)).getText();
        common.log("Mail Verification Popup Displayed with message :- "+ Mail_Verification_Msg);
    }

    public void Click_Close_Button() throws InterruptedException {
        this.click_on_user_information_page_button("CLOSE");
        common.log("Clicked On Close Button Popup");
        Thread.sleep(2000);
    }



}