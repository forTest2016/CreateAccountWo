package woo.io.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;


public class CreateAccountPage extends Page {
    public Map<String, String> data;
    public WebDriver driver;
    public int timeout = 15;
    public final String pageLoadedText = "";
    public final String pageUrl = "/app#/signup-steptwo";

    @FindBy(xpath = "html/body/div[1]/nav/div/div/button")
    public WebElement login;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "rememberMeForDisplay")
    public WebElement rememberCheckbox;

    @FindBy(xpath = "html/body/div[1]/div/div[2]/div/div/form/div[1]/label[2]")
    public WebElement errorMessage;

    @FindBy(xpath = "html/body/div[1]/div/div[2]/div/div/form/button")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='user-links']/li[2]/span")
    public WebElement userNameInPage;

    @FindBy(className = "pull-right")
    public WebElement iFogotSetupLink;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/form[2]/div[1]/input")
    public WebElement emailAdress;

    @FindBy(id = "create-account-btn")
    public WebElement claimButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/div/form[1]/div[3]/button")
    public WebElement nextButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/div/form[1]/div[2]/label[2]")
    public WebElement setYourPasswordErrorMessage;

    @FindBy(className = "mT5")
    public WebElement someElement;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/div/form[2]/div[1]/label")
    public WebElement yourLocation;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/div/form[2]/div[1]/div[2]/input")
    public WebElement location;

    @FindBy(name = "position")
    public WebElement position;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/div/form[2]/div[3]/ul")
    public WebElement positionSelected;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/div/form[2]/div[4]/div/select/option[4]")
    public List<WebElement> dropdownExpertise;

    @FindBy(className = "skill-years")
    public static List<WebElement> skillYears;

    /*@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/div/form[2]/div[6]/div")
    public static List<WebElement> describe;*/

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/div/form[2]/div[6]/div/select/option[3]")
    public static WebElement describe;

    @FindBy(id = "/html/body/div[1]/div/div/div[1]/div/div[1]/div/form[2]/div[1]/div[2]/ul/li[1]")
    public WebElement city;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/div/form[2]/div[1]/div[2]/ul")
    public WebElement selectedCity;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[1]/div/form[2]/div[7]/button[1]")
    public  WebElement nextButtonStepTwo;

    ///////////////////////////////////////////expectation page

    @FindBy(className = "no-select")
    public WebElement salaryCheckbox;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div[2]/div/ul/li[1]/div/div/div[2]/div[1]/div/span")
    public WebElement salarySwitch;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div[2]/div/ul/li[1]/div/div/div[2]/div[2]/div/form/div[1]/div/div/select")
    public List<WebElement> currency;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div[2]/div/ul/li[1]/div/div/div[2]/div[2]/div/form/div[1]/div/input")
    public WebElement salaryAmount;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div[2]/div/ul/li[2]/div/div/div[1]/div")
    public WebElement relocationCheckbox;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div[2]/div/ul/li[2]/div/div/div[2]/div[2]/div/div[1]/div[4]/div/div/select/option[3]")
    public WebElement permitDropdown;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div[2]/div/ul/li[2]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/label/span/span")
    public WebElement cityRelocation;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div[2]/div/div/div/div/form/textarea")
    public WebElement textArea;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div[3]/button")
    public WebElement nextButtonExpectations;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div[1]/div[2]/form/div/div[1]/input")
    public WebElement skillField;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div[1]/div[2]/form/div/div[3]/div/div[1]/div[1]/span[4]")
    public WebElement yearsOfExperience;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div[4]/button")
    public WebElement nextButtonSkills;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[3]/div[1]/a")
    public WebElement linkExperience;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[1]/div[3]/div[2]/form/div[1]/input")
    public WebElement companyName;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[1]/div[3]/div[2]/form/div[3]/input")
    public WebElement startDate;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[1]/div[3]/div[2]/form/div[4]/label[2]/span/span")
    public WebElement currentDate;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[1]/div[3]/div[2]/form/div[5]/button")
    public WebElement addWorkHistoryButton;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div[4]/button")
    public WebElement createProfileButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/candidate-home/div/div/h3")
    public WebElement welcomeMessage;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div[1]/div[3]/form/div[1]/div/select/option[2]")
    public WebElement noneEducationElementFromDropDown;


    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div[1]/div[3]/form/div[5]/button")
    public WebElement addEducationButton;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div[1]/div[3]/form/div[1]/div/select")
    public WebElement EducationDropDown;


    public CreateAccountPage(WebDriver driver) {
        super(driver);

        // this.PAGE_URL = getCurrentUrl();
        PageFactory.initElements(driver, this);
        this.timeout = timeout;
    }


    public CreateAccountPage clickToLogin() {
        login.click();
        return this;
    }

    public CreateAccountPage clickToLoginButton() {
        loginButton.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the CreateAccountPage class instance.
     */
    public CreateAccountPage fillLogin(String username, String pass) {
        setUserNameTextField(username);
        setPasswordField(pass);
        clickToLoginButton();
        return this;
    }

    /**
     * Set value to User Name Text field.
     *
     * @return the CreateAccountPage class instance.
     */
    public CreateAccountPage setUserNameTextField(String userNameValue) {
        setElementText(email, userNameValue);
        return this;
    }

    /**
     * Set value to Password field.
     *
     * @return the CreateAccountPage class instance.
     */
    public CreateAccountPage setPasswordField(String passwordValue) {
        setElementText(password, passwordValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the CreateAccountPage class instance.
     */
    public CreateAccountPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the CreateAccountPage class instance.
     */
    public CreateAccountPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }

    public boolean verifyUserNameAfterLogin() {
        return verifyTextBoolean(userNameInPage, " ");
    }

    public boolean checkErrorMessage() {
        waitUntilIsLoaded(errorMessage);
        return exists(errorMessage);
    }

    public void clickToForgotPasswordLink() {
        iFogotSetupLink.click();

    }

    public CreateAccountPage insertEmailForCreateAccount(String passwordValue) {
        setElementText(emailAdress, passwordValue);
        return this;
    }

    public void clickToClaimButton() {
        claimButton.click();
    }

    public void clickToNextButton() {
        nextButton.click();
    }

    public String checkErrorMessageAfterInsertEmail() {
        // waitUntilIsLoaded(setYourPasswordErrorMessage);
        return getTextElement(setYourPasswordErrorMessage);
    }

    public CreateAccountPage insertPositionForCreateAccount(String positionValue) {
        setElementText(position, positionValue);
        return this;
    }

    public CreateAccountPage insertCityForCreateAccount(String cityValue) {
        setElementTextAndEnter(location, cityValue);
        return this;
    }

    public void cityToselect() {
        city.click();
    }

    public void clicToNextButtonStepTwo() {
        nextButtonStepTwo.click();
        nextButtonStepTwo.click();
       // pressEnter();
    }

    public CreateAccountPage insertSalaryAmount(String salaryAmountValue) {
        setElementText(salaryAmount, salaryAmountValue);
        return this;
    }

    public CreateAccountPage insertTextIntoTextArea(String textValue) {
        setElementText(textArea, textValue);
        return this;
    }

    public void clicToNextButtonExpectations() {
        nextButtonExpectations.click();
    }

    public CreateAccountPage insertSkillsIntoField(String skillValue) {
        setElementText(skillField, skillValue);
        return this;
    }

    public void clicToNextButtonSkills() {
        nextButtonSkills.click();
    }

    public CreateAccountPage insertCompanyNameExperience(String companyNameValue) {
        setElementText(companyName, companyNameValue);
        return this;
    }

    public CreateAccountPage insertStartDate(String startDateValue) {
        setElementText(startDate, startDateValue);
        return this;
    }

    public void clickOnNoneEducationElementFromDropdownList() {
        clickElement(EducationDropDown);
        clickElement(noneEducationElementFromDropDown);

    }

    public void clickToCreateProfileButton() {
        clickElement(createProfileButton);
        clickElement(createProfileButton);
    }
}

