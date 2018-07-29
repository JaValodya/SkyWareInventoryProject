package test.java.com.skywareinventory.utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public abstract class TestBase {
	protected WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		driver = Driver.getDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(ConfigurationReader.getProperty("url"));

	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
	}
	

}
