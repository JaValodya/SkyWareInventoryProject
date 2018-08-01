package com.skywareinventory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skywareinventory.utilities.Driver;

public class HomePage {
	
	//kostya
 		public HomePage() {
 		PageFactory.initElements(Driver.getDriver(), this);
 	}
// 	@FindBy(xpath = "//a[@class ='button login']")
// 	public WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"signup-free\"]/a")
	public WebElement signUpForFreeButton;
	
 	//delbar
// 	public HomePage() {
// 		PageFactory.initElements(Driver.getDriver(), this);
// 	}

	/*
	 * Verify the following: 1)www.skywareinventory.com home page appears. 2)Title
	 * of a loaded page is equal to expected title
	 */
	@FindBy(id = "logo")
	public WebElement title;
	
	//kamil 
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class ='button login']")
	public WebElement loginButton;

}
