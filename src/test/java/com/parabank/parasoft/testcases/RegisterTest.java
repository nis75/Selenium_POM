package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.HomePage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.RegisterPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{
    @Test
    public void registrationShouldFillWithData()  {
        LoginPage loginPage = page.getInstance(LoginPage.class);

        RegisterPage registerPage = loginPage
                .clickRegistrationLink().clickRegisterLink();
        Assert.assertTrue(registerPage.hasSSNRequiredFieldError());
        Assert.assertTrue(registerPage.hasError(10));

    }
    @Test
    public void registrationShouldSucceed()  {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        RegisterPage registerPage = loginPage
                .clickRegistrationLink()
                .fillFirstName("Niamul")
                .fillLastName("Islam")
                .fillAddress("Thakurgaon")
                .fillCity("Thakurgaon")
                .fillState("Rangpur")
                .fillZipCode("5103")
                .fillPhoneNo("01723339875")
                .fillSSN("91231")
                .fillUserName("nis")
                .fillPassword("nis")
                .fillConfirmPassword("nis")
                .clickRegisterLink();
    }
    @Test
    public void registrationShouldSucceed2() {
        String userName = LoremIpsum.getInstance().getName();
        LoginPage loginPage = page.getInstance(LoginPage.class);
        RegisterPage registerPage = loginPage
                .clickRegistrationLink()
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(5))
                .fillCity(LoremIpsum.getInstance().getCity())
                .fillState(LoremIpsum.getInstance().getCity())
                .fillZipCode(LoremIpsum.getInstance().getZipCode())
                .fillPhoneNo(LoremIpsum.getInstance().getPhone())
                .fillSSN("912-310-879")
                .fillUserName(userName)
                .fillPassword(userName)
                .fillConfirmPassword(userName);

        HomePage homePage = registerPage.clickRegisterBtn();
        Assert.assertTrue(homePage.hasLogoutLink());
    }
    @Test(enabled = false)
    public void registrationShouldSucceed3()  {
        String userName = LoremIpsum.getInstance().getName();

        HomePage homePage = page.getInstance(LoginPage.class)
                .clickRegistrationLink()
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(5))
                .fillCity(LoremIpsum.getInstance().getCity())
                .fillState(LoremIpsum.getInstance().getCity())
                .fillZipCode(LoremIpsum.getInstance().getZipCode())
                .fillPhoneNo(LoremIpsum.getInstance().getPhone())
                .fillSSN("912-310-879")
                .fillUserName(userName)
                .fillPassword(userName)
                .fillConfirmPassword(userName)
                .clickRegisterBtn();

        Assert.assertTrue(homePage.hasLogoutLink());
    }
}
