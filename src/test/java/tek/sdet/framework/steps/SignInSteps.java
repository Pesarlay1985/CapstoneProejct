package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.signInPage().signIn);
		logger.info("user clicked on sign in succefully");
	}

	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("user entered email" + email + "and password" + password);
		slowDown();

	}

	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().login);
		logger.info("user clicked on login button");
		slowDown();

	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
		logger.info("User could login successfully");
		slowDown();
	}

	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccount);
		logger.info("User click on Create New Account button");
		slowDown();

	}

	@And("User fill the signUp information with below data")
	public void UserShouldEnterTheGivenData(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameField, signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailField, signUpData.get(0).get("email"));
		sendText(factory.signInPage().passwordField, signUpData.get(0).get("Password"));
		sendText(factory.signInPage().confirmPasswordField, signUpData.get(0).get("ConfirmPassword"));
		logger.info("User entered the data successfully");
		slowDown();
	}

	@And("User click on SignUp button")
	public void UserClickONSignUpButton() {
		click(factory.signInPage().signUpButton);
		logger.info("User clicked on SignUp button Successfully");
	}

}
