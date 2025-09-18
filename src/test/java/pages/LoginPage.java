package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobjectfactory.LoginPageFactory;
import pageobjectfactory.RegistrationPageFactory;

public class LoginPage {

    WebDriver driver;
    LoginPageFactory loginFactory;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.loginFactory = new LoginPageFactory(driver);
    }

    //all constants are stored inside this method - they are final
    public static class Constants {

        public static final String LOGIN_INFO = "Login to your account";
        public static final String ACC_DELETED_MSG = "ACCOUNT DELETED!";
        public static final String LOGIN_ERROR_MSG = "Your email or password is incorrect!";
    }

    public void enterEmailPassword(String email,String password)
    {
        String LoginInfo = loginFactory.getValidateLoginInfo().getText();
        Assert.assertEquals(LoginInfo, LoginPage.Constants.LOGIN_INFO,"New User SignUp! not visible");
        loginFactory.getEmailAddressFiled().sendKeys(email);
        loginFactory.getPasswordField().sendKeys(password);
    }

    public void clickLoginButton() throws InterruptedException {
        loginFactory.getLoginButton().click();
        Thread.sleep(3000);
    }

    public void validateLogin() {
        boolean loginText = loginFactory.getLoggedInText();
        Assert.assertTrue(loginText, "logged In as not present");
    }

    public void validateLoginUsingInvalidCredentials() {
        String invalidLoginText = loginFactory.getInvalidLoggedInText().getText();
        Assert.assertEquals(invalidLoginText,LoginPage.Constants.LOGIN_ERROR_MSG,"error message not presen");
    }

}
