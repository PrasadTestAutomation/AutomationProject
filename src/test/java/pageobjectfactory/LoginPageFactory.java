package pageobjectfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
    WebDriver driver;

    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='Login to your account']")
    private WebElement validateLoginInfo;

    @FindBy(xpath = "//form/input[@type='email' and @data-qa='login-email']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//form/input[@type='password' and @data-qa='login-password']")
    private WebElement passwordField;

    @FindBy(xpath = "//form/button[@type='submit' and @data-qa='login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(), 'Logged')]")
    private WebElement loggedInText;

    public WebElement getValidateLoginInfo() {
        return validateLoginInfo;
    }

    public WebElement getEmailAddressFiled() {
        return emailAddressField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }


    public WebElement getLoginButton() {
        return loginButton;
    }

    public boolean getLoggedInText() {
       boolean loginText =  loggedInText.isDisplayed();
       return loginText;
    }
}
