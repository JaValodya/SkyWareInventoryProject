package com.skywareinventory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.graph.NetworkBuilder;

public class HomePage {

	//his one is to help to merge

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class ='button login']")
	public WebElement loginButton;

	
}