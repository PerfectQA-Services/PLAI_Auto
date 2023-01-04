package Tests;

import Config.Configuration;
import Pages.LaunchAppPage;
import Pages.SignUpPage;
import org.testng.annotations.Test;

public class LaunchAppTests extends Configuration {

    @Test
    public void Launch_Application() throws InterruptedException {
        LaunchAppPage launchApp = new LaunchAppPage(driver);
        launchApp.Verify_Application_Launched();
        launchApp.logo_verification();
        launchApp.click_on_skip_button();
        launchApp.click_on_next_button();
    }

}