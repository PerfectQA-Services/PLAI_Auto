package Pages;

import Config.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class CreateTeamPage extends Abstract {


    public AppiumDriver driver;
    Common common = new Common();

    public CreateTeamPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void Click_on_Create_Team_Icon() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.xpath(Create_Team_Plus_Button)).click();
        common.log("Clicked On create team icon");

    }
    public void Verify_Create_Team_Header() throws InterruptedException {

        Thread.sleep(2000);
        common.isElementPresent(Create_Team_Header);
        common.log("Create team page is opened");

    }

    public void Verify_Create_Team_page_Element() throws InterruptedException {

        Thread.sleep(2000);
        common.isElementPresent(Team_Name_Label);
        common.log("Team name text is Verified.");
        common.isElementPresent(Agent_code_Label);
        common.log("Agent code text is verified");
        common.isElementPresent(Primary_Email_Label);
        common.log("Primary Email text is verified.");
        common.isElementPresent(Sport_Label);
        common.log("Sport text is verified.");
        common.isElementPresent(Team_Bio_Label);
        common.log("Team bio text is verified.");
        common.isElementPresent(next_button_1);
        common.log("Next button is verified.");

    }

    public void Click_On_Next_Button_Of_Create_Team_Page() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(next_button_1)).click();
        common.log("Next button is clicked.");


    }

    public void Enter_Team_Name_In_Create_Team_Page() throws InterruptedException {

        String Team_name=common.generateRandomChars(5);
        Thread.sleep(1000);
        driver.findElement(By.xpath(Team_Name_Label)).click();
        common.log("Clicked on Team name label");
        common.sendkeywords(driver,Team_name);
        common.log("Team name is:-"+Team_name);

    }

    public void Enter_Agent_Code_In_Create_Team_Page() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(Agent_code_Label)).click();
        common.log("Clicked on agent code label");
        driver.findElement(By.xpath(Agent_code_Checkbox)).click();
        common.log("Clicked on agent code");
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked on done button.");

    }

    public void Enter_Sport_Name_In_Create_Team_Page() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(Sport_Label)).click();
        common.log("Clicked on agent code label");
        driver.findElement(By.xpath(Agent_code_Checkbox)).click();
        common.log("Clicked on one sport");
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked on done button.");

    }

    public void Enter_Team_Bio_In_Create_Team_Page() throws InterruptedException {

        String Team_Bio=common.generateRandomChars(20);
        Thread.sleep(2000);
        driver.findElement(By.xpath(Team_Bio_TextArea)).click();
        common.log("Clicked on Team bio text area.");
        common.sendkeywords(driver,Team_Bio);
        common.log("Team name is:-"+Team_Bio);
        driver.hideKeyboard();

    }

    public void Verify_Agent_Code_Field_Element() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(Agent_code_Label)).click();
        common.log("Clicked on agent code label");
        common.isElementPresent(done_link);
        common.log("Done link iis verified.");
        common.isElementPresent(searchbar);
        common.log("Search bar is verified.");
        common.isElementPresent(Agent_code_Checkbox);
        common.log("Checkbox is verified.");
        Thread.sleep(2000);
        common.log("_____________________________Available_Agent_code_________________________________");
        for(int i=3 ; i<=15 ; i++){

                String code=driver.findElement(By.xpath("(//android.widget.TextView)["+i+"]")).getText();
                common.log(code);
        }


    }

    public void Enter_Agent_Code_Name_In_Searchbar_Verify_Done_Link() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(Agent_code_Label)).click();
        common.log("Clicked on agent code label");
        driver.findElement(By.xpath(searchbar)).click();
        common.sendkeywords(driver,"#PLAIwithRITCHIE");
        common.log("Entered Agent_code name in search bar.");
        driver.findElement(By.xpath(Agent_code_Checkbox)).click();
        common.log("Clicked on Agent code checkbox.");
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked on done link.");
        Thread.sleep(1000);
        String Agent_Code_Name=driver.findElement(By.xpath(Agent_Code_Text)).getText();
        common.log("Selected agent code:-"+Agent_Code_Name);


    }

    public void Verify_sport_field_Element_In_Create_Team_Page() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Sport_Label)).click();
        common.log("Clicked on agent code label");
        common.isElementPresent(done_link);
        common.log("Done link iis verified.");
        common.isElementPresent(searchbar);
        common.log("Search bar is verified.");
        common.isElementPresent(Agent_code_Checkbox);
        common.log("Checkbox is verified.");
        Thread.sleep(2000);
        common.log("_____________________________Available_sport_on_landing_page_________________________________");
        for(int i=3 ; i<=18 ; i++){

            String Sport_Name=driver.findElement(By.xpath("(//android.widget.TextView)["+i+"]")).getText();
            common.log(Sport_Name);
        }

    }

    public void Enter_sport_Name_In_Searchbar_Verify_Done_Link() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(Sport_Label)).click();
        common.log("Clicked on agent code label");
        driver.findElement(By.xpath(searchbar)).click();
        common.sendkeywords(driver,"Cricket");
        common.log("Entered sport name in search bar.");
        driver.findElement(By.xpath(Agent_code_Checkbox)).click();
        common.log("Clicked on sport name checkbox.");
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked on done link.");
        Thread.sleep(1000);
        String sport_Name=driver.findElement(By.xpath(Sport_Text)).getText();
        common.log("Selected sport name:-"+sport_Name);

    }

    public void Verify_Create_Team_Second_page_Element() throws InterruptedException {

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
        Thread.sleep(1000);
        common.isElementPresent(Create_Team_Button);
        common.log("Create team button is verified.");

    }

    public void Verify_Country_Field_Element() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Country_Label)).click();
        common.log("Clicked on Country label");
        common.isElementPresent(done_link);
        common.log("Done link is verified.");
        common.isElementPresent(searchbar);
        common.log("Search bar is verified.");
        common.isElementPresent(Agent_code_Checkbox);
        common.log("Checkbox is verified.");
        common.log("______Available_Country_Names______");
        Thread.sleep(2000);
        for(int i=3 ; i<=15 ; i++){
            String Country_Name=driver.findElement(By.xpath("(//android.widget.TextView)["+i+"]")).getText();
            common.log(Country_Name);
        }
    }

    public void Enter_Country_Name_In_Searchbar_Verify_Done_Link() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(Country_Label)).click();
        common.log("Clicked on country label");
        driver.findElement(By.xpath(searchbar)).click();
        common.sendkeywords(driver,"Angola");
        common.log("Entered country name in search bar.");
        driver.findElement(By.xpath(Agent_code_Checkbox)).click();
        common.log("Clicked on sport name checkbox.");
        driver.findElement(By.xpath(done_link)).click();
        common.log("Clicked on done link.");
        Thread.sleep(1000);
        String Country_Name=driver.findElement(By.xpath(Country_Text)).getText();
        common.log("Selected agent code:-"+Country_Name);

    }

    public void Click_On_Create_Team_Button_Verify_Result() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Create_Team_Button)).click();
        common.log("Clicked on Create Team Button.");
        Thread.sleep(2000);
        String Successful_Message=driver.findElement(By.xpath(Team_Creation_Message)).getText();
        common.log("Message is:-"+Successful_Message);

    }

    public void Click_On_Close_Button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(Close_Button)).click();
        common.log("Clicked on close Button.");

    }









}
