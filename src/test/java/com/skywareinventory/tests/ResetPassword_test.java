package com.skywareinventory.tests;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

import com.skywareinventory.pages.LoginPage;
import com.skywareinventory.utilities.BrowserUtils;
import com.skywareinventory.utilities.TestBase;

public class ResetPassword_test extends TestBase{
	
	LoginPage loginpage = new LoginPage();
	
	@Test
    public void resetPaaworktest_510() {
		loginpage.loginbutton.click();
		BrowserUtils.waitFor(2);
    	loginpage.resetpassword.click();
    	BrowserUtils.waitFor(2);
    	loginpage.email.sendKeys("deli.aili@gmail.com");
    	loginpage.emailsubmit.click();
    	BrowserUtils.waitForVisibility(loginpage.popuperrprMessage, 5);
    	String actual=loginpage.popuperrprMessage.getText();
    	assertEquals(actual, "Sorry, that email is not in our system.");
    }

}
