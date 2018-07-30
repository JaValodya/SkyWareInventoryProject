package com.skywareinventory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skywareinventory.utilities.Driver;

public class SignUpForFreePage {

	public SignUpForFreePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "//*[@id=\"registerForm\"]/div[1]/div[1]/h3")
	public WebElement basicInfo;
	
	@FindBy(xpath = "//*[@id=\"registerForm\"]/div[1]/div[2]/h3")
	public WebElement profileInfo;
	
	@FindBy(xpath = "//*[@id=\"registerForm\"]/div[2]/div/h3")
	public WebElement accountSettings;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	public WebElement emailField;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	public WebElement passwordField;
	
	@FindBy(xpath = "//*[@id=\"password2\"]")
	public WebElement passwordConfirmationField;
	
	@FindBy(xpath = "//*[@id=\"accountName\"]")
	public WebElement companyNameField;
	
	@FindBy(xpath = "//*[@id=\"profile_firstName\"]")
	public WebElement firstNameField;
	
	@FindBy(xpath = "//*[@id=\"profile_lastName\"]")
	public WebElement lastNameField;
	
	@FindBy(xpath = "//*[@id=\"profile_address1\"]")
	public WebElement addressStreetNumberField;
	
	@FindBy(xpath = "//*[@id=\"profile_address2\"]")
	public WebElement streetField;
	
	@FindBy(xpath = "//*[@id=\"profile_city\"]")
	public WebElement cityField;
	
	@FindBy(xpath = "//*[@id=\"profile_zip\"]")
	public WebElement zipCodeField;
	
	@FindBy(xpath = "//*[@id=\"profile_phone\"]")
	public WebElement phoneNumberField;
	
	@FindBy(xpath = "//*[@id=\"licenseAccepted\"]")
	public WebElement acceptCheckbox;
	
	@FindBy(xpath = "//*[@id=\"stateSelect\"]")
	public WebElement selectState;
	
	@FindBy(xpath = "//*[@id=\"closeCookieConsentBtn\"]")
	public WebElement closeCookieButton;
	
	@FindBy(xpath = "//*[@id=\"createButton\"]")
	public WebElement createAccountButton;
	
	@FindBy(xpath = "//*[@id=\"costFalse\"]")
	public WebElement trackItemCostsRadioOptionNo;
	
	@FindBy(xpath = "//*[@id=\"pricingFalse\"]")
	public WebElement trackItemPricesRadioOptionNo;
	
	@FindBy(xpath = "//*[@id=\"locationFalse\"]")
	public WebElement useMultipleLocationsRadioOptionNo;
	
	@FindBy(xpath = "//*[@id=\"categoryFalse\"]")
	public WebElement useCategoriesForItemsRadioOptionNo;
	
	@FindBy(xpath = "//*[@id=\"vendorFalse\"]")
	public WebElement useVendorsForItemsRadioOptionNo;
	
	@FindBy(xpath = "//*[@id=\"shippingFalse\"]")
	public WebElement trackShippingCostsRadioOptionNo;
	
	@FindBy(xpath = "//*[@id=\"taxesFalse\"]")
	public WebElement trackSalesTaxesRadioOptionNo;
	
	@FindBy(xpath = "//*[@id=\"feesFalse\"]")
	public WebElement trackMiscFeesRadioOptionNo;
	

	

}
