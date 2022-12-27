package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);

	}
	
	@FindBy(xpath ="//span[text()='All']")
	public WebElement All;
	
	@FindBy (xpath ="//select[@id='search']")
	public WebElement allDepartment;
	
	@FindBy(xpath =" //span[text() ='Electronics']")
	public WebElement Electronics;
	
	@FindBy (xpath = " //span[text() ='Computers']")
	public  WebElement Computers;
	
	@FindBy (xpath = " //span[text() ='Smart Home']")
	public WebElement smartHome;
	
	@FindBy (xpath = " //span[text() ='Sports']")
	public WebElement Sport;
	
	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computers;
	
	@FindBy(xpath = "//span[text()='Video Games']")
	public WebElement videoGames;
	
	@FindBy (xpath = "//span[text()='TV & Video']")
	public WebElement TVAndVideo;
	
	@FindBy (xpath ="//span[text() ='Accessories']")
	public WebElement Accessories;
	
	@FindBy (xpath = "//span[text() ='Networking']")
	public WebElement Networking;
	
	@FindBy (xpath = "//span[text()='Smart Home Lightning']")
	public WebElement SmartHomeLighting;
	
	@FindBy(xpath = "//span[text()='Plugs and Outlets']")
	public WebElement plugsAndOutlets;
	
	@FindBy (xpath = "//span[text() ='Athletic Clothing']")
	public WebElement AthleticClothing;
	
	@FindBy (xpath = "//span[text() ='Exercise & Fitness']" )
	public WebElement ExcerciseAndFitness;
	
	@FindBy (xpath =" //span[text() ='Automative']")
	public WebElement Automative;
	
	@FindBy (xpath ="//span[text()='Automative Parts & Accessories']")
	public WebElement AutoPartsAndAccessories;
	
	@FindBy (xpath = "//span[text()='MotorCycle & Powersports']")
	public WebElement MotorCycleAndPowerSports;
	
	@FindBy (xpath = "//input[@id='searchInput']")
	public WebElement searchInputField;
	
	@FindBy (xpath = "//button[@id='searchBtn']")
	public WebElement SearchBtn;
	
	@FindBy(xpath="//p[text()='Kasa Outdoor Smart Plug']")
    public WebElement Kasa;
	
	@FindBy(css="select.product__select")
    public WebElement Quantity;
	
	@FindBy (xpath ="//span[text()='Add to Cart']")
	public WebElement addToCart;
	
	@FindBy (xpath ="//div[@id='cartBtn']")
	public WebElement cartButton;
	
	@FindBy (xpath = "//img[@class='image']")
	public WebElement ApexLegendBook;
	
	@FindBy (xpath = "//button[@id='proceedBtn']")
	public WebElement ProceedToCheckoutButton;
	
	@FindBy (xpath = "//button[@id='addAddressBtn']")
	public WebElement AddNewAddress;
	
	@FindBy (xpath = "//button[@id='placeOrderBtn']")
	public WebElement PlaceYourOrderButton;
	
	@FindBy (xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement Thanks;
	
	@FindBy(xpath = "//select[@name='country']")
	public WebElement CountryInput;
	
	@FindBy (xpath = "//input[@name='fullName']")
	public WebElement FullNameInput;
	
	@FindBy (xpath = "//input[@id='phoneNumberInput']")
	public WebElement PhoneInput;
	
	@FindBy (xpath = "//input[@id='streetInput']")
	public WebElement StreetAddressInput;
	
	@FindBy (xpath = "//input[@id='apartmentInput']")
	public WebElement ApartmentInput;
	
	@FindBy (xpath = "//input[@id='cityInput']")
	public WebElement CityInput;
	
	@FindBy (xpath = "//select[@blacklist='[object Object]']")
	public WebElement StateInput;
	
	@FindBy (xpath = "//input[@id='zipCodeInput']")
	public WebElement ZipcodeInput;
	
	@FindBy (xpath ="//button[@id='addressBtn']")
	public  WebElement AddYourAddress;
	
	@FindBy (xpath = "//button[@id='addPaymentBtn']")
	public WebElement AddCreditOrDebitCard;
	
	@FindBy (xpath = "//input[@id='cardNumberInput']")
	public WebElement CardNumberInput;
	
	@FindBy (xpath = "//input[@id='nameOnCardInput']")
	public WebElement NameOnCardInput;
	
	@FindBy(xpath = "//select[@id='expirationMonthInput']")
	public WebElement ExpirationMonthInput;
	
	@FindBy(xpath ="//select[@id='expirationYearInput']")
	public WebElement ExpirationYearInput;
	
	@FindBy (xpath = "//input[@id='securityCodeInput']")
	public WebElement SecurityCodeInput;
	
	@FindBy (xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement AddYourCard;
	
	@FindBy (xpath = "//a[@id='accountLink']")
	public WebElement accountOption;
	
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement NameField;
	
	@FindBy (xpath = "//input[@id='personalPhoneInput']")
	public WebElement PhoneField;
	
	@FindBy (xpath = "//button[@id='personalUpdateBtn']")
	public WebElement UpdateButton;
	
	@FindBy (xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement UpdateMessage;
	
	@FindBy(xpath = "//input[@id='previousPasswordInput']")
	public WebElement PreviousPasswordInput;
	
	@FindBy(xpath = "//input[@id='newPasswordInput']")
	public WebElement NewPasswordInput;
	
	@FindBy (xpath = "//input[@id='confirmPasswordInput']")
	public WebElement ConfirmPasswordInput;
	
	@FindBy(xpath = "//button[@id='credentialsSubmitBtn']")
	public WebElement ChangePassword;
	
	@FindBy(xpath = "//div[text() ='Password Updated Successfully']")
	public WebElement PasswordUpdateMessage;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement PaymentMethodAdded;
	
	@FindBy(xpath = "//div[@class='account__payment-selected account__payment-item']")
	public WebElement PaymentCard;
	
	@FindBy (xpath ="//button[text()='Edit']/following-sibling::p/following-sibling::button[text()='remove']")
	public WebElement Edit;
	
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement UpdateCard;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentMethodUpdate;
	
	@FindBy (xpath = "//button[text()='remove']")
	public WebElement remove;
	
	@FindBy (xpath ="//p[text()='Add Address']")
	public WebElement addAddress;
	
	@FindBy(xpath = "div[text()='Address Added Successfully']")
	public WebElement messageAddressAdded;
	
	@FindBy (xpath = "//button[text()='Edit']/parent::div/parent::div[@data-id ='2035']")
	public WebElement EditAddress;
	
	@FindBy (xpath = "//button[@id='addressBtn']")
	public WebElement UpdateYourAddress;
	
	@FindBy (xpath = "//div[text()='Address Updated Successfully']")
	public WebElement UpdateYourAddressMessageConfirmed;
	
	@FindBy(xpath= "//button[text()='Remove'][1]")
	public WebElement RemoveAddress;
	
	@FindBy(xpath= "//a[@id='orderLink']")
	public WebElement OrdersOption;
	
	@FindBy(xpath = "//button[@id='cancelBtn']")
	public WebElement CancelTheOrder;
	
	@FindBy (xpath = "//select[@id='reasonInput']")
	public WebElement CancelReason;
	
	@FindBy(xpath = "//button[@id='orderSubmitBtn']")
	public WebElement cancelOrder;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement YourOrderHassBeenCanceled;
	
	@FindBy (xpath = "//button[text()='Return Items']")
	public WebElement ReturnItem;
	
	@FindBy (xpath = "//select[@id='reasonInput']")
	public WebElement ReturnReason;
	
	@FindBy (xpath = "//select[@id='dropOffInput']")
	public WebElement DropOffOffice;
	
	@FindBy (xpath = "//button[@id='orderSubmitBtn']")
	public WebElement ReturnOrder;
	
	@FindBy (xpath= "//p[text()='Return was successfull']")
	public  WebElement ReturnConfirmationMessage;
	
	@FindBy (xpath = "//button[@id='reviewBtn']")
	public WebElement ReveiwButton;
	
	@FindBy (xpath = "//input[@id='headlineInput']")
	public WebElement ReveiwHeadline;
	
	@FindBy (xpath = "//textarea[@id='descriptionInput']")
	public WebElement ReviewBody;
	
	@FindBy (xpath = "//button[@id='reviewSubmitBtn']")
	public WebElement AddYourReview;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement ReviewAddedMessage;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
