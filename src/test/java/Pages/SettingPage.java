package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SettingPage extends Abstract{

    public AppiumDriver driver;
    Common common = new Common();

    public SettingPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Click_On_Setting_Icon() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(Settings_Icon_Button)).click();
        common.log("Clicked On setting icon.");

    }

    public void Verify_Setting_Header() throws InterruptedException {

        Thread.sleep(2000);
        common.isElementPresent(Setting_Header);
        common.log("Setting page is opened.");

    }

    public void Verify_Setting_Page_Element() throws InterruptedException {

        Thread.sleep(2000);
        common.isElementPresent(Logout_Button);
        common.log("Logout button is Verified.");
        common.isElementPresent(My_Orders_Label);
        common.log("My Orders text is verified");
        common.isElementPresent(Report_An_Issue_Label);
        common.log("Report an issue text is verified.");
        common.isElementPresent(Submit_A_Feature_Request);
        common.log("Submit a feature request text is verified.");
        common.isElementPresent(Legal_Label);
        common.log("Legal text is verified.");
        common.isElementPresent(Change_Password_Label);
        common.log("Change password text is verified.");
        common.isElementPresent(Support_Label);
        common.log("Support text is verified.");
        common.isElementPresent(Facebook_Icon);
        common.log("Facebook icon is verified.");
        common.isElementPresent(Twitter_Icon);
        common.log("Twitter icon is verified.");
        common.isElementPresent(Instagram_Icon);
        common.log("Instagram icon is verified.");
        common.isElementPresent(Youtube_Icon);
        common.log("You tube icon is verified.");


    }

    public void Click_On_Report_An_Issue_Label() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(Report_An_Issue_Label)).click();
        common.log("Clicked On report an issue.");
        common.isElementPresent(FeedBack_Form_Header);
        common.log("FeedBack form header is verified.");

    }

    public void Verify_Public_FeedBack_Forum_Page_Element() throws InterruptedException {

        Thread.sleep(2000);
        common.isElementPresent(User_Information_Text);
        common.log("User IInformation text is Verified.");
        driver.findElement(By.xpath(Submission_Type_text)).click();
        common.log("Clicked on submission type");
        common.isElementPresent(Submission_Type_Problem_Text);
        common.log("Problem text is verified");
        common.isElementPresent(Submission_Type_Bug_Text);
        common.log("Bug text is verified.");
        common.isElementPresent(Select_Device_Android);
        common.log("Android device button is verified.");
        common.isElementPresent(Select_Device_Ios);
        common.log("Ios device button is verified.");
        common.isElementPresent(Full_Name);
        common.log("Full Name text is verified.");
        common.isElementPresent(Email_Field);
        common.log("Email text is verified.");
        common.isElementPresent(Facebook_Icon);
        common.log("Facebook icon is verified.");
        common.isElementPresent(Location_Field_Setting);
        common.log("Location text is verified.");
        common.isElementPresent(Member_Of_Team_No_Button);
        common.log("No button is verified.");
        common.isElementPresent(Member_Of_Team_Yes_Button);
        common.log("Yes button is verified.");
        common.isElementPresent(Description_Field);
        common.log("Description field is verified.");
        common.scrollDownMobile(driver);
        Thread.sleep(2000);
        common.isElementPresent(Attach_A_Screenshot);
        common.log("Screenshot field is verified.");
        common.isElementPresent(Report_And_Privacy_link);
        common.log("Report and Privacy link is verified.");
        common.isElementPresent(Confirm_Button);
        common.log("Confirm button is verified.");

    }

    public void Verify_Submission_Type_Field_Element() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Submission_Type_text)).click();
        common.log("Clicked on submission type");
        common.isElementPresent(Submission_Type_Problem_Text);
        common.log("Problem text is verified");
        common.isElementPresent(Submission_Type_Bug_Text);
        common.log("Bug text is verified.");


    }

    public void Click_On_Ios_Button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Select_Device_Ios)).click();
        common.log("Clicked on Ios button.");


    }

    public void Verify_Full_Name_Field() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Full_Name)).clear();
        driver.findElement(By.xpath(Full_Name)).click();
        common.log("Clicked on Full name.");
        common.sendkeywords(driver,"Test@123");
        common.log("Entered name is:-Test@123.");
        driver.hideKeyboard();

    }

    public void Enter_Invalid_Email_And_Verify_Result() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Email_Field)).clear();
        driver.findElement(By.xpath(Email_Field)).click();
        common.log("Clicked on Email Field.");
        common.sendkeywords(driver,"sagarn@gmail.ghfhf");
        common.log("Entered Email is:-sagarn@gmail.ghfhf.");
        driver.hideKeyboard();

    }

    public void Enter_valid_Email_And_Verify_Result() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Email_Field)).clear();
        driver.findElement(By.xpath(Email_Field)).click();
        common.log("Clicked on Email Field.");
        common.sendkeywords(driver,"sagarn@gmail.com");
        common.log("Entered Email is:-sagarn@gmail.com.");
        driver.hideKeyboard();

    }

    public void Click_On_Continue_Button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Confirm_Button)).click();
        common.log("Clicked on confirm button.");

    }

    public void Click_On_No_Button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Member_Of_Team_No_Button)).click();
        common.log("Clicked on no button.");

    }

    public void Click_On_Yes_Button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Member_Of_Team_Yes_Button)).click();
        common.log("Clicked on yes button.");
        common.isElementPresent(Sport_Team_Name);
        common.log("Sport team name field is verified.");

    }


    public void Verify_Location_Field_Element() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(Location_Field_Setting)).click();
        common.log("Clicked on Location Field");
        common.isElementPresent(done_link);
        common.log("Done link iis verified.");
        common.isElementPresent(searchbar);
        common.log("Search bar is verified.");
        common.isElementPresent(Agent_code_Checkbox);
        common.log("Checkbox is verified.");

        common.log("_____________________________Available_Country_Name_Landing_Page_________________________________");
        for (int i = 3; i <= 15; i++) {

            String Country_Name = driver.findElement(By.xpath("(//android.widget.TextView)[" + i + "]")).getText();
            common.log(Country_Name);
        }
    }

    public void Enter_Country_Name_In_Searchbar_Verify_Done_Link() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(Location_Field_Setting)).click();
        common.log("Clicked on Location Field");
        driver.findElement(By.xpath(searchbar)).click();
        common.sendkeywords(driver,"Angola");
        common.log("Entered sport name in search bar.");
        driver.findElement(By.xpath(Agent_code_Checkbox)).click();
        common.log("Clicked on sport name checkbox.");
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked on done link.");
        Thread.sleep(1000);
        String Country_Name=driver.findElement(By.xpath(Country_Text)).getText();
        common.log("Selected country name:-"+Country_Name);

    }

    public void Enter_Description() throws InterruptedException {

        Thread.sleep(3000);
        String Team_Bio=common.generateRandomChars(20);
        driver.findElement(By.xpath(Description_Field)).click();
        common.log("Clicked on Description text area.");
        common.sendkeywords(driver,Team_Bio);
        common.log("Team name is:-"+Team_Bio);
        driver.hideKeyboard();

    }

    public void Enter_Team_Description() throws InterruptedException {

        Thread.sleep(1000);
        String Team_Bio=common.generateRandomChars(20);
        driver.findElement(By.xpath(Sport_Team_Name)).click();
        common.log("Clicked on Description text area.");
        common.sendkeywords(driver,Team_Bio);
        common.log("Team name is:-"+Team_Bio);
        driver.hideKeyboard();

    }

    public void Click_On_Submit_A_Feature_Request_Label() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(Submit_A_Feature_Request)).click();
        common.log("Clicked On submit a feature request label.");
        common.isElementPresent(FeedBack_Form_Header);
        common.log("FeedBack form header is verified.");

    }

}
