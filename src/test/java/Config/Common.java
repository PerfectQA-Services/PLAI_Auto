package Config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.awt.*;
import java.io.*;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

public class Common{

    public MobileDriver driver;

    public MobileElement findElement(String elementName) {

        String locator;

        locator = elementName;

        int count = 0;
        while (count < 4) {
            try {
                if (locator.startsWith("link=") || locator.startsWith("LINK=")) {
                    locator = locator.substring(5); // remove "link=" from
                    // locator
                    try {
                        if (locator.contains(" "))
                            return (MobileElement) driver.findElement(By.partialLinkText(locator));

                        return (MobileElement) driver.findElement(By.linkText(locator));
                    } catch (Exception e) {
                        return null;
                    }
                }
                if (locator.startsWith("id=")) {
                    locator = locator.substring(3); // remove "id=" from locator
                    try {
                        return (MobileElement) driver.findElement(By.id(locator));
                    } catch (Exception e) {
                        return null;
                    }
                } else if (locator.startsWith("//")) {
                    try {
                        return (MobileElement) driver.findElement(By.xpath(locator));
                    } catch (Exception e) {
                        return null;
                    }
                }
                else if (locator.startsWith("name=")) {

                    locator = locator.substring(5); // remove "name=" from
                    // locator
                    try {
                        return (MobileElement) driver.findElement(By.name(locator));
                    } catch (Exception e) {
                        return null;
                    }
                } else {
                    try {
                        return (MobileElement) driver.findElement(By.id(locator));
                    } catch (Exception e) {
                        return null;
                    }

                }
            } catch (StaleElementReferenceException e) {
                e.toString();

                count = count + 1;
                // System.out.println("Trying["+
                // count+"] to recover from a stale element :" +
                // e.getMessage());
            }
            count = count + 4;
        }
        return null;

    }

    public void pause(int sec) {
        try {
            Thread.sleep(1000 * sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void log(String log) {
        System.out.println(log);
        Reporter.log(log + "<br>");
    }

    public void logStepResult(String result) {
        System.out.println("Result : " + result);
        if (result.equals("passed")) {
            Reporter.log("<h4 style=\"color:green;\">Passed</h4>");

        } else if (result.equals("failed"))
            Reporter.log("<h4 style=\"color:red;\">Failed</h4>");
        {

        }
    }

    public boolean isElementDisplayed(String elementLocator) {
        try {
            return driver.findElement(By.xpath(elementLocator)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean waitForElementIsNotDisplayed(String by) throws InterruptedException {

        for (int second = 0;; second++) {
            if (second >= 60) {

                break;
            }
            try {
                if (!isElementDisplayed(by))
                    break;
            } catch (Exception e) {
            }
            pause(1000);
        }
        return false;
    }

    public boolean isElementPresent(String locator) {

        WebElement webElement = this.findElement(locator);
        if (webElement != null) {
            return true;
        } else {

            return false;
        }
    }

    public static String generateRandomChars(int length) {
        String total = "iokijfmnbxcvfrpqsdfgvcxzdferiuytjndifur";
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char _char = total.charAt((int) (Math.random() * 100) % total.length());
            buf.append(_char);
        }
        return buf.toString();
    }

    public static int GenerateRandomNumber(int length) {
        Random rand = new Random();
        int num = rand.nextInt(length);
        int numNoRange = rand.nextInt();
        return numNoRange;
    }

    public Properties readConfigFile(String configFile) {
        Properties prop = null;
        try (InputStream input = new FileInputStream(new File("src/test/resources/" + configFile + ".properties").getAbsolutePath())) {
            prop = new Properties();
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }

    public void makeScreenshot(MobileDriver driver, String screenshotName) {
        MobileDriver augmentedDriver = (MobileDriver) new Augmenter().augment(driver);
        /* Take a screenshot */
        File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
        String nameWithExtention = screenshotName + ".png";
        /* Copy screenshot to specific folder */
        try {
            String reportFolder = "target" + File.separator + "surefire-reports" + File.separator+ "html" + File.separator;
            File screenshotFolder = new File(reportFolder);
            if (!screenshotFolder.getAbsoluteFile().exists()) {
                screenshotFolder.mkdir();
            }
            FileUtils.copyFile(screenshot,
                    new File(screenshotFolder + File.separator + nameWithExtention).getAbsoluteFile());
            Reporter.log("<a href='" + nameWithExtention +"'> <img src='"+ nameWithExtention +"' height='500' width='250'></img> </a>"+ "<br>"+ "<br>");
        } catch (IOException e) {
            this.log("Failed to capture screenshot: " + e.getMessage());
        }
    }

    public String readJson(String key) throws IOException, org.json.simple.parser.ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/test/resources/Static_Parameters.json");
        Object obj = jsonParser.parse(reader);
        JSONArray usersList = (JSONArray) obj;
        JSONObject parameters = (JSONObject) usersList.get(0);
        String Value = (String)parameters.get(key);
        return Value;
    }

    public void sendkeywords(AppiumDriver driver,String str){
        Actions action = new Actions(driver);
        action.sendKeys(str).perform();
    }

    public void movetoelement(AppiumDriver driver,String locater){
        Actions action = new Actions(driver);
        WebElement element=driver.findElement(By.xpath(locater));
        action.moveToElement(element);
    }

    public static void scrollUpMobile(MobileDriver driver) throws InterruptedException {
        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width / 2;
        int top_y = (int) (height * 0.40);
        int bottom_y = (int) (height * 0.70);
        new TouchAction((MobileDriver) driver).press(ElementOption.point(x, top_y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1500))).moveTo(ElementOption.point(x, bottom_y)).release().perform();
        System.out.println("\nScrolling the screen upwards !!!");
        Thread.sleep(1000);
    }

    public static void scrollDownMobile(MobileDriver driver) throws InterruptedException {
        Thread.sleep(2000);

        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width / 2;
        int top_y = (int) (height * 0.50);
        int bottom_y = (int) (height * 0.20);
        new TouchAction((MobileDriver)driver).press(ElementOption.point(x, top_y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3500))).moveTo(ElementOption.point(x, bottom_y)).release().perform();
        System.out.println("\nScrolling the screen downwards !!!");
        Thread.sleep(1000);
    }

    public static void scrollMyClubsBanners(MobileDriver driver) throws InterruptedException {
        Thread.sleep(2000);

        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width / 2;
        int top_y = (int) (height * 0.50);
        int bottom_y = (int) (height * 0.20);
        new TouchAction((MobileDriver)driver).press(ElementOption.point(941, 490)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3500))).moveTo(ElementOption.point(195, 490)).release().perform();
        System.out.println("\nScrolling My Club Banners !!!");
        Thread.sleep(1000);
    }

    public void scrollAtSpecificLocation(MobileDriver driver, int x1, int y, int z, int w, String msg) throws InterruptedException {
        Thread.sleep(2000);

        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width / 2;
        int top_y = (int) (height * 0.50);
        int bottom_y = (int) (height * 0.20);
        new TouchAction((MobileDriver)driver).press(ElementOption.point(x1, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3500))).moveTo(ElementOption.point(z, w)).release().perform();
        this.log(msg);
        Thread.sleep(1000);
    }

