package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;

public class LinksTabPage extends Abstract{

    public AppiumDriver driver;
    public AndroidDriver driver1;
    Common common = new Common();

    public LinksTabPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Open_Links_Tab() throws InterruptedException {
        for(int i=0;i<=5;i++){
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

    public void Click_Add_New_Link_Button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Add_New_Link_Button)).click();
        common.log("Clicked Add New Link Button.");
        Thread.sleep(3000);
        common.isElementDisplayed(Create_Link_Header);
    }

    public void Enter_Link_Title() {
        driver.findElement(By.xpath(Link_Title_Field)).sendKeys("New link");
        common.log("Link Title Entered");
    }

    public void Enter_Link_URL() {
        driver.findElement(By.xpath(Url_Field)).click();
        driver.findElement(By.xpath(Url_Field)).sendKeys("https://www.google.com");
        common.log("Link Title Entered");
    }

    public void Verify_Create_Link_Screen(){
        common.isElementDisplayed(Link_Title_Field);
        common.log("Link Title Field is displayed");
        common.isElementDisplayed(Url_Field);
        common.log("URL Field is displayed");
        common.isElementDisplayed(Icon_Dropdown);
        common.log("Icon Dropdown is displayed");
        common.isElementDisplayed(Groups_Dropdown_Create_Link);
        common.log("Groups Dropdown is displayed");
        common.isElementDisplayed(Show_Url_No_Button);
        common.log("Show URL options are Visible");
    }

    public void Click_Icon_Dropdown() throws InterruptedException {
        driver.findElement(By.xpath(Icon_Dropdown)).click();
        common.log("Clicked On icon Dropdown");
        Thread.sleep(1000);
        common.isElementDisplayed(searchbar);
        common.isElementDisplayed(done_link);
    }

    public void Select_Icon_And_Verify(){
        driver.findElement(By.xpath(Website_Icon)).click();
        common.log("Selected Website Icon");
        driver.findElement(By.xpath(done_link)).click();
        common.isElementDisplayed(Website_Icon);
        common.log("Selected Website Icon is displayed");
    }

    public void Click_Groups_Dropdown() throws InterruptedException {
        driver.findElement(By.xpath(Groups_Dropdown_Create_Link)).click();
        common.log("Clicked On icon Dropdown");
        Thread.sleep(1000);
        common.isElementDisplayed(searchbar);
        common.isElementDisplayed(done_link);
    }

    public void Select_Group_And_Verify(){
        driver.findElement(By.xpath(SelectAll_Button)).click();
        common.log("Selected Group");
        driver.findElement(By.xpath(done_link)).click();
        common.isDisplayed(Fhchb_Group);
        common.log("Selected All Groups are displayed");
    }

    public void Click_Show_URL_Yes(){
        driver.findElement(By.xpath(Show_Url_Yes_Button)).click();
    }

    public void Click_Show_URL_No(){
        driver.findElement(By.xpath(Show_Url_No_Button)).click();
    }

    public void Click_Submit_Button(){
        driver.findElement(By.xpath(Submit_Button_Invite_Member)).click();
        common.log("Clicked On Subbmit Button");
    }

    public void Click_On_Close_Button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Close_Button)).click();
        common.log("Clicked on close Button.");
    }


    public void Verify_URL_Displayed_if_Selected_Yes_In_Banner() throws InterruptedException {
        this.Enter_Link_Title();
        this.Enter_Link_URL();
        this.Click_Icon_Dropdown();
        this.Select_Icon_And_Verify();
        this.Click_Groups_Dropdown();
        this.Select_Group_And_Verify();
        this.Click_Show_URL_Yes();
        this.Click_Submit_Button();
        this.Click_On_Close_Button();
        common.isDisplayed("//android.widget.TextView[@text=\"https://www.google.com\"]");
        common.log("URL is displayed in link banner");
        driver.findElement(By.xpath(Delete_Link_Button)).click();
    }

    public void Verify_URL_Not_Displayed_if_Selected_No_In_Banner() throws InterruptedException {
        this.Enter_Link_Title();
        this.Enter_Link_URL();
        this.Click_Icon_Dropdown();
        this.Select_Icon_And_Verify();
        this.Click_Groups_Dropdown();
        this.Select_Group_And_Verify();
        this.Click_Show_URL_No();
        this.Click_Submit_Button();
        this.Click_On_Close_Button();
        common.isDisplayed("//android.widget.TextView[@text=\"https://www.google.com\"]");
        common.log("URL is not displayed in link banner");
        driver.findElement(By.xpath(Delete_Link_Button)).click();
    }


}