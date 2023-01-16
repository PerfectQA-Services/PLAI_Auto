package Pages;

public class Abstract {

    /***
     * Common Locator
     */
    String ToastAlerts = "/hierarchy/android.widget.Toast";
    String PLAIers_Snooker_Club = "//android.widget.TextView[@text=\"PLAIers Snooker Club\"]";


    /***
     * LunchApp page Locators
     */
    String bla = "msnbvjb";
    String Logo_Verfication="//android.widget.ImageView[@content-desc=\"Logo\"]";
    String skip_button="//android.view.View/android.view.View[2]/android.widget.Button";
    String next_button="//android.view.View[2]/android.view.View[3]/android.widget.Button";
    String Back_Button = "//android.widget.ImageView[@index=\"0\"]";
    String LogOut_Button = "//android.widget.ImageView[@index=\"2\"]";
    String Search_Bar = "//android.widget.EditText[@text=\"Search Now\"] | //android.widget.TextView[@text=\"Search Now\"]";


    /***
     * Signup page Locators
     */
    String signup_button="(//android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.TextView)[2]";
    String back_icon="//android.widget.ImageView[@content-desc=\"Back\"] | //android.view.View/android.view.View/android.widget.ImageView[2] | //android.view.View/android.view.View[1]/android.view.View[1]/android.widget.Button | //android.widget.ImageView[@content-desc=\"\"] | //android.view.View[@content-desc=\"Back\"]";
    String first_name_field="//android.view.View/android.view.View/android.view.View[1]/android.widget.EditText[1]/android.view.View | //android.widget.EditText[1]/android.view.View/android.view.View[2]";
    String first_name_field_1="//android.widget.TextView[@text=\"First Name\"]//..//android.view.View[2]";
    String last_name_field="//android.view.View/android.view.View/android.view.View[1]/android.widget.EditText[2]/android.view.View | //android.widget.EditText[2]/android.view.View/android.view.View[2]";
    String lst_name_field_2="//android.widget.EditText[2]/android.view.View/android.view.View[2]";
    String email_field="//android.view.View/android.view.View/android.view.View[1]/android.widget.EditText[3]/android.view.View | //android.widget.EditText[3]/android.view.View/android.view.View[2]";
    String email_field_1="//android.widget.EditText[3]/android.view.View/android.view.View[2]";
    String password_field="//android.view.View/android.view.View/android.view.View[1]/android.widget.EditText[4]/android.view.View | //android.widget.EditText[4]/android.view.View/android.view.View[2]";
    String password_field_1="//android.widget.EditText[4]/android.view.View/android.view.View[2]";
    String confirm_password_field="//android.view.View/android.view.View/android.view.View[1]/android.widget.EditText[5]/android.view.View | //android.widget.EditText[5]/android.view.View/android.view.View[2]";
    String confirm_password_field_1="//android.widget.EditText[5]/android.view.View/android.view.View[2]";
    String eye_icon="//android.view.View[1]/android.widget.EditText[4]/android.view.View/android.view.View[2]/android.widget.Button |  //android.widget.EditText[5]/android.view.View/android.view.View[2]/android.widget.Button";
    String eye_icon_2="//android.widget.EditText[4]/android.view.View/android.view.View[3]/android.widget.Button";
    String terms_and_condition_text="//android.view.View/android.view.View[1]/android.widget.TextView[2]";
    String signup_page_next_button="//android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button | //android.view.View/android.view.View/android.view.View[4]/android.widget.Button";
    String login_link="(//android.view.View/android.view.View/android.view.View[2]/android.widget.TextView)[2]";
    String login_text="(//android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView)[1]";
    String validation_message="//android.widget.Toast[@text=\"Please enter First Name\"] | //android.widget.Toast[@index=\"1\"]";
    String email_validation_message="//android.widget.Toast[@text=\"Please enter email address\"]";
    String password_validation_message="//android.widget.Toast[@index=\"1\"]";
    String text_red_colour="(//android.view.View/android.view.View/android.view.View/android.widget.TextView)[2]";
    String get_pass="//android.widget.EditText[@index=\"4\"]";
    String terms_of_use="//android.widget.TextView[@text=\"TERMS OF USE\"]";
    String country_field="//android.view.View[2]/android.widget.EditText/android.view.View";
    String mobile_number_field="(//android.view.View/android.view.View/android.widget.EditText)[2]";
    String date_of_birth_field="(//android.view.View/android.view.View/android.widget.EditText)[3]";
    String done_link="//android.widget.TextView[@text=\"Done\"]";
    String searchbar="(//android.view.View/android.view.View/android.widget.EditText)[1]";
    String get_country_name="(//android.widget.EditText[@index=\"0\"])[1] | (//android.view.View/android.widget.TextView)[2] | //android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]";
    String dropdown_icon="//android.widget.EditText/android.view.View/android.view.View[2]/android.widget.Button";
    String country_checkbox="(//android.widget.CheckBox)[1]";
    String country_checkbox_1="(//android.widget.CheckBox)[2]";
    String country_code_dropdown="//android.widget.EditText/android.view.View[2] | (//android.widget.TextView[@class=\"android.widget.TextView\"])[4]";
    String search_icon="//android.view.View[1]/android.view.View[2]/android.widget.Button";
    String country_name_with_flag="//android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]";
    String keybord="(//android.view.View/android.view.View/android.view.View/android.view.View)[1]";
    String default_year="android:id/date_picker_header_year";
    String default_date_month="android:id/date_picker_header_date";
    String cancel_button="android:id/button2";
    String calender_frame="//hierarchy/android.widget.FrameLayout";
    String ok_button="android:id/button1";
    String sport_that_you_play_text="//android.widget.TextView[@text=\"SPORT THAT YOU PLAY\"]";
    String get_sport_name="//android.widget.TextView[@index=\"0\"]";
    String next_button_1="//android.widget.TextView[@text=\"NEXT\"]";
    String Camera_Take_Picture = "(//GLButton[@content-desc=\"NONE\"])[2]";
    String Upload_Photo_Button = "//android.widget.TextView[@text=\"UPLOAD PHOTO\"]";
    String Upload_Photo_Optional_Text = "//android.widget.TextView[@text=\"Optional\"]";
    String Phone_Gallery_Files = "com.android.documentsui:id/dir_list";
    String Jpg_To_Upload = "//android.widget.LinearLayout[contains(@content-desc,\"Test.jpg\")]";
    String Crop_Button = "com.app.plaisports:id/crop_image_menu_crop";
    String Rotate_Button = "com.app.plaisports:id/ic_rotate_right_24";
    String Crop_Overlay = "com.app.plaisports:id/CropOverlayView";
    String Flip_Option = "com.app.plaisports:id/ic_flip_24";
    String Flip_Option_Horizontal = "//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView";
    String Flip_Option_Vertical = "//android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView";
    String Gender_Option_Male = "//android.view.View/android.view.View/android.view.View[4]/android.widget.Button";
    String Prefer_Not_To_Say_Checkbox = "//android.widget.CheckBox";
    String Mail_Conformation_PopUp = "//android.view.View/android.view.View[2]/android.widget.TextView";


