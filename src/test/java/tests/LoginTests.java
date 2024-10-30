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

        loginPage.fillCredentials("AlisaT123", "AlisaT123");
        loginPage.clickLoginButton();

        myAccountPage = new MyAccountPage(driver);

        Assert.assertEquals("MY ACCOUNT", myAccountPage.getMyAccountTitlePage(),
                "The title page is wrong!");
    }
}
