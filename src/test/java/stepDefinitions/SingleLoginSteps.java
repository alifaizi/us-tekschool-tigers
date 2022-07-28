package stepDefinitions;

import org.junit.Assert;

import core.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SingleLoginPageObj;

public class SingleLoginSteps extends BaseClass{
	
	SingleLoginPageObj singleloginpageObj = new SingleLoginPageObj();
	
	@Given("I am on Tekschool Tetail page")
	public void i_am_on_tekschool_tetail_page() {
	    String expectedText = "TEST ENVIRONMENT";
	    String actualText = singleloginpageObj.getTextFromUI();
	    Assert.assertEquals(expectedText, actualText);
	    logger.info("The TEST ENVIRONMENT text was verified successfully");
	}

	@When("I click on my account link")
	public void i_click_on_my_account_link() {
		singleloginpageObj.clickOnMyAccountLink();
		logger.info("My Account link was clicked successfully");
	}

	@When("I click on login link")
	public void i_click_on_login_link() {
		singleloginpageObj.clickOnLoginLink();
		logger.info("Login link was clicked successfully");
	}

	@Then("I enter my correct username and password")
	public void i_enter_my_correct_username_and_password() {
		singleloginpageObj.enterEmailAddress("johncolunga2399@gmail.com");
		singleloginpageObj.enterPassword("johncolunga2399");
		logger.info("Email address and password were entered successfully");
	}

	@Then("I logged into the Tekschool Tetail page")
	public void i_logged_into_the_tekschool_tetail_page() {
		String expectedText = "My Account";
		String actualText = singleloginpageObj.getMyAccountTextAfterLogin();
		Assert.assertEquals(expectedText, actualText);
		logger.info("The My Account text was verified successfully");
		
		
	}


}
