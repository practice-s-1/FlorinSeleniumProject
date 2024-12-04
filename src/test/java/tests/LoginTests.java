package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyAccountPage;
import utils.BaseTest;
import utils.ConfigLoader;

public class LoginTests extends BaseTest {

    String loginURL = ConfigLoader.getProperty("loginURL");
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Test
    public void checkLoginWithValidCredentials() {
        driver.get(loginURL);
        loginPage = new LoginPage(driver);

        loginPage.fillCredentials("cursant1", "Tester123");
        loginPage.clickLoginButton();

        myAccountPage = new MyAccountPage(driver);

        Assert.assertEquals(myAccountPage.getMyAccountTitlePage(), "Practice website for testing sessions",
                "The title page is wrong!");
    }
}
