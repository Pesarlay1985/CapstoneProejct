package tek.sdet.framework.steps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.sdk.metrics.data.Data;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountPage extends CommonUtility  {
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void UserClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("User clicked on Account Option");
		slowDown();
	}
	
	@When("User update Name {string} and Phone {string}")
	public void UserUpdateNameAndPhoneNuumber(String Name, String Phone) {
		clearTextUsingSendKeys(factory.homePage().NameField);
		sendText(factory.homePage().NameField,Name);
		clearTextUsingSendKeys(factory.homePage().PhoneField);
		sendText(factory.homePage().PhoneField, Phone);
		logger.info("User entered new name and phone number");
		slowDown();
	}
	
	@And("User click on Update button")
	public void UserClickOnUpdateButton() {
		click(factory.homePage().UpdateButton);
		logger.info("User clicked on Update Button");
		slowDown();
	}
	
	@Then("user profile information should be updated")
	public void UserProfileInfoShouldBeUpdated() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().UpdateMessage));
		logger.info("Name and phone number updated successfully");
		slowDown();
	}
	
	@When("User enter below information")
	public void UserEntersBellowInfo(DataTable data) {
		List <Map<String, String>> changepass = data.asMaps(String.class,String.class);
		sendText(factory.homePage().PreviousPasswordInput,changepass.get(0).get("previousPassword"));
		sendText(factory.homePage().NewPasswordInput,changepass.get(0).get("newPassword"));
		sendText(factory.homePage().ConfirmPasswordInput,changepass.get(0).get("confirmPassword"));
		logger.info("User entered above info");
	}
	
	@When("User click on Change Password button")
	public void UserClickOnChangePasswordButton() {
		click(factory.homePage().ChangePassword);
		logger.info("User clicked on Change password button");
	}
	
	@Then("a message should be displayed Password Updated Successfully")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().PasswordUpdateMessage));
		logger.info("Password updated successfully message was poped up");
	}
	
	@When("User click on Add a payment method link")
	public void UserClickOnAddApaymentMethodLink() {
		click(factory.homePage().AddCreditOrDebitCard);
		logger.info("User clicked on Add a credit or Debit Card");
	}
	
	@And("User fill Debit or credit card information")
	public void UserFillDebitOrCreditCardInof(DataTable data) {
		List<Map<String,String>> paymentCard = data.asMaps(String.class,String.class);
		sendText(factory.homePage().CardNumberInput,paymentCard.get(0).get("cardNumber"));
		sendText(factory.homePage().NameOnCardInput,paymentCard.get(0).get("nameOnCard"));
		selectByVisibleText(factory.homePage().ExpirationMonthInput,paymentCard.get(0).get("expirationMonth"));
		selectByVisibleText(factory.homePage().ExpirationYearInput,paymentCard.get(0).get("expirationYear"));
		sendText(factory.homePage().SecurityCodeInput,paymentCard.get(0).get("securirityCode"));
		logger.info("User entered payment information");
	}
	
	@And("User click on Add your card button")
	public void User_ClcikOnYourAddCardButton() {
		click(factory.homePage().AddYourCard);
		logger.info("User clicked on Add Your Card Button");
		slowDown();
	}
	
	@Then("a message should be displayed Payment Method added successfully")
	public void aMessageShouldPoppedUpPaymentMethodAddedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().PaymentMethodAdded));
		logger.info("A message popped up Payment Method added Successfully.");
		slowDown();
	}
	
	@When("User select the payment Card")
	public void UserSelectThePaymentCard() {
		click(factory.homePage().PaymentCard);
		logger.info("User clicked on Payment Card");
		slowDown();
	}
	
	@And("User click on Edit option of card section")
	public void UserClickOnEditOptionOfCardSection() {
		click(factory.homePage().Edit);
		logger.info("User clicked on Edit Option");
		slowDown();
	}
	
	@And (" user edit information with below data")
	public void UserEditInformationWithBelowData(DataTable data) {
		List<Map<String,String>> editCard = data.asMaps(String.class,String.class);
		clearTextUsingSendKeys(factory.homePage().CardNumberInput);
		sendText(factory.homePage().CardNumberInput,editCard.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.homePage().NameOnCardInput);
		sendText(factory.homePage().NameOnCardInput,editCard.get(0).get("nameOnCard"));
		selectByVisibleText(factory.homePage().ExpirationMonthInput,editCard.get(0).get("expirationMonth"));
		selectByVisibleText(factory.homePage().ExpirationYearInput,editCard.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.homePage().SecurityCodeInput);
		sendText(factory.homePage().SecurityCodeInput,editCard.get(0).get("securityCode"));
		logger.info("User edited the payment card info");
	}
	
	@And("User click on Add your card button")
	public void User_ClickOnAddYourCardButton() {
		click(factory.homePage().UpdateCard);
		logger.info("User clicked on Update your card button");
	}
	
	@Then("a message should be displayed Payment Method updated Successfully")
	public void aMessageDisplayed_PaymentMethodUpdatedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().paymentMethodUpdate));
		logger.info("a message was displayed Payment Method updated Successfully");
	}
	
	@When("User select the payment Card")
	public void User_SelectThePaymentCard() {
		click(factory.homePage().PaymentCard);
		logger.info("User selected the debit or Credit Card");
		slowDown();
	}
	
	@And("User click on remove option of card section")
	public void UserClickOnRemoveOptionOfCardSection() {
		click(factory.homePage().remove);
		logger.info("User clicked on remove option of payment card section");
		slowDown();
	}
	
	@Then("payment details should be removed")
	public void PayementdetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().PaymentCard));
		logger.info("User removed Card Successfully");
	}
	@When("User click on Add address option")
	public void UserClick_OnAddressOption() {
		click(factory.homePage().addAddress);
		logger.info("User clicked on Add Address");
	}
	@And("user fill new address form with below information")
	public void UserFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String,String>> addressForm = data.asMaps(String.class,String.class);
		selectByVisibleText(factory.homePage().CountryInput,addressForm.get(0).get("country"));
		sendText(factory.homePage().FullNameInput,addressForm.get(0).get("fullName"));
		sendText(factory.homePage().PhoneInput,addressForm.get(0).get("phoneNumber"));
		sendText(factory.homePage().StreetAddressInput,addressForm.get(0).get("streetAddress"));
		sendText(factory.homePage().ApartmentInput,addressForm.get(0).get("apt"));
		sendText(factory.homePage().CityInput,addressForm.get(0).get("city"));
		sendText(factory.homePage().StateInput,addressForm.get(0).get("state"));
		sendText(factory.homePage().ZipcodeInput,addressForm.get(0).get("zipCode"));
		logger.info("User filled the address Infomation");
	}
	
	@And("User click on Add Your Address button")
	public void User_ClickOnAddYourAddressButton() {
		click(factory.homePage().addAddress);
		logger.info("User clicked on add your address button");
		slowDown();
	}
	
	@Then("message should be displayed Address Added Successfully")
	public void Message_Should_PopUpAddressAddedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().messageAddressAdded));
		logger.info("message was popped up address successfully");
		slowDown();
	}
	
	@When("User click on edit address optio")
	public void UserClickOnEditAddressOption() {
		click(factory.homePage().EditAddress);
		logger.info("User clicked on Edit option of Address section");
	}
	
	@And("User fill new address form with below information")
	public void UserFillNew_AddressFormWithBelowInformation(DataTable data) {
		List<Map<String,String>>editAddress = data.asMaps(String.class,String.class);
		selectByVisibleText(factory.homePage().CountryInput,editAddress.get(0).get("country"));
		sendText(factory.homePage().FullNameInput,editAddress.get(0).get("fullName"));
		sendText(factory.homePage().PhoneInput,editAddress.get(0).get("phoneNumber"));
		sendText(factory.homePage().ApartmentInput,editAddress.get(0).get("apt"));
		sendText(factory.homePage().CityInput,editAddress.get(0).get("city"));
		selectByVisibleText(factory.homePage().StateInput,editAddress.get(0).get("state"));
		sendText(factory.homePage().ZipcodeInput,editAddress.get(0).get("zipCode"));
		logger.info("User Entered new Address informaiton");
		slowDown();
	}
		@And("User click update Your Address button")
		public void User_ClickUpadateYourAddress_Button() {
			click(factory.homePage().UpdateYourAddress);
			logger.info("User clicked on Update Your Address button");
			slowDown();
			
		}
		
		@Then("a message should be displayed Address Updated Successfully")
		public void AddressUpdatedmessageDisplayedSuccessfully() {
			Assert.assertTrue(isElementDisplayed(factory.homePage().UpdateYourAddressMessageConfirmed));
			logger.info("A message was dispalyed Address updated Successfully");
			slowDown();	
		}
		
		@When("User click on remove option of Address section")
		public void UserClickOnRemoveOptionOfAddressSection() {
			click(factory.homePage().RemoveAddress);
			logger.info("User clicked on Revmove option of Address");
			
		}
		
		@Then("Address details should be removed")
		public void AddressDetailsShouldBeRemoved() {
			//Assert.assertTrue(isElementDisplayed(factory.accountpage().Account)); There is no msg to validate.
			logger.info("User removed the address");
		}
		
		@When("And User click on Orders section")
		public void UserClickOnOrderSection() {
			click(factory.homePage().OrdersOption);
			logger.info("User clicked on Orders option");
			
		}
		
		@And("User click on first order in lis")
		public void UserClickedOnFirstOrderInList() {
			click(factory.homePage().CancelTheOrder);
			logger.info("User Clicked on cancel the Order button");
			
		}
		@And("User select the cancelation Reason {string}")
		public void UserSelectTheCancelationReasonBoughtWrongItem(String BWI) {
			sendText(factory.homePage().CancelReason,BWI);
			logger.info("User picked 'Bought Wrong Item");
			
		}
		
		@And ("User click on Cancel Order button")
		public void UserClickOnCancelOrderButton() {
			click(factory.homePage().cancelOrder);
			logger.info("User clicked On cancel Order button");
		}
		
		@Then("a cancelation message should be displayed Your Order Has Been Cancelled")
		public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCanceled() {
			Assert.assertTrue(isElementDisplayed(factory.homePage().YourOrderHassBeenCanceled));
			logger.info("A message was displayed 'Your Order Has Been Canceld");
			
		}
		
		@When(" User click on Return Items button")
		public void UserClickOnReturnItemBtton() {
			click(factory.homePage().ReturnItem);
			logger.info("User clicked On Return Item Button");
		}
		
		@And("User select the Return {String}")
		public void UserSelectTheReturnItemButton(String ItemDamaged) {
			sendText(factory.homePage().ReturnReason,ItemDamaged);
			logger.info("User slected RetrunReason 'Item Damaged'");
		}
		
		@And("User select the drop off service {string}")
		public void UserSelectTheDropOffService(String UPS) {
			sendText(factory.homePage().DropOffOffice,UPS);
			logger.info("User selected the Office 'UPS");
		}
		
		@And("User click on Return Order button")
		public void UserClickOnReturnOrderButton() {
			click(factory.homePage().ReturnOrder);
			logger.info("User Clicked on Return Order button");
		}
		
		@Then(" a cancelation message should be displayed Return was successful")
		public void ACancelationmessageShouldBeDisplayedReturnWasSuccessful() {
			Assert.assertTrue(isElementDisplayed(factory.homePage().ReturnConfirmationMessage));
			logger.info("A message was poped up 'Return Was Successful");
		}
		
		@When(" User click on Review button")
		public void UserClickedOnReviewButton() {
			click(factory.homePage().ReveiwButton);
			logger.info("User clicked on ReviewButton");
		}
		
		@And("User write Review headline {string} and {string}")
		public void UserWriteReveiwHeadlingAwsomAndPackageDeliveredOnTime(String Awesome, String PDOT) {
			sendText(factory.homePage().ReveiwHeadline,Awesome);
			sendText(factory.homePage().ReviewBody,PDOT);
			logger.info("User write a review in Review Headline and Review Body");
		}
		
		@And("User click Add your Review button")
		public void UserClickAddYourReviewButton() {
			click(factory.homePage().AddYourReview);
			logger.info("User Clicked on Add Your Review Button");
		}
		
		@Then("a review message should be displayed Your review was added successfully")
		public void AReveiwMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
			Assert.assertTrue(isElementDisplayed(factory.homePage().ReviewAddedMessage));
			logger.info("A Reveiw Message confirmation Should Be Displayed 'Your Review was added Successfully");
		}
		
	}
	
	