    /***
     * Log In page Locators
     */
    String EnterEmailTextField = "//android.widget.EditText[1]";
    String PasswordTextField= "//android.widget.EditText[2]";
    String LoginButton = "//android.widget.Button//..//android.widget.TextView[@text=\"LOGIN\"]";
    String ForgotPasswordLink = "//android.widget.TextView[@text=\"Forgot Password?\"]";
    String ShowPasswordIcon = "//android.view.View[@content-desc=\"Show password\"]";
    String WelcomeScreenAfterLogin = "//android.widget.TextView[contains(@text,\"WELCOME\")]";
    String Forgot_Password_Page = "//android.widget.TextView[@text=\"FORGOT PASSWORD\"]";
    String Submit_Button_Forgot_Password = "//android.widget.TextView[@text=\"SUBMIT\"]";
    String Code_Verification_Sent_Message = "//android.widget.TextView[contains(@text,'code verification')]";
    String OTP_Field_Reset_Password = "//android.widget.EditText[1]";
    String New_Password_Field = "//android.widget.EditText[2]";
    String New_Password_Field_Show_Password_Icon = "(//android.view.View[@content-desc=\"Show password\"])[1]";
    String Confirm_Password_Field = "//android.widget.EditText[3]";
    String Confirm_Password_Field_Show_Password_Icon = "(//android.view.View[@content-desc=\"Show password\"])[2]";
    String Hide_Password_Icon = "//android.view.View[@content-desc=\"Hide password\"]";
    String Resend_OTP_Link = "//android.widget.TextView[@text=\"Resend OTP?\"]";
    String Verify_Wrong_New_Password_Message= "//android.widget.TextView[@text=\"Password must contain at least 8 characters, including one upper case and one number.\"]";
    String Plai_Logo_On_Login_Splash_Screen = "//android.widget.ImageView";
    String Day_Greeting_On_Login_Splash_Screen = "//android.widget.TextView[starts-with(@text,'GOOD')]";
    String Username_On_Login_Splash_Screen = "//android.widget.TextView[3]";


    /***
     * Home Screen page Locators
     */
    String Pending_Request_Button = "//android.widget.TextView[@text=\"Pending Request\"]";
    String Sliding_Banners = "//android.view.View/android.view.View[3]/android.view.View[1]/android.widget.Button";
    String Sort_By_Button = "//android.widget.TextView[@text=\"Sort by\"]";
    String Latest_Article_Header = "//android.widget.TextView[@text=\"LATEST\"]";
    String Location_Icon = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View";
    String Create_Team_Plus_Button = "//android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View[1]";
    String Home_Icon_Button = "//android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View[2]";
    String Settings_Icon_Button = "//android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View[3]";
    String Search_Icon = "//android.widget.ImageView[@content-desc=\"Search\"] | //android.view.View[@content-desc=\"Search\"]";
    String Find_A_Club_Header = "//android.widget.TextView[@text=\"FIND A CLUB\"]";
    String Search_Field = "//android.view.View//android.view.View//android.widget.EditText";
    String Map_In_Search = "//android.view.View[@content-desc=\"Google Map\"]";
    String Sliding_Banner_In_Search = "//android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    String Back_Button_Search = "//android.view.View/android.view.View/android.widget.ImageView";
    String Join_Team_Button = "//android.widget.Button";
    String SportyTots_Location = "//android.view.View[contains(@content-desc,'Goa')]";
    String Sporty_Tots_Banner = "//android.widget.TextView[@text=\"Sporty Tots\"]";
    String Vzhx_Banner = "//android.widget.TextView[@text=\"Vzhx\"]";


