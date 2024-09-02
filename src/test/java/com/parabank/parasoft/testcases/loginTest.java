package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.HomePage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.util.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends BaseTest {
    @Test
    public void loginWithWrongUserName() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage
                .fillUserName(getUserName())
                .clickLoginLinkButton();
        Assert.assertTrue(loginPage.hasError());

    }
    @Test
    public void loginWithWrongPassword() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage.fillPassword(getPassword()).clickLoginLinkButton();
        Assert.assertTrue(loginPage.hasError());
    }
    @Test
    public void loginFail() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage.clickLoginLinkButton();
        Assert.assertTrue(loginPage.hasError());
    }
    @Test
    public void loginSuccess() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        HomePage overviewPage = loginPage
                .fillUserName(getUserName())
                .fillPassword(getPassword())
                .clickLoginButton();
        Assert.assertTrue(overviewPage.hasLogoutLink());
    }
    @Test
    public void checkTittle() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTitle(), General.LOGIN_TITTLE);
    }



}
