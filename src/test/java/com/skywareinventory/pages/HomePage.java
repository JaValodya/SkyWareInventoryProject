package com.skywareinventory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skywareinventory.utilities.Driver;

public class HomePage {
	
	//delbar
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

<<<<<<< HEAD
	/*
	 * Verify the following: 1)www.skywareinventory.com home page appears. 2)Title
	 * of a loaded page is equal to expected title
	 */
	@FindBy(id = "logo")
	public WebElement title;
	
	//kamil 
=======
	//his one is to help to merge second attempt

	
	
	
	
	
	
	
	
	
	
	
	
>>>>>>> 9df32786b72daa9f6e60493c8be54ec2f6c5d633
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class ='button login']")
	public WebElement loginButton;

<<<<<<< HEAD
=======
	
>>>>>>> 9df32786b72daa9f6e60493c8be54ec2f6c5d633
}
