package Tests;

import Config.Configuration;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class HomePageTests_New_Sprint extends Configuration {

    //TC-74
    @Test
    public void Verify_the_Home_page_when_article_in_NEWS_is_zero ()throws InterruptedException, IOException, AWTException, ParseException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SignUpPage_Club_Banner signup_club_banner=new SignUpPage_Club_Banner(driver);
        HomePage_New_Sprint homePage_newSprint =new HomePage_New_Sprint(driver);
        launchApp.Verify_Application_Launched();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
        homePage_newSprint.Login_with_valid_Credentials();
        homePage_newSprint.Verify_Homepage_Articles();

    }
}
