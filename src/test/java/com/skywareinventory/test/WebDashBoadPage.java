package com.skywareinventory.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.skywareinventory.pages.DashboardPage;
import com.skywareinventory.pages.HomePage;
import com.skywareinventory.pages.ItemsPage;
import com.skywareinventory.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDashBoadPage {

	WebDriver driver;

	@BeforeClass

	public void setUp() throws IOException {
		System.out.println("Setting up WebDriver in BeforeClass...");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

	}

	// this test takes place after user login his account
	@Test(priority = 1)
	public void dashBoardElement() throws InterruptedException, IOException {

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream("./configuration.properties");
		prop.load(fis);

		driver.get(prop.getProperty("url"));
		HomePage home = new HomePage(driver);
		//
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// WebElement element =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id=
		// 'closeCookieConsentBtn']")));
		//
		//
		home.loginButton.click();
		;
		//
		LoginPage login = new LoginPage(driver);

		login.userName.sendKeys(prop.getProperty("username"));
		login.password.sendKeys(prop.getProperty("password"));
		login.loginBtn.click();
	}
	// SPA-513
	@Test(priority = 2)

	public void itemCheck() throws InterruptedException {

		ItemsPage items = new ItemsPage(driver);

		DashboardPage dash = new DashboardPage(driver);
		// goes to items button and click on it in the dash board page
		dash.itemsButton.click();

		// goes to click for new item button
		Thread.sleep(2000);
		items.newItemBtn.click();

		String actual1 = items.nameText.getText();
		String expected1 = "Name";
		assertTrue(actual1.equals(expected1));
		if (actual1.equals(expected1)) {
			System.out.println("Name filed is displayed");
		} else {
			System.out.println("Name filed is NOT displayed");
		}

		String actual2 = items.descriptionText.getText();
		String expected2 = "Description";
		assertTrue(actual2.equals(expected2));
		if (actual2.equals(expected2)) {
			System.out.println("Description filed is displayed");
		} else {
			System.out.println("Description filed is NOT displayed");
		}

		String actual3 = items.categoryText.getText();
		String expected3 = "Category";
		assertEquals(actual3, expected3);
		if (actual3.equals(expected3)) {
			System.out.println("Category filed is displayed");
		} else {
			System.out.println("Category filed is NOT displayed");
		}

		String actual4 = items.costText.getText();
		String expected4 = "Cost";
		assertEquals(actual4, expected4);
		if (actual4.equals(expected4)) {
			System.out.println("Cost filed is displayed");
		} else {
			System.out.println("Cost filed is NOT displayed");
		}

		String actual5 = items.priceText.getText();
		String expected5 = "Price";
		assertEquals(actual5, expected5);
		if (actual5.equals(expected5)) {
			System.out.println("Price filed is displayed");
		} else {
			System.out.println("Price filed is NOT displayed");
		}

	}
	
	//SPA-516
	@Test(priority = 3)
	public void fieldCheck() {

		ItemsPage items = new ItemsPage(driver);

		// goes the description filed and type "My item"
		items.descriptionField.sendKeys("My item");

		// goes the drop down menu of Category and choose the Category B
		Select dropdown = new Select(items.categoryDropDown);
		dropdown.selectByValue("152476");

		// goes the cost field and types "300"
		items.costField.sendKeys("300");

		// goes the price field and types "10"
		items.priceField.sendKeys("10");

		// goes to the save button and click on it
		items.saveButton.click();

		// checks if the "Name is required" is visible
		String actual = items.nameMessage.getText();
		String expected = "Name is required";
		assertEquals(actual, expected);
		
		

	}
	
	//SPA-517
	@Test (priority = 4)
	public void AddName() {
		ItemsPage items = new ItemsPage(driver);
		//goes to name field and types "new generated name"
				items.nameField.sendKeys(new Faker().name().fullName());
	}
	
	
	//SPA-521 
	@Test (priority = 5)
	public void deleteItem() throws AWTException, InterruptedException {
		
		ItemsPage items = new ItemsPage(driver);
		
		// goes to the save button and click on it
		items.saveButton.click();
		
//		//goes to delete icon and click on it
//		Robot robot = new Robot();
//		robot.mouseMove(305, 601);
//		Thread.sleep(2000);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		
		
		//goes to edit button and click on it
		
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(items.editIcon));
		
		WebElement element = driver.findElement(By.xpath("//a[@alt='Maci Goldner']/../../td[2]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
//		items.editIcon.click();
		
//		String actual = items.sureMeesage.getText();
//		String expected = "Are you sure?";
//		
//		assertEquals(actual, expected);
		
		WebElement element1 = driver.findElement(By.className("delete"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(element1).click().perform();
		
		items.deletIt.click();
		
	}

}
