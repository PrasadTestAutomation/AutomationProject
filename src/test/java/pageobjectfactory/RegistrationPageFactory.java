package pageobjectfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class RegistrationPageFactory {

    WebDriver driver;

    public RegistrationPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ------------------- Web Elements -------------------
    @FindBy(xpath = "//li/a[text()=' Signup / Login']")
    private WebElement signupLoginButton;

    @FindBy(xpath = "//form/input[@type='text']")
    private WebElement userNameField;

    @FindBy(xpath = "//form/input[@type='email' and @data-qa='signup-email']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//form/button[@type='submit' and @data-qa='signup-button']")
    private WebElement signupButton;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    private WebElement validateSignUpInfo;

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    private WebElement validateSignUp;

    @FindBy(xpath = "//span/input[@type='radio' and @id='id_gender1']")
    private WebElement titleCheckbox;

    @FindBy(xpath = "//div/input[@type='password' and @id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//div/select[@name='days' and @id='days']")
    private WebElement dayDropDown;

    @FindBy(xpath = "//div/select[@name='months' and @id='months']")
    private WebElement monthDropDown;

    @FindBy(xpath = "//div/select[@name='years' and @id='years']")
    private WebElement yearDropDown;

    @FindBy(xpath = "//span/input[@name='newsletter' and @type='checkbox']")
    private WebElement signUpCheckbox;

    @FindBy(xpath = "//span/input[@name='optin' and @type='checkbox']")
    private WebElement optInCheckbox;

    @FindBy(xpath = "//input[@name='first_name' and @type='text']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@name='last_name' and @type='text']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@name='company' and @type='text']")
    private WebElement companyField;

    @FindBy(xpath = "//input[@name='address1' and @type='text']")
    private WebElement addressField;

    @FindBy(xpath = "//select[@name='country' and @id='country']")
    private WebElement countryField;


    @FindBy(xpath = "//input[@type='text' and @id='state']")
    private WebElement stateField;

    @FindBy(xpath = "//input[@type='text' and @id='city']")
    private WebElement cityField;

    @FindBy(xpath = "//input[@type='text' and @id='zipcode']")
    private WebElement zipCodeField;

    @FindBy(xpath = "//input[@type='text' and @id='mobile_number']")
    private WebElement mobileNumberField;

    @FindBy(xpath = "//button[@type='submit' and text()='Create Account']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//b[text()='Account Created!']")
    private WebElement accountCreatedMsg;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement signUpContinueButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    private WebElement loggedInAsUsername;

    @FindBy(xpath = "//li/a[text()=' Delete Account']")
    private WebElement deleteAccountButton;

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    private WebElement accountDeletedMsg;



    // ------------------- getter Methods -------------------
    public WebElement getSignUpLoginButton() {
        return signupLoginButton;
    }

    public WebElement getUserNameField() {
        return userNameField;
    }

    public WebElement getEmailAddressFiled() {
        return emailAddressField;
    }

    public WebElement getSignUpButton() {
        return signupButton;
    }

    public WebElement getValidateSignupInfo() {
        return validateSignUpInfo;
    }

    public WebElement getValidateSignup() {
        return validateSignUp;
    }

    public WebElement getTitleCheckbox() {
        return titleCheckbox;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getDay(){
        return dayDropDown;
    }

    public WebElement getMonth(){
        return monthDropDown;
    }

    public WebElement getYear(){
        return yearDropDown;
    }

    public WebElement getCheckboxSignUp(){
        return signUpCheckbox;
    }

    public WebElement getCheckboxOptIn(){
        return optInCheckbox;
    }

    public WebElement getFirstName() {
        return firstNameField;
    }

    public WebElement getLastName() {
        return lastNameField;
    }

    public WebElement getCompany() {
        return companyField;
    }

    public WebElement getAddress() {
        return addressField;
    }

    public WebElement getCountry() {
        return countryField;
    }

    public WebElement getState() {
        return stateField;
    }

    public WebElement getCity() {
        return cityField;
    }

    public WebElement getZipcode() {
        return zipCodeField;
    }

    public WebElement getMobileNumber() {
        return mobileNumberField;
    }

    public WebElement getCreateAccountButton() {
        return createAccountButton;
    }

    public WebElement getAccountCreatedMsg() {
        return accountCreatedMsg;
    }

    public WebElement getSignUpContinueButton() {
        return signUpContinueButton;
    }

    public WebElement getLoggedInAsUsername() {
        return loggedInAsUsername;
    }

    public WebElement getDeleteAccountButton() {
        return deleteAccountButton;
    }

    public WebElement getAccountDeletedMsg() {
        return accountDeletedMsg;
    }


}
