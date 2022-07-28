package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pageObjects.SearchBoxPageObj;
import utilities.UtilsClass;

public class SearchBoxStep extends BaseClass{

	SearchBoxPageObj searchboxpageobj = new SearchBoxPageObj();
	
	@Given("the user is on the Tek School retail page")
	public void the_user_is_on_the_tek_school_retail_page() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = searchboxpageobj.getTestEnvironmentText();
		Assert.assertEquals(expectedText, actualText);
		logger.info("User is on the Tek School retail page successfully");
		UtilsClass.testExecutionWait(2000);
	    	
	}

	@When("the user enter a camera in the search box")
	public void the_user_enter_a_camera_in_the_search_box() {
		searchboxpageobj.search("Camera");
		logger.info("The user entered Camera in the search box successfully");
		UtilsClass.testExecutionWait(2000);
		
	}

	@And("the user click on the search button")
	public void the_user_click_on_the_search_button() {
		searchboxpageobj.clickSeachButton();
		logger.info("The user clicked on th search button successfully");
		UtilsClass.testExecutionWait(2000);
	   
	}

	@Then("the user get on the result for the camera in a separate page")
	public void the_user_get_on_the_result_for_the_camera_in_a_separate_page() {
		searchboxpageobj.getsearchCameraText();
		logger.info("The user got the search result successfully");
		UtilsClass.testExecutionWait(2000);
		
	}
	
	@Then("the user click on the add to cart link")
	public void the_user_click_on_the_add_to_cart_link() {
		searchboxpageobj.addItemToCart();
		logger.info("The user added the item in the cart succeesfully");
		
		UtilsClass.testExecutionWait(2000);
		
		UtilsClass.takeScreenshotForStep();

	}
	

}
