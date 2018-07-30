package com.skywareinventory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skywareinventory.utilities.Driver;

public class HomePage {
	

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "//a[@class ='button login']")
	public WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"signup-free\"]/a")
	public WebElement signUpForFreeButton;
	
	

}
