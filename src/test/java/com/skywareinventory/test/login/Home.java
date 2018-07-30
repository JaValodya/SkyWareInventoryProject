package com.skywareinventory.test.login;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.skywareinventory.pages.HomePage;
import com.skywareinventory.pages.SignUpForFreePage;

import com.skywareinventory.test.TestBase;
import com.skywareinventory.utilities.ConfigurationReader;

public class Home extends TestBase{

	@Ignore 
	@Test(priority = 1)
	public void loginTest_SPA481 () throws InterruptedException {
	HomePage homePage = new HomePage();
	SignUpForFreePage signUpForFreePage = new SignUpForFreePage();
	assertTrue(driver.getTitle().equals(ConfigurationReader.getProperty("homePageTitle")));
	homePage.signUpForFreeButton.click();
	actual = signUpForFreePage.basicInfo.getText();
	expected = "Basic Info";
	assertTrue(actual.equals(expected));
	actual = signUpForFreePage.profileInfo.getText();
	expected = "Profile Info";
	assertTrue(actual.equals(expected));
	actual = signUpForFreePage.accountSettings.getText();
	expected = "Account Settings";
	assertTrue(actual.equals(expected));
	signUpForFreePage.emailField.sendKeys(randomEmail);
	sendedPassword = randomPassword;
	signUpForFreePage.passwordField.sendKeys(sendedPassword);
	signUpForFreePage.passwordConfirmationField.sendKeys(sendedPassword);
	signUpForFreePage.companyNameField.sendKeys(companyName);
	signUpForFreePage.firstNameField.sendKeys(firstName);
	signUpForFreePage.lastNameField.sendKeys(lastName);
	signUpForFreePage.addressStreetNumberField.sendKeys(addressStreetNumber);
	signUpForFreePage.streetField.sendKeys(street);
	signUpForFreePage.cityField.sendKeys(city);
	signUpForFreePage.zipCodeField.sendKeys(zipCode);
	signUpForFreePage.phoneNumberField.sendKeys(phoneNumber);
	WebElement mySelect = signUpForFreePage.selectState;
	Select stateDropdown = new Select(mySelect);
	stateDropdown.selectByVisibleText(choosenState);
	signUpForFreePage.closeCookieButton.click();
	signUpForFreePage.acceptCheckbox.click();
	signUpForFreePage.createAccountButton.click();
	driver.get("https://www.skywareinventory.com/login?ref=registersuccess");
	assertTrue(driver.findElement(By.xpath("	//*[@id=\"messages\"]")).getText().equals("Your new profile has been created! Please check your email to activate.") );
	driver.close();
	
	}
	//@Ignore
	@Test(priority = 2)
	public void signUpFunctionality_SPA488() {
		HomePage homePage = new HomePage();
		SignUpForFreePage signUpForFreePage = new SignUpForFreePage();
		assertTrue(driver.getTitle().equals(ConfigurationReader.getProperty("homePageTitle")));
		homePage.signUpForFreeButton.click();
		actual = signUpForFreePage.basicInfo.getText();
		expected = "Basic Info";
		assertTrue(actual.equals(expected));
		actual = signUpForFreePage.profileInfo.getText();
		expected = "Profile Info";
		assertTrue(actual.equals(expected));
		actual = signUpForFreePage.accountSettings.getText();
		expected = "Account Settings";
		assertTrue(actual.equals(expected));
		signUpForFreePage.emailField.sendKeys(randomEmail);
		sendedPassword = randomPassword;
		signUpForFreePage.passwordField.sendKeys(sendedPassword);
		signUpForFreePage.passwordConfirmationField.sendKeys(sendedPassword);
		signUpForFreePage.companyNameField.sendKeys(companyName);
		signUpForFreePage.firstNameField.sendKeys(firstName);
		signUpForFreePage.lastNameField.sendKeys(lastName);
		signUpForFreePage.addressStreetNumberField.sendKeys(addressStreetNumber);
		signUpForFreePage.streetField.sendKeys(street);
		signUpForFreePage.cityField.sendKeys(city);
		signUpForFreePage.zipCodeField.sendKeys(zipCode);
		signUpForFreePage.phoneNumberField.sendKeys(phoneNumber);
		WebElement mySelect = signUpForFreePage.selectState;
		Select stateDropdown = new Select(mySelect);
		stateDropdown.selectByVisibleText(choosenState);
		signUpForFreePage.trackItemCostsRadioOptionNo.click();
		signUpForFreePage.trackItemPricesRadioOptionNo.click();
		signUpForFreePage.useMultipleLocationsRadioOptionNo.click();
		signUpForFreePage.useCategoriesForItemsRadioOptionNo.click();
		signUpForFreePage.useVendorsForItemsRadioOptionNo.click();
		signUpForFreePage.trackShippingCostsRadioOptionNo.click();
		signUpForFreePage.trackSalesTaxesRadioOptionNo.click();
		signUpForFreePage.trackMiscFeesRadioOptionNo.click();
		signUpForFreePage.closeCookieButton.click();
		signUpForFreePage.acceptCheckbox.click();
		signUpForFreePage.createAccountButton.click();
		driver.get("https://www.skywareinventory.com/login?ref=registersuccess");
		assertTrue(driver.findElement(By.xpath("	//*[@id=\"messages\"]")).getText().equals("Your new profile has been created! Please check your email to activate.") );
		driver.close();
	}

	
	
	
	
	}
	
	
	