    public static String Verify_Current_Date(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        return date;
    }


    public void Verify_Past_Date(String d2) throws ParseException {
//        Date curDate = new Date(String.valueOf(new SimpleDateFormat("dd-MM-yyyy")));
////        curDate = new SimpleDateFormat("dd MMM yyyy");
//        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(PastDate);
//        date1.before(curDate);

        String pattern = "dd MMM yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String d1 = simpleDateFormat.format(new Date());
        System.out.println(d1);
        if(d1.compareTo(d2) > 0) {
            System.out.println("past date is verified");
        } else if(d1.compareTo(d2) == 0) {
            System.out.println("Both dates are equal");
        }
    }

    public void waitUntillElementPresent(String str,MobileDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str)));
    }

    public boolean isDisplayed(String Element){
        try {
            driver.findElement(By.xpath(Element)).isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void Click_And_Slide(MobileDriver driver,int x,int y,String msg) throws InterruptedException {
        Thread.sleep(2000);
        new TouchAction((MobileDriver)driver).press(ElementOption.point(x,y));
        this.log(msg);
    }
    public void scrollMyClubsBannersUntilClubFound(MobileDriver driver, String Element) throws InterruptedException {
        Thread.sleep(2000);

        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width / 2;
        int top_y = (int) (height * 0.50);
        int bottom_y = (int) (height * 0.20);


        for(int i=0;i<=20;i++){
            if(driver.findElementsByXPath(Element).isEmpty() == true){
                new TouchAction((MobileDriver)driver).press(ElementOption.point(950, 590)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3500))).moveTo(ElementOption.point(150, 590)).release().perform();
                System.out.println("\nScrolling My Club Banners !!!");
                continue;
            }
            else {
                break;
            }
        }
        Thread.sleep(1000);
    }


    public void scrollUntilRespondButtonFound(MobileDriver driver, String Element) throws InterruptedException {
        Thread.sleep(2000);

        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width / 2;
        int top_y = (int) (height * 0.50);
        int bottom_y = (int) (height * 0.20);


        for(int i=0;i<=20;i++){
            if(driver.findElementsByXPath(Element).isEmpty() == true){
                new TouchAction((MobileDriver)driver).press(ElementOption.point(x, top_y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3500))).moveTo(ElementOption.point(x, bottom_y)).release().perform();
                System.out.println("\nScrolling Events !!!");
                continue;
            }
            else {
                break;
            }
        }
        Thread.sleep(1000);
    }

    public void scrollUntilOldEventFound(MobileDriver driver, String Element) throws InterruptedException {
        Thread.sleep(2000);

        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width / 2;
        int top_y = (int) (height * 0.50);
        int bottom_y = (int) (height * 0.20);


        for(int i=0;i<=20;i++){
            if(driver.findElementsByXPath(Element).isEmpty() == true){
                new TouchAction((MobileDriver)driver).press(ElementOption.point(x, top_y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3500))).moveTo(ElementOption.point(x, bottom_y)).release().perform();
                System.out.println("\nScrolling Events !!!");
                continue;
            }
            else {
                break;
            }
        }
        Thread.sleep(1000);
    }

}