package Pages;

import Config.Common;
import io.appium.java_client.MobileDriver;
import org.openqa.selenium.By;

public class LaunchAppPage extends Abstract{

    public MobileDriver driver;
    Common common = new Common();

    public LaunchAppPage(MobileDriver driver) {
        this.driver=driver;
    }

    String Welcome_Text = "//android.widget.TextView[@text='Welcome to Planna']";

    public void Verify_Application_Launched() throws InterruptedException {
        common.log("Application Launched.");
        Thread.sleep(22000);
    }

    public void logo_verification() throws InterruptedException {

        driver.findElement(By.xpath(Logo_Verfication));
        common.log("Logo is verified.");
        Thread.sleep(2000);

    }

    public void click_on_skip_button() throws InterruptedException {

        driver.findElement(By.xpath(skip_button)).click();
        common.log("Clicked on skip button.");
        Thread.sleep(2000);

    }

    public void click_on_next_button() throws InterruptedException {

        driver.findElement(By.xpath(next_button)).click();
        common.log("Clicked on next button.");
        Thread.sleep(2000);

    }

}