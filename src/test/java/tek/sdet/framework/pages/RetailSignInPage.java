package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
		// this method will initialzie the element for us 
	}
	
	@FindBy(xpath = "//a[text() = 'Sign in']")
	public WebElement signIn;
	
	@FindBy(xpath="// input[@type='email']")
	public WebElement emailField;
	
	@FindBy(xpath="// input[@id='password']")
	public WebElement passwordField;
	
	@FindBy(xpath = "// button[@type='submit']")
	public WebElement login;
	
	@FindBy(xpath = "//a[text()='Account']")
	public WebElement account;
	
	@FindBy (xpath = "//a[@id='signinLink']")
	public WebElement signInOption;
	
	@FindBy(xpath ="//a[text()='Create New Account']")
	public WebElement createNewAccount;
	
	@FindBy(id = "nameInput")
	public WebElement nameField;
	
	@FindBy(id ="emailInput")
	public WebElement emailField1;
	
	@FindBy(id ="passwordInput")
	public WebElement passwordField1;
	
	@FindBy(id ="confirmPasswordInput")
	public WebElement confirmPasswordField;
	
	@FindBy(xpath ="//button[text() ='Sign Up']")
	public WebElement signUpButton;
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
	
	
	
	

	
	
	

