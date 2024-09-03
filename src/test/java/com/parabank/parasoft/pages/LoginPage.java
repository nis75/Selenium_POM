package com.parabank.parasoft.pages;

import com.thedeanda.lorem.LoremIpsum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

        public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage fillUserName(String userName) {
            getWebElement(By.cssSelector("input[name='username']")).sendKeys(userName);
            return this;
    }
    public LoginPage fillPassword(String password) {
        getWebElement(By.cssSelector("input[name='password']")).sendKeys(password);
        return this;
    }
    public HomePage clickLoginButton() {
            getWebElement(By.cssSelector("input[value='Log In']")).click();
        return getInstance(HomePage.class);
    }
    public LoginPage clickLoginLinkButton() {
        getWebElement(By.cssSelector("input[value='Log In']")).click();
        return getInstance(LoginPage.class);
    }
    public CustomerLookupPage clickForgetLink() {
        getWebElement(By.cssSelector("a[href='lookup.htm']")).click();
            return getInstance(CustomerLookupPage.class);

    }
    public RegisterPage clickRegistrationLink() throws InterruptedException {
            Thread.sleep(3000);
        getWebElement(By.cssSelector("a[href='register.htm']")).click();
        return getInstance(RegisterPage.class);
    }
    public boolean hasError(){

            return getWebElements(By.ByClassName.className("error")).size()>0;
    }
    public HomePage doLogin(String userName, String password) {
            return fillUserName(userName)
                    .fillPassword(password)
                    .clickLoginButton();
    }

    public HomePage doLoginViaRegistration() throws InterruptedException {
        String userName = LoremIpsum.getInstance().getName();
        return getInstance(LoginPage.class)
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
    }


}
