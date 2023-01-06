package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;

public class LinksTabPage extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public LinksTabPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Open_Links_Tab() throws InterruptedException {
        for(int i=0;i<=3;i++){
            driver.findElement(By.xpath(Navigation_Right_Arrow)).click();}
        Thread.sleep(2000);
        driver.findElement(By.xpath(LINKS_Tab)).click();
        common.log("Opened Links Tab");
        Thread.sleep(4000);
    }

    public void Verify_Links_Tab(){
        common.isElementPresent(Search_Bar);
        common.log("Search bar is present");
        common.isElementPresent(Add_Link_Button);
        common.log("Add Link button is present");
    }

    public void Search_Link(){
        driver.findElement(By.xpath(Search_Bar)).sendKeys("Link");
        common.log("Searched Link in Search Bar");
        common.isElementPresent(Link_Google_Link_After_Search);
        common.log("Searched Link is displayed");
    }

    public void Click_Link_Banner_And_Verify() throws InterruptedException {
        driver.findElement(By.xpath(Link_Banner)).click();
        common.log("Clicked On Link Banner");
        Thread.sleep(2000);
        common.isElementPresent(Verify_Browser_Opened);
        common.log("Link Opened in browser");
    }

    public void Click_On_Angel_Up_icon() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Angel_Up_Icon)).click();
        common.log("Clicked On angel up icon.");

    }

    public void Click_On_Angel_down_icon() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Angel_Up_Icon)).click();
        common.log("Clicked On angel up icon.");

    }

    public void Verify_Up_And_Down_Arrows_Functionality() throws InterruptedException {
        driver.findElement(By.xpath(Down_Arrow)).click();
        common.log("Clicked On Down Arrow");
        Thread.sleep(1000);
        driver.findElement(By.xpath(Up_Arrow)).click();
        common.log("Clicked On Up Arrow");
    }
}