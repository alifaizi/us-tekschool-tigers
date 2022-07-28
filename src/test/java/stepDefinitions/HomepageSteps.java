package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.HomepagePageObj;

public class HomepageSteps extends BaseClass {

	HomepagePageObj homepagePageObj = new HomepagePageObj();

	@Then("i validate Desktops {string} on the UI")
	public void i_validate_desktops_on_the_ui(String desktops) {
		homepagePageObj.campareTextdesktopLink(desktops);
		logger.info("Text for " + desktops + " verified successfully" );
	} 

	@Then("i validate Laptops & Notebooks {string} on the UI")
	public void i_validate_laptops_notebooks_on_the_ui(String laptopsAndNotebooks) {
		homepagePageObj.campareTextlaptopsAndNotebooks(laptopsAndNotebooks);
		logger.info("Text for " + laptopsAndNotebooks + " verified successfully" );
	}

	@Then("i validate Components {string} on the UI")
	public void i_validate_components_on_the_ui(String components) {
		homepagePageObj.campareTextcomponentsLink(components);
		logger.info("Text for " + components + " verified successfully" );
	}

	@Then("i validate Tablets {string} on the UI")
	public void i_validate_tablets_on_the_ui(String tablets) {
		homepagePageObj.campareTexttabletsLink(tablets);
		logger.info("Text for " + tablets + " verified successfully" );
	}

	@Then("i validate Software {string} on the UI")
	public void i_validate_software_on_the_ui(String software) {
		homepagePageObj.campareTextsoftwareLink(software);
		logger.info("Text for " + software + " verified successfully" );
	}

	@Then("i validate Phones & PDAs {string} on the UI")
	public void i_validate_phones_pd_as_on_the_ui(String phonesAndPDAs) {
		homepagePageObj.campareTextphonesAndPDAsLink(phonesAndPDAs);
		logger.info("Text for " + phonesAndPDAs + " verified successfully" );
	}

	@Then("i validate Cameras {string} on the UI")
	public void i_validate_cameras_on_the_ui(String cameras) {
		homepagePageObj.campareTextcamerasLink(cameras);
		logger.info("Text for " + cameras + " verified successfully" );
	}

	@Then("i validate MP3 Players {string} on the UI")
	public void i_validate_mp3_players_on_the_ui(String mP3Player) {
		homepagePageObj.campareTextmP3PlayerLink(mP3Player);
		logger.info("Text for " + mP3Player + " verified successfully" );
	}

}
