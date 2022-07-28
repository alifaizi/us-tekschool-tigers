package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.DataTablePageObj;
import utilities.UtilsClass;

public class DataTableSteps extends BaseClass {
	
	DataTablePageObj datatablepageobj = new DataTablePageObj();
	
	
	@And("I click on register link")
	public void i_click_on_register_link() {
		datatablepageobj.clickOnRegisterLink();
		logger.info("Register link was clicked successfully.");
	    
	}

	@And("I fill the registration form")
	public void i_fill_the_registration_form(DataTable dataTable) {
	    
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		datatablepageobj.enterFirstName(data.get(0).get("firstname"));
		datatablepageobj.enterLastName(data.get(0).get("lastname"));
		datatablepageobj.enterEmail(data.get(0).get("email"));
		datatablepageobj.enterTelephone(data.get(0).get("telephone"));
		datatablepageobj.enterPassword(data.get(0).get("password"));
		datatablepageobj.enterConfirmPassword(data.get(0).get("confirmPassword"));
	    UtilsClass.takeScreenshotForStep();
	    logger.info("Registration was completed successfully");
	}

	@And("I subscribe to newsletter")
	public void i_subscribe_to_newsletter() {
		datatablepageobj.clickOnYesNewsLetterRadioButton();
		logger.info("Subsciption radio button was clicked successfully");
	    
	}

	@And("I agree to privacy policy")
	public void i_agree_to_privacy_policy() {
		datatablepageobj.clickOnPrivacyPolicyCheckBox(); 
		logger.info("Privacy policy radio button slected successfully");
	}

	@And("I click on continue button")
	public void i_click_on_continue_button() {
		datatablepageobj.clickOnContinueButton();
		logger.info("Continue button was clicked successfully");
	}

	@Then("I validate my account is created successfully")
	public void i_validate_my_account_is_created_successfully() {
		String expectedMessage = "Your Account Has Been Created!";
		String actualMessage = datatablepageobj.getAccountCreatedMessageFromUI();
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("The account created message displayed successfully");
	}

}
