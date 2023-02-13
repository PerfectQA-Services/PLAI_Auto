package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class ManageStripeAccountPage extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public ManageStripeAccountPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Click_On_Three_Dot() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Three_Dot_Button)).click();
        common.log("Clicked on three button");
        common.isDisplayed(Connect_Stripe_Button);
        common.log("Connect stripe button is verified.");

    }


}
