package com.skywareinventory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skywareinventory.utilities.Driver;


public class SignUpPage {
	public SignUpPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="email")
	public WebElement signUpPageEmail;
	
	@FindBy(id="password")
	public WebElement signUpPagePassword;
	
	@FindBy(id="password2")
	public WebElement signUpPagePassword2;
	
	@FindBy(id="accountName")
	public WebElement signUpPageCompanyName;
	
	@FindBy(id="profile_firstName")
	public WebElement signUpPageFirstName;
	
	@FindBy(id="profile_lastName")
	public WebElement signUpPageLastName;
	
	@FindBy(id="countrySelect")
	public WebElement signUpPageCountrySelect;
	
	@FindBy(id="profile_address1")
	public WebElement signUpPageAddressLine1;
	
	@FindBy(id="profile_address2")
	public WebElement signUpPageAddressLine2;
	
	@FindBy(id="profile_city")
	public WebElement signUpPageCity;
	
	@FindBy(id="stateSelect")
	public WebElement signUpPageStateSelect;
	
	@FindBy(id="profile_zip")
	public WebElement signUpPageZipCode;
	
	@FindBy(id="costTrue")
	public WebElement signUpPageTrackItemCostsTrue;
	
	@FindBy(id="costFalse")
	public WebElement signUpPageTrackItemCostsFalse;
	
	@FindBy(id="pricingTrue")
	public WebElement signUpPageTrackItemPricingTrue;
	
	@FindBy(id="pricingFalse")
	public WebElement signUpPageTrackItemPricingFalse;
	
	@FindBy(id="locationTrue")
	public WebElement signUpPageUseMultipleLocationsTrue;
	
	@FindBy(id="locationFalse")
	public WebElement signUpPageUseMultipleLocationsFalse;
	
	@FindBy(id="categoryTrue")
	public WebElement signUpPageUseCategoriesforItemsTrue;
	
	@FindBy(id="categoryFalse")
	public WebElement signUpPageUseCategoriesforItemsFalse;
	
	@FindBy(id="vendorTrue")
	public WebElement signUpPageUseVendorsForItemsTrue;
	
	@FindBy(id="locationFalse")
	public WebElement signUpPageUseVendorsForItemsFalse;
	
	@FindBy(id="shippingTrue")
	public WebElement signUpPageTrackShippingCostsTrue;
	
	@FindBy(id="shippingFalse")
	public WebElement signUpPageTrackShippingCostsFalse;
	
	@FindBy(id="taxesTrue")
	public WebElement signUpPageTrackSalesTaxesTrue;
	
	@FindBy(id="taxesFalse")
	public WebElement signUpPageTrackSalesTaxesFalse;
	
	@FindBy(id="feesTrue")
	public WebElement signUpPageTrackMiscFeesTrue;
	
	@FindBy(id="feesFalse")
	public WebElement signUpPageTrackMiscFeesFalse;

	@FindBy(id="lifoFalse")
	public WebElement signUpPageAccountingMethodFIFO;
	
	@FindBy(id="lifoTrue")
	public WebElement signUpPageAccountingMethodLIFO;
	
	@FindBy(id="licenseAccepted")
	public WebElement signUpPageAcceptLicense;
	
	@FindBy(id="createButton")
	public WebElement signUpPageCreateAccountButton;
	
	@FindBy(id="closeCookieConsentBtn")
	public WebElement cookie;
	
}
