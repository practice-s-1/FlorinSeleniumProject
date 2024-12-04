package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;

public class MyAccountPage extends BasePage {

    @FindBy(className = "site-description")
    WebElement myAccountTitle;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getMyAccountTitlePage() {
        return myAccountTitle.getText();
    }
}
