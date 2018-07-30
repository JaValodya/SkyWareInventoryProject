package com.skywareinventory.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skywareinventory.utilities.Driver;

public class ItemsPage {

	public ItemsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "pageTitle")
	public WebElement itemListText;

	@FindBy(id = "newItemButton")
	public WebElement newItemBtn;

	@FindBy(xpath = "//label[.='Name']")
	public WebElement nameText;
	
	@FindBy(className = "name")
	public WebElement nameField;

	@FindBy(xpath = "//label[.='Description']")
	public WebElement descriptionText;

	@FindBy(id = "category_sort")
	public WebElement categoryText;

	@FindBy(xpath = "//label[.='Cost']")
	public WebElement costText;

	@FindBy(xpath = "//label[.='Price']")
	public WebElement priceText;

	@FindBy(xpath = "//textarea[@class='description']")
	public WebElement descriptionField;

	@FindBy(xpath = "//select[@class='category']")
	public WebElement categoryDropDown;

	@FindBy(className = "cost")
	public WebElement costField;
	
	@FindBy(className = "price")
	public WebElement priceField;
	
	@FindBy(className = "save")
	public WebElement saveButton;
	
	@FindBy(xpath = "//li[.='Name is required']")
	public WebElement nameMessage;
	
	@FindBy( xpath = "//a[@alt='Maci Goldner']/../../td[2]/a")
	public WebElement editIcon;
	
	@FindBy(className = "delete")
	public WebElement deleteBtn;
	
	@FindBy (xpath = "//div[@class='ui-tooltip-titlebar']//div[@class='ui-tooltip-title']")
	public WebElement sureMeesage;
	
	@FindBy(xpath = "//a[@class='really_delete']")
	public WebElement deletIt;
	

}
