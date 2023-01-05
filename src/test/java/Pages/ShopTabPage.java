package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ShopTabPage extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public ShopTabPage(AppiumDriver driver) {
        this.driver=driver;
    }
    
    public void Open_PLAIERS_Snooker_Club() throws InterruptedException {
        driver.findElement(By.xpath(PLAIers_Snooker_Club)).click();
        common.log("Clicked On PLAIers Snooker Club Banner");
        Thread.sleep(3000);
        common.isElementPresent(PLAIers_Snooker_Club);
        common.log("PLAIers Snooker Club Opened");
    }

    public void Open_Shop_Tab() throws InterruptedException {
        driver.findElement(By.xpath(SHOP_Tab)).click();
        common.log("Shop Tab Opened");
        Thread.sleep(5000);
    }

    public void Verify_Shop_Tab_Opened(){
        common.isElementPresent(Search_Bar);
        common.log("Search Bar Is Displayed");
        common.isElementPresent(HamBurgerMenu_ShopTab);
        common.log("Burger Menu Is Displayed");
        common.isElementPresent(Product_Banner);
        common.log("Product Banner Is Displayed");
        common.isElementPresent(Product_Price);
        common.log("Product Price Is Displayed");
        common.isElementPresent(View_All_ShopTab);
        common.log("View All Button Is Displayed");
    }

    public void Verify_Search_Product() throws InterruptedException {
        driver.findElement(By.xpath(SHOP_Tab)).sendKeys("Test Product");
        common.log("Searched Test Product");
        driver.findElement(By.xpath(SHOP_Tab)).sendKeys("\n");
        Thread.sleep(3000);
        common.isElementPresent(Test_Product);
        common.log("Searched Product is displayed");
    }

    public void Switch_View_With_Hamburger_Menu_Button() throws InterruptedException {
        driver.findElement(By.xpath(HamBurgerMenu_ShopTab)).click();
        Thread.sleep(2000);
        common.log("Product View Switched to List");
        driver.findElement(By.xpath(HamBurgerMenu_ShopTab)).click();
        Thread.sleep(2000);
        common.log("Product View Switched to Tiles");
    }

    public void Verify_View_All() throws InterruptedException {
        driver.findElement(By.xpath(View_All_ShopTab)).click();
        common.log("Clicked On View All Button Of Clothing");
        Thread.sleep(6000);
        common.isElementPresent(Clothing_Header);
        common.log("Clothing List Page Is Displayed");
    }

    public void Verify_Search_CLP(){
        driver.findElement(By.xpath(Search_Bar)).sendKeys("T-Shirt");
        common.log("Searched T-Shirt in CLP");
        common.isElementPresent(T_Shirt_Product);
        common.log("Searched Product Is Displayed");
    }

    public void Open_Clothing_Product(){
        driver.findElement(By.xpath(T_Shirt_Product)).click();
        common.log("Clicked On T-Shirt Product_Banner");
    }

    public void Verify_Product_page(){
        common.isElementPresent(Back_Button_Search);
        common.log("Back Button Is Displayed");
        common.isElementPresent(Product_Price);
        common.log("Product Price Is Displayed");
        common.isElementPresent(Buy_Now_Button);
        common.log("BUy Now button Is Displayed");
    }

    public void Click_Back_Button(){
        driver.findElement(By.xpath(Back_Button_PDP)).click();
        common.log("Clicked On Back Button of Product Description Page");
        common.isElementPresent(Clothing_Header);
        common.log("Clothing List Page Is Displayed");
    }

    public void Verify_Buy_Now_Functionality(){
        driver.findElement(By.xpath(Buy_Now_Button)).click();
        common.log("Clicked On Buy Now Button");
        common.isElementPresent(Checkout_Header);
        common.log("Checkout Page is Displayed");
    }

    public void Verify_Checkout_Page() throws InterruptedException {
        common.isElementPresent(Item_Total);
        common.log("Clothing List Page Is Displayed");
        common.isElementPresent(Transaction_Fee);
        common.log("Clothing List Page Is Displayed");
        String Name = driver.findElement(By.xpath(Name_In_Checkout)).getText();
        common.log("Name in Checkout Is Displayed : "+Name);
        String Address = driver.findElement(By.xpath(Address_In_Checkout)).getText();
        common.log("Address in Checkout Is Displayed : "+Address);
        common.isElementPresent(Proceed_To_Payment_Button);
        common.log("Proceed To Payment Button Is Displayed");
        Thread.sleep(4000);
    }

    public void Click_Proceed_To_Payment_Button() throws InterruptedException {
        driver.findElement(By.xpath(Proceed_To_Payment_Button)).click();
        common.log("Clicked On Proceed To Payment button");
        Thread.sleep(4000);
    }

    public void Verify_Confirm_Purchase_Screen(){
        common.isElementPresent(Card_Number_Field);
        common.log("Card Number Field Is Displayed");
        common.isElementPresent(Expiration_Dropdown);
        common.log("Expiration Dropdown Is Displayed");
        common.isElementPresent(CVV_Field);
        common.log("CVV Field Is Displayed");
        common.isElementPresent(Country_Dropdown);
        common.log("Country Dropdown Is Displayed");
        common.isElementPresent(Confirm_Purchase);
        common.log("Confirm Purchase Displayed");
    }

    public void Enter_Card_Number(){
        driver.findElement(By.xpath(Card_Number_Field)).sendKeys("7689253445678576");
        common.log("Searched T-Shirt in CLP");
    }

    public void Click_Card_Number_Field(){
        driver.findElement(By.xpath(Card_Number_Field)).click();
        common.log("Clicked On Card Number Field");
    }

    public void Click_Expiration_Dropdown(){
        driver.findElement(By.xpath(Expiration_Dropdown)).click();
        common.log("Clicked On Card Number Field");
        common.log("Date Panel for month and Year Opened");
    }

    public void Enter_Invalid_CVV_2_Digits() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(CVV_Field)).sendKeys("12");
        common.log("Entered 2 digits CVV");
    }

    public void Enter_Invalid_CVV_4_Digits() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(CVV_Field)).sendKeys("1234");
        common.log("Sent 4 digits CVV");
        common.log("User is not able to Enter more than 3 digits");
    }

    public void Select_Country(){
        driver.findElement(By.xpath(Country_Dropdown_Checkout)).click();
        common.log("Clicked On Country Dropdown");
        driver.findElement(By.xpath(country_checkbox_1)).click();
        common.log("Selected Second Country as UAE");
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked On Done BButton");
    }

    public void Verify_Selected_Country(){
        common.isElementPresent(Country_Selected);
        common.log("Selected country is displayed");
    }

    public void Click_Confirm_Purchase() throws InterruptedException {
        driver.findElement(By.xpath(Confirm_Purchase)).click();
        common.log("Clicked On Confirm_Purchase Button");
        Thread.sleep(5000);
    }


}