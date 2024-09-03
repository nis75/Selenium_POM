package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.HomePage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.OpenNewAccountPage;
import com.parabank.parasoft.util.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BaseTest {
    @Test
    public void openAccountShouldSucceed() throws InterruptedException {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTitle(), General.LOGIN_TITTLE);
        HomePage homePage = loginPage.doLoginViaRegistration();
                //.doLogin(getUserName(), getPassword());
        Assert.assertTrue(homePage.hasLogoutLink());

        OpenNewAccountPage newAccountOpenPage = homePage
                .clickOpenAccountLink()
                .selectAccountType(1)
                .selectAccountTNumber(0)
                .clickNewAccountOpenBtn();
        Assert.assertTrue(newAccountOpenPage.hasAccountId());


    }
    @Test(priority = 0)
    public void openAccountShouldSucceed2() {
        OpenNewAccountPage newAccountPage = page.getInstance(LoginPage.class)
                .doLogin(getUserName(),getPassword())
                .clickOpenAccountLink()
                .selectAccountType(1)
                .selectAccountTNumber(0)
                .clickNewAccountOpenBtn();
        Assert.assertTrue(newAccountPage.hasAccountId());

    }
    @Test(priority = 1)
    public void openAccountShouldSucceed1() {
        OpenNewAccountPage newAccountPage = page.getInstance(LoginPage.class)
                .doLogin(getUserName(),getPassword())
                .clickOpenAccountLink()
                .clickNewAccountOpenBtn();
        Assert.assertTrue(newAccountPage.hasAccountId());

    }

}
