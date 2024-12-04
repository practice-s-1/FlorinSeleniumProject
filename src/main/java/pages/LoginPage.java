package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;

public class LoginPage extends BasePage {

    // search elements
    @FindBy(id = "user_login")
    WebElement usernameTextBox;

    @FindBy(id = "user_pass")
    WebElement passwordTextBox;

    @FindBy(id = "wppb-submit")
    WebElement loginButton;

    // constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // methods
    public void fillCredentials(String username, String password) {
        usernameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
