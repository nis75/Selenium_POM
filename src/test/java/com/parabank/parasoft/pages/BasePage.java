package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage extends Page {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTitle(By locator) {
        return "";
    }

    @Override
    public WebElement getWebElement(By locator) {
        return null;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {
        return List.of();
    }

    @Override
    public void waitForElement(By locator) {

    }
}
