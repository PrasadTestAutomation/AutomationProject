package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.RegistrationPage;

public class LoginSteps {
    WebDriver driver = stepdefinitions.Hooks.driver;
    LoginPage loginpage = new LoginPage(driver);

    @When("user Enters valid email {string} and password {string}")
    public void userEntersValidUsernameAndPassword(String email, String password) {
        loginpage.enterEmailPassword(email,password);
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() throws InterruptedException {
        loginpage.clickLoginButton();
    }

    @Then("user should be able to login successfully")
    public void userShouldBeAbleToLoginSuccessfully() throws InterruptedException {
        loginpage.validateLogin();
        System.out.println("user logged in successfullly");
    }

}
