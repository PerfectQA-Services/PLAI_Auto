package Tests;

import Config.Configuration;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class ManageStripeAccountTest extends Configuration {

    //TC-140
    @Test
    public void Verify_the_field_display_on_the_MANAGE_STRIPE_ACCOUNT_tab() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ManageStripeAccountPage manageStripeAccountPage=new ManageStripeAccountPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageStripeAccountPage.Click_On_Three_Dot();

    }
    //TC-141
    @Test
    public void Verify_the_CONNECT_STRIPE_button_display () throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ManageStripeAccountPage manageStripeAccountPage=new ManageStripeAccountPage(driver);
        ShopTabPage shopTab = new ShopTabPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        loginPage.Verify_Splash_Welcome_Screen_Elements_After_Login();
        homePage.Click_Test27_Admin_Club_Banner();
        manageStripeAccountPage.Click_On_Three_Dot();
        shopTab.Click_On_Connect_Stripe_Button();

    }

}
