package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;

import java.io.IOException;

public class HomePage_New_Sprint extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public HomePage_New_Sprint(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Click_On_Login_Button(){
        driver.findElement(By.xpath(LoginButton)).click();
        common.log("Clicked On Login Button");
    }

    public void Login_with_valid_Credentials() throws IOException, ParseException, InterruptedException {

        driver.findElement(By.xpath(EnterEmailTextField)).sendKeys("riyakagda@gmail.com");
        common.log("Entered Email :- riyakagda@gmail.com");
        driver.findElement(By.xpath(PasswordTextField)).sendKeys("Test@123");
        common.log("Entered Password :- Test@123");
        this.Click_On_Login_Button();
        Thread.sleep(5000);
    }

    public void Verify_Homepage_Articles(){

        common.isElementPresent(Admin_Page_Article_1);
        common.log("1st article is verified.");
        common.isElementPresent(Admin_Page_Article_2);
        common.log("2nd article is verified.");
        common.isElementPresent(Admin_Page_Article_3);
        common.log("3rd article is verified.");

    }

}
