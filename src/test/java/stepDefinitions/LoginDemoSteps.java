package stepDefinitions;

import org.junit.Assert;

import core.BaseClass;
import io.cucumber.java.en.*;

import pageObjects.LoginDemoPageObj;

public class LoginDemoSteps extends BaseClass {
	
	LoginDemoPageObj logindemopageobj = new LoginDemoPageObj();

	@Given("browser is open")
	public void browser_is_open() {
		String expectedText = "Community Powered Test Automation";
		String actualText = logindemopageobj.getLoginPageText();
		Assert.assertEquals(expectedText, actualText);
		logger.info("The text on the login page verified successfully");		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		logindemopageobj.enterUserName("Raghav");
		logindemopageobj.enterPassword("12345");
		logger.info("User entered Username and password entered successfully");
		
	}
	
	@And("user click on login")
	public void user_click_on_login() {
		logindemopageobj.clickOnLoginBtn();
		logger.info("User clicked on the Login button successfully");
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		logindemopageobj.getTextAfterLogin();
		logger.info("User nvaigated to the home page successfully");
		
	}
	
	@Then("user click on logout button")
	public void user_click_on_logout_button() {
		logindemopageobj.clickOnLogoutBtn();
		logger.info("User clicked on the Logout button successfully");
		
	}

}
