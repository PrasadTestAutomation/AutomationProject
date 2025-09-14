package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;

public class RegistrationSteps {

    WebDriver driver = stepdefinitions.Hooks.driver;
    RegistrationPage registrationPage = new RegistrationPage(driver);
    //RegistrationPageFactory regPageFactory = new RegistrationPageFactory(driver);



    @Given("user is on the registration page")
    public void user_is_on_registration_page(){
        registrationPage.clickSignInLoginButton();
    }

    @When("user Enters valid name {string} and email {string}")
    public void userEntersValidAnd(String username, String email) {

        registrationPage.enterUsernameEmail(username,email);
    }

    @And("user clicks on SignUp Button")
    public void userClicksOnSignUpButton() throws InterruptedException {
        registrationPage.clickSignupButton();
    }

    @Then("user should be navigated to signup page")
    public void userShouldBeNavigatedToSignupPage() throws InterruptedException {
        registrationPage.validateSignInPage();
    }

    @When("user select title as Mr.")
    public void userSelectTitleAs() {
        registrationPage.selectTitle();
    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        registrationPage.enterPassword(password);
    }

    @And("user enters date of birth")
    public void userEntersDateOfBirth() {
        registrationPage.selectDateOfBirth();
    }

    @And("user clicks two checkboxes below DOB field")
    public void userClicksTwoCheckboxesBelowDOBField() {
        registrationPage.clickCheckBoxes();
    }

    @And("user enter firstname {string} lastname {string} company {string} address {string}")
    public void userEnterFirstnameLastnameAddress(String firstName, String lastName, String company, String address) {
        registrationPage.enterFirstNameLastNameCompanyAddress(firstName,lastName,company,address);
    }

    @And("user selects country {string}")
    public void userSelectsCountry(String country) {
        registrationPage.selectCountry(country);
    }

    @And("user enters state {string}, City {string}, Zipcode {string} and mobile number {string}")
    public void userEntersStateCityZipcodeAndMobileNumber(String state, String city, String zipCode, String mobileNumber) {
        registrationPage.enterStateCityZipcodeMobilenumber(state,city,zipCode,mobileNumber);
    }

    @And("user clicks the Create Account button")
    public void userClicksTheCreateAccountButton() {
         registrationPage.clickCreateAccountButton();
    }

    @Then("a message about account created should be displayed")
    public void aMessageAboutAccountCreatedShouldBeDisplayed() {
        registrationPage.validateAccountCreatedMessage();
    }

    @When("user clicks on continue button")
    public void userClicksOnContinueButton() {
        registrationPage.clickContinueButton();
    }

    @Then("on homepage {string} is visible")
    public void onHomepageLoggedInAsIsVisible(String username) {
        registrationPage.validateLoggedInAsUsername(username);
    }


    @When("user clicks on Delete Account button")
    public void userClicksOnDeleteAccountButton() {
       registrationPage.clickDeleteAccountButton();
    }


    @Then("user should see account deleted message")
    public void userShouldSeeAccountDeletedMessage() {
        registrationPage.validateAccountDeletedMessage();
    }
}