    /***
     *  Profile page Locators
     */
    String Profile_Icon = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]";
    String Edit_Profile_Button = "//android.view.View[@content-desc=\"edit\"]";
    String Profile_Picture = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]";
    String MyClub_Section_Header = "//android.widget.TextView[@text=\"My Club\"]";
    String Back_Button_Profile = "//android.widget.ImageView[@content-desc=\"Back\"]";
    String UserName = "//android.view.View/android.view.View[2]/android.widget.TextView[1]";
    String Country = "//android.widget.ImageView[@content-desc=\"location\"]";
    String Mobile_Number = "//android.widget.ImageView[@content-desc=\"phone\"]";
    String Date_Of_Birth = "//android.widget.ImageView[@content-desc=\"dob\"]";
    String Gender = "//android.widget.ImageView[@content-desc=\"male\"] | //android.widget.ImageView[@content-desc=\"female\"]";
    String Email_ID = "//android.widget.TextView[ends-with(@text,'.com')]";


    /***
     * Edit Profile page Locators
     */
    String Back_Button_Edit_Profile = "//android.view.View/android.widget.ImageView[2]";
    String Done_Button_Edit_Profile = "//android.view.View/android.widget.ImageView[3]";
    String First_Name_Label = "//android.widget.TextView[@text=\"First Name:\"]";
    String Last_Name_Label = "//android.widget.TextView[@text=\"Last Name:\"]";
    String Email_Label = "//android.widget.TextView[@text=\"Email:\"]";
    String DOB_Label = "//android.widget.TextView[@text=\"Date of Birth::\"]";
    String Location_Label = "//android.widget.TextView[@text=\"Location\"]";
    String Mobile_Number_Label = "//android.widget.TextView[@text=\"Mobile Number:\"]";
    String Select_Gender_Label = "//android.widget.TextView[@text=\"Select Gender:\"]";
    String Gender_Checkbox = "//android.widget.CheckBox";
    String Add_Bio_Label = "//android.widget.TextView[@text=\"Add Bio:\"]";
    String Add_Children_Label = "//android.widget.TextView[@text=\"Add Children:\"]";
    String Location_Field = "//android.widget.ScrollView/android.view.View[3]/android.widget.EditText";
    String Phone_Number_Field = "//android.widget.EditText[4]";


    /***
     * Pending Requests page Locators
     */
    String Pending_Request_Header = "//android.widget.TextView[@text=\"PENDING REQUEST\"]";
    String Request_Message_Under_Team = "//android.widget.TextView[@text=\"A TEAM ADMIN WILL SOON APPROVE YOUR REQUEST.\"]";
    String Back_Button_Pending_Requests = "//android.view.View/android.view.View/android.widget.ImageView";
    String Search_Bar_Pending_Requests = "//android.widget.EditText";


    /***
     * Sort By Locators
     */
    String Sort_Panel = "//android.widget.TextView[@text=\"Please select\"]";
    String All_Sort_Options = "//android.widget.TextView[@text=\"All\"]";
    String Bookmark_Sort_Options = "//android.widget.TextView[@text=\"Bookmark\"]";
    String Add_Bookmark = "//android.widget.TextView[@text=\"Add Bookmark\"]";
    String Cancel_Sort = "//android.widget.TextView[@text=\"Cancel\"]";


    /***
     * Article Banner Locators
     */
    String Article_Banner = "//android.widget.TextView[contains(@text,\"Article\")]";
    String Article_Creator_Text_Verification = "//android.widget.TextView[contains(@text,\"Created By\")]";
    String Read_Article_Button = "//android.view.View[1]/android.widget.TextView[@text=\"Read Article\"]";
    String Share_Article_Button = "(//android.widget.TextView[@text=\"Test Article 2\"]//..//android.view.View[2])[1]";
    String Share_Panel = "//android.widget.TextView[contains(@text,\"Click here to view on PLAI.\")]";
    String Bookmark_Icon_Article_Banner = "//android.view.View[5]/android.view.View[1]/android.view.View[1]";


    /***
     * Member Club Banner Locators
     */
    String Club_Member_Banner = "//android.view.View[3]/android.view.View[1]/android.widget.Button";
    String Member_Tag_On_Banner = "//android.widget.TextView[@text=\"Member\"]";
    String Member_Club_Name = "//android.widget.TextView[2]";
    String Welcome_Message_Club_Page = "//android.widget.TextView[contains(@text,\"Welcome to\")]";
    String Social_Media_Icon_Facebook = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]";
    String Social_Media_Icon_Twitter = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]";
    String Social_Media_Icon_Instagram = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[3]";
    String Social_Media_Icon_YouTube = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[4]";
    String Navigation_Right_Arrow = "//android.view.View[7]";
    String Navigation_Previous_Arrow = "//android.view.View[6]";
    String NEWS_Tab = "//android.widget.TextView[@text=\"NEWS\"]";
    String EVENT_Tab = "//android.widget.TextView[@text=\"EVENT\"]";
    String GROUPS_Tab = "//android.widget.TextView[@text=\"GROUPS\"]";
    String LINK_Tab = "//android.widget.TextView[@text=\"LINK\"]";
    String REQUEST_Tab = "//android.widget.TextView[@text=\"REQUEST\"]";

    /***
     * Admin Club Banner Locators
     */
    String Admin_Tag_On_Banner = "//android.widget.TextView[@text=\"Admin\"]";
    String Admin_Club_Name = "//android.widget.TextView[2]";
    String Edit_Button = "//android.widget.TextView[@text=\"EDIT\"]//..";
    String Add_New_Article = "//android.widget.TextView[@text=\"ADD NEW ARTICLE\"]";
    String Next_Button = "//android.widget.TextView[@text=\"NEXT\"]";

    /***
     * Admin Club Edit Locators
     */
    String Team_Name_TextField = "//android.widget.TextView[@text=\"Team Name*\"]//..//..";
    String Agent_Code_Dropdown = "//android.widget.TextView[@text=\"Agent Code (If you have one)\"]//..//..//..//android.widget.EditText";
    String Primary_Email_TextField = "//android.widget.TextView[@text=\"Primary Email*\"]//..//..";
    String Sport_Dropdown = "//android.widget.TextView[@text=\"Sport*\"]//..//..//..//android.widget.EditText";
    String Team_Bio_TextArea = "//android.widget.EditText[3]";
    String Country_Dropdown = "//android.widget.TextView[@text=\"Country*\"]//..//..//..//android.widget.EditText";
    String Location_Text_Field = "//android.widget.ScrollView/android.view.View[2]/android.widget.EditText";
    String Team_Logo = "//android.widget.TextView[@text=\"Team logo\"]";
    String Update_Team = "//android.widget.TextView[@text=\"UPDATE TEAM\"]//..//android.widget.Button";
    String Team_Updated_Message = "//android.widget.TextView[@text=\"Team is updated successfully.\"]";
    String User_Request = "//android.widget.TextView[@text=\"Riya Test\"]";
    String Accept_Request_Button = "//android.widget.TextView[@text=\"3ynrhm Eynryn\"]//..//android.view.View//android.widget.TextView[@text=\"ACCEPT\"]";
    String Assign_Group_Popup = "//android.widget.TextView[@text=\"Assign Groups\"][1]";
    String Assign_Group_Dropdown = "//android.widget.TextView[@text=\"Assign Groups\"]//..//..//android.widget.EditText";
    String Confirm_Button = "//android.widget.TextView[@text=\"CONFIRM\"]";
    String Group = "//android.widget.TextView[@text=\"Fhchb\"]//..//android.widget.CheckBox";
    String DeselectAll_Button = "//android.widget.TextView[@text=\"Deselect All\"]";
    String SelectAll_Button = "//android.widget.TextView[@text=\"Select all\"]";
    String Delete_Member_Button = "//android.widget.TextView[@text=\"3ynrhm Eynryn\"]//..//android.view.View[2]";
    String Confirm_Delete = "//android.widget.TextView[@text=\"Confirm\"]";
    String Sort_News_Tab = "//android.view.View/android.view.View[9]";
    String Add_New_Article_News_Tab = "//android.widget.TextView[@text=\"ADD NEW ARTICLE\"]";
    String News_Article = "//android.view.View[9]/android.view.View[1]/android.widget.Button";
    String Bookmark_News_Article = "//android.view.View[9]/android.view.View[1]/android.view.View[1]";
    String Share_News_Article = "//android.view.View[9]/android.view.View[1]/android.view.View[3]";
    String Edit_Button_News_Article = "//android.widget.ScrollView/android.view.View[1]";
    String Update_Article = "//android.widget.TextView[@text=\"UPDATE ARTICLE\"]";
    String Update_Article_Title_Field = "//android.widget.TextView[@text=\"Title*\"]";
    String Preview_Button = "//android.widget.TextView[@text=\"PREVIEW\"]";
    String Article_Updated = "//android.view.View[2]/android.widget.TextView";
    String Article_Delete_Icon = "//android.view.View[2]";
    String Dismiss_Button = "//android.widget.TextView[@text=\"Dismiss\"]";

    /**
     * New Article Screen
     */
    String New_Article_Screen = "//android.widget.TextView[@text=\"NEW ARTICLE\"]";
    String Title_Text_Field = "//android.view.View/android.widget.ScrollView/android.widget.EditText[1]";
    String Article_Description_TF = "//android.widget.TextView[@text=\"Article Description**\"]//..//..//android.widget.ScrollView//android.widget.EditText[2]";
    String Publish_Now_Dropdown = "//android.view.View[@content-desc=\"Drop-down menu\"]";
    String Publish_Now_No_Option = "//android.widget.TextView[@text=\"No\"]";
    String Publish_Date_Field = "//android.widget.EditText[contains(@text,\"2023\")]";
    String Next_Arrow_Calender = "android:id/next";
    String Feb_Twenty_Eight = "//android.view.View[@text=\"28\"]";
    String OK_Button = "//android.widget.Button[@text=\"OK\"]";
    String Cancel_Button = "//android.widget.Button[@text=\"CANCEL\"]";
    String Publish_Time = "(//android.view.View[@content-desc=\"Drop-down menu\"])[2]";
    String Time_Eight = "//android.widget.TextView[@text=\"8\"]";
    String Send_Email_No = "//android.view.View[2]//android.widget.TextView[@text=\"NO\"]";
    String Send_Notification_No = "//android.view.View[4]//android.widget.TextView[@text=\"NO\"]";
    String Groups_Dropdown = "//android.widget.TextView[@text=\"Groups*\"]";
    String Allow_Comments_No = "//android.view.View[8]//android.widget.TextView[@text=\"NO\"]";

    /**
     *  Event Tab
     */
    String Add_New_Event = "//android.widget.TextView[@text=\"ADD NEW EVENT\"]";
    String Sort_Event = "//android.view.View[9]";
    String Sort_Event_Type = "//android.widget.TextView[@text=\"Type\"]";
    String Sort_By_Upcoming_Event = "//android.widget.TextView[@text=\"Upcoming\"]";
    String Sort_By_Past_Event = "//android.widget.TextView[@text=\"Past\"]";
    String Sort_Event_Filter_Dropdown = "//android.view.View[@content-desc=\"Drop-down menu\"]";
    String Filter_By_All = "//android.widget.TextView[@text=\"All\"]";
    String Filter_By_Match = "//android.widget.TextView[@text=\"Match\"]";
    String Filter_By_Training = "//android.widget.TextView[@text=\"Training\"]";
    String Filter_By_Social_Event = "//android.widget.TextView[@text=\"Social Event\"]";
    String Filter_By_Other = "//android.widget.TextView[@text=\"Other\"]";
    String Apply_Sort_And_Filter = "//android.widget.TextView[@text=\"APPLY\"]";
    String Reset_Sort_And_Filter = "//android.widget.TextView[@text=\"RESET\"]";
    String Verify_Past_Date = "//android.view.View[10]/android.view.View[1]/android.widget.TextView[3]";
    String Create_Event_Header = "//android.widget.TextView[@text=\"CREATE EVENT\"]";
    String Location_Field_Create_Event = "//android.widget.TextView[@text=\"Location\"]//..//..//..//android.widget.EditText";
    String Search_Location = "com.app.plaisports:id/places_autocomplete_search_bar";
    String Name_Field_Create_Event = "//android.widget.TextView[@text=\"Name\"]//..//..";
    String Capacity_Dropdown_Create_Event = "(//android.view.View[@content-desc=\"Drop-down menu\"])[1]";
    String Capacity_Field = "//android.widget.TextView[@text=\"Capacity\"]//..//..//..//android.widget.EditText[2]";
    String Type_Dropdown_Create_Event = "(//android.view.View[@content-desc=\"Drop-down menu\"])[2]";
    String Event_Type_Game_Option = "//android.widget.TextView[@text=\"Social Event\"]";
    String Request_To_Join_Dropdown_Create_Event = "(//android.view.View[@content-desc=\"Drop-down menu\"])[3]";
    String Start_Date_Create_Event = "//android.widget.TextView[@text=\"Start Date*\"]//..//..//..//android.widget.EditText";
    String End_Date_Create_Event = "//android.widget.TextView[@text=\"End Date*\"]//..//..//..//android.widget.EditText";
    String Start_Time_Create_Event = "//android.widget.TextView[@text=\"Start Time*\"]//..//..//..//android.widget.EditText";
    String End_Time_Create_Event = "//android.widget.TextView[@text=\"End Time*\"]//..//..//..//android.widget.EditText";
    String Time_Picker = "android:id/radial_picker";
    String Toggle_Between_Clock_And_Keyboard = "android:id/toggle_mode";
    String Input_Hour = "android:id/input_hour";
    String Input_Minute = "android:id/input_minute";
    String Select_Hour_As_3 = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"3\"]";
    String Select_Minute_As_15 = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]";
    String Event_Repeat_Dropdown = "//android.widget.TextView[@text=\"Repeats\"]//..//..//..//android.widget.EditText";
    String Repeat_Daily_Option = "//android.widget.TextView[@text=\"Daily\"]";
    String How_Many_Times_Field = "//android.widget.TextView[@text=\"How many times?\"]//..//..";
    String Event_Coaches_Dropdown = "//android.widget.TextView[@text=\"Coaches\"]//..//..//..//android.widget.EditText";
    String Event_Visible_To_Dropdown = "//android.widget.TextView[@text=\"Visible To\"]//..//..//..//android.widget.EditText";
    String Event_Successfully_Creates_Message = "//android.widget.TextView[contains(@text,\"Event is successfully\")]";
    String New_Event_Banner = "//android.widget.TextView[@text=\"New Sports Event\"]";
    String Old_Event = "//android.widget.TextView[contains(@text,\"Dec 2022\")]";
    String Add_TO_Calender_Button = "//android.widget.TextView[@text=\"ADD TO CALENDER\"]//..//android.widget.Button";
    String Respond_Button_Event_Banner = "//android.widget.TextView[@text=\"monday event\"]//..//android.widget.TextView[@text=\"RESPOND\"] | //android.widget.TextView[@text=\"monday event\"]//..//android.widget.TextView[@text=\"SUBMITTED\"]";
    String Respond_Button = "//android.widget.TextView[@text=\"RESPONDED\"]//..//android.widget.Button";
    String Respond_Screen_Header = "//android.widget.TextView[@text=\"SUBMIT A RESPONSE\"]";
    String Select_Attendees_Dropdown = "//android.widget.TextView[@text=\"Select Attendees*\"]";
    String Availability_Dropdown = "//android.widget.TextView[@text=\"Availability *\"]";
    String Add_Note_TextField = "//android.widget.TextView[@text=\"Type Here\"]//..";
    String Available_Option = "//android.widget.TextView[@text=\"Available\"]";
    String MoreTimeNeeded_Option = "//android.widget.TextView[@text=\"More time needed\"]";
    String Unavailable_Option = "//android.widget.TextView[@text=\"Unavailable\"]";
    String Overview_Button = "//android.widget.TextView[@text=\"OVERVIEW\"]";
    String Back_Button_Event = "//android.widget.ImageView[@index=\"0\"]";


    /***
     * CreateTeam page Locators
     */
    String Create_Team_Header="//android.widget.TextView[@text=\"CREATE TEAM\"]";
    String Team_Name_Label="//android.widget.TextView[@text=\"Team Name*\"]";
    String Agent_code_Label="//android.widget.TextView[@text=\"Agent Code (If you have one)\"]";
    String Primary_Email_Label="//andro id.widget.TextView[@text=\"Primary Email*\"]";
    String Sport_Label="//android.widget.TextView[@text=\"Sport*\"]";
    String Team_Bio_Label="//android.widget.TextView[@text=\"Team Bio*\"]";
    String Agent_code_Checkbox="(//android.widget.CheckBox)[1]";
    String Agent_Code_Text="(//android.widget.EditText)[2]";
    String Sport_Text="(//android.widget.EditText)[4]";
    String Country_Label="//android.widget.TextView[@text=\"Country*\"]";
    String Facebook_Label="//android.widget.TextView[@text=\"Facebook\"]";
    String Twitter_Label="//android.widget.TextView[@text=\"Twitter\"]";
    String Instagram_Label="//android.widget.TextView[@text=\"Instagram\"]";
    String Youtube_Label="//android.widget.TextView[@text=\"Youtube\"]";
    String Create_Team_Button="(//android.widget.TextView[@text=\"CREATE TEAM\"])[2]";
    String Country_Text="(//android.widget.EditText)[1]";
    String Team_Creation_Message="//android.widget.TextView";
    String Close_Button="//android.widget.TextView[@text=\"CLOSE\"]";


    /***
     * Setting page Locators
     */
    String Setting_Header="//android.widget.TextView[@text=\"SETTINGS\"]";
    String Logout_Button="//android.view.View/android.view.View/android.widget.ImageView[2]";
    String My_Orders_Label="//android.widget.TextView[@text=\"My Orders\"]";
    String Report_An_Issue_Label="//android.widget.TextView[@text=\"Report an issue\"]";
    String Submit_A_Feature_Request="//android.widget.TextView[@text=\"Submit a feature request\"]";
    String Legal_Label="//android.widget.TextView[@text=\"Legal\"]";
    String Change_Password_Label="//android.widget.TextView[@text=\"Change Password\"]";
    String Support_Label="//android.widget.TextView[@text=\"Support\"]";
    String Facebook_Icon="//android.widget.ImageView[@content-desc=\"fb\"]";
    String Twitter_Icon="//android.widget.ImageView[@content-desc=\"ic_twitter\"]";
    String Instagram_Icon="//android.widget.ImageView[@content-desc=\"insta\"]";
    String Youtube_Icon="//android.widget.ImageView[@content-desc=\"youtube\"]";
    String FeedBack_Form_Header="//android.widget.TextView[@text=\"PLAI PUBLIC FEEDBACK FORUM\"]";
    String User_Information_Text="(//android.widget.TextView)[2]";
    String Submission_Type_text="//android.widget.EditText[@text=\"PROBLEM\"]";
    String Submission_Type_Problem_Text="//android.widget.TextView[@text=\"PROBLEM\"]";
    String Submission_Type_Bug_Text="//android.widget.TextView[@text=\"BUG\"]";
    String Select_Device_Android="//android.view.View[@content-desc=\"android\"]";
    String Select_Device_Ios="//android.view.View[@content-desc=\"ios\"]";
    String Full_Name="//android.widget.TextView[@text=\"Full Name:\"]//..//android.widget.EditText[@index=\"7\"]";
    String Email_Field="//android.widget.TextView[@text=\"Full Name:\"]//..//android.widget.EditText[@index=\"9\"]";
    String Location_Field_Setting="//android.view.View[@content-desc=\"Trailing icon for exposed dropdown menu\"]";
    String Member_Of_Team_No_Button="//android.widget.TextView[@text=\"NO\"]";
    String Member_Of_Team_Yes_Button="//android.widget.TextView[@text=\"YES\"]";
    String Sport_Team_Name="(//android.widget.TextView[@text=\"Type Here\"])[1]";
    String Description_Field="//android.widget.EditText[4]";
    String Attach_A_Screenshot="//android.widget.TextView[@text=\"Select Files...\"]";
    String Capture_an_Image_Option="//android.widget.TextView[@text=\"Capture an Image\"]";
    String Pick_An_Image_Option="//android.widget.TextView[@text=\"Pick an Image\"]";
    String Report_And_Privacy_link="//android.widget.TextView[@text=\"Never submit your passwords here. Report abuse or check out our Privacy Policy.\"]";
    String Legal_Header="//android.widget.TextView[@text=\"LEGAL\"]";
    String Terms_Of_Use_Label="//android.widget.TextView[@text=\"Terms of use\"]";
    String Privacy_Policy_Label="//android.widget.TextView[@text=\"Privacy Policy\"]";
    String Buyer_And_Seller_Terms_Label="//android.widget.TextView[@text=\"Buyer & Seller Terms\"]";
    String Delete_Account_Label="//android.widget.TextView[@text=\"Delete Account\"]";
    String Terms_Of_Use_Header="//android.widget.TextView[@text=\"TERMS OF USE\"]";
    String Privacy_Policy_Header="//android.widget.TextView[@text=\"PRIVACY POLICY\"]";
    String Buyer_And_Seller_Terms_Header="//android.widget.TextView[@text=\"BUYER & SELLER TERMS\"]";
    String Delete_Account_Popup="(//android.view.View/android.view.View/android.view.View)[1]";
    String Change_Password_Header="//android.widget.TextView[@text=\"CHANGE PASSWORD\"]";
    String Current_Password_Field="//android.widget.TextView[@text=\"Current Password\"]";
    String Update_Password_Button="//android.widget.TextView[@text=\"UPDATE PASSWORD\"]";
    String Current_Password_Field_Show_Password_Icon = "(//android.view.View[@content-desc=\"Show password\"])[1]";
    String New_Password_Field_Show_Password_Icon_Change_Password= "(//android.view.View[@content-desc=\"Show password\"])[2]";
    String Confirm_Password_Field_Show_Password_Icon_Change_Password = "(//android.view.View[@content-desc=\"Show password\"])[3]";
    String Text_In_Red_Colour="//android.view.View/android.view.View/android.widget.ScrollView/android.widget.TextView";


    /**
     *  Shop Tab
     */
    String SHOP_Tab = "//android.widget.TextView[@text=\"SHOP\"]";
    String HamBurgerMenu_ShopTab = "//android.view.View[8]";
    String View_All_ShopTab = "//android.view.View[9]/android.widget.TextView[4]";
    String Product_Banner = "//android.view.View[9]/android.view.View[1]/android.view.View/android.view.View";
    String Product_Price = "//android.widget.TextView[contains(@text,\"£\")]";
    String Test_Product = "//android.widget.TextView[@text=\"Test Product\"]";
    String Clothing_Header = "//android.widget.TextView[@text=\"CLOTHING\"]";
    String T_Shirt_Product = "//android.widget.TextView[@text=\"T-Shirt\"]";
    String Buy_Now_Button = "//android.widget.TextView[@text=\"BUY NOW\"]";
    String Back_Button_PDP = "//android.widget.ImageView";
    String Checkout_Header = "//android.widget.TextView[@text=\"CHECKOUT\"]";
    String Item_Total = "//android.widget.TextView[@text=\"Item Total\"]";
    String Transaction_Fee = "//android.widget.TextView[@text=\"Transaction Fee\"]";
    String Name_In_Checkout = "//android.widget.EditText[1]";
    String Address_In_Checkout = "//android.widget.EditText[2]";
    String Proceed_To_Payment_Button = "//android.widget.TextView[@text=\"PROCEED TO PAYMENT\"]";
    String Card_Number_Field = "//android.widget.TextView[@text=\"Card Number\"]//..//..";
    String Expiration_Dropdown = "//android.widget.TextView[@text=\"Expiration\"]";
    String CVV_Field = "//android.widget.TextView[@text=\"CVC\"]//..//..";
    String Country_Dropdown_Checkout = "//android.widget.TextView[@text=\"Country*\"]";
    String Confirm_Purchase = "//android.widget.TextView[@text=\"CONFIRM PURCHASE\"]//..//android.widget.Button";
    String Country_Selected = "//android.widget.EditText[contains(@text,\"UAE\")]";


    /**
     *  Members Tab
     */
    String MEMBERS_Tab = "//android.widget.TextView[@text=\"MEMBERS\"]";
    String Members_Banner = "//android.view.View[9]/android.view.View[1] | //android.view.View[9]/android.view.View[2]";
    String Member_Edit_Button = "//android.view.View[9]/android.view.View[1]/android.view.View[1]";
    String Member_Delete_Button = "//android.view.View[9]/android.view.View[1]/android.view.View[2]";
    String Invite_Member_Button = "//android.widget.TextView[@text=\"INVITE MEMBER\"]";
    String Make_Admin_Checkbox = "//android.widget.TextView[contains(@text,\"Team Admin\")]//..//android.widget.CheckBox";
    String Save_Edit_Button = "//android.widget.TextView[@text=\"SAVE\"]";
    String Groups_Dropdown_Edit_Member = "//android.widget.TextView[@text=\"Groups\"]//..//..//..//android.widget.EditText";
    String Custom_Name_Field = "//android.widget.TextView[@text=\"Field Name\"]//..//..";
    String Custom_Value_Field = "//android.widget.TextView[@text=\"Field Value\"]//..//..";
    String Add_Button = "//android.widget.TextView[@text=\"Add\"]";
    String Delete_Button_Custom_Field = "//android.view.View[1]/android.view.View[4]";
    String Invite_Member_Header = "//android.widget.TextView[@text=\"INVITE MEMBER\"]";
    String First_Name_Field_Invite_Member = "//android.widget.EditText[1]";
    String Last_Name_Field_Invite_Member = "//android.widget.EditText[2]";
    String Email_Field_Invite_Member = "//android.widget.EditText[3]";
    String Mobile_Number_Field_Invite_Member = "//android.widget.EditText[4]";
    String Country_Code_Dropdown_Invite_Member = "//android.widget.TextView[@text=\"+91\"]";
    String Groups_Dropdown_Invite_Member = "//android.widget.TextView[@text=\"Groups\"]";
    String Submit_Button_Invite_Member = "//android.widget.TextView[@text=\"SUBMIT\"]";
    String Search_Field_Country_Code = "//android.widget.TextView[@text=\"Search…\"]//..";

    /**
     *  Links Tab Locators
     */
    String Add_Link_Button = "//android.widget.TextView[@text=\"ADD NEW LINK\"]";
    String Link_Google_Link_After_Search = "//android.view.View[10]/android.view.View/android.widget.TextView[1]";
    String Link_Banner = "//android.view.View[9]/android.view.View[1]/android.widget.Button";
    String Verify_Browser_Opened = "com.android.chrome:id/url_bar";
    String Angel_Up_Icon="//android.view.View[9]/android.view.View[2]/android.view.View[1]";
    String Angel_Down_Icon="//android.view.View[9]/android.view.View[1]/android.view.View[2]";
    String Update_Team_Header= "//android.widget.TextView[@text=\"UPDATE TEAM\"]";
    String Add_New_Link_Button="//android.widget.TextView[@text=\"ADD NEW LINK\"]";
    String Create_Link_Header="//android.widget.TextView[@text=\"CREATE LINK\"]";
    String Link_Title_Field="//android.widget.EditText[1]";
    String Url_Field="//android.widget.EditText[2]";
    String Icon_Dropdown="//android.widget.TextView[@text=\"Icon *\"]";
    String Website_Icon = "//android.widget.TextView[@text=\"Website\"]";
    String Groups_Dropdown_Create_Link="//android.widget.TextView[@text=\"Groups\"]";
    String Fhchb_Group = "//android.widget.TextView[@text=\"Fhchb\"]";
    String Show_Url_No_Button="//android.widget.TextView[@text=\"NO\"]";
    String Show_Url_Yes_Button="//android.widget.TextView[@text=\"YES\"]";
    String LINKS_Tab = "//android.widget.TextView[@text=\"LINKS\"]";
    String Down_Arrow = "//android.view.View[9]/android.view.View[1]/android.view.View[2]";
    String Up_Arrow = "//android.view.View[9]/android.view.View[2]/android.view.View[1]";
    String Delete_Link_Button = "//android.view.View[9]/android.view.View/android.view.View[4]";


    /**
     *  Support Tab Locators
     */
    String Support_Header = "//android.widget.TextView[@text=\"SUPPORT\"]";
    String User_Support_Button = "//android.widget.TextView[@text=\"General User Support\"]";
    String Admin_Support_Button = "//android.widget.TextView[@text=\"Team Admin Support\"]";
    String First_Name_Field_Support = "//android.widget.TextView[@text=\"First Name\"]//..//..";
    String Last_Name_Field_Support = "//android.widget.EditText[2]";
    String Select_Team_Dropdown = "//android.widget.TextView[@text=\"Select Team\"]";
    String Support_Description_Field = "//android.widget.EditText[3]";

    /**
     *  Group Tab Locators
     */

    String Groups_Tab="//android.widget.TextView[@text=\"GROUPS\"]";
    String Edit_Icon="//android.view.View[8]/android.view.View[1]/android.view.View[3]";
    String Delete_Icon="//android.view.View[8]/android.view.View[1]/android.view.View[4]";
    String Add_New_Group_Button="//android.widget.TextView[@text=\"ADD NEW GROUP\"]";
    String Group_Banner="//android.view.View[1]/android.widget.Button";
    String Group_Information="//android.view.View/android.widget.Button";
    String Edit_Group_Popup="//android.view.View[2]";
    String Group_Name_Field="//android.widget.EditText[1]";
    String Group_Description="//android.widget.EditText[2]";
    String Successful_Message="//android.widget.TextView";



}
