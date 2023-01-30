package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;

public class LoginPage_Club_Banner extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public LoginPage_Club_Banner(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Click_On_Google_Icon() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Google_Icon_Signup_Screen)).click();
        common.log("Clicked on google icon of login page");
    }

    public void Click_On_Facebook_Icon() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Facebook_Icon_Signup_Screen)).click();
        common.log("Clicked on google icon of login page");
    }

}
