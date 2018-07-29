package test.java.com.skywareinventory.tests;

import static org.testng.Assert.*;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import test.java.com.skywareinventory.pages.HomePage;
import test.java.com.skywareinventory.pages.LoginPage;
import test.java.com.skywareinventory.utilities.BrowserUtils;
import test.java.com.skywareinventory.utilities.Driver;
import test.java.com.skywareinventory.utilities.TestBase;

public class Homepage_LoginTest extends TestBase{
	HomePage homepage=new HomePage();
	LoginPage loginpage=new LoginPage();
	@Ignore
	@Test
	public void titletest_506() {
		BrowserUtils.waitFor(2);
		String actual=driver.getTitle();
		String expected="Skyware Inventory Management Software is brought to you by Open Sky Software, provider of custom software development and software consulting services.";
		System.out.println(expected);
		BrowserUtils.waitFor(2);
		assertEquals(actual, expected,"Title does not Match the expected result");
		}
	@Test
  public void loginTest_506() {
	  loginpage.loginbutton.click();
	  loginpage.login("", "");
	  assertTrue(loginpage.errorMessage.isDisplayed());
	  
  }

}
