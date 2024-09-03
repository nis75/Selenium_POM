package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.TransferFundPage;
import org.testng.Assert;

public class TransferFundTest extends BaseTest{
    public void transferFoundsShouldSucceed()  {
        TransferFundPage transferFundPage = page.getInstance(LoginPage.class)
                .doLoginViaRegistration()
               // .doLogin(getUserName(),getPassword())
                .clickTransferFundLink()
                .clickTransferFundsLink();
        Assert.assertTrue(transferFundPage.hasCompletedTransfer());


    }

}
