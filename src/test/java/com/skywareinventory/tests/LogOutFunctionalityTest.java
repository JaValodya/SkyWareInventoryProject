package com.skywareinventory.tests;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.skywareinventory.pages.HomePage;
import com.skywareinventory.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogOutFunctionalityTest {

	WebDriver driver;

	@BeforeClass

	public void setUp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}

	@Test
	public void logOutTest() throws InterruptedException, IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./configuration.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		String title = "Skyware Inventory | Free Web Based Inventory Tracking Software";
		Assert.assertEquals(title, driver.getTitle());
		HomePage home = new HomePage(driver);
		home.loginButton.click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='loginForm']/h2")).isDisplayed());
		LoginPage login = new LoginPage(driver);
		login.userName.sendKeys(prop.getProperty("username"));
		login.password.sendKeys(prop.getProperty("password"));
		login.loginBtn.click();
		driver.findElement(By.xpath("//*[@id='subtabLink']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='messages']")).isDisplayed());
		
	}

}