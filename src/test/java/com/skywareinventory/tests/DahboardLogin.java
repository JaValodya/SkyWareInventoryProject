package com.skywareinventory.tests;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.skywareinventory.pages.LoginToDashBorad;
import com.skywareinventory.utilities.ConfigurationReader;
import com.skywareinventory.utilities.TestBase;

public class DahboardLogin extends TestBase {
	LoginToDashBorad logindash=new LoginToDashBorad();
	
	
	
	@Test(priority=1,groups= {"smoke"})
	public void login_With_Valid_Credential_512() {
	
		logindash.loginbutton.click();
		logindash.username.sendKeys(ConfigurationReader.getProperty("username"));
		logindash.password.sendKeys(ConfigurationReader.getProperty("password"));
		logindash.submit.click();
		String expected=logindash.dashbordtitle.getText();
		assertTrue(logindash.logoutbutton.isDisplayed());
		String actual="Dashboard";
		assertEquals(actual, expected);
		logindash.ItemsButton.click();
		String expectedItemList="Item List";
		String actualItemList=logindash.dashbordtitle.getText();
		assertEquals(actualItemList, expectedItemList);
		
		
	}

	
}
