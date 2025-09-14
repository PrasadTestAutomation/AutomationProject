package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageobjectfactory.RegistrationPageFactory;

public class RegistrationPage {

    WebDriver driver;
    RegistrationPageFactory regFactory;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        this.regFactory = new RegistrationPageFactory(driver);
    }


    //all constants are stored inside this method - they are final
    public static class Constants {
        public static final String SITE_URL = "https://automationexercise.com/";
        public static final String SIGNUP_TEXT = "ENTER ACCOUNT INFORMATION";
        public static final String SIGNUP_INFO = "New User Signup!";
        public static final String ACC_CREATED_MSG = "ACCOUNT CREATED!";
        public static final String ACC_DELETED_MSG = "ACCOUNT DELETED!";
    }

    public void clickSignInLoginButton()
    {
        String SignupPageURL = driver.getCurrentUrl();
        Assert.assertEquals(SignupPageURL,Constants.SITE_URL,"User is not on the Automation Exercise Page");
        regFactory.getSignUpLoginButton().click();
    }

    public void enterUsernameEmail(String username,String email)
    {
        String signUpInfo = regFactory.getValidateSignupInfo().getText();
        Assert.assertEquals(signUpInfo,Constants.SIGNUP_INFO,"New User SignUp! not visible");
        regFactory.getEmailAddressFiled().sendKeys(email);
        regFactory.getUserNameField().sendKeys(username);
    }

    public void clickSignupButton() throws InterruptedException {
        regFactory.getSignUpButton().click();
        Thread.sleep(3000);
    }

    public void validateSignInPage() throws InterruptedException {

        String signupText = regFactory.getValidateSignup().getText();
        Assert.assertEquals(signupText,Constants.SIGNUP_TEXT,"User is not on the SignUp Page");
    }

    public void selectTitle() {
        regFactory.getTitleCheckbox().click();
    }

    public void enterPassword(String password) {
        regFactory.getPasswordField().sendKeys(password);
    }

    public void selectDateOfBirth() {
        Select day = new Select(regFactory.getDay());
        day.selectByValue("1");

        Select month = new Select(regFactory.getMonth());
        month.selectByValue("1");

        Select year = new Select(regFactory.getYear());
        year.selectByValue("1999");
    }

    public void clickCheckBoxes() {
        regFactory.getCheckboxSignUp().click();
        regFactory.getCheckboxOptIn().click();
    }

    public void enterFirstNameLastNameCompanyAddress(String firstName, String lastName, String company, String address){
        regFactory.getFirstName().sendKeys(firstName);
        regFactory.getLastName().sendKeys(lastName);
        regFactory.getCompany().sendKeys(company);
        regFactory.getAddress().sendKeys(address);
    }

    public void selectCountry(String country) {
        Select Country = new Select(regFactory.getCountry());
        Country.selectByValue(country);
    }

    public void enterStateCityZipcodeMobilenumber(String state, String city, String zipCode, String mobileNumber) {
        regFactory.getState().sendKeys(state);
        regFactory.getCity().sendKeys(city);
        regFactory.getZipcode().sendKeys(zipCode);
        regFactory.getMobileNumber().sendKeys(mobileNumber);
    }

    public void clickCreateAccountButton() {
        regFactory.getCreateAccountButton().click();
    }

    public void validateAccountCreatedMessage() {
        String accountCreatedMessage = regFactory.getAccountCreatedMsg().getText();
        Assert.assertEquals(accountCreatedMessage,Constants.ACC_CREATED_MSG,"Account Not Created");
    }

    public void clickContinueButton() {
        regFactory.getSignUpContinueButton().click();
    }

    public void validateLoggedInAsUsername(String username) {
        String accountCreatedMessage = regFactory.getLoggedInAsUsername().getText();
        Assert.assertEquals(accountCreatedMessage,username,"Account Not Created");
    }

    public void clickDeleteAccountButton()
    {
        regFactory.getDeleteAccountButton().click();
    }

    public void validateAccountDeletedMessage() {
        String accountDeletedMessage = regFactory.getAccountDeletedMsg().getText();
        Assert.assertEquals(accountDeletedMessage,Constants.ACC_DELETED_MSG,"Account Not Deleted");
    }

}
