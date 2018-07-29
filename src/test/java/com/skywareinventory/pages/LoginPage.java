package test.java.com.skywareinventory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.java.com.skywareinventory.utilities.Driver;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	/*
	 * Click on "Login" button Verify the page with following text appears:
	 * 1)Current users Leave "Username/Email" and "Password" fields empty.
	 * "Username/Email" and "Password" fields should be available and take input
	 * Click "Login" button Verify the following text appears:
	 * "Incorrect Username or password. Please try again."
	 */
	@FindBy(xpath = "//a[@class='button login']")
	public WebElement loginbutton;
    @FindBy(id="username")
    public WebElement username;
    @FindBy(id="password")
    public WebElement password;
  //input[@type='submit']
    @FindBy(xpath="//input[@value='Log in']")
    public WebElement submit;
    @FindBy(id="messages")
    public WebElement errorMessage ;
    @FindBy(id="forgotPasswordLink")
    public WebElement resetpassword;
    @FindBy(id="pageTitle")
    public WebElement resetpasswordtitle;
    @FindBy(name="email")
    public WebElement email;
    @FindBy(id="submitButton")
    public WebElement emailsubmit;
    @FindBy(id="ui-tooltip-0-content")
    public WebElement popuperrprMessage;
    
    
	public void login(String uid, String pwd) {
		username.sendKeys(uid);
		password.sendKeys(pwd);
		submit.click();
}
}