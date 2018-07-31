package com.skywareinventory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skywareinventory.utilities.Driver;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	/*
	 * Verify the following: 1)www.skywareinventory.com home page appears. 2)Title
	 * of a loaded page is equal to expected title
	 */
	@FindBy(id = "logo")
	public WebElement title;

}
