package test.java.com.skywareinventory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.java.com.skywareinventory.utilities.Driver;

public class LoginToDashBorad {
	
	public LoginToDashBorad() {
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	@FindBy(xpath = "//a[@class='button login']")
	public WebElement loginbutton;
    @FindBy(id="username")
    public WebElement username;
    @FindBy(id="password")
    public WebElement password;
    @FindBy(xpath="//input[@value='Log in']")
    public WebElement submit;
    @FindBy(id="subtabLink")
    public WebElement logoutbutton;
    @FindBy(id="pageTitle")
    public WebElement dashbordtitle;
    @FindBy(xpath="//a[@title='Items']")
    public WebElement ItemsButton;
    
    
  //a[@title='Items']
}
