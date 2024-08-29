package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.BasePage;
import com.parabank.parasoft.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    Page page;
    @BeforeMethod
    public void setUpBrowser() {
        driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/");
        driver.manage().window().maximize();

        page=new BasePage(driver);
    }
    @AfterMethod
    public void tearDownBrowser() {
        driver.quit();
    }
}
