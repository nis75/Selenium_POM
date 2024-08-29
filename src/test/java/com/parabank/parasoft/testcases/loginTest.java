package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.AccountOverviewPage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.util.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends BaseTest {
    @Test
    public void loginWithWrongUserName() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage
                .fillUserName("sdasdadss")
                .clickLoginLinkButton();
        Assert.assertTrue(loginPage.hasError());


//        LoginPage loginPage2 = page.getInstance(LoginPage.class)
//                .fillUserName("sdasdadss")
//                .clickLoginLinkButton();
//        Assert.assertTrue(loginPage2.hasError());
    }
    @Test
    public void loginWithWrongPassword() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage.fillPassword("sdasdadss").clickLoginLinkButton();
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
        AccountOverviewPage overviewPage = loginPage
                .fillUserName("nis")
                .fillPassword("nis")
                .clickLoginButton();
        Assert.assertTrue(overviewPage.hasLogoutLink());
    }
    @Test
    public void checkTittle() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTitle(), General.LOGIN_TITTLE);
    }



}
