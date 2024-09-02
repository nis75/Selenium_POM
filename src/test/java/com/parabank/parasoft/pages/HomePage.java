package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {

        super(driver);
    }
    public boolean hasLogoutLink(){
        return getWebElements(By.cssSelector("a[href='logout.htm']")).size()>0;
    }
    public OpenNewAccountPage clickOpenAccountLink(){
        By accountL= By.cssSelector("a[href='openaccount.html']");
        waitForElement(accountL);
        getWebElement(accountL).click();
        return getInstance(OpenNewAccountPage.class);
    }
    public TransferFundPage clickTransferFundLink(){

        waitForElement(By.cssSelector("a[href='transfer.html']"));
        getWebElement(By.cssSelector("a[href='transfer.html']")).click();
        return getInstance(TransferFundPage.class);
    }





}
