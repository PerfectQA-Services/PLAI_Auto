package Tests;

import org.testng.annotations.Test;
import Config.Configuration;
import Pages.CreateTeamPage;
import Pages.LaunchAppPage;
import Pages.LoginPage;
import Pages.SignUpPage;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class CreateTeamTests extends Configuration {

   //TC_324
    @Test
    public void Verify_the_Create_Team_icon_placed_at_bottom_left_of_the_Home_screen() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        createteampage.Click_on_Create_Team_Icon();
        createteampage.Verify_Create_Team_Header();

    }
    //TC-325
    @Test
    public void Verify_the_fields_display_on_first_screen_of_CREATE_TEAM() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        createteampage.Click_on_Create_Team_Icon();
        createteampage.Verify_Create_Team_Header();
        signup.verify_back_icon();
        createteampage.Verify_Create_Team_page_Element();

    }
    //TC-326
    @Test
    public void Verify_the_NEXT_button_of_CREATE_TEAM_screen_without_entering_data_in_mandatory_fields() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        createteampage.Click_on_Create_Team_Icon();
        createteampage.Click_On_Next_Button_Of_Create_Team_Page();
        loginPage.Get_Toast_Alert("Getting this error when click next without entering data");

    }
    //TC-327
    @Test
    public void Verify_the_NEXT_button_of_CREATE_TEAM_screen_by_entering_data_in_mandatory_fields() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        createteampage.Click_on_Create_Team_Icon();
        createteampage.Enter_Team_Name_In_Create_Team_Page();
        createteampage.Enter_Agent_Code_In_Create_Team_Page();
        createteampage.Enter_Sport_Name_In_Create_Team_Page();
        createteampage.Enter_Team_Bio_In_Create_Team_Page();
        createteampage.Click_On_Next_Button_Of_Create_Team_Page();
        createteampage.Verify_Create_Team_Header();


    }
    //TC-328
    @Test
    public void Verify_the_Agent_Code_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        createteampage.Click_on_Create_Team_Icon();
        createteampage.Verify_Agent_Code_Field_Element();

    }
    //TC-329
    @Test
    public void Verify_the_Search_bar_and_Done_link_Agent_code() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        createteampage.Click_on_Create_Team_Icon();
        createteampage.Enter_Agent_Code_Name_In_Searchbar_Verify_Done_Link();

    }
    //TC-330
    @Test
    public void Verify_the_Sport_field() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        createteampage.Click_on_Create_Team_Icon();
        createteampage.Verify_sport_field_Element_In_Create_Team_Page();

    }
    //TC-331
    @Test
    public void Verify_the_Search_bar_and_Done_link_Sport() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        createteampage.Click_on_Create_Team_Icon();
        createteampage.Enter_sport_Name_In_Searchbar_Verify_Done_Link();

    }
    //TC-332
    @Test
    public void Verify_the_fields_display_on_second_screen_of_CREATE_TEAM() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        createteampage.Click_on_Create_Team_Icon();
        createteampage.Enter_Team_Name_In_Create_Team_Page();
        createteampage.Enter_Agent_Code_In_Create_Team_Page();
        createteampage.Enter_Sport_Name_In_Create_Team_Page();
        createteampage.Enter_Team_Bio_In_Create_Team_Page();
        createteampage.Click_On_Next_Button_Of_Create_Team_Page();
        createteampage.Verify_Create_Team_Header();
        signup.verify_back_icon();
        createteampage.Verify_Create_Team_Second_page_Element();

    }
    //TC-333
    @Test
    public void Verify_dropdown_list_for_Country_field_Create_Team_Page() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup=new SignUpPage(driver);
        CreateTeamPage createteampage=new CreateTeamPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        createteampage.Click_on_Create_Team_Icon();
        createteampage.Enter_Team_Name_In_Create_Team_Page();
        createteampage.Enter_Agent_Code_In_Create_Team_Page();
        createteampage.Enter_Sport_Name_In_Create_Team_Page();
        createteampage.Enter_Team_Bio_In_Create_Team_Page();
        createteampage.Click_On_Next_Button_Of_Create_Team_Page();
        createteampage.Verify_Country_Field_Element();

    }
    //TC-334
    @Test
    public void Verify_Done_link_by_selecting_country_from_the_list() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup = new SignUpPage(driver);
        CreateTeamPage createteampage = new CreateTeamPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        createteampage.Click_on_Create_Team_Icon();
        createteampage.Enter_Team_Name_In_Create_Team_Page();
        createteampage.Enter_Agent_Code_In_Create_Team_Page();
        createteampage.Enter_Sport_Name_In_Create_Team_Page();
        createteampage.Enter_Team_Bio_In_Create_Team_Page();
        createteampage.Click_On_Next_Button_Of_Create_Team_Page();
        createteampage.Enter_Country_Name_In_Searchbar_Verify_Done_Link();

    }
    //TC-335
    @Test
    public void Verify_Search_bar_of_dropdown_list_for_Country() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup = new SignUpPage(driver);
        CreateTeamPage createteampage = new CreateTeamPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        createteampage.Click_on_Create_Team_Icon();
        createteampage.Enter_Team_Name_In_Create_Team_Page();
        createteampage.Enter_Agent_Code_In_Create_Team_Page();
        createteampage.Enter_Sport_Name_In_Create_Team_Page();
        createteampage.Enter_Team_Bio_In_Create_Team_Page();
        createteampage.Click_On_Next_Button_Of_Create_Team_Page();
        createteampage.Enter_Country_Name_In_Searchbar_Verify_Done_Link();

    }
    //TC-336
    @Test
    public void Verify_CREATE_TEAM_button() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup = new SignUpPage(driver);
        CreateTeamPage createteampage = new CreateTeamPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        createteampage.Click_on_Create_Team_Icon();
        createteampage.Enter_Team_Name_In_Create_Team_Page();
        createteampage.Enter_Agent_Code_In_Create_Team_Page();
        createteampage.Enter_Sport_Name_In_Create_Team_Page();
        createteampage.Enter_Team_Bio_In_Create_Team_Page();
        createteampage.Click_On_Next_Button_Of_Create_Team_Page();
        createteampage.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        createteampage.Click_On_Next_Button_Of_Create_Team_Page();
        createteampage.Click_On_Create_Team_Button_Verify_Result();

    }
    //TC-337
    @Test
    public void Verify_the_functionality_of_ClOSE_button() throws InterruptedException, IOException, ParseException {

        LaunchAppPage launchapp = new LaunchAppPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signup = new SignUpPage(driver);
        CreateTeamPage createteampage = new CreateTeamPage(driver);
        launchapp.Verify_Application_Launched();
        launchapp.click_on_skip_button();
        launchapp.click_on_next_button();
        loginPage.Login_with_valid_Credentials();
        createteampage.Click_on_Create_Team_Icon();
        createteampage.Enter_Team_Name_In_Create_Team_Page();
        createteampage.Enter_Agent_Code_In_Create_Team_Page();
        createteampage.Enter_Sport_Name_In_Create_Team_Page();
        createteampage.Enter_Team_Bio_In_Create_Team_Page();
        createteampage.Click_On_Next_Button_Of_Create_Team_Page();
        createteampage.Enter_Country_Name_In_Searchbar_Verify_Done_Link();
        createteampage.Click_On_Next_Button_Of_Create_Team_Page();
        createteampage.Click_On_Create_Team_Button_Verify_Result();
        createteampage.Click_On_Close_Button();
        launchapp.logo_verification();

    }





}
