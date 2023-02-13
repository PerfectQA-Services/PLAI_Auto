package Tests;

import Config.Configuration;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class ShopTabTests extends Configuration {


    //TC-225
    @Test
    public void Verify_the_EVENT_tab_for_Admin_banner()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_Shop_Tab_Opened();
    }

    //TC-226
    @Test
    public void Verify_the_Search_bar_of_SHOP_tab()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_Search_Product();
    }

    //TC-227
    @Test
    public void Verify_the_Hamburger_menu_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Switch_View_With_Hamburger_Menu_Button();
    }

    //TC-228
    @Test
    public void Verify_the_View_All_Link_of_category()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_View_All();
    }

    //TC-229
    @Test
    public void Verify_the_Search_bar_of_CLOTHING_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_View_All();
        shopTab.Verify_Search_CLP();
    }

    //TC-230
    @Test
    public void Verify_the_banners_for_product()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_View_All();
        shopTab.Verify_Search_CLP();
        shopTab.Open_Clothing_Product();
        shopTab.Verify_Product_page();
    }

    //TC-231
    @Test
    public void Verify_the_Back_icon()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_View_All();
        shopTab.Verify_Search_CLP();
        shopTab.Open_Clothing_Product();
        shopTab.Click_Back_Button();
    }

    //TC-232
    @Test
    public void Verify_the_functionality_of_BUY_NOW_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_View_All();
        shopTab.Verify_Search_CLP();
        shopTab.Open_Clothing_Product();
        shopTab.Verify_Buy_Now_Functionality();
        shopTab.Verify_Checkout_Page();
    }

    //TC-233
    @Test
    public void Verify_the_functionality_of_PROCEED_TO_PAYMENT_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_View_All();
        shopTab.Verify_Search_CLP();
        shopTab.Open_Clothing_Product();
        shopTab.Verify_Buy_Now_Functionality();
        shopTab.Verify_Checkout_Page();
        shopTab.Click_Proceed_To_Payment_Button();
        shopTab.Verify_Confirm_Purchase_Screen();
    }

    //TC-234
    @Test
    public void Verify_the_Card_Number_field_of_CHECKOUT_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_View_All();
        shopTab.Verify_Search_CLP();
        shopTab.Open_Clothing_Product();
        shopTab.Verify_Buy_Now_Functionality();
        shopTab.Verify_Checkout_Page();
        shopTab.Click_Proceed_To_Payment_Button();
        shopTab.Click_Card_Number_Field();
    }

    //TC-235
    @Test
    public void Verify_the_Expiration_field_of_CHECKOUT_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_View_All();
        shopTab.Verify_Search_CLP();
        shopTab.Open_Clothing_Product();
        shopTab.Verify_Buy_Now_Functionality();
        shopTab.Verify_Checkout_Page();
        shopTab.Click_Proceed_To_Payment_Button();
        shopTab.Click_Expiration_Dropdown();
    }

    //TC-236
    @Test
    public void Verify_the_Expiration_field_by_entering_invalid_value()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_View_All();
        shopTab.Verify_Search_CLP();
        shopTab.Open_Clothing_Product();
        shopTab.Verify_Buy_Now_Functionality();
        shopTab.Verify_Checkout_Page();
        shopTab.Click_Proceed_To_Payment_Button();
        shopTab.Click_Expiration_Dropdown();
        homePage.Click_Confirm_Button();
    }

    //TC-237
    @Test
    public void Verify_the_CVC_field_by_entering_2_digit_CVC_Code()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_View_All();
        shopTab.Verify_Search_CLP();
        shopTab.Open_Clothing_Product();
        shopTab.Verify_Buy_Now_Functionality();
        shopTab.Verify_Checkout_Page();
        shopTab.Click_Proceed_To_Payment_Button();
        shopTab.Enter_Card_Number();
        shopTab.Click_Expiration_Dropdown();
        homePage.Click_Confirm_Button();
        shopTab.Enter_Invalid_CVV_2_Digits();
        shopTab.Select_Country();
        shopTab.Click_Confirm_Purchase();
        loginPage.Get_Toast_Alert("Alert for entering 2 digits CVV :- ");
    }

    //TC-238
    @Test
    public void Verify_the_CVC_field_by_entering_4_digit_CVC_Code()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_View_All();
        shopTab.Verify_Search_CLP();
        shopTab.Open_Clothing_Product();
        shopTab.Verify_Buy_Now_Functionality();
        shopTab.Verify_Checkout_Page();
        shopTab.Click_Proceed_To_Payment_Button();
        shopTab.Enter_Invalid_CVV_4_Digits();
    }

    //TC-239
    @Test
    public void Verify_the_Country_field_of_CHECKOUT_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_View_All();
        shopTab.Verify_Search_CLP();
        shopTab.Open_Clothing_Product();
        shopTab.Verify_Buy_Now_Functionality();
        shopTab.Verify_Checkout_Page();
        shopTab.Click_Proceed_To_Payment_Button();
        shopTab.Select_Country();
    }

    //TC-240
    @Test
    public void Verify_the_Search_bar_with_Done_link_of_Country_field()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_View_All();
        shopTab.Verify_Search_CLP();
        shopTab.Open_Clothing_Product();
        shopTab.Verify_Buy_Now_Functionality();
        shopTab.Verify_Checkout_Page();
        shopTab.Click_Proceed_To_Payment_Button();
        shopTab.Select_Country();
        shopTab.Verify_Selected_Country();
    }

    //TC-241
    @Test
    public void Verify_the_CONFIRM_PURCHASE_button()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Verify_View_All();
        shopTab.Verify_Search_CLP();
        shopTab.Open_Clothing_Product();
        shopTab.Verify_Buy_Now_Functionality();
        shopTab.Verify_Checkout_Page();
        shopTab.Click_Proceed_To_Payment_Button();
        shopTab.Enter_Card_Number();
        shopTab.Click_Expiration_Dropdown();
        homePage.Click_Confirm_Button();
        shopTab.Enter_Invalid_CVV_4_Digits();
        shopTab.Select_Country();
        shopTab.Click_Confirm_Purchase();
        loginPage.Get_Toast_Alert("");
    }
    //Nov-Dec Sprint
    //TC-114
    @Test
    public void Verify_the_cards_display_on_the_CHECKOUT_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Click_Snooker_Membership_Item_Proceed_To_Payment();
        newsTab.Click_Change_Card_Button_Verify_Result();


    }
    //TC-115
    @Test
    public void Verify_the_CHANGE_CARD_button_display_on_the_CHECKOUT_screen()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Click_Snooker_Membership_Item_Proceed_To_Payment();
        newsTab.Click_Change_Card_Button_Verify_Result();
        shopTab.Select_Different_Card();

    }
    //TC-116
    @Test
    public void Verify_the_CHANGE_CARD_option_by_selecting_other_card()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Click_Snooker_Membership_Item_Proceed_To_Payment();
        newsTab.Click_Change_Card_Button_Verify_Result();
        shopTab.Select_Different_Card();

    }
    //TC-117
    @Test
    public void Verify_the_CHANGE_CARD_option_by_entering_new_card_detail()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        HomePage homePage = new HomePage(driver);
        NewsTabPage newsTab = new NewsTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        shopTab.Open_PLAIERS_Snooker_Club();
        shopTab.Open_Shop_Tab();
        shopTab.Click_Snooker_Membership_Item_Proceed_To_Payment();
        newsTab.Click_Change_Card_Button_Verify_Result();
        shopTab.Add_New_Card();

    }
    //Tc-147
    @Test
    public void Verify_the_CONNECT_STRIPE_button_display_on_the_SHOP_tab() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        shopTab.Open_Shop_Tab();
        shopTab.Click_On_Connect_Stripe_Button();

    }




}