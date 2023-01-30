package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SignUpPage_Club_Banner extends Abstract {

    public AppiumDriver driver;
    Common common = new Common();

    public SignUpPage_Club_Banner(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Click_on_Club_Banner() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(Club_Banner)).click();
        common.log("Clicked on Club banner.");

    }
    public void Enter_Team_Bio_In_Create_Team_Page() throws InterruptedException {

        String Team_Bio=common.generateRandomChars(20);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//android.widget.EditText)[4]")).click();
        common.log("Clicked on Team bio text area.");
        common.sendkeywords(driver,Team_Bio);
        common.log("Team name is:-"+Team_Bio);
        driver.hideKeyboard();

    }

    public void Enter_Data_in_Team_Name() throws InterruptedException {

        String Team_Name=common.generateRandomChars(5);
        Thread.sleep(3000);
        driver.findElement(By.xpath(Team_Name_Label)).click();
        common.log("Clicked on team name  label.");
        common.sendkeywords(driver,Team_Name);
        driver.hideKeyboard();

    }
    public void Verify_Club_Banner_Signup_Third_page_Element() throws InterruptedException {

        Thread.sleep(2000);
        common.isElementPresent(Country_Label);
        common.log("Country field is Verified.");
        common.isElementPresent(Location_Label);
        common.log("Location field is verified");
        common.isElementPresent(Facebook_Label);
        common.log("Facebook link is verified.");
        common.isElementPresent(Twitter_Label);
        common.log("Twitter link is verified.");
        common.isElementPresent(Instagram_Label);
        common.log("Instagram link is verified.");
        common.isElementPresent(Youtube_Label);
        common.log("Youtube link is verified.");
        driver.findElement(By.xpath(next_button_1)).click();
        common.log("Clicked next button.");

    }

    public void Enter_Country_Name_In_Searchbar() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(Country_Label)).click();
        common.log("Clicked on country label");
        driver.findElement(By.xpath(searchbar)).click();
        common.sendkeywords(driver,"Angola");
        common.log("Entered country name in search bar.");


    }

    public void Enter_Country_Name_In_Searchbar_Verify_Done_Link() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(Country_Label)).click();
        common.log("Clicked on country label");
        driver.findElement(By.xpath(searchbar)).click();
        common.sendkeywords(driver,"Angola");
        common.log("Entered country name in search bar.");
        driver.findElement(By.xpath(country_checkbox)).click();
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked on done link.");
        Thread.sleep(1000);
        String Country_Name=driver.findElement(By.xpath(Country_Text)).getText();
        common.log("Selected country name:-"+Country_Name);

    }

    public void Click_on_Location_Field_And_Verify_Result() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(Location_Text_Field)).click();
        common.log("Clicked on location field.");
        driver.findElement(By.id("com.app.plaisports:id/places_autocomplete_search_bar")).isDisplayed();
        common.log("Search bar is displayed.");

    }
    public void Enter_Location_Name_In_Searchbar_Verify_Result() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.id("com.app.plaisports:id/places_autocomplete_search_bar")).click();
        common.log("Clicked on Search bar.");
        common.sendkeywords(driver,"Great Ocean Road");
        driver.findElement(By.xpath(Location_Name)).click();
        common.log("Select location.");
        String Location_Name=driver.findElement(By.xpath(Location_Text)).getText();
        common.log("Selected country name:-"+Location_Name);

    }

    public void Verify_Social_Media_Link() throws InterruptedException {

        Thread.sleep(3000);
        common.isElementPresent(Facebook_Label);
        common.log("Facebook link is verified.");
        common.isElementPresent(Twitter_Label);
        common.log("Twitter link is verified.");
        common.isElementPresent(Instagram_Label);
        common.log("Instagram link is verified.");
        common.isElementPresent(Youtube_Label);
        common.log("Youtube link is verified.");

    }
    public void Verify_Forth_Screen_Of_Club_Banner_Signup() throws InterruptedException {

        Thread.sleep(3000);
        common.isElementPresent(back_icon);
        common.log("Back icon is verified.");
        common.isElementPresent(Member_Question_1_Text_Field);
        common.log("Member question is verified.");
        common.isElementPresent(Require_Checkbox);
        common.log("Require checkbox is verified.");
        common.isElementPresent(Plus_Icon);
        common.log("Plus icon is verified.");
        common.isElementPresent(Confirm_Button);
        common.log("Confirm button is verified.");

    }
    public void Enter_Member_Question() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(Member_Question_1_Text_Field)).click();
        common.log("Clicked on member question.");
        common.sendkeywords(driver,"Great Ocean Road?");
        common.log("Member question is entered.");

    }

    public void Click_On_Plus_Icon_Verify_Result() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(Plus_Icon)).click();
        common.log("Clicked on plus icon.");
        common.isElementPresent(Member_Question_2_Text_Field);
        common.log("Member question 2 text field is verified.");
        common.isElementPresent(Plus_Icon_1);
        common.log("Plus icon 2 is verified.");
        common.isElementPresent(Minus_Icon);
        common.log("Minus icon is verified.");
        common.isElementPresent(Require_Checkbox_1);
        common.log("Required checkbox 2 is verified.");


    }

    public void Click_On_Minus_Icon_Verify_Result() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(Plus_Icon)).click();
        common.log("Clicked on plus icon.");
        driver.findElement(By.xpath(Plus_Icon)).click();
        common.log("Clicked on Minus icon.");
        if(driver.findElement(By.xpath(Member_Question_1_Text_Field)).isDisplayed()){
            common.log("Minus icon doesn't work ");
        }else {
            common.log("Member question 2 is removed.");
        }

    }

    public void Click_On_Plus_Icon_Of_Second_Question_And_Verify_Result() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(Plus_Icon)).click();
        common.log("Clicked on plus icon.");
        driver.findElement(By.xpath(Plus_Icon_1)).click();
        common.log("Clicked on plus icon of second question.");
        common.isElementPresent(Member_Question_3_Text_Field);
        common.log("Member question 3 text field is verified.");

    }

    public void Click_On_Minus_Icon_Of_Second_Question_And_Verify_Result() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(Plus_Icon)).click();
        common.log("Clicked on plus icon.");
        driver.findElement(By.xpath(Minus_Icon)).click();
        common.log("Clicked on Minus icon of second question.");
        if(driver.findElement(By.xpath(Member_Question_1_Text_Field)).isDisplayed()){
            common.log("Minus icon doesn't work ");
        }else {
            common.log("Member question 2 is removed.");
        }

    }
    public void Click_Checkbox_Optional_Of_Second_Question_And_Verify_Result() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(Plus_Icon)).click();
        common.log("Clicked on plus icon.");
        driver.findElement(By.xpath(Require_Checkbox_2_Question)).click();
        common.log("Clicked checkbox of optional of second question.");

    }

    public void Click_On_Confirm_Button_And_Verify_Result() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(Confirm_Button)).click();
        common.log("Clicked on Confirm button.");
        common.isElementPresent(Conformation_Text);
        common.log("Conformation text is verified.");
        common.isElementPresent(Close_Button);
        common.log("Close button is verified.");

    }
    public void Click_On_Close_Button() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(Close_Button)).click();
        common.log("Clicked on close button.");

    }


}
