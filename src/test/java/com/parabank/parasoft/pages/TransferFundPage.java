package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundPage extends BasePage{
    public TransferFundPage(WebDriver driver) {
        super(driver);
    }
    public TransferFundPage clickTransferFundsLink() {
        getWebElement(By.cssSelector("input[value='Transfer']")).click();
        return  this;
    }
    public  boolean hasCompletedTransfer(){
        return  getWebElements(By.cssSelector("div[id='showResult'] h1[class='title']")).size() > 0;
    }
}
