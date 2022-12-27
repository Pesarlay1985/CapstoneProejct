package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();// wrote this one in CommonUtility
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + " is equal to " + expectedTitle);
	}

	@And("User click on All section")
	public void allSection() {
		click(factory.homePage().All);
		logger.info("user clicked  on All section Successfully");
	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable options) {
		List<List<String>> optionsToDisplay = options.asLists(String.class);
		Assert.assertTrue(isElementDisplayed(
				getDriver().findElement(By.xpath("//span[text() = '" + optionsToDisplay.get(0).get(0) + "']"))));
		logger.info("options Electronics, Computers, Smart Home, Sports and Automative are present");
	}

	String department;

	@When("User is on {string}")
	public String userOnElectronics(String department) {

		switch (department) {
		case "Electronics":
			Assert.assertTrue(isElementDisplayed(factory.homePage().Electronics));
			logger.info("user is on Electronics section");
			break;

		case "Computers":
			Assert.assertTrue(isElementDisplayed(factory.homePage().Computers));
			logger.info("user is on Computers section");
			break;

		case "Smart Home":
			Assert.assertTrue(isElementDisplayed(factory.homePage().smartHome));
			logger.info("user is on Smart Home section");
			break;

		case "Sports":
			Assert.assertTrue(isElementDisplayed(factory.homePage().Sport));
			logger.info("user is on Sports section");
			break;

		case "Automotive":
			Assert.assertTrue(isElementDisplayed(factory.homePage().Automative));
			logger.info("user is on Automotive section");
			break;
		default:

		}

		return this.department = department;
	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable, String SmartHomeLighing) {
		List<List<String>> department = dataTable.asLists();

		switch (this.department) {
		case "Electronics":
			click(factory.homePage().videoGames);
			String video = getText(factory.homePage().videoGames);
			String TVAndVideo = getText(factory.homePage().TVAndVideo);
			Assert.assertEquals(TVAndVideo, department.get(0).get(0));
			Assert.assertEquals(video, department.get(0).get(0));
			logger.info(video + "options are present in department" + TVAndVideo);
			break;
		case "Compuers":
			click(factory.homePage().Computers);
			String Accessories = getText(factory.homePage().Accessories);
			String Networking = getText(factory.homePage().Networking);
			Assert.assertEquals(Accessories, department.get(0).get(0));
			Assert.assertEquals(Networking, department.get(0).get(0));
			logger.info(Accessories + "options are present in department" + Networking);
			break;

		case "Smart Home":
			click(factory.homePage().smartHome);
			String SmartHomeLighting = getText(factory.homePage().SmartHomeLighting);
			String plugsAndOutlets = getText(factory.homePage().plugsAndOutlets);
			Assert.assertEquals(SmartHomeLighting, department.get(0).get(0));
			Assert.assertEquals(plugsAndOutlets, department.get(0).get(0));
			logger.info(SmartHomeLighing + "options are present in department" + plugsAndOutlets);
			break;

		case "Sports":
			click(factory.homePage().Sport);
			String AthleticAndclothing = getText(factory.homePage().AthleticClothing);
			String ExcerciseAndFitness = getText(factory.homePage().ExcerciseAndFitness);
			Assert.assertEquals(AthleticAndclothing, department.get(0).get(0));
			Assert.assertEquals(ExcerciseAndFitness, department.get(0).get(0));
			logger.info(AthleticAndclothing + "options are present in department" + ExcerciseAndFitness);
			break;

		case "Automative":
			click(factory.homePage().Automative);
			String AutoPartsAndAccessories = getText(factory.homePage().AutoPartsAndAccessories);
			String MotorCycleAndPowerSports = getText(factory.homePage().MotorCycleAndPowerSports);
			Assert.assertEquals(AutoPartsAndAccessories, department.get(0).get(0));
			Assert.assertEquals(MotorCycleAndPowerSports, department.get(0).get(0));
			logger.info(AutoPartsAndAccessories + "options are present" + MotorCycleAndPowerSports);
			break;
		}
	}

	@When("User click on sign in option")
	public void UserClickOnSignInOption() {
		click(factory.signInPage().signInOption);
	}
	@And ("User enter email{string} and password{string}")
	public void UserEntersEmailAndPassword(String email, String Password) {
		sendText(factory.signInPage().emailField,email);
		sendText(factory.signInPage().passwordField,Password);
		logger.info("user entered email"+email+"and password" +Password);
	}
	
	@And("User click on Login button")
	public void UserClickOnLoginButton() {
		click(factory.signInPage().login);
		logger.info("User clicked on Login button");
		
	}
	@And("User should be logged in into account")
	public void UserShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
		logger.info("User could log in successfully");
	}
	
	@And("User change the category to {string}")
	public void UserChangeThenCatagoryToSmartHome(String smartHome) {
		selectByVisibleText(factory.homePage().allDepartment,smartHome);
		logger.info("All Department changed to"+ smartHome);
		
	}
	
	@And("User search for an item {string}")
	public void UserSearchForAnItem(String Kasa) {
		sendText(factory.homePage().searchInputField, Kasa);
		logger.info("User entered kasa in search field");
	
}
	@And("User click on Search icon")
	public void UserClickOnSearchIcon() {
		click(factory.homePage().SearchBtn);
		logger.info("User clicked on search icon");
	
	}
	
	@And ("User click on item")
	public void UserClickOnItem() {
	click(factory.homePage().Kasa);
	logger.info("User clicked on item");
	
	}
	
	@And("User select quantity{string}")
	public void UserSelectQuantity(String added) {
		sendText(factory.homePage().Quantity,added);
		logger.info("user selected quantitiy '2'");
		
		
	}
	
	@And(" User click add to Cart button")
	public void UserClickAddToCartButton() {
		click(factory.homePage().addToCart);
		logger.info("user clicked on Add To Cart");
		
	}
	
	@Then("The cart icon quantity should change to {string}")
	public void TheCartIconQuanitityShouldChangetoTwo(String Two) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartButton,Two));
		logger.info("Cart Icon changed to '2'");
	}
	
	@And ("User click on Cart option")
	public void UserClickOnCartOption() {
	click(factory.homePage().cartButton);
	logger.info("User clicked on Cart option");
}
	@And("User click on Proceed to Checkout button")
	public void User_Click_OnProceed_To_Checkout_Button() {
		click(factory.homePage().ProceedToCheckoutButton);
	}
	
	@And("User click Add a new address link for shipping address")
	public void UserClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().AddNewAddress);
		logger.info("User clicked on add a new address link");
	}
	
	@And("User fill the new address form with below information")
	public void UserFillTheNewAddressFormWithBelowInfo(DataTable data) {
	List<Map<String,String>>fillNewAddress=data.asMaps(String.class,String.class);
	
		selectByVisibleText(factory.homePage().CountryInput,fillNewAddress.get(0).get("Country"));
		sendText(factory.homePage().FullNameInput,fillNewAddress.get(0).get("FullName"));
		sendText(factory.homePage().PhoneInput,fillNewAddress.get(0).get("PhoneNumber"));
		sendText(factory.homePage().StreetAddressInput,fillNewAddress.get(0).get("StreetAddress"));
		sendText(factory.homePage().ApartmentInput,fillNewAddress.get(0).get("Apt"));
		sendText(factory.homePage().CityInput, fillNewAddress.get(0).get("City"));
		selectByVisibleText(factory.homePage().StateInput,fillNewAddress.get(0).get("State"));
		sendText(factory.homePage().ZipcodeInput, fillNewAddress.get(0).get("ZipCode"));
	}
	
	@And("User click Add Your Address  button")
	public void UserClickAddYourAddressButton() {
		click(factory.homePage().AddYourAddress);
		logger.info("User clicked on Add Your Address button");
	}
		
	@And("User click Add a credit card or Debit Card for Payment method")
	public void UserClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.homePage().AddCreditOrDebitCard);
	}
	
	@And("User fill the Debit or credit card information")
	public void UserFillTheDebitOrCreditCardInfo(DataTable data) {
	List<Map<String,String>> cardInfo = data.asMaps(String.class,String.class);
	sendText(factory.homePage().CardNumberInput,cardInfo.get(0).get("CardNumber"));
	sendText(factory.homePage().NameOnCardInput,cardInfo.get(0).get("NameOnCard"));
	selectByVisibleText(factory.homePage().ExpirationMonthInput,cardInfo.get(0).get("ExpirationMonth"));
	selectByVisibleText(factory.homePage().ExpirationYearInput,cardInfo.get(0).get("ExpirationYear"));
	sendText(factory.homePage().SecurityCodeInput,cardInfo.get(0).get("SecurityCode"));
	}
	
	@And("User click on Add your card button")
	public void UserClickOnAddYourCardButton() {
		click(factory.homePage().AddYourCard);
		logger.info("User clicked on Add Your Card button");
	}
	
	@And("User click on Place Your Order")
	public void User_Click_On_Place_Your_Order() {
		click(factory.homePage().PlaceYourOrderButton);
		logger.info("User clicked on place your order button");
	}
	
	@Then("message should be displayed Order Placed, Thanks")
	public void messageShouldBeDisplayedOrderPlacedThanks() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().Thanks));
		logger.info("The messaged poped up 'Thanks'");
	}
	
	
	
	
	
	

	@When("User click on Sign in option")
	public void User_click_On_Sign_In_Option() {
		click(factory.signInPage().signInOption);
		logger.info("User clicked on Sign in Option");
	}
	
	@And("User enter email {string} and password {string}")
	public void User_Enter_Email_And_Password(String email, String password) {
		sendText(factory.signInPage().emailField,email);
		sendText(factory.signInPage().passwordField,password);
		logger.info("User entered email "+email +"and password "+ password);
	}
	
	@And("User should be logged in into Account")
	public void User_ShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
		logger.info("user was successfully logged in into Account");
	}
	
	@And("User click on login button")
	public void User_click_On_Login_Button() {
		click(factory.signInPage().login);
		logger.info("User clicked on Login Button");
	}
	
	
	@And("User change the category to {string}")
	public void UserChangedTheCatagoryToSmartHome(String itemElectronic){
		sendText(factory.homePage().searchInputField, itemElectronic);
		logger.info("user entered" + itemElectronic);	
	}
	
	@And("User click on Item")
	public void User_Click_On_Item(String ApexLegenBook) {
		click(factory.homePage().ApexLegendBook);
		logger.info("User clicked on item" + ApexLegenBook);
}
	
	@And("User click on search icon")
	public void User_clicked_On_Search_Icon() {
		click(factory.homePage().SearchBtn);
		logger.info("User clicked on Search Button");
	}
	
	@And("User click on Item")
	public void User_Click_On_Item() {
		click(factory.homePage().ApexLegendBook);
		logger.info("User clicked on item");
	}
 
	
	@And("user select quantity {string}")
	public void User_Select_Quantity(String Five) {
		sendText(factory.homePage().Quantity, Five);
		logger.info("User selected the quantity '5'");
		
	}
	
	@And("User click add to cart button")
	public void User_Clicked_Add_To_Cart_Button() {
		click(factory.homePage().addToCart);
		logger.info("User clicked on Add To Cart Button");
	}
	
	@And("the cart icon quantity should change to {string}")
	public void CartIconQuantityShouldChangeToFive(String Five) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartButton,Five));
		logger.info("Cart Icon Changed to Five");
	}
	
	@And("User click on cart option")
	public void UserClickedOnCartOption() {
		click(factory.homePage().cartButton);
		logger.info("User clicked on Cart Button");
	}
	
	@And("User click on proceed to Checkout button")
	public void UserClickOnProceedToCheckoutButton() {
		click(factory.homePage().ProceedToCheckoutButton);
		logger.info("User clicked on proceed to check out button");
		
	}
	
	@And("User click on place Your Order")
	public void UserClickOnPlaceYourOrderButton() {
		click(factory.homePage().PlaceYourOrderButton);
		logger.info("user clicked on Place Your order button" );
	}
	
	@Then("A message Should be Displayed Order Placed, Thanks")
	public void aMessageShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().Thanks));
		logger.info("a message popoed up on the top of screen 'Thanks'");
	}
	
	
	
	
	
	
	
	
	

}
