package stepDefinitions;

import org.junit.Assert;

import core.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.DesktopItemsPageObj;

public class DesktopItemsSteps extends BaseClass {
	
	DesktopItemsPageObj desktoppageobj = new DesktopItemsPageObj(); 
	
	@When("I hover my mouse over desktop dropdown")
	public void i_hover_my_mouse_over_desktop_dropdown() {
	
		desktoppageobj.clickOnDesktopLink();
		logger.info("Mouse moved to Desktops link successfully");
	}

	@Then("I see show all desktops link")
	public void i_see_show_all_desktops_link() {
		String expectedText = "Show All Desktops";
		String actualText = desktoppageobj.getShowAllDesktopText();
		System.out.println("Show All Desktops text from the UI ===> " + actualText);
		Assert.assertEquals(expectedText, actualText);
		logger.info("Show All Desktop Text was verified successfully");
	}
	
	@Then("I click on show all desktops link")
	public void i_click_on_show_all_desktops_link() {
		desktoppageobj.clickOnshowAllDesktopLink();
		logger.info("Show ALl Desktop link was clicked successfully");

	}

	@Then("I validate the Tablets tab on the UI")
	public void i_validate_the_tablets_tab_on_the_ui() {
		String expectedText = "Tablets";
		String actualText = desktoppageobj.getTabletsTextFromUI();
		System.out.println("Tablets text printed" + actualText);
		Assert.assertEquals(expectedText, actualText);
		logger.info("Tablets text was verified successfully");

	}

	}
