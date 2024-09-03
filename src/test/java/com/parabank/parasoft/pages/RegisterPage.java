package com.parabank.parasoft.pages;

import com.parabank.parasoft.util.General;
import com.thedeanda.lorem.LoremIpsum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public RegisterPage fillFirstName(String firstName) {
        getWebElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(firstName);
        return this;
    }
    public RegisterPage fillLastName(String lastName) {
        getWebElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(lastName);
        return this;
    }
    public RegisterPage fillAddress(String address) {
        getWebElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(address);
        return this;
    }
    public RegisterPage fillCity(String city) {
        getWebElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(city);
        return this;
    }
    public RegisterPage fillState(String state) {
        getWebElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(state);
        return this;
    }
    public RegisterPage fillZipCode(String zipCode) {
        getWebElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(zipCode);
        return this;
    }
    public RegisterPage fillPhoneNo(String phoneNo) {
        getWebElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(phoneNo);
        return this;
    }
    public RegisterPage fillSSN(String ssn) {
        getWebElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(ssn);
        return this;
    }
    public RegisterPage fillUserName(String userName) {
        getWebElement(By.xpath("//input[@id='customer.username']")).sendKeys(userName);
        return this;
    }
    public RegisterPage fillPassword(String password) {
        getWebElement(By.xpath("//input[@id='customer.password']")).sendKeys(password);
        return this;
    }
    public RegisterPage fillConfirmPassword(String confirmPassword) {
        getWebElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(confirmPassword);
        return this;
    }
    public HomePage clickRegisterBtn() {
        General.customSleep();
        getWebElement(By.cssSelector("input[value='Register']")).click();
        return getInstance(HomePage.class);
    }
    public RegisterPage clickRegisterLink(){
        General.customSleep();
        getWebElement(By.cssSelector("input[value='Register']")).click();
        return  this;
    }
    public boolean hasSSNRequiredFieldError(){

        return  getWebElements(By.id("customer.ssn.errors")).size() > 0;
    }
    public boolean hasFirstNameRequiredFieldError(){
        return  getWebElements(By.id("customer.firstName.errors")).size() > 0;
    }
    public boolean hasError(int errorNumber){
        System.out.println("++++++++++++++++++++++++++++++++++++++++=");
        System.out.println(getWebElements(By.className("error")).size() >= errorNumber);
        System.out.println(errorNumber);
        System.out.println("===========================================");
        return  getWebElements(By.className("error")).size() >= errorNumber;
    }

}
