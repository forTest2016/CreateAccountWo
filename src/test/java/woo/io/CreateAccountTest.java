package woo.io;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import woo.io.pages.CreateAccountPage;
import woo.io.resourse.LogLog4j;

import java.io.IOException;


public class CreateAccountTest extends TestNgTestBase {
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());

    public CreateAccountPage createUser;
    String randomStringEmail = RandomStringEmail.generateRandomString();
    private int timeoutInSeconds = 5;

    @BeforeClass
    public void testInit() {

        /*BasicConfigurator.configure();
        DesiredCapabilities DesireCaps = new DesiredCapabilities();
        DesireCaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\Users\\ilya.z\\Desktop\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
        WebDriver driver = new PhantomJSDriver(DesireCaps);*/

        driver.manage().window().maximize();
        driver.get("https://test.woo.io/eng/useinvite?token=TEMP");
        createUser = PageFactory.initElements(driver, CreateAccountPage.class);
    }

    @Test
    public void createAccount() throws InterruptedException {
        LogLog4j.startTestCase("create account");
        Log.info("//////////////////////////step one page - begin/////////////////////////");
        createUser.insertEmailForCreateAccount(randomStringEmail + "@yopmail.com");
        System.out.println(randomStringEmail + "@yopmail.com");
        Log.info("mail generated randomly: - "+ randomStringEmail + "@yopmail.com");
        Log.info("email inserted");
        createUser.clickToClaimButton();
        Log.info("claim button pressed");
        Log.info("//////////////////////////step one page - end/////////////////////////");
        Log.info("//////////////////////////step two page - begin/////////////////////////");
        Assert.assertEquals(true, createUser.nextButton.isDisplayed());
        Log.info("assert on username passed");
        createUser.clickToNextButton();
        Log.info("next button pressed");
        Assert.assertEquals(createUser.checkErrorMessageAfterInsertEmail(), "Password must be at least 6 characters long");
        Log.info("assert on error message passed");
        createUser.setPasswordField("454545");
        Log.info("password is inserted");
        createUser.clickToNextButton();
        Log.info("next button pressed");
        Log.info("//////////////////////////step two page - end/////////////////////////");
        Log.info("//////////////////////////expectation page - begin/////////////////////////");
        // Assert.assertEquals(createUser.yourLocation.getText(), "Your location");
        //  new WebDriverWait((WebDriver) createUser, timeoutInSeconds).until(ExpectedConditions.invisibilityOfElementLocated((By) createUser.someElement));
        try {
            createUser.waitUntilElementIsLoaded(createUser.someElement);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.info("someElement is displayed on page step two");
        Thread.sleep(5000);
        createUser.insertCityForCreateAccount("Tel Aviv");
        Log.info("city inserted");
        createUser.selectedCity.click();
        Log.info("city selected");
        createUser.insertPositionForCreateAccount("QA Architect");
        Log.info("position inserted");
        createUser.positionSelected.click();
        Log.info("position is selected");
        //Thread.sleep(5000);
        //createUser.dropdownExpertise.get(2).click();
        // Log.info("dropdownExpertise is clicked");
        createUser.skillYears.get(3).click();
        Log.info("skill years selected");
        createUser.describe.click();
        Log.info("describe is clicked");
        createUser.clicToNextButtonStepTwo();
        Thread.sleep(5000);
        Log.info("next button pressed");
        //Assert.assertEquals(createUser.someElementOnExpectationsPage.getText(), " Only let companies approach me if...");
        Log.info("//////////////////////////expectation page - end/////////////////////////");
        Assert.assertEquals(driver.getCurrentUrl(), "https://test.woo.io/app#/expectations");
        try {
            createUser.waitUntilElementIsLoaded(createUser.salaryCheckbox);
        } catch (IOException e) {
            e.printStackTrace();
        }
        createUser.salaryCheckbox.click();
        Log.info("unchecked checkbox is checked");
        createUser.salarySwitch.click();
        Log.info("salarySwitch is clicked");
       /* createUser.currency.get(1).click();
        Log.info("currency is selected");*/
        createUser.insertSalaryAmount("5000");
        Log.info("currency is selected");
        createUser.relocationCheckbox.click();
        Log.info("unchecked relocationCheckbox is checked");
        createUser.permitDropdown.click();
        Log.info("permitDropdown is selected");
        createUser.cityRelocation.click();
        Log.info("cityRelocation checkbox is checked");
        createUser.insertTextIntoTextArea("some text should be here");
        Log.info("some text inserted");
        createUser.clicToNextButtonExpectations();
        Log.info("next button expectation pressed");
        Assert.assertEquals(driver.getCurrentUrl(), "https://test.woo.io/app#/skills");
        try {
            createUser.waitUntilElementIsLoaded(createUser.skillField);
        } catch (IOException e) {
            e.printStackTrace();
        }
        createUser.insertSkillsIntoField("a,b,c");
        Log.info("skills inserted into a field");
        createUser.yearsOfExperience.click();
        Log.info("yearsOfExperience is selected");
        createUser.clicToNextButtonSkills();
        Log.info("next button skills pressed");
        Assert.assertEquals(driver.getCurrentUrl(), "https://test.woo.io/app#/experience");
        try {
            createUser.waitUntilElementIsLoaded(createUser.linkExperience);
        } catch (IOException e) {
            e.printStackTrace();
        }
        createUser.linkExperience.click();
        Log.info("link is clicked");
        createUser.insertCompanyNameExperience("Google");
        Log.info("company name is inserted");
        createUser.insertStartDate("01-2014");
        Log.info("data inserted");
        createUser.addWorkHistoryButton.click();
        Log.info("add history button is clicked for open place of view for current date element");
        // Assert.assertEquals(createUser.checkErrorMessageAfterInsertEmail(), "Please enter an end date or check "Current Job"");
        // Log.info("assert on error message passed");
        createUser.currentDate.click();
        Log.info("currentDate is clicked");
        createUser.addWorkHistoryButton.click();
        Log.info("work history is added");
        createUser.clickOnNoneEducationElementFromDropdownList();
        Log.info("none education is clicked");
        Thread.sleep(1000);
        //createUser.addEducationButton.click();
        //Log.info("none education is added");
        createUser.clickToCreateProfileButton();
        Log.info("createProfileButton is clicked");
        Assert.assertTrue(createUser.welcomeMessage.getText().contains("Welcome"));
        Log.info("profile is created");

    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
